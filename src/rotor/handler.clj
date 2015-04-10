(ns rotor.handler
   (:require [compojure.core :refer [defroutes]]
            ;[hiccup.middleware :refer [wrap-base-url]]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [noir.util.middleware :as noir-middleware]
            [rotor.routes.home :refer [home-routes]]
            [rotor.routes.student :refer [student-routes]]
            [rotor.routes.dp :refer [dp-routes]]
            ;[progen.routes.super :refer [super-routes]]
            [rotor.routes.datagen :refer [datagen-routes]]
            ))

(defn init []
  (println "zen is starting"))

(defn destroy []
  (println "zen is shutting down"))

(defroutes app-routes
  (route/resources "/")
  (route/not-found "Not Found"))

(def app (noir-middleware/app-handler
       [
        home-routes
        student-routes
        dp-routes
        ;super-routes
        datagen-routes
        app-routes
        ]))
