(ns nest.routes
  (:require [hellhound.http :as http]
            [hellhound.logger :as logger]))

(defn home
  [args]
  (logger/debug "<<<<<<<<<<<<<<<<<<<,")
  (println args)
  (assoc args :response {:status 200 :headers [] :body "hey"}))

(http/defrouter routes
  ["/" :get [{:name ::home :enter home}] :route-name :home])
