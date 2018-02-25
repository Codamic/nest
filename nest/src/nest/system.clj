(ns nest.system
  (:require
   [nest.routes :as router]
   [hellhound.components.webserver :as web]))


(def system
  {:components [(web/factory router/routes {:port 3000})]
   :workflow []})
