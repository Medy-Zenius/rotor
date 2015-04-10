(ns rotor.routes.datagen
  (:require [compojure.core :refer :all]
            [rotor.views.layout :as layout]
            [noir.validation :as vali]
            [noir.util.crypt :as crypt]
            [noir.response :as resp]
            [rotor.models.db :as db]
            [noir.session :as session]
            [ring.util.response :refer [file-response]]
            [rotor.routes.dp :as dp]))

(def abjad "abcdefghijklmnopqrstuvwxyz")

(defn str-to-vec [vstr]
  (let [cstr (count vstr)]
   (loop [vvar [] a 1 b 2]
     (if (= a cstr)
         vvar
         (if (or (= (subs vstr b (inc b)) "|") (= (subs vstr b (inc b)) "]"))
             (recur (conj vvar (subs vstr a b)) (+ b 1) (+ b 2))
             (recur vvar a (inc b)))))))


;;;
;;; Create Problem, save in database
;;;
(defn handle-datagen-create-data [kode]
  (let [data (vec (take 200 (eval (read-string kode))))
        cdata (count data)
        fdata (first data)
        cfdata (count fdata)]
    (layout/render "datagen/show-data.html" {:kode kode :data data :cdata cdata :fdata fdata :cfdata cfdata})))

(defn handle-datagen-save-data [cd dt so kb]
  (try (db/insert-data "datagen" {:kodebutir kb
                                  :code cd
                                  :data dt
                                  :soal so
                                  })
      (layout/render "pesan.html" {:pesan "Berhasil save data"})
      (catch Exception ex
        (layout/render "pesan.html"
          {:pesan (str "Gagal Save Data error: " ex)}))))

(defn datagen-search-butir [act]
  (layout/render "datagen/search.html" {:action act}))

(defn handle-datagen-search-edit [kode act]
  (let [data (db/get-data (str "select kodebutir,code from datagen where kodebutir like '" kode "%'") 2)]
       (if data
          (layout/render "datagen/kodebutir.html" {:data data :kdbtr kode :action act})
          (layout/render "pesan.html" {:pesan "Tidak ada data kode butir tersebut"}))))

(defn handle-do-edit [butir kode]
  (layout/render "datagen/edit-butir.html"
        {:data (db/get-data (str "select * from datagen where kodebutir='" butir "'") 1)
         :kdbtr kode
         }))

(defn handle-datagen-update-butir [kb co da so gam]
  (try (db/update-data-1 "datagen"
                         ["kodebutir=?" kb] {:code co :data da :soal so :gambar gam})
       (layout/render "pesan.html" {:pesan "Berhasil Update data butir pelajaran"})
       (catch Exception ex
        (layout/render "pesan.html"
          {:pesan (str "Gagal Update Data error: " ex)}))))

(defn handle-datagen-do-delete [kdbutir kdbtr]
  (try (db/delete-data "datagen" (str "kodebutir='" kdbutir "'"))
       (handle-datagen-search-edit kdbtr "/datagen-do-delete")
       (catch Exception ex
        (layout/render "pesan.html"
          {:pesan (str "Gagal Delete Data error: " ex)}))))
;;;
;;; Create Problem Set, save in database
;;;
(defn datagen-choose-subject [subjek act]
  (layout/render "datagen/proset-mp.html"
      {:subjek subjek :probs (session/get :problems)
       :kodekelas (db/get-data "select * from kodekelaslp order by kode asc" 2)
       :kodekurikulum (db/get-data "select * from kodekuri order by kode asc" 2)
       :bidangstudi (db/get-data "select * from bidangstudi order by kode asc" 2)
       :action act
       :template (session/get :template)}))

(defn datagen-choose-problems [ke ku bi sub act]
  (session/put! :subjek sub)
  (layout/render "datagen/view-lp.html"
   {:butirs (db/get-data (str "select kode,keterangan from lessonplan where kode LIKE '%" ke ku bi "_' order by kode ASC") 2)
    :subjek (session/get :subjek)
    :problems (session/get :problems)
    :action act
    :template (session/get :template)}))

