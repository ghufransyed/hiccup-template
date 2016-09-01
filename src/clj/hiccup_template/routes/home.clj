(ns hiccup-template.routes.home
  (:require [hiccup-template.layout :as layout]
            [compojure.core :refer [defroutes GET]]
            [ring.util.http-response :as response]
            [clojure.java.io :as io]
            [hiccup-template.views.home :as view]))

(defn home-page []
  (view/page))

(defn about-page []
  (layout/render "about.html"))

(defroutes home-routes
  (GET "/" [] (home-page))
  (GET "/about" [] (about-page)))

