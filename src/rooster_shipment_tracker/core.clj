(ns rooster-shipment-tracker.core
  (:require [clj-http.client :as http])
  (:require [clojure.data.xml :as xml])
  (:gen-class))

(defn fetch [url] 
  (:body (http/get url)))

(defn parse [xml] 
  (xml/parse (java.io.StringReader. xml)))

(defn -main
  "Given a URL, downloads and parses it."
  [url]
  (println (parse (fetch url)))
  ; same as
  (-> url fetch parse println))
