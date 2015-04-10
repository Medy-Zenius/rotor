(defproject progen "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.2"]
                 [postgresql/postgresql "9.1-901.jdbc4"]
                 [org.clojure/java.jdbc "0.2.3"]
                 [lib-noir "0.7.6"]
                 [selmer "0.5.4"]
                 [ring-server "0.3.1"]
                 [org.clojure/data.json "0.2.6"]
                 ]
  :repl-options {:init-ns rotor.repl
                 :timeout 120000}
  :jvm-opts ["-Xmx256M"]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler rotor.handler/app
         :init rotor.handler/init
         :destroy rotor.handler/destroy}
  :aot :all
  :profile
  {:production
   {:ring
    {:open-browser? false, :stacktraces? false, :auto-reload? false}}
  :dev {:dependencies [[ring/ring-devel "1.2.1"]
                        [ring-mock "0.1.5"]]}})

