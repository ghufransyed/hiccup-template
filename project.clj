(defproject hiccup-template "0.1.0-SNAPSHOT"

  :description "FIXME: write description"
  :url "http://example.com/FIXME"

  :dependencies [[luminus-log4j "0.1.3"]
                 [org.clojure/clojure "1.8.0"]
                 [selmer "1.0.6"]
                 [hiccup "1.0.5"]
                 [markdown-clj "0.9.89"]
                 [ring-middleware-format "0.7.0"]
                 [metosin/ring-http-response "0.7.0"]
                 [bouncer "1.0.0"]
                 [org.webjars/bootstrap "4.0.0-alpha.2"]
                 [org.webjars/font-awesome "4.6.3"]
                 [org.webjars.bower/tether "1.3.2"]
                 [org.webjars/jquery "2.2.4"]
                 [org.clojure/tools.logging "0.3.1"]
                 [compojure "1.5.1"]
                 [ring-webjars "0.1.1"]
                 [ring/ring-defaults "0.2.1"]
                 [mount "0.1.10"]
                 [cprop "0.1.8"]
                 [org.clojure/tools.cli "0.3.5"]
                 [luminus-nrepl "0.1.4"]
                 [org.webjars/webjars-locator-jboss-vfs "0.1.0"]
                 [luminus-immutant "0.2.0"]]

  :min-lein-version "2.0.0"

  :jvm-opts ["-server" "-Dconf=.lein-env"]
  :source-paths ["src/clj"]
  :resource-paths ["resources"]
  :target-path "target/%s/"
  :main hiccup-template.core

  :plugins [[lein-cprop "1.0.1"]
            [lein-immutant "2.1.0"]]

  :profiles
  {:uberjar {:omit-source true
             
             :aot :all
             :uberjar-name "hiccup-template.jar"
             :source-paths ["env/prod/clj"]
             :resource-paths ["env/prod/resources"]}

   :dev           [:project/dev :profiles/dev]
   :test          [:project/test :profiles/test]

   :project/dev  {:dependencies [[prone "1.1.1"]
                                 [ring/ring-mock "0.3.0"]
                                 [ring/ring-devel "1.5.0"]
                                 [pjstadig/humane-test-output "0.8.0"]]
                  :plugins      [[com.jakemccrary/lein-test-refresh "0.14.0"]]
                  
                  :source-paths ["env/dev/clj" "test/clj"]
                  :resource-paths ["env/dev/resources"]
                  :repl-options {:init-ns user}
                  :injections [(require 'pjstadig.humane-test-output)
                               (pjstadig.humane-test-output/activate!)]}
   :project/test {:resource-paths ["env/dev/resources" "env/test/resources"]}
   :profiles/dev {}
   :profiles/test {}})
