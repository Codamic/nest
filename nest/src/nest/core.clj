(ns nest.core
  (:require
   [hellhound.system :as hellhound]
   [nest.system :as system])
  (:gen-class))

(defn start
  []
  (hellhound/set-system! system/system)
  (hellhound/start!))

(defn stop
  []
  (hellhound/stop!))

(defn -main
  [& args]
  (start))
