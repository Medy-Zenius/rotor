;;Teori Kinetik Gas
;;Persamaan gas ideal (suhu tetap)
(spit "data/fis1113/bab8/C2A2FHAA-0.txt"
(vec
(take 200
(for [P1 (range 2 5 1/4) V1 (range 2 10 1/2) V2 (range 1 10 1/2)
        :when (not= V1 V2)
        :let [P2 (/ (* P1 V1) V2)]
      ]
        [P1 V1 P2 V2]))))
;;Persamaan gas ideal (volume tetap)
(spit "data/fis1113/bab8/C2A2FHAA-1.txt"
(vec
(take 200
(for [P1 (range 1 5 1/4) T1 (range 27 78 10) T2 (range 27 78 10)
        :when (not= T1 T2)
        :let [P2 (* P1 (/ (+ T2 273) (+ T1 273)))]
      ]
        [P1 T1 P2 T2]))))
;;Persamaan gas ideal (tekanan tetap)
(spit "data/fis1113/bab8/C2A2FHAA-2.txt"
(vec
(take 200
(for [V1 (range 1 5 1/4) T1 (range 27 78 10) T2 (range 27 78 10)
        :when (not= T1 T2)
        :let [V2 (* V1 (/ (+ T2 273) (+ T1 273)))]
      ]
        [V1 T1 V2 T2]))))

;;Persamaan gas ideal (tekanan tetap)
(spit "data/fis1113/bab8/C2A2FHAB-0.txt"
(vec
(take 200
(for [P1 (range 1 5) V1 (range 1 5 1/4) T1 (range 27 78 10) T2 (range 27 78 10) P2 (range 2 6)
        :when (not= P1 P2)
        :let [V2 (* V1 (/ (+ T2 273) (+ T1 273)) (/ P1 P2))]
      ]
        [P1 V1 T1 P2 V2 T2]))))

(spit "data/fis1113/bab8/C2A2FHAB-1.txt"
(vec
(take 200
(for [P (range 2 11) T [300 350 400] n (range 5 11)
        :let [V (/ (* n 8.314 T 0.01) P)]
      ]
        [P n T (nd V 2)]))))

(spit "data/fis1113/bab8/C2A2FHAB-2.txt"
(vec
(take 200
(for [V (range 50 100 10) T [300 350 400] n (range 5 11)
        :let [P (/ (* n 8.314 T 0.01) V)]
      ]
        [V n T (nd P 2)]))))

;;PV = NkT 10^23
(spit "data/fis1113/bab8/C2A2FHAC-0.txt"
(vec
(take 200
(for [P (range 1 11) T [300 350 400]
        :let [V (* 1.38 (+ 1 (rand-int 10)))
              N (/ (* P V 100) (* 1.38 T))]
      ]
        [P T (nd V 3) (nd N 2)]))))

(spit "data/fis1113/bab8/C2A2FHAC-1.txt"
(vec
(take 200
(for [n1 (range 1 10) fP [7/8 3/4 5/6 2/3 1/2 1/3 1/4 1/5] fT [8/7 6/5 5/4 4/3 3/2 2 1]
        :when (< (/ fP fT) 1)
        :let [n2 (* n1 (/ fP fT))]

      ]
        [n1 (- n1 n2) (nd (* (- n1 n2) 6.02) 2) fP fT]))))

;;Energi kinetik gas
(spit "data/fis1113/bab8/C2A2FHAE-0.txt"
(vec
(take 200
(for [n (range 1 10) T (range 300 400 10)
        :let [Ektot (* 1.5 n 6.02 1.38 T 0.01)]
      ]
        [(nd (* n 0.01) 2) T (nd Ektot 2)]))))

(spit "data/fis1113/bab8/C2A2FHAE-1.txt"
(vec
(take 200
(for [T (range 300 400)
        :let [Ek (* 1.5 1.38 T 0.01)]
      ]
        [T (nd Ek 2)]))))

(spit "data/fis1113/bab8/C2A2FHAE-2.txt"
(vec
(take 200
(for [T (range 300 400 10) mo [4 20.2 39.9 83.8 131.3]
        :let [mgram (nd (* mo 1.66) 3)
              vrms (* 100 (Math/sqrt (/ (* 3 1.38 T) mgram)))]
      ]
        [T mgram (nd vrms 2)]))))

(spit "data/fis1113/bab8/C2A2FHAF-0.txt"
(vec
(take 200
(for [pT (range 1.1 5 0.1)
        :let [pT2 (* pT pT)]
      ]
        [(nd pT 1) (nd pT2 4)]))))

(spit "data/fis1113/bab8/C2A2FHAG-0.txt"
(vec
(take 200
(for [P (range 1 4 0.2) M (range 1 10) V (range 10 20 2)
        :let [vrms (* 100 (Math/sqrt (/ (* 30 P V) M)))]
      ]
        [(nd P 1) M V (Math/round vrms)]))))

(spit "data/fis1113/bab8/C2A2FHAH-0.txt"
(vec
(take 200
(for [vx (range 300 3300 100)
        :let [vrms (Math/sqrt (* 3 vx vx))]
      ]
        [vx (Math/round vrms)]))))

(spit "data/fis1113/bab8/C2A2FHAH-1.txt"
(vec
(take 200
(for [d [3 5 7] N (range 2 10 2) T (range 300 400 20)
        :let [Ektot (* d 0.5 N 1.38 T)]
      ]
        [d N T (nd Ektot 2)]))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))
