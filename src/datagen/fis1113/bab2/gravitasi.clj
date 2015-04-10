;;Gaya Gravitasi
(spit "data/fis1113/bab2/C2A2FBCA-0.txt"
(let [G 6.672]
(loop [data [], m1 2]
   (if (> m1 20)
       data
       (recur (loop [data1 data, m2 2]
                    (if (> m2 20)
                          data1
                          (recur (loop [data2 data1, R 2]
                                       (if (> R 20)
                                       data2
                                       (let [F (/ (* G m1 m2) (* R R))
                                             ]
                                        (recur (conj data2 [m1
                                                            m2
                                                            R
                                                            (nd F 3)
                                                            ])
                         (+ R 2))))) (+ m2 2)))) (+ m1 2))))))

;;Gaya Gravitasi
(spit "data/fis1113/bab2/C2A2FBCA-1.txt"
(let [G 6.672]
(loop [data [], xr 2]
   (if (> xr 10)
       data
       (recur (loop [data1 data, xA 2]
                    (if (> xA 5)
                          data1
                          (recur (loop [data2 data1, xB 2]
                                       (if (> xB 7)
                                       data2
                                       (let [xF (/ (* xA xB) (* xr xr))
                                             ]
                                        (recur (conj data2 [xr
                                                            xA
                                                            xB
                                                            xF
                                                            ])
                         (inc xB))))) (inc xA)))) (inc xr))))))

;Gaya gravitasi bumi 1
(spit "data/fis1113/bab2/C2A2FBEA-0.txt"
(loop [data [], xm 1/8]
   (if (> xm 16)
       data
       (recur (loop [data1 data, xR 2]
                            (if (> xR 5)
                              data1
                              (recur (conj data1 [xm
                                                  xR
                                                  (/ xm (* xR xR))])
                                     (+ xR 1)))) (+ xm 1/4)))))

;Gaya gravitasi bumi 1
(spit "data/fis1113/bab2/C2A2FBEA-1.txt"
(let [vxR (filter #(> % 1) (for [a (range 1 11) b (range 1 11)](/ a b)))]
(loop [data [], ixR 0]
   (if (= ixR (count vxR))
       data
       (let [xR (nth vxR ixR)
             h (- xR 1)
             xg (/ 1 (* xR xR))]
       (recur (conj data [xR
                          h
                          xg
                          ]) (inc ixR)))))))

;Gaya gravitasi bumi 2
(spit "data/fis1113/bab2/C2A2FBEB-0.txt"
(loop [data [], xm 1/8]
   (if (> xm 4)
       data
       (recur (loop [data1 data, xR 1/8]
                            (if (> xR 4)
                              data1
                              (recur (conj data1 [xm
                                                  xR
                                                  (/ xm (* xR xR))])
                                     (+ xR 1/8)))) (+ xm 1/8)))))

;;Hukum Kepler 3
(spit "data/fis1113/bab2/C2A2FBGC-0.txt"
(vec (filter #(not (= (first %) (second %))) (filter #(= (/ (* (first %) (first %))(* (nth % 2) (nth % 2) (nth % 2)))
            (/ (* (nth % 1) (nth % 1)) (* (nth % 3) (nth % 3) (nth % 3))))
       (for [a (range  1 40), b (range  1 40), c (range  1 40), d (range  1 40) ][a b c d])))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))
