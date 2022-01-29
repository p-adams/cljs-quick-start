(ns cljs-quick-start.core
    (:require react-dom))

;;(defn e (1)
;; [el props & children]
;;  (apply js/React.createElement el (clj->js props) children))



(defonce root
    (.createRoot js/ReactDOM
        (.getElementById js/document "app")))

(let [[c, s] (js/React.useState 0)]
    (.createElement js/React "div" #js{:className "counter-app"}
            (.createElement js/React "button"
                {:onClick
                    (fn []( s (inc c)))})
                (str "count: " c)))

(defn counter []
  (.createElement js/React "div" nil "hello"))



(defn app []
    (let [el (.createElement js/React "div" #js{:className "app-container"} (counter))]
    el))

(.render root
    (app))



