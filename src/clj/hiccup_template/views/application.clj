(ns hiccup-template.views.application
  (:require [hiccup.core :as h]
            [hiccup.page :as p]))

(defn app-head
  ([] 
   (h/html [:head
            (h/html [:meta {:http-equiv "Content-Type"
                            :content    "text/html; charset=UTF-8"
                            :charset    "UTF-8"}]
                    [:meta {:name    "viewport"
                            :content "width=device-width, initial-scale=1"}]
                    [:title "Welcome to Hiccup-Template"])]))
  ([head-content]
   (h/html [:head
            (h/html [:meta {:http-equiv "Content-Type"
                            :content    "text/html; charset=UTF-8"
                            :charset    "UTF-8"}]
                    [:meta {:name    "viewport"
                            :content "width=device-width, initial-scale=1"}]
                    [:title "Welcome to Hiccup-Template"]
                    head-content)])))


(defn app-body
  ([]
   (h/html [:body]))
  ([body-content]
   (h/html [:body body-content])))
