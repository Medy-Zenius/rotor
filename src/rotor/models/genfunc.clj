(ns rotor.models.genfunc
  (:require
      [compojure.core :refer :all]
  )
)


(def huruf "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")

(defn alpis [] (nth [30 60 53 37 45] (rand-int 5)))

(defn pm []
  (if (= 0 (rand-int 2)) -1 1))

(defn random [rng]
  (+ 1 (rand-int rng)))

(defn random1 [rng]
  (rand-int rng))

(defn hrandom []
  (let [n (rand-int (count huruf))]
    (str (nth huruf n))))

(defn spm [angka]
  (if (> angka 0) "+" "-"))

(defn jawaban []
  (let [x (rand-int 5)] (subs "ABCDE" x (inc x))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd))
  )

(defn mutlak [x]
  "mutlak dari x"
  (if (< x 0) (* x -1) x))

(defn kd [x]
  "kuadrat dari x"
  (* x x))

(defn pangkat [x y]
  (reduce * (repeat y x)))

(defn rdlist [lst]
  "random dari list/vektor"
  (nth lst (rand-int (count lst))))

(defn exclude [va rng]
  "exclude dari suatu range"
  (let [
        y (loop [z (inc (rand-int rng))]
            (if (not (= z va))
                z
                (recur (inc (rand-int rng)))
            ))]
       y
    ))

;;wheter string contain slash (/)  true --> contain slash
(defn conslash [string]
  (loop [state false, x 0, stopper false]
    (if (or (= x (count string)) stopper)
        state
        (recur (if (= (subs string x (inc x)) "/") true false) (inc x) (if (= (subs string x (inc x)) "/") true false))
     )))

;; perbandingan (e.g 5/7 --> "5 : 7"  atau  5 --> " 5 : 1")
(defn sbanding [ap]
  (let [sap (str ap) cs (count sap)]
  (loop [vs "" idx 0]
     (if (= idx cs)
            (if (not (conslash (str ap))) (str ap " : " 1) vs)
            (recur (if (= (subs sap idx (inc idx)) "/")
                       (str vs " : ")
                       (str vs (subs sap idx (inc idx)))) (inc idx))))
    ))

