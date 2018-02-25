(ns nest.core
  (:require
   [hellhound.system :as hellhound]
   [nest.system :as system])
  (:gen-class))

(defn -main
  [& args]
  (hellhound/set-system! system/system)
  (hellhound/start!))
