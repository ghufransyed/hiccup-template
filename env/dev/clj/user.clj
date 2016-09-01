(ns user
  (:require [mount.core :as mount]
            [hiccup.core :as h]
            [hiccup.page :as hp]
            hiccup-template.core))

(defn start []
  (mount/start-without #'hiccup-template.core/repl-server))

(defn stop []
  (mount/stop-except #'hiccup-template.core/repl-server))

(defn restart []
  (stop)
  (start))


(comment)

(restart)

(hp/html5 [:head 
           [:meta {:http-equiv   "Content-Type"
                :content      "text/html"
                :charset      "UTF-8"}
            ]
           
           [:meta {:name "viewport"
                   :content "width=device-width,initial-scale=1"}]
           
           [:title "The Page"]]
          
          [:body [:div "foo"]])

(h/html [:meta {:http-equiv   "Content-Type"
                :content      "text/html"
                :charset      "UTF-8"}])
(hp/include-css "/assets/bootstrap/css/bootstrap.min.css")

