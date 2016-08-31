(ns hiccup-template.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [hiccup-template.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[hiccup-template started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[hiccup-template has shut down successfully]=-"))
   :middleware wrap-dev})
