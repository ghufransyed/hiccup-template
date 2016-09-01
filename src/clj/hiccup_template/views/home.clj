(ns hiccup-template.views.home
  (:require [hiccup.core :as h]
            [hiccup.page :as hp]
            [hiccup-template.views.application :as app-view]))

(defn page []
  (h/html (app-view/app-head)
          (app-view/app-body "This is some text for the home page")))

