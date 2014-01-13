(ns one-route.core
  (:require [compojure.handler :as handler]
            [compojure.core
             :as c-core
             :refer [defroutes GET POST PUT DELETE HEAD OPTIONS PATCH ANY]]
            [compojure.route :as c-route]
            [ring.server.standalone :as server]
            [ring.middleware.json :as ring-json]))

(defroutes api
  (GET "/" [] (slurp "resources/public/html/index.html"))
  (c-route/resources "/"))

(defn app []
  (-> (handler/api api)
    (ring-json/wrap-json-body {:keywords? true})
    (ring-json/wrap-json-response)))

(defn start-server []
  (server/serve (app) {:port 8070
                       :open-browser? false}))