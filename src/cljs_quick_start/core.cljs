(ns cljs-quick-start.core
    (:require react-dom))


(defonce root
    (.createRoot js/ReactDOM
        (.getElementById js/document "app")))


(defn app []
    (let [el (.createElement js/React "div" #js{:className "app-container"} "meow")]
    el))

(.render root
    (app))



