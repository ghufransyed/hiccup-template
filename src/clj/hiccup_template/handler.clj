(ns hiccup-template.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [hiccup-template.layout :refer [error-page]]
            [hiccup-template.routes.home :refer [home-routes]]
            [compojure.route :as route]
            [hiccup-template.env :refer [defaults]]
            [mount.core :as mount]
            [hiccup-template.middleware :as middleware]))

(mount/defstate init-app
                :start ((or (:init defaults) identity))
                :stop  ((or (:stop defaults) identity)))

(def app-routes
  (routes
    (-> #'home-routes
        (wrap-routes middleware/wrap-csrf)
        (wrap-routes middleware/wrap-formats))
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))


(defn app [] (middleware/wrap-base #'app-routes))
