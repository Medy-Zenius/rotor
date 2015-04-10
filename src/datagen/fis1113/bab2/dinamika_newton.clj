;;Gaya Gesek
(spit "data/fis1113/bab2/C2A2FBAF-1.txt"
(loop [data [], us 2]
   (if (> us 5)
       data
       (recur (loop [data1 data, m 2]
                    (if (> m 40)
                          data1
                          (recur (loop [data2 data1, F 2]
                                       (if (> F 100)
                                       data2
                                       (let [uk (- us 1)
                                             fsmax (* us m)
                                             fg (if (> F fsmax) (* uk m) F)
                                             a (if (> F fsmax) (/ F m) 0)
                                             ]
                                        (recur (conj data2 [(nd (* us 0.1) 1)
                                                            (nd (* uk 0.1) 1)
                                                            m
                                                            fg
                                                            F
                                                            (nd a 3)])
                         (+ F 4))))) (+ m 2)))) (inc us)))))
;;Gaya Gesek 2
(spit "data/fis1113/bab2/C2A2FBAF-2.txt"
(loop [data [], us 2]
   (if (> us 5)
       data
       (recur (loop [data1 data, m 2]
                    (if (> m 40)
                          data1
                          (recur (loop [data2 data1, F 2]
                                       (if (> F 100)
                                       data2
                                       (let [uk (- us 1)
                                             fsmax (* us m)
                                             fg (if (> F fsmax) (* uk m) F)
                                             a (if (> F fsmax) (/ F m) 0)
                                             ]
                                        (recur (conj data2 [(nd (* us 0.1) 1)
                                                            (nd (* uk 0.1) 1)
                                                            m
                                                            F
                                                            (nd a 3)])
                         (+ F 4))))) (+ m 2)))) (inc us)))))



;;Gaya gesek 2
(spit "data/fis1113/bab2/C2A2FBAG-0.txt"
(let [alfis [[30 0.5 0.87] [37 0.6 0.8] [45 0.71 0.71] [53 0.8 0.6] [60 0.87 0.5]]
      vu [0.1 0.2 0.3 0.4 0.5]
      g 10]
(loop [data [], F 50]
   (if (> F 100)
       data
       (recur (loop [data1 data, ialf 0]
                            (if (> ialf 4)
                              data1
                              (recur (loop [data2 data1, m 1]
                                       (if (> m 10)
                                           data2
                                           (let [u (nth vu (rand-int 5))
                                                 alf (first (nth alfis ialf))
                                                 sinalf (second (nth alfis ialf))
                                                 cosalf (last (nth alfis ialf))
                                                 N (+ (* F sinalf) (* m 10))
                                                 fsmax (* u N)
                                                 Fx (* F cosalf)
                                                 fg (if (> Fx fsmax) fsmax Fx)
                                                 a (if (> Fx fsmax) (/ (- Fx fsmax) m) 0)
                                                 ]
                                           (recur (conj data2 [F
                                                               m
                                                               alf
                                                               u
                                                               sinalf
                                                               cosalf
                                                               (nd fg 3)
                                                               (nd a 2)
                                                               ]) (inc m))))) (inc ialf)))) (+ F 2))))))

;;Gaya Gesek 2
(spit "data/fis1113/bab2/C2A2FBAG-1.txt"
(let [vu [0.1 0.2 0.3 0.4]]
(loop [data [], m1 3]
   (if (> m1 7)
       data
       (recur (loop [data1 data, m2 1]
                    (if (> m2 5)
                          data1
                          (recur (loop [data2 data1, iu 0]
                                       (if (> iu 3)
                                       data2
                                       (recur (loop [data3 data2, h 5]
                                                (if (> h 10)
                                                    data3
                                                    (let [u (nth vu iu)
                                                          w1 (* m1 10)
                                                          fg2 (* u m2 10)
                                                          a (/ (- w1 fg2) (+ m1 m2))
                                                          v (Math/sqrt (* 2 h a))
                                                          t (Math/sqrt (/ (* 2 h) a))
                                                          ]
                                                    (recur (conj data3 [m1 m2 u h (nd a 2) (nd v 2) (nd t 2)])
                        (inc h))))) (inc iu)))) (inc m2)))) (inc m1))))))

;;Gaya gesek 2
(spit "data/fis1113/bab2/C2A2FBAG-2.txt"
(let [alfis [[30 0.5 0.87] [37 0.6 0.8] [45 0.71 0.71] [53 0.8 0.6] [60 0.87 0.5]]
      vu [0.1 0.2 0.3 0.4]
      g 10]
(loop [data [], m 50]
   (if (> m 100)
       data
       (recur (loop [data1 data, ialf 0]
                            (if (> ialf 4)
                              data1
                              (recur (loop [data2 data1, iu 1]
                                       (if (> iu 3)
                                           data2
                                           (let [u (nth vu iu)
                                                 alf (first (nth alfis ialf))
                                                 sinalf (second (nth alfis ialf))
                                                 cosalf (last (nth alfis ialf))
                                                 N (* m 10 cosalf)
                                                 fsmax (* u N)
                                                 Fx (* m 10 sinalf)
                                                 fg (if (> Fx fsmax) fsmax Fx)
                                                 a (if (> Fx fsmax) (/ (- Fx fsmax) m) 0)
                                                 ]
                                           (recur (conj data2 [m
                                                               alf
                                                               u
                                                               sinalf
                                                               cosalf
                                                               (nd a 3)
                                                               ]) (inc iu))))) (inc ialf)))) (+ m 2))))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))
