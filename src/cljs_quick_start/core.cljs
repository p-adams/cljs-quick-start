(ns cljs-quick-start.core
    (:require ["react" :as react]
              ["react-dom" :as react-dom]
              [sablono.core :as html :refer-macros [html]]))

(defonce root
    (.createRoot react-dom
        (.getElementById js/document "app")))


(defn counter []
   (let [count 0]
     (html [:div {:className "counter-app"} count])))


(defn app []
    (html [:div {:className "app-container"} (counter)]))



(.render root
    (app))



