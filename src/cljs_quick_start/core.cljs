(ns cljs-quick-start.core
    (:require react-dom))


(defonce root
    (.createRoot js/ReactDOM
        (.getElementById js/document "app")))


(defn app []
    (let [el (.createElement js/React "div" nil "meow")]
    el))

(.render root
    (app))