(defn datagen-add-problems [ko sub act]
  (layout/render "datagen/add-prob.html"
      {:subjek (session/get :subjek)
       :butirs (db/get-data (str "select kode,keterangan from lessonplan
                                 where kode LIKE '" ko "%' and dp='1' order by kode ASC") 2)
       :action act
       :template (session/get :template)}))
(defn datagen-do-add-problems [ko act]
   (layout/render "datagen/add-jbutir.html"
      {:kode ko :subjek (session/get :subjek)
       :keterangan (:keterangan (db/get-data (str "select keterangan from lessonplan where kode='" ko "'") 1))
       :problems (session/get :problems)
       :action act
       :template (session/get :template)}))
(defn datagen-update-problems [ko js act]
  (let [old_problems (session/get :problems)
        new_problems (conj old_problems {:kode ko :jsoal js})]
       (session/put! :problems new_problems))
       (datagen-add-problems (subs ko 0 6) (session/get :subjek) act))
(defn datagen-save-proset []
  (let [pembuat (session/get :id)
        subjek (session/get :subjek)
        problems (str (session/get :problems))]
       (try (db/insert-data "datasoal" {:pembuat pembuat
                                  :subjek subjek
                                  :soal problems
                                  })
      (layout/render "pesan.html" {:pesan "Berhasil Save Proset"})
      (catch Exception ex
        (layout/render "pesan.html"
          {:pesan (str "Gagal Save Proset ! error: " ex)})))))

;;;Template
(defn datagen-save-template []
  (let [pembuat (session/get :id)
        subjek (session/get :subjek)
        problems (str (session/get :problems))]
       (try (db/insert-data "template" {:pembuat pembuat
                                  :subjek subjek
                                  :soal problems
                                  })
      (layout/render "pesan.html" {:pesan "Berhasil Save Template"})
      (catch Exception ex
        (layout/render "pesan.html"
          {:pesan (str "Gagal Save Template ! error: " ex)})))))

;;; Show Problems Set
(def n_atom (atom 0))

(defn datagen-make-soal [kode nomer]
  "Make a single problem"
  (assoc (dp/dp-soal kode) :no nomer))
(defn datagen-make-proset [vsoal]
  (let [ckode (count vsoal), no 0]
      (loop [probs [], cnt 0]
         (if (= cnt ckode)
             probs
             (recur (loop [probs1 probs, cnt1 0]
                      (if (= cnt1 (Integer/parseInt (:jsoal (nth vsoal cnt))))
                          probs1
                          (recur (conj probs1 (datagen-make-soal (:kode (nth vsoal cnt)) (swap! n_atom inc)))
                                 (inc cnt1)))) (inc cnt))))))
(defn datagen-show-proset [act]
  (let [pembuat (session/get :id)]
     (layout/render "datagen/show-proset.html"
          {:data (db/get-data (str "select nomer,subjek from datasoal where pembuat='" pembuat "' order by nomer asc") 2)
           :action act}
       )))
(defn datagen-detail-proset [no]
  (let [vsoal (db/get-data (str "select soal,subjek from datasoal where nomer='" no "'") 1)
        vs (read-string (:soal vsoal))
        subj (:subjek vsoal)
        zerokan (swap! n_atom (fn [n] (* 1 0)))
        proset (datagen-make-proset vs)
        ]
       (layout/render "soal/tampilan-proset.html"
                      {:proset proset :subjek subj})
    ))

(defn datagen-show-template [act]
  (let [pembuat (session/get :id)]
     (layout/render "datagen/show-proset.html"
          {:data (db/get-data (str "select nomer,subjek from template order by subjek asc") 2)
           :action act}
        )))
(defn datagen-detail-template [no]
  (let [vsoal (db/get-data (str "select soal,subjek from template where nomer='" no "'") 1)
        vs (read-string (:soal vsoal))
        subj (:subjek vsoal)
        zerokan (swap! n_atom (fn [n] (* 1 0)))
        proset (datagen-make-proset vs)
        ]
       (layout/render "soal/tampilan-proset.html"
                      {:proset proset :subjek subj})
    ))

(defn datagen-delete-proset [kode]
  (try (db/delete-data "datasoal" (str "nomer='" kode "'"))
       (datagen-show-proset "/datagen-delete-proset")
       (catch Exception ex
        (layout/render "pesan.html"
          {:pesan (str "Gagal Delete Data error: " ex)}))))

(defn datagen-delete-template [kode]
  (try (db/delete-data "template" (str "nomer='" kode "'"))
       (datagen-show-template "/datagen-delete-template")
       (catch Exception ex
        (layout/render "pesan.html"
          {:pesan (str "Gagal Delete Data error: " ex)}))))

(defn datagen-edit-template [kode act]
  (layout/render "datagen/edit-template.html"
       {:data (db/get-data (str "select nomer,subjek from template where nomer='" kode "'") 1)
        :action act}))
(defn datagen-update-template [ser kode sub]
  (try (db/update-data-1 "template"
                         ["nomer=?" ser] {:subjek sub :kode kode})
       (layout/render "pesan.html" {:pesan "Update Subjek Template Sukses !"})
       (catch Exception ex
        (layout/render "pesan.html"
          {:pesan (str "Gagal Update Data error: " ex)}))))

(defroutes datagen-routes

  (GET "/datagen-create-data" []
       (layout/render "datagen/datawork.html"))
  (POST "/datagen-create-data" [tprogram]
     (handle-datagen-create-data tprogram))
  (POST "/datagen-save-data" [code datas soal kodebutir]
        (handle-datagen-save-data code (str datas) (str soal) kodebutir))
  (POST "/datagen-show-soal" [showsoal]
        (layout/render "datagen/show-soal.html" {:soal showsoal}))
  (GET "/datagen-edit-butir" []
       (datagen-search-butir "/datagen-search-edit"))
  (POST "/datagen-search-edit" [kdbtr]
        (handle-datagen-search-edit kdbtr "/datagen-do-edit"))
  (POST "/datagen-do-edit" [kodebutir kdbtr]
        (handle-do-edit kodebutir kdbtr))
  (POST "/datagen-update-butir" [kodebutir code data soal gambar]
        (handle-datagen-update-butir kodebutir code data soal gambar))

  (GET "/datagen-delete-butir" []
       (datagen-search-butir "/datagen-search-delete"))
  (POST "/datagen-search-delete" [kdbtr]
        (handle-datagen-search-edit kdbtr "/datagen-do-delete"))
  (POST "/datagen-do-delete" [kodebutir kdbtr]
        (handle-datagen-do-delete kodebutir kdbtr))

  ;;; Proset
  (GET "/datagen-create-proset" []
      (let [task1 (session/put! :problems [])
            task2 (session/put! :template 0)]
        (layout/render "datagen/proset-subjek.html" {:action "/datagen-choose-subject"})))
  (POST "/datagen-choose-subject" [subjek]
        (datagen-choose-subject subjek "/datagen-choose-problems"))
  (POST "/datagen-choose-problems" [kelas kurikulum bidangstudi subjek]
        (datagen-choose-problems kelas kurikulum bidangstudi subjek "/datagen-add-problems"))
  (POST "/datagen-add-problems" [kode subjek]
        (datagen-add-problems kode subjek "/datagen-do-add-problems"))
  (POST "/datagen-do-add-problems" [kode]
        (datagen-do-add-problems kode "/datagen-update-problems"))
  (POST "/datagen-update-problems" [kode jsoal]
        (datagen-update-problems kode jsoal "/datagen-do-add-problems"))
  (GET "/datagen-save-proset" []
        (datagen-save-proset))

  (GET "/datagen-show-proset" []
        (datagen-show-proset "/datagen-detail-proset"))
  (POST "/datagen-detail-proset" [kode]
        (datagen-detail-proset kode))

  (GET "/datagen-delete-proset" []
       (datagen-show-proset "/datagen-delete-proset"))
  (POST "/datagen-delete-proset" [kode]
        (datagen-delete-proset kode))

  ;;; Template
  (GET "/datagen-create-template" []
       (let [task1 (session/put! :problems [])
             task2 (session/put! :template 1)]
              (layout/render "datagen/proset-subjek.html" {:action "/datagen-choose-subject-t"})))
  (POST "/datagen-choose-subject-t" [subjek]
        (datagen-choose-subject subjek "/datagen-choose-problems-t"))
  (POST "/datagen-choose-problems-t" [kelas kurikulum bidangstudi subjek]
        (datagen-choose-problems kelas kurikulum bidangstudi subjek "/datagen-add-problems-t"))
  (POST "/datagen-add-problems-t" [kode subjek]
        (datagen-add-problems kode subjek "/datagen-do-add-problems-t"))
  (POST "/datagen-do-add-problems-t" [kode]
        (datagen-do-add-problems kode "/datagen-update-problems-t"))
  (POST "/datagen-update-problems-t" [kode jsoal]
        (datagen-update-problems kode jsoal "/datagen-do-add-problems-t"))
  (GET "/datagen-save-template" []
        (datagen-save-template))

    (GET "/datagen-show-template" []
        (datagen-show-template "/datagen-detail-template"))
  (POST "/datagen-detail-template" [kode]
        (datagen-detail-template kode))

  (GET "/datagen-delete-template" []
       (datagen-show-template "/datagen-delete-template"))
  (POST "/datagen-delete-template" [kode]
        (datagen-delete-template kode))

  (GET "/datagen-edit-template" []
       (datagen-show-template "/datagen-edit-template"))
  (POST "/datagen-edit-template" [kode]
       (datagen-edit-template kode "/datagen-update-template"))
  (POST "/datagen-update-template" [serial kode subjek]
        (datagen-update-template (Integer/parseInt serial) kode subjek))

)
