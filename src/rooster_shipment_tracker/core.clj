(ns rooster-shipment-tracker.core
  (:require [clj-http.client :as http])
  (:gen-class))

; Given a UPS number, track it.
;

(defn fetch [url] 
  (:headers (http/get url)))

(defn -main
  "I don't do a whole lot ... yet."
  [url & args]
  (println (fetch url)))