;; separate fraction (e.g "12/7" --> ["12" "7"] , "12" --> ["12" "1"]
(defn sepfrac [s]
  (if (not (conslash s))
    [s "1"]
    (loop [vv [] x 0 stopper false]
             (if (or (= x (count s)) stopper)
                vv
                (recur (if (= (subs s x (inc x)) "/")
                                    (conj vv (subs s 0 x) (subs s (inc x) (count s)))
                                    vv)
                       (inc x) (if (= (subs s x (inc x)) "/") true false))
            ))))

;; convert fraction (e.g "6/4"  (opt = 0 --> "1 1/2") (opt = 1 --> "6 ${1}\frac{2}$"
(defn cf [s opt]
  (let [
        v (sepfrac s)
        nfir (read-string (first v))
        nsec (read-string (second v))
        hb (Math/round (Math/floor (/ nfir nsec)))
        si (- (/ nfir nsec) hb)
        ssi (sepfrac (str si))
        ]
        (cond
        (= opt 0) (str (if (= hb 0) "" (str hb)) (if (= si 0) "" (str " " si)))
        (= opt 1) (str (if (= hb 0) (if (= si 0) "$0" "$") (str "$" hb))
                           (if (= si 0) "$" (str "\\frac{" (first ssi) "}{" (second ssi) "}$")))
        (= opt 2) (str (if (= hb 0) (if (= si 0) "") (str  hb))
                           (if (= si 0) "" (str "\\frac{" (first ssi) "}{" (second ssi) "}")))
        )))

(defn phyn [x]
  (filter #(= (+ (kd (first %)) (kd (second %))) (kd (last %))) (for [c (range 1 (inc x)) b (range 1 c) a (range 1 b)][a b c])))

(defn axbc2 [x]
  (filter #(= (* (first %) (second %)) (last %)) (for [a (range 1 x) b (range 1 a) c (range 1 (* x x))] [a b (* c c)]))
  )

(defn sind [sdt]
  (* (Math/round (* (Math/sin (* Math/PI (/ sdt 180))) 100)) 0.01))

(defn cosd [sdt]
  (* (Math/round (* (Math/cos (* Math/PI (/ sdt 180))) 100)) 0.01))

(defn tand [sdt]
  (* (Math/round (* (Math/tan (* Math/PI (/ sdt 180))) 100)) 0.01))

(defn krip [x]
  (let [sx (str x)]
    (loop [hkrip ""  i 0]
      (if (= i 5)
          hkrip
          (recur (str hkrip (subs sx i (inc i)) (rand-int 10)) (inc i))) )))

(defn dekrip [sx]
  (loop [hdekrip "" i 0]
        (if (= i 5)
          (read-string hdekrip)
          (recur (str hdekrip (subs sx (* i 2) (+ (* i 2) 1))) (inc i)))))

(defn cajwb [a]
  (cond
    (and (>= a 10000) (< a 20000)) "C"
    (and (>= a 20000) (< a 40000)) "E"
    (and (>= a 40000) (< a 60000)) "A"
    (and (>= a 60000) (< a 80000)) "B"
    (and (>= a 80000) (< a 100000)) "D"
   ))

(defn cnum [sjaw]
  (cond
     (= sjaw "C") (+ 10000 (rand-int 10000))
     (= sjaw "E") (+ 20000 (rand-int 20000))
     (= sjaw "A") (+ 40000 (rand-int 20000))
     (= sjaw "B") (+ 60000 (rand-int 20000))
     (= sjaw "D") (+ 80000 (rand-int 20000))
   ))

(defn crypting [sjaw]
  (krip (cnum sjaw)))

(defn decrypting [sa]
   (cajwb (dekrip sa)))

;;; Mengubah vektor data dan string soal menjadi soal
(defn break_soal [soal]
  (let [csoal (count soal)]
    (loop [vsoal [], a 1, b 2]
       (if (> b csoal)
           vsoal
           (if (or (= "@" (subs soal b (inc b))) (= "]" (subs soal b (inc b))))
               (recur (conj vsoal (subs soal a b)) (inc b) (+ b 2))
               (recur vsoal a (inc b))))
    )))
(defn create-problem [data, soal]
  (let [vsoal1 (break_soal soal)
        cdata (count data)]
        (loop [ssoal (first vsoal1) idx 0]
           (if (= idx (dec cdata))
               ssoal
               (recur (str ssoal (nth data idx) (nth vsoal1 (+ idx 1))) (inc idx))
           ))))

(defn special [a n j]
  (let [pil [] x (+ 1 (rand-int 5))]
    (cond
     (= j "A") (conj pil (nd a n) (nd (* x 2.0) n) (nd (* x 3.0) n) (nd (* x 4.0) n) (nd (* x 5.0) n))
     (= j "E") (conj pil (nd (* x 5.0) n) (nd (* x 4.0) n) (nd (* x 3.0) n) (nd (* x 2.0) n) (nd a n))
     (= j "B") (conj pil (nd (* x 2.0) n) (nd a n) (nd (* x 0.5) n) (nd (* x 0.4) n) (nd (* x 0.3) n))
     (= j "C") (conj pil (nd (* x 3.0) n) (nd (* x 2.0) n) (nd a n) (nd (* x 0.5) n) (nd (* x 0.4) n))
     (= j "D") (conj pil (nd (* x 4.0) n) (nd (* x 3.0) n) (nd (* x 2.0) n) (nd a n) (nd (* x 0.5) n))
     )))

(defn create-option0 [ang j]
  (let [pil []]
    (cond
     (= j "A") (conj pil ang (Math/round (* ang 2.0)) (Math/round (* ang 3.0)) (Math/round (* ang 4.0)) (Math/round (* ang 5.0)))
     (= j "E") (conj pil (Math/round (* ang 5.0)) (Math/round (* ang 4.0)) (Math/round (* ang 3.0)) (Math/round (* ang 2.0)) ang)
     (= j "B") (conj pil (Math/round (* ang 2.0)) ang (Math/round (/ ang 2.0)) (Math/round (/ ang 3.0)) (Math/round (/ ang 4.0)))
     (= j "C") (conj pil (Math/round (* ang 3.0)) (Math/round (* ang 2.0)) ang (Math/round (/ ang 2.0)) (Math/round (/ ang 3.0)))
     (= j "D") (conj pil (Math/round (* ang 4.0)) (Math/round (* ang 3.0)) (Math/round (* ang 2.0)) ang (Math/round (/ ang 2.0)))
     )))

(defn create-option1 [ang j]
  "Angka dengan range -10 s/d +20 plus random x"
  (let [pil [], x (random 5)]
    (cond
     (= j "A") (conj pil ang (+ ang x 5) (+ ang x 10) (+ ang x 15) (+ ang x 20))
     (= j "E") (conj pil (+ ang x 20) (+ ang x 15) (+ ang x 10) (+ ang x 5) ang)
     (= j "B") (conj pil (+ ang x 5) ang (- ang x 5) (- ang x 10) (- ang x 15))
     (= j "C") (conj pil (+ ang x 10) (+ ang x 5) ang (- ang x 5) (- ang x 10))
     (= j "D") (conj pil (+ ang x 15) (+ ang x 10) (+ ang x 5) ang (- ang x 5))
     )))
(defn create-option1a [ang j]
  "Angka dengan range -4 s/d +4 plus random x"
  (let [pil [], x (random 3)]
    (cond
     (= j "A") (conj pil ang (+ ang x 1) (+ ang x 2) (+ ang x 3) (+ ang x 4))
     (= j "E") (conj pil (+ ang x 4) (+ ang x 3) (+ ang x 2) (+ ang x 1) ang)
     (= j "B") (conj pil (+ ang x 1) ang (- ang x 1) (- ang x 2) (- ang x 3))
     (= j "C") (conj pil (+ ang x 3) (+ ang x 1) ang (- ang x 1) (- ang x 2))
     (= j "D") (conj pil (+ ang x 3) (+ ang x 2) (+ ang x 1) ang (- ang x 1))
     )))
(defn create-option1b [ang j]
  "Angka dengan perkalian s/d 5 dan pembagian s/d 5"
  (let [pil []]
    (cond
     (= j "A") (conj pil ang (* ang 2) (* ang 3) (* ang 4) (* ang 5))
     (= j "E") (conj pil (/ ang 5) (/ ang 4) (/ ang 3) (/ ang 2) ang)
     (= j "B") (conj pil (* ang 2) ang (/ ang 2) (/ ang 3) (/ ang 4))
     (= j "C") (conj pil (* ang 3) (* ang 2) ang (/ ang 2) (/ ang 3))
     (= j "D") (conj pil (* ang 4) (* ang 3) (* ang 2) ang (/ ang 2))
     )))

(defn create-option2 [ang j]
  "Angka dengan range -3 s/d +4 plus random x"
  (let [pil [], x (random 5)]
    (cond
     (= j "A") (conj pil ang (+ ang (* x 1)) (+ ang (* x 2)) (+ ang (* x 3)) (+ ang (* x 4)))
     (= j "E") (conj pil (+ ang (* x 4)) (+ ang (* x 3)) (+ ang (* x 2)) (+ ang (* x 1)) ang)
     (= j "B") (conj pil (+ ang (* x 1)) ang (- ang (* x 1)) (- ang (* x 2)) (- ang (* x 3)))
     (= j "C") (conj pil (+ ang (* x 2)) (+ ang (* x 1)) ang (- ang (* x 1)) (- ang (* x 2)))
     (= j "D") (conj pil (+ ang (* x 3)) (+ ang (* x 2)) (+ ang (* x 1)) ang (- ang (* x 1)))
     )))

(defn create-option3 [a n j]
  "Satu angka dengan n jumlan desimal"
  (if (= a 0.0)
  (special a n j)
  (let [pil []]
    (cond
     (= j "A") (conj pil (nd a n) (nd (* a 2.0) n) (nd (* a 3.0) n) (nd (* a 4.0) n) (nd (* a 5.0) n))
     (= j "E") (conj pil (nd (* a 5.0) n) (nd (* a 4.0) n) (nd (* a 3.0) n) (nd (* a 2.0) n) (nd a n))
     (= j "B") (conj pil (nd (* a 2.0) n) (nd a n) (nd (/ a 2.0) n) (nd (/ a 3.0) n) (nd (/ a 4.0) n))
     (= j "C") (conj pil (nd (* a 3.0) n) (nd (* a 2.0) n) (nd a n) (nd (/ a 2.0) n) (nd (/ a 3.0) n))
     (= j "D") (conj pil (nd (* a 4.0) n) (nd (* a 3.0) n) (nd (* a 2.0) n) (nd a n) (nd (/ a 2.0) n))
     ))))

(defn create-option3a [a n j]
  "Satu angka dengan n jumlan desimal"
  (if (= a 0.0)
  (special a n j)
  (let [pil []]
    (cond
     (= j "A") (conj pil (nd a n) (nd (* a 2.0) n) (nd (* a 4.0) n) (nd (* a 10.0) n) (nd (* a 100.0) n))
     (= j "E") (conj pil (nd (* a 100.0) n) (nd (* a 10.0) n) (nd (* a 3.0) n) (nd (* a 2.0) n) (nd a n))
     (= j "B") (conj pil (nd (* a 10.0) n) (nd a n) (nd (/ a 2.0) n) (nd (/ a 10.0) n) (nd (/ a 100.0) n))
     (= j "C") (conj pil (nd (* a 10.0) n) (nd (* a 2.0) n) (nd a n) (nd (/ a 2.0) n) (nd (/ a 10.0) n))
     (= j "D") (conj pil (nd (* a 100.0) n) (nd (* a 10.0) n) (nd (* a 2.0) n) (nd a n) (nd (/ a 10.0) n))
     ))))

(defn create-option4 [ang v j]
  "Angka dan String"
  (let [pil [], x (random 5)]
    (cond
     (= j "A") (conj pil (str ang v) (str (+ ang x 5) v) (str (+ ang x 10) v) (str (+ ang x 15) v) (str (+ ang x 20) v))
     (= j "E") (conj pil (str (+ ang x 20) v) (str (+ ang x 15) v) (str (+ ang x 10) v) (str (+ ang x 5) v) (str ang v))
     (= j "B") (conj pil (str (+ ang x 5) v) (str ang v) (str (- ang x 5) v) (str (- ang x 10) v) (str (- ang x 15) v))
     (= j "C") (conj pil (str (+ ang x 10) v) (str (+ ang x 5) v) (str ang v) (str (- ang x 5) v) (str (- ang x 10) v))
     (= j "D") (conj pil (str (+ ang x 15) v) (str (+ ang x 10) v) (str (+ ang x 5) v) (str ang v) (str (- ang x 5) v))
     )))

(defn create-option4a [ang v j]
  "Angka dan String"
  (let [pil [], x (random 5)]
    (cond
     (= j "A") (conj pil (str ang v) (str (* ang x 2) v) (str (* ang x 3) v) (str (* ang x 4) v) (str (* ang x 5) v))
     (= j "E") (conj pil (str (* ang x 5) v) (str (* ang x 4) v) (str (* ang x 3) v) (str (* ang x 2) v) (str ang v))
     (= j "B") (conj pil (str (* ang x 2) v) (str ang v) (str (/ ang x 2) v) (str (/ ang x 3) v) (str (/ ang x 4) v))
     (= j "C") (conj pil (str (* ang x 3) v) (str (* ang x 2) v) (str ang v) (str (/ ang x 2) v) (str (/ ang x 3) v))
     (= j "D") (conj pil (str (* ang x 4) v) (str (* ang x 3) v) (str (* ang x 2) v) (str ang v) (str (/ ang x 2) v))
     )))

(defn create-option5 [p j]
  "dua pilihan angka"
  (let [pil [], x (random 5)]
    (cond
     (= j "A") (conj pil (str (first p) " dan " (second p))
                         (str (+ (first p) x 5) " dan " (second p))
                         (str (+ (first p) x 10) " dan " (second p))
                         (str (first p) " dan " (+ (second p) x 5))
                         (str (+ (first p) x 5) " dan " (+ (second p) x 5)))
     (= j "E") (conj pil (str (first p) " dan " (+ (second p) x 10))
                         (str (+ (first p) x 15) " dan " (second p))
                         (str (+ (first p) x 10) " dan " (second p))
                         (str (+ (first p) x 5) " dan " (second p))
                         (str (first p) " dan " (second p)))
     (= j "B") (conj pil (str (+ (first p)x 5) " dan " (second p))
                         (str (first p) " dan " (second p))
                         (str (+ (first p) x 10) " dan " (second p))
                         (str (+ (first p) x 5) " dan " (+ (second p) x 5))
                         (str (- (first p) x 5) " dan " (+ (second p) x 5)))
     (= j "C") (conj pil (str (+ (first p) x 10) " dan " (second p))
                         (str (+ (first p) x 5) " dan "(+ (second p) x 5))
                         (str (first p) " dan " (second p))
                         (str (- (first p) x 5) " dan " (second p))
                         (str (first p) " dan " (- (second p) x 5)))
     (= j "D") (conj pil (str (+ (first p) x 10) " dan " (+ (second p) x 10))
                         (str (- (first p) x 5) " dan " (- (second p) x 5))
                         (str (+ (first p) x 5) " dan " (second p))
                         (str (first p) " dan " (second p))
                         (str (first p) " dan " (+ (second p) x 5)))
     )))

(defn create-option5a [a n j]
  "Dua angka dengan n jumlan desimal"
  (let [pil []]
    (cond
     (= j "A") (conj pil (str (nd (first a) n) " dan " (nd (second a) n))
                         (str (nd (* (first a) 2.0) n) " dan " (nd (second a) n))
                         (str (nd (* (first a) 3.0) n) " dan " (nd (* (second a) 2.0) n))
                         (str (nd (* (first a) 4.0) n) " dan " (nd (* (second a) 2.0) n))
                         (str (nd (* (first a) 4.0) n) " dan " (nd (* (second a) 3.0) n)))
     (= j "E") (conj pil (str (nd (* (first a) 4.0) n) " dan " (nd (* (second a) 3.0) n))
                         (str (nd (* (first a) 4.0) n) " dan " (nd (* (second a) 2.0) n))
                         (str (nd (* (first a) 3.0) n) " dan " (nd (* (second a) 2.0) n))
                         (str (nd (* (first a) 2.0) n) " dan " (nd (second a) n))
                         (str (nd (first a) n) " dan " (nd (second a) n)))
     (= j "B") (conj pil (str (nd (* (first a) 2.0) n) " dan " (nd (second a) n))
                         (str (nd (first a) n) " dan " (nd (second a) n))
                         (str (nd (/ (first a) 2.0) n) " dan " (nd (second a) n))
                         (str (nd (/ (first a) 3.0) n) " dan " (nd (/ (second a) 2.0) n))
                         (str (nd (/ (first a) 3.0) n) " dan " (nd (/ (second a) 3.0) n)))
     (= j "C") (conj pil (str (nd (* (first a) 3.0) n) " dan " (nd (* (second a) 2.0) n))
                         (str (nd (* (first a) 2.0) n) " dan " (nd (second a) n))
                         (str (nd (first a) n) " dan " (nd (second a) n))
                         (str (nd (/ (first a) 2.0) n) " dan " (nd (second a) n))
                         (str (nd (/ (first a) 3.0) n) " dan " (nd (/ (second a) 2.0) n)))
     (= j "D") (conj pil (str (nd (* (first a) 4.0) n) " dan " (nd (* (second a) 2.0) n))
                         (str (nd (* (first a) 3.0) n) " dan " (nd (* (second a) 2.0) n))
                         (str (nd (* (first a) 2.0) n) " dan " (nd (second a) n))
                         (str (nd (first a) n) " dan " (nd (second a) n))
                         (str (nd (/ (first a) 2.0) n) " dan " (nd (/ (second a) 2.0) n)))
     )))

(defn create-option6 [p j]
  "Dua pilihan: angka dan kiri-kanan, kanan = 1"
  (let [pil [] x (random 5)
        s [(if (= (second p) 1) "kanan" "kiri") (if (= (second p) 1) "kiri" "kanan")]]
      (cond
        (= j "A") (conj pil (str (first p) " ; " (first s))
                            (str (+ (first p) x 5) " ; " (first s))
                            (str (first p) " ; " (second s))
                            (str (+ (first p) x 5) " ; " (second s))
                            (str (+ (first p) x 10) " ; " (first s)))
        (= j "E") (conj pil (str (+ (first p) x 10) " ; " (second s))
                            (str (first p) " ; " (second s))
                            (str (+ (first p) x 5) " ; " (second s))
                            (str (+ (first p) x 5) " ; " (first s))
                            (str (first p) " ; " (first s)))
        (= j "B") (conj pil (str (+ (first p) x 5) " ; " (first s))
                            (str (first p) " ; " (first s))
                            (str (first p) " ; " (second s))
                            (str (+ (first p) x 5) " ; " (second s))
                            (str (+ (first p) x 10) " ; " (second s)))
        (= j "C") (conj pil (str (+ (first p) x 10) " ; " (second s))
                            (str (+ (first p) x 5) " ; " (second s))
                            (str (first p) " ; " (first s))
                            (str (+ (first p) x 5) " ; " (first s))
                            (str (+ (first p) x 10) " ; " (first s)))
        (= j "D") (conj pil (str (+ (first p) x 10) " ; " (first s))
                            (str (+ (first p) x 5) " ; " (first s))
                            (str (+ (first p) x 5) " ; " (second s))
                            (str (first p) " ; " (first s))
                            (str (first p) " ; " (second s)))
     )))

(defn create-option7 [p j]
  "Dua pilihan: angka dan atas-bawah, atas = 1"
  (let [pil [] x (random 5)
        s [(if (= (second p) 1) "atas" "bawah") (if (= (second p) 1) "bawah" "atas")]]
      (cond
        (= j "A") (conj pil (str (first p) " ; " (first s))
                            (str (+ (first p) x 5) " ; " (first s))
                            (str (first p) " ; " (second s))
                            (str (+ (first p) x 5) " ; " (second s))
                            (str (+ (first p) x 10) " ; " (first s)))
        (= j "E") (conj pil (str (+ (first p) x 10) " ; " (second s))
                            (str (first p) " ; " (second s))
                            (str (+ (first p) x 5) " ; " (second s))
                            (str (+ (first p) x 5) " ; " (first s))
                            (str (first p) " ; " (first s)))
        (= j "B") (conj pil (str (+ (first p) x 5) " ; " (first s))
                            (str (first p) " ; " (first s))
                            (str (first p) " ; " (second s))
                            (str (+ (first p) x 5) " ; " (second s))
                            (str (+ (first p) x 10) " ; " (second s)))
        (= j "C") (conj pil (str (+ (first p) x 10) " ; " (second s))
                            (str (+ (first p) x 5) " ; " (second s))
                            (str (first p) " ; " (first s))
                            (str (+ (first p) x 5) " ; " (first s))
                            (str (+ (first p) x 10) " ; " (first s)))
        (= j "D") (conj pil (str (+ (first p) x 10) " ; " (first s))
                            (str (+ (first p) x 5) " ; " (first s))
                            (str (+ (first p) x 5) " ; " (second s))
                            (str (first p) " ; " (first s))
                            (str (first p) " ; " (second s)))
     )))

(defn sv [value]
  (if (> value 0) 0 1))

(defn create-option8 [ve j]
  "Kombinasi tiga parameter"
  (let [pil []
        vj (last ve) vj1 (first vj) vj2 (second vj) vj3 (last vj)
        vp1 (first ve)
        vp2 (second ve)
        vp3 (nth ve 2)]
      (cond
        (= j "A") (conj pil (str (nth vp1 vj1) ", " (nth vp2 vj2) ", " (nth vp3 vj3))
                            (str (nth vp1 vj1) ", " (nth vp2 (sv vj2)) ", " (nth vp3 vj3))
                            (str (nth vp1 vj1) ", " (nth vp2 vj2) ", " (nth vp3 (sv vj3)))
                            (str (nth vp1 (sv vj1)) ", " (nth vp2 vj2) ", " (nth vp3 vj3))
                            (str (nth vp1 (sv vj1)) ", " (nth vp2 (sv vj2)) ", " (nth vp3 vj3))
                  )
        (= j "E") (conj pil (str (nth vp1 vj1) ", " (nth vp2 (sv vj2)) ", " (nth vp3 vj3))
                            (str (nth vp1 vj1) ", " (nth vp2 vj2) ", " (nth vp3 (sv vj3)))
                            (str (nth vp1 (sv vj1)) ", " (nth vp2 vj2) ", " (nth vp3 vj3))
                            (str (nth vp1 (sv vj1)) ", " (nth vp2 (sv vj2)) ", " (nth vp3 vj3))
                            (str (nth vp1 vj1) ", " (nth vp2 vj2) ", " (nth vp3 vj3))
                  )
        (= j "B") (conj pil (str (nth vp1 vj1) ", " (nth vp2 (sv vj2)) ", " (nth vp3 vj3))
                            (str (nth vp1 vj1) ", " (nth vp2 vj2) ", " (nth vp3 vj3))
                            (str (nth vp1 vj1) ", " (nth vp2 vj2) ", " (nth vp3 (sv vj3)))
                            (str (nth vp1 (sv vj1)) ", " (nth vp2 vj2) ", " (nth vp3 vj3))
                            (str (nth vp1 (sv vj1)) ", " (nth vp2 (sv vj2)) ", " (nth vp3 vj3))
                  )
        (= j "C") (conj pil (str (nth vp1 vj1) ", " (nth vp2 (sv vj2)) ", " (nth vp3 vj3))
                            (str (nth vp1 vj1) ", " (nth vp2 vj2) ", " (nth vp3 (sv vj3)))
                            (str (nth vp1 vj1) ", " (nth vp2 vj2) ", " (nth vp3 vj3))
                            (str (nth vp1 (sv vj1)) ", " (nth vp2 vj2) ", " (nth vp3 vj3))
                            (str (nth vp1 (sv vj1)) ", " (nth vp2 (sv vj2)) ", " (nth vp3 vj3))
                  )
        (= j "D") (conj pil (str (nth vp1 vj1) ", " (nth vp2 (sv vj2)) ", " (nth vp3 vj3))
                            (str (nth vp1 vj1) ", " (nth vp2 vj2) ", " (nth vp3 (sv vj3)))
                            (str (nth vp1 (sv vj1)) ", " (nth vp2 vj2) ", " (nth vp3 vj3))
                            (str (nth vp1 vj1) ", " (nth vp2 vj2) ", " (nth vp3 vj3))
                            (str (nth vp1 (sv vj1)) ", " (nth vp2 (sv vj2)) ", " (nth vp3 vj3))
                  )
     )))

(defn create-option9 [p j]
  "Perbandingan"
  (let [pil []]
      (cond
        (= j "A") (conj pil (sbanding p) (sbanding (* p 2)) (sbanding (* p 3)) (sbanding (* p 4)) (sbanding (* p 5)))
        (= j "E") (conj pil (sbanding (/ p 5)) (sbanding (/ p 4)) (sbanding (/ p 3)) (sbanding (/ p 2)) (sbanding p))
        (= j "B") (conj pil (sbanding (* p 2)) (sbanding p) (sbanding (/ p 2)) (sbanding (/ p 3)) (sbanding (/ p 4)))
        (= j "C") (conj pil (sbanding (* p 3)) (sbanding (* p 2)) (sbanding p) (sbanding (/ p 2)) (sbanding (/ p 3)))
        (= j "D") (conj pil (sbanding (* p 4)) (sbanding (* p 3)) (sbanding (* p 2)) (sbanding p) (sbanding (/ p 2)))
     )))

(defn create-option10 [angka j]
  "Angka fraction misal "55/7" --> '7${6}\frac{7}$'"
  (let [pil []
        vs (sepfrac (str angka))
        n1 (read-string (first vs))
        n2 (read-string (second vs))
        ]
    (cond
     (= j "A") (conj pil (cf (str n1 "/" n2) 1) (cf (str (* n1 5) "/" (* n2 4)) 1) (cf (str (* n1 4) "/" (* n2 3)) 1)
                         (cf (str (* n1 3) "/" (* n2 2)) 1) (cf (str (* n1 2) "/" (* n2 1)) 1))
     (= j "B") (conj pil (cf (str (* n1 5) "/" (* n2 4)) 1) (cf (str n1 "/" n2) 1) (cf (str (* n1 4) "/" (* n2 5)) 1)
                         (cf (str (* n1 3) "/" (* n2 5)) 1) (cf (str (* n1 1) "/" (* n2 2)) 1))
     (= j "C") (conj pil (cf (str (* n1 4) "/" (* n2 2)) 1) (cf (str (* n1 5) "/" (* n2 4)) 1) (cf (str n1 "/" n2) 1)
                         (cf (str (* n1 3) "/" (* n2 4)) 1) (cf (str (* n1 1) "/" (* n2 2)) 1))
     (= j "D") (conj pil (cf (str (* n1 4) "/" (* n2 2)) 1) (cf (str (* n1 5) "/" (* n2 3)) 1)
                         (cf (str (* n1 4) "/" (* n2 3)) 1) (cf (str n1 "/" n2) 1) (cf (str (* n1 1) "/" (* n2 3)) 1))
     (= j "E") (conj pil (cf (str (* n1 1) "/" (* n2 2)) 1) (cf (str (* n1 1) "/" (* n2 3)) 1)
                         (cf (str (* n1 1) "/" (* n2 4)) 1) (cf (str (* n1 1) "/" (* n2 5)) 1) (cf (str n1 "/" n2) 1))
     )))

(defn create-option11 [angka j]
  "Dua angka dan dua variabel e.g. [[4 5] ['a' 'b']] --> $4a + 5b$"
  (let [pil []
        n1 (first (first angka))
        n2 (second (first angka))
        v1 (first (second angka))
        v2 (second (second angka))
        ]
    (cond
     (= j "A") (conj pil (str "$" n1 v1 "+" n2 v2 "$") (str "$" (+ n1 1) v1 "+" n2 v2 "$") (str "$" n1 v1 "+" (+ n2 1) v2 "$")
                         (str "$" (+ n1 1) v1 "+" (+ n2 1) v2 "$") (str "$" (+ n1 2) v1 "+" n2 v2 "$"))
     (= j "B") (conj pil (str "$" (+ n1 1) v1 "+" n2 v2 "$") (str "$" n1 v1 "+" n2 v2 "$") (str "$" n1 v1 "+" (+ n2 1) v2 "$")
                         (str "$" (+ n1 1) v1 "+" (+ n2 1) v2 "$") (str "$" (+ n1 2) v1 "+" n2 v2 "$"))
     (= j "C") (conj pil (str "$" (+ n1 1) v1 "+" n2 v2 "$") (str "$" n1 v1 "+" (+ n2 1) v2 "$") (str "$" n1 v1 "+" n2 v2 "$")
                         (str "$" (+ n1 1) v1 "+" (+ n2 1) v2 "$") (str "$" (+ n1 2) v1 "+" n2 v2 "$"))
     (= j "D") (conj pil (str "$" (+ n1 1) v1 "+" n2 v2 "$") (str "$" n1 v1 "+" (+ n2 1) v2 "$")
                         (str "$" (+ n1 1) v1 "+" (+ n2 1) v2 "$") (str "$" n1 v1 "+" n2 v2 "$") (str "$" (+ n1 2) v1 "+" n2 v2 "$"))
     (= j "E") (conj pil (str "$" (+ n1 1) v1 "+" n2 v2 "$") (str "$" n1 v1 "+" (+ n2 1) v2 "$")
                         (str "$" (+ n1 1) v1 "+" (+ n2 1) v2 "$") (str "$" (+ n1 2) v1 "+" n2 v2 "$") (str "$" n1 v1 "+" n2 v2 "$"))
     )))

(defn create-option12 [angka j]
  "Dua angka dan dua variabel"
  (let [pil []
        op (first angka)
        a (second angka)
        ]
    (cond
     (= j "A") (conj pil (str "$" op "{" a "}$") (str "$" op "{" (+ a 1) "}$") (str "$" op "{" (+ a 2) "}$")
                         (str "$" op "{" (+ a 3) "}$") (str "$" op "{" (+ a 4) "}$"))
     (= j "B") (conj pil (str "$" op "{" (- a 1) "}$") (str "$" op "{" a "}$") (str "$" op "{" (+ a 1) "}$")
                         (str "$" op "{" (+ a 2) "}$") (str "$" op "{" (+ a 3) "}$"))
     (= j "C") (conj pil (str "$" op "{" (- a 2) "}$") (str "$" op "{" (- a 1) "}$") (str "$" op "{" a "}$")
                         (str "$" op "{" (+ a 1) "}$") (str "$" op "{" (+ a 2) "}$"))
     (= j "D") (conj pil (str "$" op "{" (- a 3) "}$") (str "$" op "{" (- a 2) "}$")
                         (str "$" op "{" (- a 1) "}$") (str "$" op "{" a "}$") (str "$" op "{" (+ a 1) "}$"))
     (= j "E") (conj pil (str "$" op "{" (+ a 4) "}$") (str "$" op "{" (+ a 3) "}$")
                         (str "$" op "{" (+ a 2) "}$") (str "$" op "{" (+ a 1) "}$") (str "$" op "{" a "}$"))
     )))
