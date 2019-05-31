(ns ^:figwheel-hooks plop.view
  (:require [react]
            [react-native :as rn]))

(def <> react/createElement)



(defn ^:before-load my-before-reload-callback []
  (println "BEFORE reload!!!"))

(defn ^:after-load my-after-reload-callback []
  (println "AFTER reload!!!"))


(defn root [props]
  (<> rn/View
      #js {:style #js {:backgroundColor "#FFFFFF"
                       :flex 1
                       :justifyContent "center"}}
      (<> rn/Text
          #js {:style #js {:color "black"
                           :textAlign "center"}}
          (str "HELLO"))))

