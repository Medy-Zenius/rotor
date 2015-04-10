(ns rotor.routes.dp
  (:require
      [compojure.core :refer :all]
      [rotor.views.layout :as layout]
      [noir.session :as session]
      [noir.response :as resp]
      [clj-time [format :as timef] [coerce :as timec]]
      [rotor.models.db :as db]
      [rotor.models.genfunc :as fnc]
      [rotor.soal.C1X1F :as fis10]
      [rotor.soal.C1A2F :as fis1013]
      [rotor.soal.C2A2F :as fis1113]
      [rotor.soal.C3A1F :as fis1206]
      [rotor.soal.C1X1A :as mat10]
  )
)

(defn dp-soal [kd]
  (let [vns (str "rotor.soal." (subs kd 0 5))]

     ((resolve (symbol vns kd)))

   ))

(defn dp-pilih-soal [kode]
  (let [a (dp-soal kode)
        zen (session/get :id)
        data (db/get-data (str "select solved from datadp where id='" zen "' and kodelp='" kode "'") 1)
       ]
       (if a
       (layout/render "soal/tampilan.html"
         {
          :soal (a :soal)
          :pilihan (a :pilihan)
          ;:jawaban (a :jawaban)
          :jawaban (fnc/crypting (a :jawaban))
          :back kode
          :solved (if data (data :solved) 0)
          :img (if (a :img) (a :img) nil)
          :gambar (if (a :pictures) (a :pictures) nil)
          :grafik (if (a :grafik) (a :grafik) nil)
          :tabel (if (a :tabel) (a :tabel) nil)
         })
         (layout/render "pesan.html" {:pesan "tidak ada soal pada butir ini !"})
         )))
(defn dp-pilih-soal-learn [kode]
  (let [a (dp-soal kode)
        zen (session/get :id)
        ;data (db/get-data (str "select solved from datadp where id='" zen "' and kodelp='" kode "'") 1)
       ]
       (if a
       (layout/render "soal/tampilan-learn.html"
         {
          :soal (a :soal)
          :pilihan (a :pilihan)
          :jawaban (a :jawaban)
          :back kode
          ;:solved (if data (data :solved) 0)
          :img (if (a :img) (a :img) nil)
          :gambar (if (a :pictures) (a :pictures) nil)
          :grafik (if (a :grafik) (a :grafik) nil)
          :tabel (if (a :tabel) (a :tabel) nil)
          :teori (if (a :teori) (a :teori) nil)
         })
         (layout/render "pesan.html" {:pesan "tidak ada soal pada butir ini !"})
         )))

(defn dp-update-data [zen bk]
  (let [data (db/get-data (str "select solved,kodelp from datadp where id='" zen "' and kodelp = '" bk "'") 1)
        dc (if data (db/update-data-1 "datadp"
                                      ["kodelp=? AND id=?" (data :kodelp) zen]
                                      {:solved (+ (data :solved) 1)})
               (db/insert-data "datadp" {:id zen :kodelp bk :solved 1}))]

  (dp-pilih-soal bk)))

(defn dp-cek-jawaban [jw jwan bk]
  (if (= jw (fnc/decrypting jwan))
  (dp-update-data (session/get :id) bk)
  (dp-pilih-soal bk)))

(defn dp-next-problem [bk]
   (dp-pilih-soal-learn bk))

(defn dp-show-teori [urla]
  (layout/render  urla)
  )

(defroutes dp-routes

  (POST "/dp-cek-jawaban" [jawab vvoid back]
     (dp-cek-jawaban jawab vvoid back))
  (POST "/dp-next-problem" [back]
     (dp-next-problem back))
  (POST "/dp-show-teori" [urla]
     (dp-show-teori urla))

)
