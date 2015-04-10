(ns rotor.routes.home
  (:require [compojure.core :refer :all]
            [rotor.views.layout :as layout]
            [noir.validation :as vali]
            [noir.util.crypt :as crypt]
            [noir.response :as resp]
            [rotor.models.db :as db]
            [rotor.models.share :as share]
            [noir.session :as session]
            ;[ring.util.response :refer [file-response]]
            ;[progen.routes.dp :as dp]
            ))

(defn valid? [id pass pass1]
  (vali/rule (vali/has-value? id)
    [:id "user id is required"])
  (vali/rule (vali/min-length? pass 5)
    [:pass "password must be at least 5 characters"])
  (vali/rule (= pass pass1)
    [:pass "entered passwords do not match"])
  (not (vali/errors? :id :pass :pass1)))

(defn format-error [id ex]
  (cond
    (and (instance? org.postgresql.util.PSQLException ex)
      (= 0 (.getErrorCode ex)))
    (str "The user with id " id " already exists!")
    :else
    "An error has occured while processing the request"))

(defn home-sign [& [id nm em]]
(layout/render "reg-user.html"
{
  :id id
  :name nm
  :email em
  :id-error (first (vali/get-errors :id))
  :pass-error (first (vali/get-errors :pass))}))

(defn handle-home-sign [nm em id pass pass1]
  (if (valid? id pass pass1)
    (try
      (db/insert-data "users" {:name nm :email em :id id :pass (crypt/encrypt pass) :status 1})
      (layout/render "pesan.html"
         {:pesan (str "Berhasil registrasi User dengan ID = " id)}
                      )
      (catch Exception ex
        (vali/rule false [:id (format-error id ex)])
        (home-sign)))
      (home-sign id nm em)))

(defn home-login []
    (layout/render "login.html"
       ))

(defn handle-home-login [id pass]
  (let [user (db/get-data (str "select * from users where id='" id "'") 1)]
    (if (and user (crypt/compare pass (:pass user)))
      (let [task1 (session/put! :id id)
            task2 (session/put! :status (:status user))])
    ))
    (resp/redirect "/"))


(defn home-err-msg [pesan]
  (layout/render "home/error-msg.html" {:pesan pesan}))
(defn home-change-pw [usr]
  (layout/render "home/ganti-pw.html"
     {:id usr
      }))

(defn home []
    (layout/render "home.html"))


(defroutes home-routes
  (GET "/" [] (home))
  (GET "/home-sign" [] (home-sign))
  (POST "/home-sign" [nama email id pass pass1]
  (handle-home-sign nama email id pass pass1))
  (GET "/home-login" []
       (share/login "/home-login"))
  (POST "/home-login" [id pass]
       (share/handle-login id pass))
  (GET "/home-ranks" []
       (share/ranks))
)
