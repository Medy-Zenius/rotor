(ns rotor.routes.student
  (:require [compojure.core :refer :all]
            [rotor.views.layout :as layout]
            [noir.validation :as vali]
            [noir.util.crypt :as crypt]
            [noir.response :as resp]
            [rotor.models.db :as db]
            [rotor.models.share :as share]
            [rotor.routes.dp :as dp]
            [noir.session :as session]
            [ring.util.response :refer [file-response]]
            ;[progen.routes.dp :as dp]
            ))

(defroutes student-routes
  (GET "/student-dp-fis-10" []
       (share/search-bab-lp "/student-view-butir" "Lesson Plan - Bab Pelajaran" "C1A" "2" "F"))
  (POST "/student-view-butir" [kode]
        (share/view-butir kode "/student-view-dp"))
  (POST "/student-view-dp" [act vod]
        (cond
          ;(= vod "a") (resp/redirect (str "/filespro/" act))
          (= vod "b") (dp/dp-pilih-soal act)
          (= vod "c") (dp/dp-pilih-soal-learn act)
         ))
  (POST "/student-view-data" [kode]
        (share/view-data (session/get :id) kode "/student-view-dp")
        )

  (GET "/student-change-pw" []
       (share/change-pw (session/get :id) "/student-change-pw"))
  (POST "/student-change-pw" [opw npw npw1]
       (share/handle-change-pw (session/get :id) opw npw npw1))

  (GET "/student-dp-fis-11" []
       (share/search-bab-lp "/student-view-butir" "Lesson Plan - Bab Pelajaran" "C2A" "2" "F"))
  (GET "/student-dp-fis-12" []
       (share/search-bab-lp "/student-view-butir" "Lesson Plan - Bab Pelajaran" "C3A" "1" "F"))
  (GET "/student-logout" []
       (share/logout))
  (GET "/student-sp-fis-10" []
       (share/search-bab-lp "/student-view-data" "Your Practised Data" "C1A" "2" "F"))
  (GET "/student-sp-fis-11" []
       (share/search-bab-lp "/student-view-data" "Your Practised Data" "C2A" "2" "F"))
  (GET "/student-sp-fis-12" []
       (share/search-bab-lp "/student-view-data" "Your Practised Data" "C3A" "1" "F"))
  (GET "/student-to" []
       (share/search-kode-to "/student-to-work"))
  (POST "/student-to-work" [kode]
       (share/to-work kode "/student-eval-to"))
)
