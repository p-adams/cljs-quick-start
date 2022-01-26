// Compiled by ClojureScript 1.10.914 {:optimizations :none}
goog.provide('cljs_quick_start.core');
goog.require('cljs.core');
cljs.core.println.call(null,"Hello worldddd");
cljs_quick_start.core.create_node = (function cljs_quick_start$core$create_node(){
var app = document.getElementById("app");
var p = document.createElement("p");
(p.innerHTML = "meow");

return app.appendChild(p);
});
cljs_quick_start.core.create_node.call(null);

//# sourceMappingURL=core.js.map
