(ns nest.routes
  (:require [hellhound.http :as http]))

(defn home
  [args]
  (println "<<<<<<<<<<<<<<<<<<<,")
  (println args)
  {:status 200 :headers [] :body "hey"})

(http/defrouter routes
  ["/" :get [{:name ::home :enter home}] :route-name :home])
