(ns rooster-shipment-tracker.core
  (:require [clj-http.client :as http])
  (:require [clojure.data.xml :as xml])
  (:require [compojure.core :as c])
  (:require [compojure.handler :as c.handler])
  (:gen-class))

(defn fetch [url] 
  (:body (http/get url)))

(defn parse [xml] 
  (xml/parse (java.io.StringReader. xml)))

(c/defroutes app-routes 
             (c/GET "/" [] "hooray!")
             (c/GET "/fetch" [url] (fetch url ))
             )


(def app (c.handler/site app-routes))

(defn -main
  "Given a URL, downloads and parses it."
  [url]
  (println (parse (fetch url)))
  ; same as
  (-> url fetch parse println))

