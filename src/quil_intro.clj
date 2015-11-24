(ns quil-intro.first
    (:require [quil.core :as q]))

; define function which draws spiral
(defn draw []
  (q/background 255)

  ; move origin point to centre of screen
  (q/with-translation [(/ (q/width) 2) (/ (q/height) 2)]
    (doseq [t (range 0 100 0.01)]
      ;draw a point wih x=t*sin(t) and y = t*cos(t)
      (q/point (* t (q/sin t))
               (* t (q/cos t))))))

; run sketch
(q/defsketch trigonometry
             :size [300 300]
             :draw draw)
