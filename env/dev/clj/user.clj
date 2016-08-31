(ns user
  (:require [mount.core :as mount]
            hiccup-template.core))

(defn start []
  (mount/start-without #'hiccup-template.core/repl-server))

(defn stop []
  (mount/stop-except #'hiccup-template.core/repl-server))

(defn restart []
  (stop)
  (start))


