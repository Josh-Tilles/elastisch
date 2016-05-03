(ns clojurewerkz.elastisch.arguments)

(defn ->opts
  "Coerces arguments to a map"
  {:doc/format :markdown}
  [args]
  (let [x (first args)]
    (if (map? x)
      x
      (apply array-map args))))
