(ns rotor.models.share
  (:require [compojure.core :refer :all]
            [rotor.views.layout :as layout]
            [noir.response :as resp]
            [rotor.models.db :as db]
            [rotor.routes.dp :as dp]
            [noir.util.crypt :as crypt]
            [clojure.data.json :as json]
            [noir.session :as session]))


(def n_atom (atom 0))

(defn lanjutkan []
  (layout/render "pesan.html" {:pesan "Lanjutkan!"}))

(defn error-msg [pesan]
  (layout/render "pesan.html" {:pesan pesan}))

(defn logout []
  (session/clear!)
  (resp/redirect "/"))

(defn login [act]
  (layout/render "share/login.html" {:action act}))

(defn handle-login [id pass]
  (let [user (db/get-data (str "select * from users where id='" id "'") 1)]
    (if (and user (crypt/compare pass (:pass user)))
      (let [task1 (session/put! :id id)
            task2 (session/put! :status (:status user))])
    ))
    (resp/redirect "/"))

(defn search-bab-lp [act ket ke ku bi]
  (layout/render "share/search-bab-lp.html"
  {
   :babs (db/get-data (str "select kode,keterangan from lessonplan where kode like '" ke ku bi "_' order by kode ASC") 2)
   :action act
   :keterangan ket
   }))

(defn view-butir [ko act]
  (layout/render "share/view-butir-lp.html"
      {:action act
       :butirs (db/get-data (str "select keterangan,kodekonten,proset,dp,kode from lessonplan where kode LIKE '" ko "%' order by kode ASC") 2)
       }))

(defn ranks []
    (layout/render "share/ranks.html"
       {
        :data (db/get-data (str "select id, sum(solved) from datadp group by id order by sum desc") 2)
        ;:data (db/get-data (str "select id,score from userdp order by score desc") 2)
        })
  )

(defn view-data [id ko act]
  (layout/render "share/view-data-id.html"
      {:action act
       :datas (db/get-data (str "select keterangan,kodekonten,dp,kode,solved from lessonplan
                               left join (select * from datadp where id='" id "') as foo
                               on lessonplan.kode=foo.kodelp where kode LIKE '" ko "%' and dp='1' order by kode ASC") 2)
       }))

(defn change-pw [usr act]
  (layout/render "share/ganti-pw.html"
     {:id usr
      :action act
      }))
(defn handle-change-pw [usr opw npw npw1]
  (let [duser (db/get-data (str "select pass from users where id ='" usr "'") 1)]
   (if (and duser (crypt/compare opw (:pass duser)))
    (if (= npw npw1)
      (try (db/update-data "users" (str "id='" usr "'") {:pass (crypt/encrypt npw)})(logout))
      (layout/render "pesan.html" {:pesan "Konfirmasi password baru gagal !"})
    )
    (layout/render "pesan.html" {:pesan "Password lama salah !"}) )))

;;; Create TO
;;;
(defn make-soal [kode nomer]
  "Make a single problem"
  (assoc (dp/dp-soal kode) :no nomer))
(defn make-proset [vsoal]
  (let [ckode (count vsoal), no 0]
      (loop [probs [], cnt 0]
         (if (= cnt ckode)
             probs
             (recur (loop [probs1 probs, cnt1 0]
                      (if (= cnt1 (Integer/parseInt (:jsoal (nth vsoal cnt))))
                          probs1
                          (recur (conj probs1 (make-soal (:kode (nth vsoal cnt)) (swap! n_atom inc)))
                                 (inc cnt1)))) (inc cnt))))))

(defn search-kode-to [act]
  (layout/render "share/input-kodeto.html" {:action act}))

(defn to-work [kode act]
  (let [vsoal (db/get-data (str "select kode,soal,subjek from template where kode='" kode "'") 1)
        ]
       (if (and vsoal (not= kode ""))
           (let [vs (read-string (:soal vsoal))
                 subj (:subjek vsoal)
                 zerokan (swap! n_atom (fn [n] (* 1 0)))
                 proset (make-proset vs)
                 ]
                 (layout/render "share/coba.html"
                                {:kode kode :proset (json/write-str proset)
                                 :subjek subj :jsoal (count proset) :action act}))
           (error-msg "tidak ada kode to tersebut"))))
