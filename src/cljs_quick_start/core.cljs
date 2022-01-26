(ns cljs-quick-start.core)


(defonce app (.getElementById js/document "app"))

(defn render [el]
    (.appendChild app el))

(defn p-node [t]
    (let [el (.createElement js/document "p")]
        (set! (.-innerHTML el) t)
        el))


(render (p-node "meow"))


