(ns one-route.core
  (:require [compojure.handler :as handler]
            [compojure.core
             :as c-core
             :refer [defroutes GET POST PUT DELETE HEAD OPTIONS PATCH ANY]]
            [compojure.route :as c-route]
            [ring.server.standalone :as server]))

(defroutes api
  (GET "/" [] "Hello World"))

(defn app []
  (handler/api api))

(defn start-server []
  (server/serve (app) {:port 8070
                       :open-browser? false}))