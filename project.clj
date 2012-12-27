(defproject rooster_shipment_tracker "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [
                 [org.clojure/clojure "1.4.0"] 
                 [clj-http "0.6.3"] 
                 [org.clojure/data.xml "0.0.6"]
                 [compojure "1.1.3"]
                ]


  :profiles { 
    :dev 
      {:dependencies [
      ]}}

  :ring {:handler rooster-shipment-tracker.core/app}
  :plugins [[lein-ring "0.7.5"]]

  :main rooster-shipment-tracker.core
)
