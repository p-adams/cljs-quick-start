(ns cljs-quick-start.core)

(defn create-node []
    (let [app (.getElementById js/document "app")
          p (.createElement js/document "p")]
        (set! (.-innerHTML p) "meow")
        (.appendChild app  p)))

(create-node)
