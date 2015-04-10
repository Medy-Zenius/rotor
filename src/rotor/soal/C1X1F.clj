(ns rotor.soal.C1X1F
  (:require [compojure.core :refer :all]
            [rotor.models.genfunc :as fnc]
            ))

(def my-ns "rotor.soal.C1X1F")

(defn C1X1FAAA []
  (let [F (fnc/random 40)
        m (fnc/random 40)
        angka (/ F m)
        jwb (fnc/jawaban)
        ]
  {:soal (str "Sebuah balok pada lantai mendatar licin mendapat gaya mendatar sebesar " F " newton. Jika massa benda "
                  m " kg maka percepatan benda adalah ... (m/s" "$^2$" ")")
   :pilihan (fnc/create-option3 angka 3 jwb)
   :jawaban jwb
   :pictures (seq [{:obj 9 :param "#555555,050,150,300"},{:obj 4 :param "#000000,070,100,120,148"},
               {:obj 3 :param "#000000,122,125,070,000"}, {:obj 8 :param (str "#000000,200,130," F "N")},
               {:obj 8 :param (str "#000000,088,125," m "kg")}])
   }

  ))
;;;Gerak Lurus - Posisi Jarak Perpindahan
(defn C1X1FBAE-0 []
  (let [so (* (fnc/pm) (fnc/random 100))
        st (* (fnc/pm) (fnc/random 100))
        var (rand-int 2)
        angka (if (= var 0) (- st so) (Math/abs (- st so)))
        jwb (fnc/jawaban)]
  {:soal (str "Sebuah benda bergerak dari posisi awal " so " satuan menuju posisi akhir " st " satuan pada garis mendatar (sumbu x). "
              (if (= var 0) "Perpindahan " "Jarak tempuh ") "benda adalah ... satuan.")
   :pilihan (fnc/create-option1 angka jwb)
   :jawaban jwb
   :teori "teori/fis10ktsp/bab2/C1X1FBAE-0.html"}))
(defn C1X1FBAE-1 []
  (let [so (* (fnc/pm) (fnc/random1 100))
        sm (* (fnc/pm) (fnc/random1 100))
        st (* (fnc/pm) (fnc/random1 100))
        var (rand-int 2)
        angka (if (= var 0) (- st so) (+ (Math/abs (- sm so)) (Math/abs (- st sm))))
        jwb (fnc/jawaban)]
  {:soal (str "Sebuah benda bergerak dari posisi awal " so " satuan menuju posisi " sm " satuan lalu ke posisi akhir "
              st " satuan pada garis mendatar (sumbu x). "
              (if (= var 0) "Perpindahan " "Jarak tempuh ") "benda adalah ... satuan.")
   :pilihan (fnc/create-option1 angka jwb)
   :jawaban jwb
   :teori "teori/fis10ktsp/bab2/C1X1FBAE-0.html"}))
(defn C1X1FBAE []
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FBAE-" x))))))

;;;Gerak Lurus - Kecepatan dan kelajuan rata-rata
(defn C1X1FBAF-0 []
  (let [so (* (fnc/pm) (fnc/random1 100))
        sm (* (fnc/pm) (fnc/random1 100))
        st (* (fnc/pm) (fnc/random1 100))
        t1 (fnc/random 20)
        t2 (fnc/random 10)
        var (rand-int 2)
        angka (if (= var 0)
                (/ (- st so) (+ t1 t2))
                (/ (+ (Math/abs (- sm so)) (Math/abs (- st sm))) (+ t1 t2)))
        jwb (fnc/jawaban)]
  {:soal (str "Sebuah benda bergerak dari posisi awal " so " meter menuju posisi " sm " meter selama " t1 " detik, lalu ke posisi akhir "
              st " meter selama " t2 " detik, pada garis mendatar (sumbu x). "
              (if (= var 0) "Kecepatan rata-rata " "Laju rata-rata ") "benda adalah ... (m/s).")
   :pilihan (fnc/create-option3 angka 3 jwb)
   :teori "teori/fis10ktsp/bab2/C1X1FBAF-0.html"
   :jawaban jwb }))

(defn C1X1FBAF-1 []
  (let [pn (fnc/phyn 50)
        ph (nth pn (fnc/random1 (count pn)))
        d1 (first ph)
        d2 (second ph)
        t1 (fnc/random 20)
        t2 (fnc/random 20)
        var (rand-int 2)
        angka (if (= var 0)
                (/ (last ph) (+ t1 t2))
                (/ (+ d1 d2) (+ t1 t2)))
        jwb (fnc/jawaban)]
  {:soal (str "Sebuah benda bergerak dari posisi semula ke arah " (if (= var 0) "Utara" "Selatan") " sejauh " d1 " meter selama " t1
              " detik. Benda kemudian bergerak ke arah " (if (= var 0) "Barat" "Timur") " sejauh " d2 " meter selama " t2
              " detik. " (if (= var 0) "Besar kecepatan" "Kelajuan") " rata-rata benda adalah ... (m/s).")
   :pilihan (fnc/create-option3 angka 2 jwb)
   :teori "teori/fis10ktsp/bab2/C1X1FBAF-0.html"
   :jawaban jwb }))

(defn C1X1FBAF []
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FBAF-" x))))))

;;;Gerak Lurus - Percepatan rata-rata

(defn C1X1FBAG-0 []
    (let [t1 (rand-int 10)
          t2 (+ t1 (fnc/random 10))
          t3 (+ t2 (fnc/random 10))
          t4 (+ t3 (fnc/random 10))
          v1 (* (fnc/pm) (fnc/random1 50))
          v2 (* (fnc/pm) (fnc/random1 50))
          v3 (* (fnc/pm) (fnc/random1 50))
          v4 (* (fnc/pm) (fnc/random1 50))
          sekuen [[t1 v1] [t2 v2] [t3 v3] [t4 v4]]
          idx2 (fnc/random 3)
          idx1 (rand-int idx2)
          angka (/ (- (second (nth sekuen idx2)) (second (nth sekuen idx1))) (- (first (nth sekuen idx2)) (first (nth sekuen idx1))))
          jwb (fnc/jawaban)]
  {:soal (str "Kecepatan suatu benda yang bergerak dalam garis lurus dicatat dalam tabel di bawah. Percepatan rata-rata benda dari detik ke "
              (first (nth sekuen idx1)) " sampai detik ke " (first (nth sekuen idx2)) " adalah .... (m/s" "$^2$" ").")

   :tabel {:var1 "t (sekon)" :var2 "v (m/s)" :data [{:x t1 :y v1} {:x t2 :y v2} {:x t3 :y v3} {:x t4 :y v4}]}
   :pilihan (fnc/create-option3 angka 3 jwb)
   :jawaban jwb
   :teori "teori/fis10ktsp/bab2/C1X1FBAG-0.html"})
  )
(defn C1X1FBAG []
  (C1X1FBAG-0))

(defn C1X1FBAI-0 []
  (let [t1 (rand-int 10)
        t2 (+ t1 (fnc/random 20))
        y1 (* (fnc/pm) (rand-int 30))
        y2 (* (fnc/pm) (rand-int 30))
        rd (rand-int 2)
        var1 (if (= rd 0) "s" "v")
        var2 "t"
        datax [t1 t2]
        datay [y1 y2]
        max1 t2
        max2 (if (> (Math/abs (first (sort datay))) (last (sort datay))) (Math/abs (first (sort datay))) (last (sort datay)))
        ja (count datax)
        angka (/ (- y2 y1) (- t2 t1))
        jwb (fnc/jawaban)
        ]
    {:soal (str "Gerak sebuah benda pada garis lurus digambarkan pada grafik " var1 " (" (if (= rd 0) "posisi" "kecepatan") ") terhadap "
                var2 " (waktu) di bawah. " (if (= rd 0) "Kecepatan" "Percepatan") " benda pada selang waktu tersebut adalah ... (dalam SI)." )
     :grafik {:var1 var1 :var2 var2 :max1 max1 :max2 max2 :pair ja :datax datax :datay datay}
     :pilihan (fnc/create-option3 angka 3 jwb)
     :jawaban jwb
     :teori "teori/fis10ktsp/bab2/C1X1FBAI-0.html"
     }
  ))
(defn C1X1FBAI []
  (C1X1FBAI-0))

(defn C1X1FBAJ-0 []
    (let [
          t (+ 4 (* 2 (fnc/random 20)))
          a (* (fnc/pm) (fnc/random 10))
          v1 (* (fnc/pm) (fnc/rdlist (range (fnc/mutlak a) 20 (fnc/mutlak a))) 2)
          v2 (+ v1 (* a t))
          t0 (* -1 (/ v1 a))
          des (/ (* (+ v2 v1) t) 2)
          jt (if (or (< t0 0) (> t0 t)) (fnc/mutlak des) (+ (fnc/mutlak (/ (* v1 t0) 2)) (fnc/mutlak (/ (* v2 (- t t0)) 2))))
          var1 "v"
          var2 "t"
          datax [0 t]
          datay [v1 v2]
          max1 (last (sort datax))
          max2 (if (> (Math/abs (first (sort datay))) (last (sort datay))) (Math/abs (first (sort datay))) (last (sort datay)))
          ja (count datax)
          rd (rand-int 2)
          angka (if (= rd 0) des jt)
          jwb (fnc/jawaban)
          ]
      {:soal (str "Sebuah benda bergerak dari posisi awal nol dengan kecepatan (m/s) terhadap waktu (sekon) seperti pada grafik di bawah. "
                  (if (= rd 0) "Perpindahan" "Jarak tempuh") " benda sampai detik ke " t " adalah ....(meter)." )
       :grafik {:var1 var1 :var2 var2 :max1 max1 :max2 max2 :pair ja :datax datax :datay datay}
       :pilihan (fnc/create-option1 angka jwb)
       :jawaban jwb
       :teori "teori/fis10ktsp/bab2/C1X1FBAJ-0.html"
       }
  ))
(defn C1X1FBAJ []
  (C1X1FBAJ-0))

(defn C1X1FBAK-0 []
    "Gerak Lurus Beraturan"
    (let [v (* (fnc/pm) (fnc/random 40))
          t (fnc/random 100)
          so (* (fnc/pm) (fnc/random 200))
          s (+ so (* v t))
          rd (rand-int 6)
          angka (cond
                 (= rd 0) s
                 (= rd 1) so
                 (= rd 2) v
                 (= rd 3) t
                 (= rd 4) (- s so)
                 (= rd 5) (Math/abs (- s so))
                 )
          jwb (fnc/jawaban)
          ]
      {:soal (cond
              (= rd 0) (str "Sebuah benda bergerak lurus beraturan dari posisi awal " so " meter dari titik acuan. Jika kecepatan benda "
                            v " m/s, maka setelah " t " detik posisi benda adalah .... meter.")
              (= rd 1) (str "Sebuah benda bergerak lurus beraturan dengan kecepatan " v " m/s. Jika posisi benda setelah " t " detik adalah "
                            s " meter, maka posisi awal benda adalah .... meter.")
              (= rd 2) (str "Sebuah benda bergerak lurus beraturan dari posisi awal " so " menuju posisi akhir " s " dalam waktu " t " detik.
                            Kecepatan benda adalah .... m/s.")
              (= rd 3) (str "Sebuah benda bergerak lurus beraturan dari posisi awal " so " meter menuju posisi akhir " s " meter.
                            Waktu yang dibutuhkan benda jika kecepatannya " v " m/s adalah .... sekon.")
              (= rd 4) (str "Sebuah benda bergerak lurus dengan kecepatan tetap " v " m/s. Perpindahan benda setelah " t " sekon adalah ...
                            meter.")
              (= rd 5) (str "Sebuah benda bergerak lurus dengan kecepatan tetap " v " m/s. Jarak tempuh benda setelah " t " sekon adalah ...
                            meter.")
             )


       ;:grafik {:var1 var1 :var2 var2 :max1 max1 :max2 max2 :pair ja :datax datax :datay datay}

       :pilihan (fnc/create-option1 angka jwb)
       :jawaban jwb
       :teori "teori/fis10ktsp/bab2/C1X1FBAK-0.html"
       }
))

;;;Gerak Lurus - GLB dan GLBB
(defn C1X1FBAK-1 []
    "Gerak Lurus Berubah Beraturan"
    (let [
          t (fnc/random 100)
          vo (* (fnc/pm) (fnc/random 40))
          so (* (fnc/pm) (fnc/random 200))
          a (* (fnc/pm) (* 2 (fnc/random 10)))
          v (+ vo (* a t))
          s (+ so (+ (* vo t) (* 1/2 a (* t t))))
          rd (rand-int 6)
          angka (cond
                 (= rd 0) v
                 (= rd 1) s
                 (= rd 2) t
                 (= rd 3) a
                 (= rd 4) so
                 (= rd 5) (- s so)
                 )
          jwb (fnc/jawaban)
          ]
      {:soal (cond
              (= rd 0) (str "Sebuah benda bergerak dengan kecepatan tetap " a " m/s$^2$. Jika kecepatan awal benda " vo "
                            m/s maka kecepatan benda setelah " t " sekon adalah .... (m/s).")
              (= rd 1) (str "Suatu benda bergerak dari posisi awal " so " meter dengan percepatan konstan " a " m/s$^2$. Jika
                            kecepatan awalnya " vo " m/s maka posisinya setelah " t " sekon adalah .... meter.")
              (= rd 2) (str "Waktu yang dibutuhkan benda yang kecepatan awalnya " vo " m/s sehingga kecepatannya menjadi " v "
                            m/s bila mengalami percepatan konstan " a " m/s$^2$ adalah .... sekon.")
              (= rd 3) (str "Kecepatan benda berubah menjadi " v " m/s selama " t " sekon. Jika kecepatan awal benda adalah " v "
                            m/s maka percepatan yang dialami benda adalah .... m/s$^2$.")
              (= rd 4) (str "Posisi suatu benda yang bergerak lurus berubah menjadi " s " meter setelah " t " sekon karena percepatan " a
                            " m/s$^2$ yang dialaminya. Jika kecepatan awal benda adalah " vo " m/s, maka posisi awalnya adalah .... meter.")
              (= rd 5) (str "Sebuah benda mengalami percepatan konstan " a " m/s$^2$ selama " t " sekon. Jika kecepatan awal benda adalah "
                            vo " m/s, maka perpindahan benda adalah ... meter.")
             )

       :pilihan (fnc/create-option1 angka jwb)
       :jawaban jwb
       :teori "teori/fis10ktsp/bab2/C1X1FBAK-0.html"
       }
))
(defn C1X1FBAK []
  "GLB dan GLBB"
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FBAK-" x))))))

(defn C1X1FBAKA-0 []
  (let [
          soa 0
          va (+ 5 (fnc/random 20))
          vb (fnc/random (dec va))
          t (+ 2 (fnc/random 100))
          ;sob=(va-vb)*t
          sob (* (- va vb) t)

          rd (rand-int 4)
          angka (cond
                 (= rd 0) t
                 (= rd 1) va
                 (= rd 2) vb
                 (= rd 3) sob
                 )
          jwb (fnc/jawaban)
          ]
      {:soal (cond
              (= rd 0) (str "Benda A dan benda B bergerak pada suatu lintasan lurus dengan kecepatan masing-masing " va " m/s dan " vb "
                            m/s seperti pada gambar. Jika jarak A dan B mula-mula adalah " sob " m, maka A akan menyusul B pada detik ke ...")
              (= rd 1) (str "Benda A dan B yang berjarak awal " sob " bergerak bersamaan dimana kecepatan B adalah " vb " m/s seperti
                            pada gambar. Kecepatan A jika A berhasil menyusul B setelah " t " detik adalah .... m/s.")
              (= rd 2) (str "Benda A dan B yang mula-mula berjarak " sob " meter bergerak bersamaan dengan kecepatan A " va " m/s seperti
                            pada gambar. Jika A berhasil menyusul B pada detik ke " t " maka kecepatan B adalah .... m/s ")
              (= rd 3) (str "Benda A dan B bergerak bersamaan pada suatu lintasan lurus dengan kecepatan masing-masing " va " m/s
                            dan " vb " m/s seperti pada gambar.
                            Jika A menyusul B setelah " t " detik maka jarak awal A dan B adalah .... meter.")
             )
       :pictures [{:obj 9 :param "#555555,000,150,420"}, {:obj 4 :param "#000000,020,110,060,148"},
                  {:obj 3 :param "#000000,062,130,040,000"}, {:obj 8 :param "#000000,036,135,A"},
                  {:obj 8 :param "#000000,104,135,Va"}, {:obj 8 :param "#000000,298,135,B"}
                  {:obj 4 :param "#000000,280,110,320,148"}, {:obj 3 :param "#000000,322,130,040,000"}
                  {:obj 8 :param  "#000000,364,135,Vb"}]
       :pilihan (fnc/create-option1 angka jwb)
       :jawaban jwb
       :teori "teori/fis10ktsp/bab2/C1X1FBAKA-0.html"
       }))

(defn C1X1FBAKA-1 []
  (let [
          soa 0
          va (fnc/random 20)
          vb (fnc/random 20)
          t (+ 2 (fnc/random 100))
          ;sob=(va-vb)*t
          sob (* (+ va vb) t) ; lajunya

          rd (rand-int 4)
          angka (cond
                 (= rd 0) t
                 (= rd 1) va
                 (= rd 2) vb
                 (= rd 3) sob
                 )
          jwb (fnc/jawaban)
          ]
      {:soal (cond
              (= rd 0) (str "Benda A dan benda B bergerak pada suatu lintasan lurus dengan laju masing-masing " va " m/s dan " vb "
                            m/s seperti pada gambar. Jika jarak A dan B mula-mula adalah " sob " m, maka A dan B akan berpapasan pada detik ke ...")
              (= rd 1) (str "Benda A dan B yang berjarak awal " sob " bergerak bersamaan dimana laju B adalah " vb " m/s seperti
                            pada gambar. Besar kecepatan A jika A dan B berpapasan setelah " t " detik adalah .... m/s.")
              (= rd 2) (str "Benda A dan B yang mula-mula berjarak " sob " meter bergerak bersamaan dengan laju A " va " m/s seperti
                            pada gambar. Jika A dan B berpapasan pada detik ke " t " maka besar kecepatan B adalah .... m/s ")
              (= rd 3) (str "Benda A dan B bergerak bersamaan pada suatu lintasan lurus dengan laju masing-masing " va " m/s
                            dan " vb " m/s seperti pada gambar.
                            Jika A dan B berpapasan setelah " t " detik maka jarak awal A dan B adalah .... meter.")
             )
       :pictures [{:obj 9 :param "#555555,000,150,400"}, {:obj 10 :param "#555555,000,050,400"},
                  {:obj 1 :param "#000000,000,100,400,100"},{:obj 4 :param "#000000,020,102,060,140"},
                  {:obj 3 :param "#000000,062,122,040,000"}, {:obj 8 :param "#000000,036,127,A"},
                  {:obj 8 :param "#000000,104,125,Va"}, {:obj 8 :param "#000000,295,085,B"},
                  {:obj 4 :param "#000000,280,060,320,098"}, {:obj 3 :param "#000000,278,080,040,180"},
                  {:obj 8 :param  "#000000,218,085,Vb"}]
       :pilihan (fnc/create-option1 angka jwb)
       :jawaban jwb
       :teori "teori/fis10ktsp/bab2/C1X1FBAKA-0.html"
       }))
(defn C1X1FBAKA []
  "GLB dan GLBB lanjutan"
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FBAKA-" x))))))

(defn C1X1FBAL-0 []
  "Gerak Relatif"
    (let [vab (* (fnc/pm) (fnc/random 100))
          vbt (* (fnc/pm) (fnc/random 100))
          vat (+ vab vbt)
          rd (rand-int 3)
          angka (cond
                    (= rd 0) vab
                    (= rd 1) vbt
                    (= rd 2) vat
                 )
          jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Benda A dan B bergerak dalam satu garis lurus dengan kecepatan terhadap titik acuan berturut-turut " vat " m/s
                              dan " vbt " m/s. Kecepatan A terhadap B adalah ... m/s.")
                (= rd 1) (str "Benda A dan B bergerak dalam satu garis lurus dimana kecepatan A terhadap B adalah " vab " m/s. Jika
                              kecepatan A terhadap titik acuan adalah " vat " m/s, maka kecepatan B terhadap titik acuan adalah ... m/s.")
                (= rd 2) (str "Benda A dan B bergerak dalam satu garis lurus dimana kecepatan A terhadap B adalah " vab " m/s. Jika
                              kecepatan B terhadap titik acuan adalah " vbt " m/s, maka kecepatan A terhadap titik acuan adalah ... m/s.")
               )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab2/C1X1FBAL-0.html"
         }
      ))

(defn C1X1FBAL []
  "Gerak Relatif"
  (C1X1FBAL-0))

;BAB-2 GERAK MELINGKAR BERATURAN
;
;
(defn C1X1FCAA-0 []
  (let [r (fnc/random 100)
        atheta (fnc/random 100)
        theta (* atheta 3.14)
        s (Math/round (* theta r))
        rd (rand-int 3)
        angka (cond
                    (= rd 0) s
                    (= rd 1) theta
                    (= rd 2) r
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bergerak pada lintasan melingkar berjejari " r " meter. Jarak tempuh benda ketika sudut
                              tempuhnya " atheta "$\\pi$ radian adalah ... meter. ($\\pi$ = 3,14).")
                (= rd 1) (str "Sebuah benda bergerak pada lintasan melingkar berjejari " r " meter. Sudut tempuh benda ketika jarak
                              tempuhnya " s " meter adalah ... radian. ($\\pi$ = 3,14).")
                (= rd 2) (str "Sebuah benda yang bergerak melingkar menempuh jarak " s " meter ketika sudut tempuhnya " atheta
                              "$\\pi$ radian. Jejari lintasan benda adalah ... meter ($\\pi$ = 3,14).")
               )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab3/C1X1FCAA-0.html"
         }
      ))

(defn C1X1FCAA-1 []
  (let [r (fnc/random 100)
        atheta (fnc/random 100)
        putaran (/ atheta 2)
        s (* atheta r)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) s
                    (= rd 1) atheta
                    (= rd 2) s
               )
        vstr "$\\pi$"
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bergerak pada lintasan melingkar berjejari " r " meter. Jarak tempuh benda ketika sudut
                              tempuhnya " atheta "$\\pi$ radian adalah ... meter. ($\\pi$ = 3,14).")
                (= rd 1) (str "Sebuah benda bergerak pada lintasan melingkar berjejari " r " meter. Sudut tempuh benda ketika jarak
                              tempuhnya " s "$\\pi$ meter adalah ... radian. ($\\pi$ = 3,14).")
                (= rd 2) (str "Sebuah benda bergerak pada lintasan melingkar berjejari " r " meter. Ketika benda telah menempuh
                              " putaran " putaran maka jarak tempuhnya adalah ... meter ($\\pi$ = 3,14).")
               )
         :pilihan (fnc/create-option4 angka vstr jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab3/C1X1FCAA-0.html"
         }
      ))
(defn C1X1FCAA []
  "Posisi sudut dan Jarak tempuh"
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FCAA-" x))))))


(defn C1X1FCAB-0 []
  (let [r (fnc/random 100)
        aomega (fnc/random 100)
        av (* aomega r)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) av
                    (= rd 1) aomega
               )
        vstr "$\\pi$"
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bergerak pada lintasan melingkar berjejari " r " meter. Besar kecepatan linier benda jika
                              kecepatan sudutnya " aomega "$\\pi$ rad/s adalah ... m/s. ($\\pi$ = 3,14).")
                (= rd 1) (str "Sebuah benda bergerak pada lintasan melingkar berjejari " r " meter. Jika laju linier benda
                              " av "$\\pi$ m/s maka kecepatan sudut benda adalah  ... rad/s. ($\\pi$ = 3,14).")
               )
         :pilihan (fnc/create-option4 angka vstr jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab3/C1X1FCAA-0.html"
         }
      ))

(defn C1X1FCAB-1 []
  (let [rA (fnc/random 100)
        rB (* (* 2 rA) (fnc/random 10))
        vA (fnc/random 20)
        vB (* vA (/ rB rA))
        rd (rand-int 4)
        angka (cond
                    (= rd 0) vA
                    (= rd 1) vB
                    (= rd 2) rA
                    (= rd 3) rB
               )

        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Dua buah piringan A dan B yang masing-masing berjejari " rA " cm dan " rB " cm bergerak dengan satu poros putar
                              seperti pada gambar. Jika laju linier titik b ditepi piringan B adalah " vB " cm/s, maka laju linier titik a
                              di tepi piringan A adalah ... cm/s")
                (= rd 1) (str "Dua buah piringan A dan B yang masing-masing berjejari " rA " cm dan " rB " cm bergerak dengan satu poros putar
                              seperti pada gambar. Jika laju linier titik a ditepi piringan A adalah " vA " cm/s, maka laju linier titik b
                              di tepi piringan B adalah ... cm/s")
                (= rd 2) (str "Dua buah piringan A dan B berputar dalam satu poros sehingga laju titik a di tepi piringan A adalah " vA "
                               cm/s dan laju titik b di tepi piringan B adalah " vB " cm/s. Jika jejari piringan B adalah " rB " cm,
                              maka jejari piringan A adalah ... cm.")
                (= rd 3) (str "Dua buah piringan A dan B berputar dalam satu poros sehingga laju titik b di tepi piringan B adalah " vB "
                               cm/s dan laju titik a di tepi piringan A adalah " vA " cm/s. Jika jejari piringan A adalah " rA " cm,
                              maka jejari piringan B adalah ... cm.")
               )
         :pictures [{:obj 6 :param "#000000,200,100,30"}, {:obj 6 :param "#000000,200,100,080"},
                  {:obj 6 :param "#000000,230,100,002"},{:obj 6 :param "#000000,280,100,002"},
                  {:obj 6 :param "#000000,200,100,002"}, {:obj 8 :param "#000000,232,095,a"},
                  {:obj 8 :param "#000000,282,095,b"}, {:obj 8 :param "#000000,193,090,A"},                ,
                  {:obj 8 :param  "#000000,193,050,B"}]
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab3/C1X1FCAA-0.html"
         }
      ))

(defn C1X1FCAB-2 []
  (let [rB (fnc/random 10)
        rA (* (* 2 rB) (fnc/random 10))
        omgA (fnc/random 20)
        omgB (* omgA (/ rA rB))
        rd (rand-int 4)
        angka (cond
                    (= rd 0) omgA
                    (= rd 1) omgB
                    (= rd 2) rA
                    (= rd 3) rB
               )

        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Dua buah piringan A dan B yang masing-masing berjejari " rA " cm dan " rB " cm dihubungkan dengan sabuk dan
                              berputar seperti pada gambar. Jika kecepatan sudut piringan B adalah " omgB " rad/s, maka kecepatan
                              sudut piringan A adalah ... rad/s.")
                (= rd 1) (str "Dua buah piringan A dan B yang masing-masing berjejari " rA " cm dan " rB " cm dihubungkan dengan sabuk dan
                              berputar seperti pada gambar. Jika kecepatan sudut piringan A adalah " omgA " rad/s, maka kecepatan
                              sudut piringan B adalah ... rad/s.")
                (= rd 2) (str "Dua buah piringan A dan B yang dihubungkan oleh suatu sabuk, berputar pada  poros masing-masing dengan
                              kecepatan sudut berturut-turut " omgA " rad/s dan " omgB " rad/s. Jika jejari piringan B adalah " rB " cm
                              maka jejari piringan A adalah ... cm.")
                (= rd 3) (str "Dua buah piringan A dan B yang dihubungkan oleh suatu sabuk, berputar pada  poros masing-masing dengan
                              kecepatan sudut berturut-turut " omgA " rad/s dan " omgB " rad/s. Jika jejari piringan A adalah " rA " cm
                              maka jejari piringan B adalah ... cm.")
               )
         :pictures [{:obj 6 :param "#000000,050,100,30"}, {:obj 6 :param "#000000,250,100,080"},
                  {:obj 6 :param "#000000,050,100,002"},{:obj 6 :param "#000000,250,100,002"},
                  {:obj 1 :param "#000000,050,070,230,022"},
                  {:obj 1 :param "#000000,050,130,230,178"},
                  {:obj 8 :param "#000000,247,090,A"},
                  {:obj 8 :param  "#000000,047,090,B"}
                    ]
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab3/C1X1FCAA-0.html"
         }
      ))
(defn C1X1FCAB []
  "Kecepatan sudut dan laju linier"
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1X1FCAB-" x))))))


(defn C1X1FCAC-0 []
  (let [f (/ (fnc/random 100) 100.0)
        T (/ 1 f)
        omg (/ (Math/round (* (* 2 3.14 f) 100)) 100.0)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) f
                    (= rd 1) T
                    (= rd 2) omg
               )
        ;vstr "$\\pi$"
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bergerak melingkar dengan kecepatan sudut " omg " rad/s. Frekuensi putaran benda
                              tersebut adalah ... Hertz. ($\\pi$ = 3,14).")
                (= rd 1) (str "Sebuah benda bergerak melingkar dengan kecepatan sudut " omg " rad/s. Periode putaran benda
                              tersebut adalah ... sekon. ($\\pi$ = 3,14).")
                (= rd 2) (str "Sebuah benda bergerak melingkar dengan frekuensi " f " putaran/sekon. Kecepatan sudut benda itu adalah
                              ... rad/s. ($\\pi$ = 3,14).")
               )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab3/C1X1FCAA-0.html"
         }
      ))

(defn C1X1FCAC-1 []
  (let [f (/ (fnc/random 100) 100.0)
        r (fnc/random 100)
        T (/ 1 f)
        omg (/ (Math/round (* (* 2 3.14 f) 100)) 100.0)
        v (* omg r)
        rd (rand-int 4)
        angka (cond
                    (= rd 0) f
                    (= rd 1) T
                    (= rd 2) v
                    (= rd 3) r
               )
        ;vstr "$\\pi$"
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bergerak melingkar dengan laju linier " v " m/s. Jika jejari lintasannya adalah " r " meter,
                              maka frekuensi putaran benda tersebut adalah ... Hertz. ($\\pi$ = 3,14).")
                (= rd 1) (str "Sebuah benda bergerak melingkar dengan laju linier " v " m/s. Jika jejari lintasannya adalah " r " meter,
                              maka periode putaran benda tersebut adalah ... sekon. ($\\pi$ = 3,14).")
                (= rd 2) (str "Sebuah benda bergerak melingkar dengan periode " T " sekon. Jika jejari lintasannya adalah " r "
                              meter, maka laju liniernya adalah ... m/s. ($\\pi$ = 3,14).")
                (= rd 3) (str "Sebuah benda bergerak melingkar dengan frekuensi " f " Hertz. Jika laju liniernya adalah " v " m/s maka
                              jejari lintasannya adalah ... meter. ($\\pi$ = 3,14).")
               )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab3/C1X1FCAA-0.html"
         }
      ))

(defn C1X1FCAC []
  "Frekuensi dan Periode"
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FCAC-" x))))))

(defn C1X1FCAD-0 []
  "percepatan sentripetal"
  (let [pairs (fnc/axbc2 30)
        pair (nth pairs (rand-int (count pairs)))
        R (first pair)
        as (second pair)
        v (Math/round (Math/sqrt (last pair)))
        rd (rand-int 3)
        angka (cond
                    (= rd 0) v
                    (= rd 1) as
                    (= rd 2) R
               )
        ;vstr "$\\pi$"
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bergerak pada lintasan lingkaran dengan jejari " R " meter. Jika percepatan sentripetal yang
                              dialami benda adalah " as " m/s$^2$ ,maka laju linier benda adalah ... m/s.")
                (= rd 1) (str "Sebuah benda bergerak pada lintasan lingkaran dengan jejari " R " meter. Jika laju linier benda " v " m/s,
                              maka percepatan sentripetal yang dialami benda adalah ... m/s$^2$.")
                (= rd 2) (str "Sebuah benda bergerak pada lintasan lingkaran dengan laju linier " v " m/s. Jika percepatan sentripetal yang
                              dialami benda adalah " as " m/s$^2$ ,maka jejari lintasan benda adalah ... meter.")
               )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab3/C1X1FCAA-0.html"
         }
      ))

(defn C1X1FCAD []
  "Gerak Melingkar Beraturan"
  (C1X1FCAD-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FCAD-" x))))))

 (defn C1X1FCAE-0 []
  (let [t (fnc/random 50)
        f (/ (fnc/random 20) 10.0)
        r (/ (fnc/random 50) 10.0)
        omg (/ (Math/round (* 2 3.14 f 100)) 100.0)
        theta (/ (Math/round (* omg t 100)) 100.0)
        v (/ (Math/round (* omg r 100)) 100.0)
        s (/ (Math/round (* theta r 100)) 100.0)
        rd (rand-int 6)
        angka (cond
                    (= rd 0) theta
                    (= rd 1) theta
                    (= rd 2) s
                    (= rd 3) omg
                    (= rd 4) f
                    (= rd 5) t
               )
        ;vstr "$\\pi$"
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Kecepatan sudut sebuah benda yang bergerak melingkar beraturan adalah " omg " rad/s. Sudut tempuh benda
                              setelah berputar selama " t " sekon adalah ... radian.")
                (= rd 1) (str "Besar kecepatan linier sebuah benda yang bergerak melingkar beraturan adalah " v " m/s. Jika jejari
                               lintasan benda adalah " r " meter, maka sudut tempuh benda setelah berputar selama " t " sekon
                              adalah ... radian.")
                (= rd 2) (str "Sebuah benda bergerak pada lintasan lingkaran dengan frekuensi  " f " Hz. Jika jejari lintasan benda
                              adalah " r " meter, maka jarak tempuh benda setelah bergerak melingkar beraturan selama " t "
                              sekon adalah ... meter. ($\\pi$ = 3,14).")
                (= rd 3) (str "Setelah bergerak melingkar beraturan selama " t " detik, jarak tempuh suatu benda menjadi " s " meter.
                              jika jejari lintasan benda adalah " r " meter, maka kecepatan sudut benda adalah ... rad/s.")
                (= rd 4) (str "Setelah bergerak melingkar beraturan selama " t " detik, sudut tempuh suatu benda menjadi " theta " rad.
                              Frekuensi putaran benda adalah ... Hertz. ($\\pi$ = 3,14).")
                (= rd 5) (str "Sebuah benda bergerak melingkar beraturan dengan frekuensi " f " Hz. Jika jejari lintasan gerak benda
                              adalah " r " meter, maka waktu yang dibutuhkan untuk menempuh jarak " s " meter adalah ...
                              detik. ($\\pi$ = 3,14).")
               )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab3/C1X1FCAA-0.html"
         }
      ))

(defn C1X1FCAE []
  "Gerak Melingkar Beraturan"
  (C1X1FCAE-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FCAD-" x))))))


;;; Hukum Newton tentang gerak

(defn C1X1FDAB-0 []
  (let [F1 (fnc/random 100)
        F2 F1
        v (fnc/random 10)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) F2
                    (= rd 1) F2
                    (= rd 2) F2
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Suatu benda mengalami dua gaya seperti pada gambar di bawah. Jika besar gaya F1 adalah " F1 " newton
                              dan benda tetap diam maka besar gaya F2 adalah ... newton.")
                (= rd 1) (str "Suatu benda mengalami dua gaya seperti pada gambar di bawah. Jika besar gaya F1 adalah " F1 " newton
                              dan benda bergerak lurus beraturan maka besar gaya F2 adalah ... newton.")
                (= rd 2) (str "Suatu benda mengalami dua gaya seperti pada gambar di bawah. Jika besar gaya F1 adalah " F1 " newton
                              dan benda bergerak dengan kecepatan tetap " v " m/s, maka besar gaya F2 adalah ... newton.")
               )
         :pictures (if (= (rand-int 2) 0)
                 [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 3 :param "#000000,175,100,040,180"},
                  {:obj 3 :param "#000000,225,100,040,000"},
                  {:obj 8 :param "#000000,115,100,F1"},
                  {:obj 8 :param  "#000000,267,100,F2"}
                 ]
                 [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 3 :param "#000000,200,075,040,090"},
                  {:obj 3 :param "#000000,200,125,040,270"},
                  {:obj 8 :param "#000000,195,030,F1"},
                  {:obj 8 :param  "#000000,195,178,F2"}
                 ])
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }
      ))
(defn C1X1FDAB-1 []
  (let [F1 (fnc/random 100)
        F2 F1
        F3 (fnc/random 100)
        F4 F3
        v (fnc/random 10)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) [F2 F4]
                    (= rd 1) [F2 F4]
                    (= rd 2) [F2 F4]
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Suatu benda mengalami empat gaya seperti pada gambar di bawah. Jika besar gaya F1 dan F3 berturut-
                              turut adalah " F1 " dan " F3 " newton dan benda tetap diam maka besar gaya F2
                              dan F4 adalah ... newton.")
                (= rd 1) (str "Suatu benda mengalami empat gaya seperti pada gambar di bawah. Jika besar gaya F1 dan F3 berturut-
                              turut adalah " F1 " dan " F3 " newton dan benda bergerak lurus beraturan
                              maka besar gaya F2 dan F4 adalah ... newton.")
                (= rd 2) (str "Suatu benda mengalami empat gaya seperti pada gambar di bawah. Jika besar gaya F1 dan F3 berturut-
                              turut adalah " F1 " dan " F3 " newton dan benda bergerak dengan kecepatan tetap " v " m/s,
                              maka besar gaya F2 dan F4 adalah ... newton.")
               )
         :pictures
                 [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 3 :param "#000000,175,100,040,180"},
                  {:obj 3 :param "#000000,225,100,040,000"},
                  {:obj 8 :param "#000000,115,100,F1"},
                  {:obj 8 :param  "#000000,267,100,F2"},
                  {:obj 3 :param "#000000,200,075,040,090"},
                  {:obj 3 :param "#000000,200,125,040,270"},
                  {:obj 8 :param "#000000,195,030,F3"},
                  {:obj 8 :param  "#000000,195,178,F4"}]
         :pilihan (fnc/create-option5 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }
      ))
(defn C1X1FDAB-2 []
  (let [F1 (+ 5 (fnc/random 100))
        F2 (* (fnc/pm) (fnc/random F1))
        F3 (+ F1 F2)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) F1
                    (= rd 1) (Math/abs F2)
                    (= rd 2) F3
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Suatu benda mengalami tiga gaya seperti pada gambar di bawah. Jika besar gaya F2 dan F3 berturut-
                              turut adalah " (Math/abs F2) " dan " F3 " newton dan benda tetap diam maka besar gaya F1
                              adalah ... newton.")
                (= rd 1) (str "Suatu benda mengalami tiga gaya seperti pada gambar di bawah. Jika besar gaya F1 dan F3 berturut-
                              turut adalah " F1 " dan " F3 " newton dan benda bergerak lurus beraturan
                              maka besar gaya F2 adalah ... newton.")
                (= rd 2) (str "Suatu benda mengalami tiga gaya seperti pada gambar di bawah. Jika besar gaya F1 dan F2 berturut-
                              turut adalah " F1 " dan " (Math/abs F2) " newton dan benda bergerak dengan kecepatan tetap,
                              maka besar gaya F3 adalah ... newton.")
               )
         :pictures
                 [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 3 :param "#000000,175,100,040,180"},
                  (if (< F2 0) {:obj 3 :param "#000000,225,112,035,000"} {:obj 3 :param "#000000,175,112,035,180"}),
                  {:obj 3 :param "#000000,225,100,045,000"},
                  {:obj 8 :param "#000000,115,097,F1"},
                  (if (< F2 0) {:obj 8 :param  "#000000,262,115,F2"} {:obj 8 :param  "#000000,120,115,F2"}),
                  {:obj 8 :param "#000000,272,097,F3"}]
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }
      ))
(defn C1X1FDAB-3 []
  (let [F1 (+ 20 (fnc/random 100))
        alp (fnc/alpis)
        F2 (Math/round (* F1 (Math/cos (* (/ alp 180) Math/PI))))
        F3 (Math/round (* F1 (Math/sin (* (/ alp 180) Math/PI))))
        rd (rand-int 3)
        angka (cond
                    (= rd 0) [F2 F3]
                    (= rd 1) [F2 F3]
                    (= rd 2) [F2 F3]
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Suatu benda mengalami gaya-gaya seperti pada gambar di bawah. Besar gaya F1 serta sudut A
                               berturut-turut adalah " F1 "N, dan " alp "$^o$. Jika benda tetap diam maka besar gaya F2
                              dan F3 adalah ... newton.")
                (= rd 1) (str "Suatu benda mengalami gaya-gaya seperti pada gambar di bawah. Besar gaya F1 serta sudut A
                               berturut-turut adalah " F1 "N, dan " alp "$^o$. Jika benda bergerak lurus beraturan maka besar
                              gaya F2 dan F3 adalah ... newton.")
                (= rd 2) (str "Suatu benda mengalami gaya-gaya seperti pada gambar di bawah. Besar gaya F1 serta sudut A
                               berturut-turut adalah " F1 "N, dan " alp "$^o$. Jika benda bergerak dengan kecepatan konstan
                              maka besar gaya F2 dan F3 adalah ... newton.")
               )
         :pictures
                 [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 2 :param "#d3d3d3,225,075,080,000"},
                  {:obj 3 :param "#000000,225,075,090,040"},
                  {:obj 13 :param "#939393,280,075,290,050,285,045,270,037"},
                  {:obj 3 :param "#000000,175,100,060,180"}, {:obj 3 :param "#000000,200,125,050,270"},
                  {:obj 8 :param "#000000,290,015,F1"}, {:obj 8 :param "#000000,255,065,A"},
                  {:obj 8 :param "#000000,095,102,F2"}, {:obj 8 :param "#000000,195,187,F3"}
                  ]
         :pilihan (fnc/create-option5 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }
      ))
(defn C1X1FDAB []
  "Hukum Newton I"
  ;(C1X1FDAB-3))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "C1X1FDAB-" x))))))


(defn C1X1FDAC-0 []
  (let [m (fnc/random 100)
        a (/ (fnc/random 10) 10.0)
        F (/ (Math/round (* m a 10)) 10.0)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) F
                    (= rd 1) m
                    (= rd 2) a
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Suatu benda bermassa " m " kg mengalami percepatan konstan sebesar " a " m/s$^2$. Besar
                              resultan gaya yang bekerja pada benda tersebut adalah ... newton.")
                (= rd 1) (str "Percepatan yang dialami benda ketika diberi gaya " F " newton adalah " a " m/s$^2$. Massa benda
                              tersebut adalah ... kg.")
                (= rd 2) (str "Sebuah benda bermassa " m " kg diberi gaya sebesar " F " newton. Percepatan yang akan dialami
                              benda tersebut adalah ... m/s$^2$.")
               )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAC-1 []
  (let [m (fnc/random 100)
        F1 (fnc/random 100)
        F2 (* (fnc/pm) (fnc/random 100))
        a (/ (+ F1 F2) m 1.0)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) (Math/abs a)
                    (= rd 1) m
                    (= rd 2) F1
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Sebuah balok dikenai dua gaya F1 dan F2 yang besarnya berturut-turut " F1 " dan "
                              (Math/abs F2) " newton. Jika massa balok " m " kg, maka percepatan balok adalah ... m/s$^2$.")
                (= rd 1) (str "Suatu balok berada di lantai licin dan diberi gaya F1 dan F2 yang besarnya berturut-turut " F1 "
                              dan " (Math/abs F2) " newton. Jika percepatan yang timbul pada benda adalah
                              " (/ (Math/round (* (Math/abs a) 100)) 100.0) " m/s$^2$, maka massa
                              balok adalah ... kg. ")
                (= rd 2) (str "Sebuah benda bermassa " m " kg dikenai gaya F1 dan F2 sehingga percepatannya menjadi "
                              (/ (Math/round (* (Math/abs a) 100)) 100.0) " m/s$^2$.
                              Jika besar F2 adalah " (Math/abs F2) " newton maka besar F1 adalah ... newton.")
               )
         :pictures [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 9 :param "#939393,000,126,400"}
                    {:obj 3 :param "#000000,175,100,040,180"},
                    (if (< F2 0) {:obj 3 :param "#000000,225,100,040,000"} {:obj 3 :param "#000000,175,112,040,180"})
                    {:obj 8 :param "#000000,115,100,F1"},
                    (if (< F2 0) {:obj 8 :param  "#000000,267,103,F2"} {:obj 8 :param "#000000,115,115,F2"})
                 ]

         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }
      ))
(defn C1X1FDAC-2 []
  (let [m (+ 2 (fnc/random 25))
        F1 (fnc/random 20)
        F2 (* (fnc/pm) (fnc/random 100))
        alp (fnc/alpis)
        a (/ (+ (* F1 (Math/cos (* (/ alp 180) Math/PI))) F2) m 1.0)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) (Math/abs a)
                    (= rd 1) m
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Sebuah balok dikenai dua gaya F1 dan F2 yang besarnya berturut-turut " F1 " dan "
                              (Math/abs F2) " newton. Jika massa balok " m " kg, maka percepatan balok adalah ... m/s$^2$.
                              (Sudut A = " alp "$^o$).")
                (= rd 1) (str "Suatu balok berada di lantai licin dan diberi gaya F1 dan F2 yang besarnya berturut-turut " F1 "
                              dan " (Math/abs F2) " newton. Jika percepatan yang timbul pada benda adalah
                              " (/ (Math/round (* (Math/abs a) 100)) 100.0) " m/s$^2$, maka massa
                              balok adalah ... kg. (Sudut A = " alp "$^o$).")
               )
         :pictures [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 9 :param "#939393,000,126,400"}
                    {:obj 2 :param "#d3d3d3,225,075,080,000"}, {:obj 13 :param "#939393,280,075,290,050,285,045,270,037"},
                    {:obj 3 :param "#000000,225,075,090,040"},
                    (if (> F2 0) {:obj 3 :param "#000000,225,100,040,000"} {:obj 3 :param "#000000,175,100,040,180"})
                    {:obj 8 :param "#000000,290,015,F1"},{:obj 8 :param "#000000,255,065,A"}
                    (if (> F2 0) {:obj 8 :param  "#000000,267,103,F2"} {:obj 8 :param "#000000,115,102,F2"})
                 ]

         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }
      ))
(defn C1X1FDAC []
  "Hukum Newton II"
  ;(C1X1FDAC-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1X1FDAC-" x))))))


(defn C1X1FDAD-0 []
  (let [Fa (fnc/random 100)
        arah-aksi (rand-int 2)
        sarah-aksi (if (= arah-aksi 0) "kiri" "kanan")
        arah-reaksi (if (= arah-aksi 0) 1 0)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) [Fa arah-reaksi]
                    (= rd 1) [Fa arah-reaksi]
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Seseorang mendorong tembok dengan gaya dorong sebesar " Fa " newton ke " sarah-aksi ". Besar
                              dan arah gaya reaksi tembok kepada orang tersebut adalah ... newton ke arah ....")
                (= rd 1) (str "Setiap kali melangkah kaki seseorang memberikan gaya dorong ke lantai dengan besar
                              " Fa " newton ke " sarah-aksi ". Besar dan arah gaya dorong lantai terhadap kaki orang adalah
                              ... newton ke ...."))
         :pilihan (fnc/create-option6 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))

(defn C1X1FDAD-1 []
  (let [Fa (fnc/random 100)
        arah-aksi 0
        sarah-aksi "bawah"
        arah-reaksi (if (= arah-aksi 0) 1 0)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) [Fa arah-reaksi]
                    (= rd 1) [Fa arah-reaksi]
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Sebuah balok berada dalam keadaan diam pada lantai mendatar. Jika gaya dorongan balok
                              terhadap lantai adalah " Fa " newton ke " sarah-aksi ", maka besar
                              dan arah gaya reaksi lantai terhadap balok adalah ... newton ke arah ....")
                (= rd 1) (str "Sebuah balok tergantung vertikal pada seutas tali yang terikat pada palang kayu. Jika balok
                              menarik tali dengan gaya " Fa " newton ke " sarah-aksi ", maka besar dan arah gaya tarik
                              tali terhadap balok adalah adalah ... newton ke ...."))
         :pilihan (fnc/create-option7 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAD []
  "Hukum Newton III - Aksi Reaksi"
  ;(C1X1FDAD-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FDAD-" x))))))


(defn C1X1FDAE-0 []
  (let [m (fnc/random 100)
        g (nth [10.0 9.8] (rand-int 2))
        w (* m g)
        sw (/ (Math/round (* w 100)) 100)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) w
                    (= rd 1) m
                    (= rd 2) w
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Jika percepatan gravitasi bumi adalah " g " m/s$^2$ maka benda bermassa " m " kg
                              memiliki berat sebesar ... newton.")
                (= rd 1) (str "Berat sebuah benda adalah " sw " newton. Jika percepatan gravitasi bumi adalah " g " m/s$^2$
                              maka massa benda adalah ... kg.")
                (= rd 2) (str "Sebuah balok bermassa " m " kg terletak diam pada lantai mendatar licin. Jika percepatan
                              gravitasi bumi sebesar " g " m/s$^2$, maka gaya dorong lantai terhadap benda adalah ... newton"))
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))

(defn C1X1FDAE-1 []
  (let [m (fnc/random 100)
        g (nth [10.0 9.8] (rand-int 2))
        w (/ (Math/round (* m g 100)) 100.0)
        F (* g (fnc/random (dec m)))
        a (/ (- (* m g) F) m)
        sF (/ (Math/round (* F 100)) 100)
        sa (/ (Math/round (* a 100)) 100)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) a
                    (= rd 1) m
                    (= rd 2) F
               )
        jwb (fnc/jawaban)
          ]
        {:soal (cond
                (= rd 0) (str "Sebuah balok bermassa " m " kg yang sedang turun vertikal ditahan oleh gaya F yang
                              besarnya " sF " newton ke atas seperti pada gambar. Bila percepatan gravitasi bumi " g "
                              m/s$^2$ maka percepatan turun balok tersebut adalah ... m/s$^2$.")
                (= rd 1) (str "Sebuah balok bergerak turun dengan percepatan " sa " m/s$^2$ akibat gaya penahan F sebesar
                              " sF " newton seperti pada gambar. Jika percepatan gravitasi bumi " g " m/s$^2$, maka massa
                              balok adalah ... kg.")
                (= rd 2) (str "Sebuah balok bermassa " m " kg jatuh ke bawah dengan percepatan " sa " m/s$^2$ seperti
                              pada gambar. Jika percepatan gravitasi bumi adalah " g " m/s$^2$, maka besarnya
                              gaya F adalah ... newton."))
         :pictures [{:obj 4 :param "#000000,185,075,215,105"}, {:obj 3 :param "#000000,200,075,040,090"},
                    {:obj 8 :param "#000000,195,030,F"},
                    {:obj 9 :param "#939393,000,180,400"}]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAE []
  "Gaya Berat"
  ;(C1X1FDAE-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FDAE-" x))))))

(defn C1X1FDAF-0 []
  (let [m (fnc/random 100)
        g 10
        w (* m g)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) [w 1]
                    (= rd 1) [m 1]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah balok bermassa " m " kg terletak di atas lantai seperti pada gambar. Besar dan
                              arah gaya normal yang bekerja pada balok ... newton ke arah .... (g = 10 m/s$^2$).")
                (= rd 1) (str "Sebuah balok mengalami gaya normal sebesar " w " newton oleh lantai (lihat gambar).
                              Massa balok adalah ... kg dan arah gaya normal pada balok adalah ke .... (g = 10 m/s$^2$)."))
         :pictures [{:obj 4 :param "#000000,175,075,225,125"},
                    {:obj 9 :param "#939393,000,126,400"}]
         :pilihan (fnc/create-option7 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAF-1 []
  (let [m (+ 16 (fnc/random 10))
        g 10
        w (* m g)
        F (fnc/random 100)
        N (+ F w)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) N
                    (= rd 1) m
                    (= rd 2) F
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah balok bermassa " m " kg terletak di atas lantai dan diberi gaya F sebesar " F " newton
                              seperti pada gambar. Besar gaya normal antara balok dengan lantai adalah ... newton. (g = 10 m/s$^2$).")
                (= rd 1) (str "Sebuah balok yang terletak pada lantai diberi gaya F = " F " newton seperti pada gambar.
                              Jika balok mengalami gaya normal sebesar " N " newton, maka massa balok adalah ... kg.
                              (g = 10 m/s$^2$).")
                (= rd 2) (str "Sebuah balok bermassa " m " kg yang terletak pada lantai diberi gaya F seperti pada gambar.
                              Jika balok mengalami gaya normal sebesar " N " newton, maka besar gaya F tersebut adalah ... newton.
                              (g = 10 m/s$^2$)."))
         :pictures [{:obj 4 :param "#000000,175,075,225,125"},
                    {:obj 9 :param "#939393,000,126,400"}
                    {:obj 3 :param "#000000,200,035,040,270"}
                    {:obj 8 :param "#000000,204,055,F"}]
         :pilihan (fnc/create-option2 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAF-2 []
  (let [m (+ 16 (fnc/random 10))
        g 10
        w (* m g)
        alp (fnc/alpis)
        F (+ 10(fnc/random m))
        Fx (* F (fnc/cosd alp))
        Fy (* F (fnc/sind alp))
        N (- w Fy)
        a (/ Fx m)
        ;rd (rand-int 3)
        angka [N a]
        jwb (fnc/jawaban)
       ]
        {:soal (str "Sebuah balok bermassa " m " kg mengalami gaya F = " F " newton yang membentuk sudut A = " alp "$^o$
                    terhadap horisontal seperti pada gambar. Jika lantai licin maka besar gaya normal dan percepatan yang
                    dialami balok berturut-turut adalah ... newton dan ... m/s$^2$.")
         :pictures [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 2 :param "#d3d3d3,225,075,080,000"},
                    {:obj 3 :param "#000000,225,075,090,040"},
                    {:obj 13 :param "#939393,280,075,290,050,285,045,270,037"},
                    {:obj 8 :param "#000000,290,015,F"}, {:obj 8 :param "#000000,255,065,A"},
                    {:obj 9 :param "#939393,000,126,400"}
                   ]
         :pilihan (fnc/create-option5a angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAF-3 []
  (let [m (fnc/random 10)
        g 10
        w (* m g)
        alp (fnc/alpis)
        F (+ 5 (fnc/random m))
        Fx (* F (fnc/cosd alp))
        Fy (* F (fnc/sind alp))
        N Fx
        a (/ (- w Fy) m)
        ;rd (rand-int 3)
        angka [N a]
        jwb (fnc/jawaban)
       ]
        {:soal (str "Sebuah balok bermassa " m " kg mengalami gaya F = " F " newton yang membentuk sudut A = " alp "$^o$
                    terhadap horisontal seperti pada gambar. Jika dinding licin maka besar gaya normal dan percepatan yang
                    dialami balok berturut-turut adalah ... newton dan ... m/s$^2$.")
         :pictures [{:obj 4 :param "#000000,051,075,101,125"}, {:obj 2 :param "#d3d3d3,080,177,080,000"},
                    {:obj 3 :param "#000000,152,177,070,135"},
                    {:obj 13 :param "#939393,110,177,110,160,120,150,122,145"},
                    {:obj 8 :param "#000000,120,140,F"}, {:obj 8 :param "#000000,121,170,A"},
                    {:obj 11 :param "#939393,050,000,200"}
                   ]
         :pilihan (fnc/create-option5a angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAF-4 []
  (let [m (+ 40 (fnc/random 60))
        g 10
        w (* m g)
        a (fnc/random 5)
        av (if (= 0 (rand-int 2)) "turun" "naik")
        ka (if (= 0 (rand-int 2)) "dipercepat" "diperlambat")
        aa (cond
              (and (= av "turun") (= ka "dipercepat")) 0
              (and (= av "turun") (= ka "diperlambat")) 1
              (and (= av "naik") (= ka "dipercepat")) 1
              (and (= av "naik") (= ka "diperlambat")) 0
            )
        N (if (= aa 0) (- w (* m a)) (+ w (* m a)))
        angka (/ N g)
        jwb (fnc/jawaban)
       ]
        {:soal (str "Seseorang yang bermassa  " m " kg melakukan timbang badan di dalam suatu lift yang sedang bergerak
                    " av " seperti pada gambar. Jika lift " ka " " a " m/s$^2$, maka massa orang yang terbaca pada
                    timbangan adalah ... kg. (g = 10 m/s$^2$).")
         :pictures [{:obj 4 :param "#000000,182,110,218,119"},
                    {:obj 4 :param "#000000,160,020,240,120"},
                    {:obj 14 :param "#000000,200,045"},
                    (if (= av "turun") {:obj 3 :param "#000000,270,070,040,270"} {:obj 3 :param "#000000,270,110,040,090"})
                    (if (= av "turun") {:obj 8 :param "#000000,266,122,v"} {:obj 8 :param "#000000,268,064,v"})
                    ;{:obj 10 :param "#939393,000,020,400"}
                    ]
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAF []
  "Gaya Normal"
  ;(C1X1FDAF-4))
  (let [x (rand-int 5)] ((resolve (symbol my-ns (str "C1X1FDAF-" x))))))

(defn C1X1FDAG-0 []
  (let [m (fnc/random 100)
        F (* (fnc/pm) (fnc/random 100))
        f (fnc/mutlak F)
        af (if (< F 0) 1 0)
        angka [f af]
        jwb (fnc/jawaban)
       ]
        {:soal (str "Sebuah balok bermassa " m " kg berada di atas lantai dan diberi gaya F = " f " newton seperti
                    pada gambar. Jika balok tetap diam maka besar dan arah gaya gesekan lantai adalah ... newton ke ....")
         :pictures [{:obj 4 :param "#000000,175,075,225,125"},
                    {:obj 9 :param "#939393,000,126,400"},
                    (if (> F 0) {:obj 3 :param "#000000,225,100,040,000"} {:obj 3 :param "#000000,175,100,040,180"})
                    (if (> F 0) {:obj 8 :param "#000000,270,103,F"} {:obj 8 :param "#000000,120,103,F"})]
         :pilihan (fnc/create-option6 angka jwb)
         :jawaban jwb
         }))
(defn C1X1FDAG-1 []
  (let [m (+ 10 (fnc/random 40))
        a (fnc/random 10)
        f (fnc/random 20)
        F (* (fnc/pm) (+ f (* m a)))
        af (if (< F 0) 1 0)
        abF (fnc/mutlak F)
        angka [f af]
        jwb (fnc/jawaban)
       ]
        {:soal (str "Sebuah balok bermassa " m " kg berada di atas lantai dan diberi gaya F = " abF " newton seperti
                    pada gambar. Jika balok bergerak dengan percepatan " a " m/s$^2$ maka besar dan arah gaya gesekan lantai
                    adalah ... newton ke ....")
         :pictures [{:obj 4 :param "#000000,175,075,225,125"},
                    {:obj 9 :param "#939393,000,126,400"},
                    (if (> F 0) {:obj 3 :param "#000000,225,100,040,000"} {:obj 3 :param "#000000,175,100,040,180"})
                    (if (> F 0) {:obj 8 :param "#000000,270,103,F"} {:obj 8 :param "#000000,120,103,F"})]
         :pilihan (fnc/create-option6 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAG-2 []
  (let [m (+ 16 (fnc/random 10))
        g 10
        w (* m g)
        alp (fnc/alpis)
        F (+ 10 (fnc/random m))
        Fx (* F (fnc/cosd alp))
        Fy (* F (fnc/sind alp))
        f  (fnc/random (dec (Math/round Fx)))
        N (- w Fy)
        a (/ (- Fx f) m 1.0)
        sa (/ (Math/round (* a 100)) 100.0)
        rd (rand-int 3)
        angka (cond
                 (= rd 0) a
                 (= rd 1) F
                 (= rd 2) f
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
               (= rd 0) (str "Sebuah balok bermassa " m " kg mengalami gaya F = " F " newton yang membentuk sudut A = " alp "$^o$
                          terhadap horisontal seperti pada gambar. Jika gaya gesek yang bekerja antara balok dengan lantai adalah
                          " f " newton, maka percepatan balok adalah ... m/s$^2$.")
               (= rd 1) (str "Sebuah balok bermassa " m " kg mengalami gaya F yang membentuk sudut A = " alp "$^o$
                          terhadap horisontal seperti pada gambar. Jika gaya gesek yang bekerja antara balok dengan lantai adalah
                          " f " newton dan percepatan balok " sa " m/s$^2$, maka besar gaya F tersebut adalah ... newton.")
               (= rd 2) (str "Sebuah balok bermassa " m " kg mengalami gaya F = " F " newton yang membentuk sudut A = " alp "$^o$
                          terhadap horisontal seperti pada gambar. Jika percepatan balok " sa " m/s$^2$, maka besar gaya
                             gesek yang bekerja antara permukaan balok dan lantai adalah ... newton.")
               )
         :pictures [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 2 :param "#d3d3d3,225,075,080,000"},
                    {:obj 3 :param "#000000,225,075,090,040"},
                    {:obj 13 :param "#939393,280,075,290,050,285,045,270,037"},
                    {:obj 8 :param "#000000,290,015,F"}, {:obj 8 :param "#000000,255,065,A"},
                    {:obj 9 :param "#939393,000,126,400"}
                   ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAG-3 []
  (let [m (+ 6 (fnc/random 10))
        g 10
        w (* m g)
        a (fnc/random (dec g))
        f (- w (* m a))
        rd (rand-int 3)
        angka (cond
                 (= rd 0) a
                 (= rd 1) f
                 (= rd 2) m
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah balok bermassa " m " kg mengalami gaya F yang sejajar horisontal seperti pada gambar.
                              Jika gaya gesek dinding terhadap balok adalah " f " newton, maka percepatan balok adalah ...
                              m/s$^2$.")
                (= rd 1) (str "Sebuah balok bermassa " m " kg mengalami gaya F yang sejajar horisontal seperti pada gambar.
                              Jika percepatan balok adalah " a " m/s$^2$, maka gaya gesek yang bekerja pada dinding adalah ...
                              newton.")
                (= rd 2) (str "Sebuah balok ditekan ke dinding dengan gaya F yang sejajar horisontal seperti pada gambar.
                              Jika percepatan balok " a " m/s$^2$ dan gaya gesekan dinding " f " newton, maka massa balok
                              adalah ... kg.")
               )
         :pictures [{:obj 4 :param "#000000,051,075,101,125"},
                    {:obj 3 :param "#000000,151,100,050,180"},
                    {:obj 8 :param "#000000,120,095,F"},
                    {:obj 11 :param "#939393,050,000,200"}
                   ]
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAG-4 []
  (let [mA (+ 10 (fnc/random 40))
        mB (fnc/random (dec mA))
        a (fnc/random 5)
        fAB (* mB a)
        fAL (fnc/random 10)
        F (* (fnc/pm) (+ fAB fAL (* mA a)))
        abF (Math/abs F)
        afB (if (< F 0) 0 1)
        afA (if (< F 0) 1 0)
        rd (rand-int 2)
        angka (cond
                 (= rd 0) [fAB afB]
                 (= rd 1) [fAL afA]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Dua buah balok A = " mA " kg dan B = " mB " kg ditumpuk dan didorong pada lantai dengan
                               gaya F = " abF " newton seperti pada gambar. Jika balok A dan B bergerak bersama-sama dengan
                               percepatan " a " m/s$^2$, maka besar dan arah gaya gesek yang bekerja pada benda B adalah
                               ... newton ke ....")
                 (= rd 1) (str "Dua buah balok A = " mA " kg dan B = " mB " kg ditumpuk dan didorong pada lantai dengan
                               gaya F = " abF " newton seperti pada gambar. Jika balok A dan B bergerak bersama-sama dengan
                               percepatan " a " m/s$^2$, maka besar dan arah gaya gesek yang bekerja pada benda A adalah
                               ... newton ke ....")
                )
         :pictures [{:obj 4 :param "#000000,175,075,225,125"},
                    {:obj 4 :param "#000000,185,045,215,074"}
                    {:obj 9 :param "#939393,000,126,400"},
                    {:obj 8 :param "#000000,198,103,A"}, {:obj 8 :param "#000000,198,063,B"},
                    (if (> F 0) {:obj 3 :param "#000000,225,100,040,000"} {:obj 3 :param "#000000,175,100,040,180"})
                    (if (> F 0) {:obj 8 :param "#000000,270,103,F"} {:obj 8 :param "#000000,120,103,F"})]
         :pilihan (fnc/create-option6 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
;;; terusin untuk:
;;; balok di dinding gaya tegak lurus dan miring
(defn C1X1FDAG []
  "Gaya Gesek"
  ;(C1X1FDAG-4))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "C1X1FDAG-" x))))))

(defn C1X1FDAH-0 []
  (let [m (fnc/random 100)
        g 10
        w (* m g)
        T w
        rd (rand-int 2)
        angka (cond
                    (= rd 0) T
                    (= rd 1) m
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah balok bermassa " m " kg digantung pada seutas tali vertkal seperti pada gambar
                              Gaya tarikan tali terhadap balok adalah ... newton. (g = 10 m/s$^2$).")
                (= rd 1) (str "Sebuah balok digantung vertikal pada seutas tali seperti pada gambar. Jika
                              gaya tegangan tali adalah " T " newton, maka massa benda adalah ... kg. (g = 10 m/s$^2$)."))
         :pictures [{:obj 4 :param "#000000,185,075,215,105"},
                    {:obj 1 :param "#000000,200,020,200,075"}
                    {:obj 10 :param "#939393,000,020,400"}]
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAH-1 []
  (let [m (fnc/random 100)
        g 10
        w (* m g)
        a (fnc/random 8)
        av (if (= 0 (rand-int 2)) "turun" "naik")
        ka (if (= 0 (rand-int 2)) "dipercepat" "diperlambat")
        aa (cond
              (and (= av "turun") (= ka "dipercepat")) 0
              (and (= av "turun") (= ka "diperlambat")) 1
              (and (= av "naik") (= ka "dipercepat")) 1
              (and (= av "naik") (= ka "diperlambat")) 0
            )
        T (if (= aa 0) (- w (* m a)) (+ w (* m a)))
        angka T
        jwb (fnc/jawaban)
       ]
        {:soal (str "Sebuah balok bermassa " m " kg digantung pada seutas tali di dalam lift yang sedang bergerak
                    " av " seperti pada gambar. Jika lift " ka " " a " m/s$^2$, maka besar gaya
                    tegangan tali penggantung balok adalah ... newton. (g = 10 m/s$^2$).")
         :pictures [{:obj 4 :param "#000000,185,075,215,105"},
                    {:obj 4 :param "#000000,160,020,240,120"},
                    {:obj 1 :param "#000000,200,020,200,075"},
                    (if (= av "turun") {:obj 3 :param "#000000,270,070,040,270"} {:obj 3 :param "#000000,270,110,040,090"})
                    (if (= av "turun") {:obj 8 :param "#000000,266,122,v"} {:obj 8 :param "#000000,268,064,v"})
                    ;{:obj 10 :param "#939393,000,020,400"}
                    ]
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAH-2 []
  (let [mA (+ 8 (fnc/random 20))
        mB (fnc/random 20)
        a (fnc/random 8)
        T (* mA a)
        F (+ T (* mB a))
        rd (rand-int 2)
        angka (cond
                (= rd 0) T
                (= rd 1) F
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Dua buah balok A dan B yang massanya mA = " mA " kg dan mB = " mB " kg dihubungkan dengan
                              tali lalu ditarik dengan gaya F = " F " newton seperti pada gambar. Jika percepatan
                              benda " a " m/s$^2$, maka gaya tegangan tali penghubung adalah ... newton.")
                (= rd 1) (str "Dua buah balok A dan B yang massanya mA = " mA " kg dan mB = " mB " kg dihubungkan dengan
                              tali lalu ditarik dengan gaya F newton seperti pada gambar. Jika percepatan
                              benda " a " m/s$^2$, maka besar gaya F adalah ... newton."))
         :pictures [{:obj 4 :param "#000000,175,075,225,125"},
                    {:obj 4 :param "#000000,075,075,125,125"},
                    {:obj 1 :param "#000000,125,100,175,100"},
                    {:obj 3 :param "#000000,225,100,050,000"},
                    {:obj 8 :param "#000000,280,100,F"},
                    {:obj 8 :param "#000000,195,105,B"},
                    {:obj 8 :param "#000000,095,105,A"},
                    {:obj 9 :param "#939393,000,126,400"}
                    ]
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAH-3 []
  (let [m (fnc/random 40)
        g 10
        w (* m g)
        alp (fnc/alpis)
        a (* g (fnc/tand alp))
        T (/ w (fnc/cosd alp))
        rd (rand-int 3)
        angka (cond
               (= rd 0) T
               (= rd 1) alp
               (= rd 2) a
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah bandul bermassa " m " kg digantung pada atap kereta yang sedang bergerak ke kanan seperti
                              pada gambar. Jika kereta dipercepat " a " m/s$^2$, maka besar gaya tegangan tali penggantung
                              bandung adalah ... newton. (g = 10 m/s$^2$).")
                (= rd 1) (str "Sebuah bandul bermassa " m " kg digantung pada atap kereta yang sedang bergerak ke kanan seperti
                              pada gambar. Jika kereta dipercepat " a " m/s$^2$, maka besar sudut antara tali penggantung
                              bandul dengan garis vertikal adalah  ... derajat. (g = 10 m/s$^2$).")
                (= rd 2) (str "Sebuah bandul bermassa " m " kg digantung pada atap kereta yang sedang bergerak ke kanan seperti
                              pada gambar. Jika tegangan tali bandul adalah " T " newton, maka percepatan kereta
                              adalah ... m/s$^2$. (g = 10 m/s$^2$).")
                )
         :pictures [{:obj 6 :param "#000000,160,075,010"}, {:obj 1 :param "#000000,200,020,166,066"},
                    {:obj 4 :param "#000000,120,020,280,150"}, {:obj 7 :param "#000000,174,150,010"},
                    {:obj 7 :param "#000000,228,150,010"}, {:obj 3 :param "#000000,290,085,040,000"},
                    {:obj 8 :param "#000000,332,085,v"}, {:obj 9 :param "#939393,000,161,400"}
                    ]
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAH []
  "Gaya Tegangan Tali"
  ;(C1X1FDAH-3))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "C1X1FDAH-" x))))))

(defn C1X1FDAJ-0 []
  (let [m (fnc/random 50)
        r (fnc/random 10)
        v (* (fnc/random 5) r)
        Fsp (/ (* m (* v v)) r)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) Fsp
                    (= rd 1) v
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bermassa " m " kg bergerak dengan laju " v " m/s dalam lintasan berbentuk lingkaran
                            berjejari " r " m. Besar gaya sentripetal yang dialami benda adalah ... newton.")
                (= rd 1) (str "Sebuah benda bermassa " m " kg bergerak dalam lintasan berbentuk lingkaran
                            berjejari " r " m. Jika besar gaya sentripetal yang dialami benda adalah " Fsp " newton maka
                              laju benda adalah ... m/s."))
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAJ-1 []
  (let [m (+ 80 (fnc/random 50))
        r (+ 10 (fnc/random 10))
        v (* (fnc/random 5) r)
        Fsp (/ (* m (* v v)) r)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) Fsp
                    (= rd 1) v
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seseorang mengendarai sepeda motor dengan massa total (orang dan sepeda motor) " m " kg berbelok
                              pada suatu lintasan melingkar datar denga  laju " v " m/s. Jika jejari lintasan adalah " r " m,
                              maka besar gaya gesek ke pusat lingkaran yang bekerja pada roda motor adalah ... newton.")
                (= rd 1) (str "Seseorang mengendarai sepeda motor dengan massa total (orang dan sepeda motor) " m " kg berbelok
                              pada suatu lintasan melingkar datar denga  jejari " r " m. Jika gaya gesek maksimum lintasan
                              terhadap ban sepeda motor adalah " Fsp " newton, maka laju maksimum sepeda motor agar tidak keluar
                              dari lintasan melingkarnya adalah ... m/s."))
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAJ-2 []
  (let [m (+ 200 (fnc/random 200))
        r (+ 50 (fnc/random 100))
        v (* (fnc/random 5) r)
        Fsp (/ (* m (* v v)) r)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) Fsp
                    (= rd 1) v
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bermassa " m " gram diikat dengan tali kemudian diputar melingkar di atas meja licin
                             mendatar seperti pada gambar (tampak atas). Jika panjang tali adalah " r " cm dan laju benda
                              " v " cm/s maka besar gaya tegangan tali adalah ... dyne.")
                (= rd 1) (str "Sebuah benda bermassa " m " gram diikat dengan tali kemudian diputar melingkar di atas meja licin
                             mendatar seperti pada gambar (tampak atas). Jika panjang tali adalah " r " cm dan tegangan tali
                              maksimum agar tidak putus adalah " Fsp " dyne, maka laju benda maksimum adalah ... cm/s."))
         :pictures [{:obj 6 :param "#d3d3d3,200,100,070"}, {:obj 1 :param "#000000,200,100,260,100"},
                    {:obj 4 :param "#000000,110,010,290,190"}, {:obj 4 :param "#000000,260,090,280,110"}
                    ]
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAJ-3 []
  (let [m (fnc/random 50)
        r (fnc/random 4)
        g 10
        v (* (fnc/random 3) r)
        Nb (+ (/ (* m (* v v)) r) (* m g))
        va_min (Math/sqrt (* g r))
        rd (rand-int 2)
        angka (cond
                    (= rd 0) Nb
                    (= rd 1) va_min
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bermassa " m " kg bergerak dalam lintasan vertikal melingkar berjejari " r " m
                              seperti pada gambar. Jika laju benda di dasar lintasan adalah " v " m/s, maka gaya normal
                              yang bekerja pada bola adalah ... newton. (g = 10 m/s$^2$). ")
                (= rd 1) (str "Sebuah benda bermassa " m " kg bergerak dalam lintasan vertikal melingkar berjejari " r " m
                              seperti pada gambar. Laju benda di puncak lintasan agar benda tetap pada lintasan melingkarnya
                              adalah ... m/s (g = 10 m/s$^2$)."))
         :pictures [{:obj 6 :param "#b3b3b3,200,100,70"}, {:obj 6 :param "#f3f3f3,200,100,72"},
                    {:obj 7 :param "#000000,200,160,010"}]
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FDAJ []
  "Gaya Sentripetal"
  ;(C1X1FDAJ-3))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "C1X1FDAJ-" x))))))

;;;;;;
;;;;;; OPTIKA GEOMETRI

(defn C1X1FEAA-0 []
  (let [A (+ 90 (rand-int 15))
        i (+ 20 (rand-int 50))
        p (- A i)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) A
                    (= rd 1) i
                    (= rd 2) p
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seberkas sinar datang menumbuk bidang pantul I kemudian dipantulkan menuju bidang pantul II seperti
                              pada gambar. Jika sudut datang sinar pada bidang pantul I adalah " i " derajat dan sudut pantul sinar
                              pada bidang kedua adalah " p " derajat, maka sudut antara bidang pantul I dan II adalah ... derajat.")
                (= rd 1) (str "Seberkas sinar datang menumbuk bidang pantul I kemudian dipantulkan menuju bidang pantul II seperti
                              pada gambar. Jika sudut antara bidang pantul I dan II adalah " A " derajat dan sudut pantul
                              sinar pada bidang pantul II adalah " p " derajat, maka sudut datang sinar pada bidang
                              pantul I adalah ... derajat. ")
                (= rd 2) (str "Seberkas sinar datang menumbuk bidang pantul I kemudian dipantulkan menuju bidang pantul II seperti
                              pada gambar. Jika sudut antara bidang pantul I dan II adalah " A " derajat dan sudut datang
                              sinar pada bidang pantul I adalah " i " derajat, maka sudut pantul sinar pada bidang
                              pantul II adalah ... derajat. "))

         :pictures [{:obj 1 :param "#535353,130,040,150,160"}, {:obj 1 :param "#535353,150,160,300,160"},
                    {:obj 8 :param "#535353,120,090,I"}, {:obj 8 :param "#535353,200,180,II"},
                    {:obj 8 :param "#535353,210,060,sinar datang"}, {:obj 3 :param "#000000,200,060,070,215"}]
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/bab4/C1X1FDAB.html"
         }))
(defn C1X1FEAA-1 []
  (let [h (+ 120 (nth (range 0 61 2) (rand-int 30)))
        l (+ 200 (rand-int 51))
        p (- (/ h 2) (rand-int 20))
        t (- (- l h) (rand-int 40))
        pa (* (- p (- l h t)) 2)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) pa
                    (= rd 1) h
                    (= rd 2) t
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seseorang dengan tinggi " h " cm berdiri di depan cermin datar yang panjangnya " p " cm dan
                              dipasang pada dinding vertikal
                              pada sebuah ruangan seperti pada gambar. Jika tinggi langit-langit " l " cm dan jarak ujung atas
                              cermin dari langit-langit adalah " t " cm, maka bagian bayangan badan yang dapat dilihat orang
                              adalah setinggi ... cm.")
                (= rd 1) (str "Seseorang berdiri didepan cermin datar yang panjangnya " p " cm dan dipasang pada dinding vertikal
                              pada sebuah ruangan yang tinggi langit-langitnya adalah " l " cm seperti pada gambar.
                              Jika cermin dipasang dengan jarak ujung atas cermin dengan langit-langit adalah " t " cm,
                              dan bayangan bagian badan yang terlihat oleh orang adalah setinggi " pa " cm,
                              maka tinggi orang tersebut adalah ... cm.")
                (= rd 2) (str "Seseorang yang tingginya " h " cm berdiri didepan cermin datar yang panjangnya " p " cm
                              dan dipasang pada dinding vertikal
                              pada sebuah ruangan yang tinggi langit-langitnya adalah " l " cm seperti pada gambar.
                              Jika bayangan bagian badan yang terlihat oleh orang adalah setinggi " pa " cm,
                              maka jarak ujung atas cermin dari langit-langit adalah ... cm."))
         :pictures [{:obj 14 :param "#000000,120,085"}, {:obj 9 :param "#535353,100,150,105"}, {:obj 10 :param "#535353,100,020,100"},
                    {:obj 12 :param "#535353,200,020,130"}, {:obj 4 :param "#000000,198,060,200,110"}]
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAA-2 []
  (let [h (+ 120 (nth (range 0 61 2) (rand-int 30)))
        m (nth [10 12 14] (rand-int 3))
        y (/ (- h m) 2)
        t (/ h 2)
        j (+ 100 (rand-int 20))
        rd (rand-int 3)
        angka (cond
                    (= rd 0) t
                    (= rd 1) y
                    (= rd 2) h
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seseorang berdiri " j " cm di depan cermin datar yang terpasang di dinding vertikal seperti
                              pada gambar. Jika tinggi orang tersebut " h " cm, maka panjang cermin minimum agar orang tersebut
                              dapat melihat bayangan dari ujung kaki sampai ujung kepala adalah ... cm.")
                (= rd 1) (str "Seseorang dengan tinggi badan " h " cm berdiri di depan cermin datar yang dipasang pada dinding
                              vertikal seperti pada gambar. Jika jarak antara mata orang dengan ujung kepalanya adalah " m " cm,
                              maka jarak maksimal ujung bawah cermin dengan lantai agar orang masih bisa melihat ujung kakinya
                              adalah ... cm.")
                (= rd 2) (str "Seseorang berdiri " j " cm di depan cermin datar yang terpasang di dinding vertikal seperti
                              pada gambar. Jika panjang cermin minimum yang dibutuhkan agar orang tersebut
                              dapat melihat bayangan dari ujung kaki sampai ujung kepala adalah " t " cm, maka tinggi orang
                              tersebut adalah ... cm."))
         :pictures [{:obj 14 :param "#000000,120,085"}, {:obj 9 :param "#535353,100,150,105"}
                    {:obj 12 :param "#535353,200,050,100"}, {:obj 4 :param "#535353,198,080,200,140"}]
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAA-3 []
  (let [a (+ 5 (fnc/random 30))
        b (* a 2)
        rd (rand-int 4)
        angka (cond
                    (= rd 0) b
                    (= rd 1) a
                    (= rd 2) b
                    (= rd 3) a
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seseorang melihat bayangan dirinya melalui cermin yang bergerak mendekat dengan laju " a " m/s.
                              Laju bayangan orang tersebut adalah ... m/s mendekati orang.")
                (= rd 1) (str "Seseorang melihat bayangan dirinya pada cermin bergerak menjauh dengan laju " b " m/s. Laju
                              gerak cermin menjauhi orang adalah ... m/s.")
                (= rd 2) (str "Seberkas sinar diarahkan ke suatu cermin datar sehingga memantul dari cermin.
                               Jika cermin diputar " a " derajat maka sinar pantul akan berputar ... derajat.")
                (= rd 3) (str "Seberkas sinar diarahkan ke suatu cermin datar sehingga memantul dari cermin.
                               Sinar pantul ini akan berputar " b " derajat apabila cermin diputar ... derajat."))
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAA []
  "Cermin datar"
  ;(C1X1FEAA-3))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "C1X1FEAA-" x))))))

(defn C1X1FEAB-0 []
  (let [data (read-string (slurp "data/fis10ktsp/C1X1FEAB-0.txt"))
        datum (nth data (rand-int (count data)))
        s (first datum)
        sa (second datum)
        ket_sa (if (< sa 0) "maya" "nyata")
        a_sa (Math/abs sa)
        f (last datum)
        R (* f 2)
        M (/ a_sa s)
        rd (rand-int 6)
        angka (cond
                    (= rd 0) a_sa
                    (= rd 1) s
                    (= rd 2) f
                    (= rd 3) R
                    (= rd 4) M
                    (= rd 5) s
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu benda berada " s " cm di depan cermin cekung yang berjejari " R " cm. Jarak bayangan benda
                              dari cermin adalah ... cm." )
                (= rd 1) (str "Suatu benda diletakkan di depan cermin cekung yang jari-jarinya " R " cm sehingga menghasilkan
                              bayangan " ket_sa " yang berjarak " a_sa " cm dari cermin. Jarak benda tersebut dari cermin
                              adalah ... cm.")
                (= rd 2) (str "Suatu benda berada " s " cm di depan cermin cekung sehingga menghasilkan bayangan " ket_sa "
                              yang berjarak " a_sa " cm dari cermin. Jarak fokus cermin tersebut adalah ... cm.")
                (= rd 3) (str "Suatu benda berada " s " cm di depan cermin cekung sehingga menghasilkan bayangan " ket_sa "
                              yang berjarak " a_sa " cm dari cermin. Jejari cermin tersebut adalah ... cm.")
                (= rd 4) (str "Suatu benda berada " s " cm di depan cermin cekung berjejari " R " cm. Pembesaran bayangan
                              cermin adalah ... kali.")
                (= rd 5) (str "Jika bayangan yang terbentuk oleh cermin cekung dengan jari-jari kelengkungan " R " cm " ket_sa "
                              dan pembesarannya " M " kali, maka bendanya terletak di muka cermin sejauh .... cm."))
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAB-1 []
  (let [data (read-string (slurp "data/fis10ktsp/C1X1FEAB-1.txt"))
        datum (nth data (rand-int (count data)))
        s (first datum)
        sa (second datum)
        a_sa (Math/abs sa)
        f (last datum)
        a_f (Math/abs f)
        R (* 2 a_f)
        M (/ a_sa s)
        rd (rand-int 5)
        angka (cond
                    (= rd 0) a_sa
                    (= rd 1) s
                    (= rd 2) a_f
                    (= rd 3) R
                    (= rd 4) M
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu benda berada " s " cm di depan cermin cembung yang berjejari " R " cm. Jarak bayangan benda
                              dari cermin adalah ... cm." )
                (= rd 1) (str "Suatu benda diletakkan di depan cermin cembung yang jari-jarinya " R " cm sehingga menghasilkan
                              bayangan yang berjarak " a_sa " cm dari cermin. Jarak benda tersebut dari cermin
                              adalah ... cm.")
                (= rd 2) (str "Suatu benda berada " s " cm di depan cermin cembung sehingga menghasilkan bayangan
                              yang berjarak " a_sa " cm dari cermin. Jarak fokus cermin tersebut adalah ... cm.")
                (= rd 3) (str "Suatu benda berada " s " cm di depan cermin cembung sehingga menghasilkan bayangan
                              yang berjarak " a_sa " cm dari cermin. Jejari cermin tersebut adalah ... cm.")
                (= rd 4) (str "Suatu benda berada " s " cm di depan cermin cembung berjejari " R " cm. Pembesaran bayangan
                              cermin adalah ... kali."))
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAB-2 []
  "Sifat bayangan cermin cekung dan cembung"
  (let [f (+ 10 (rand-int 101))
        R (* f 2)
        vsb [["nyata" "maya"] ["diperbesar" "diperkecil" "sama besar"] ["tegak" "terbalik"]]
        s (fnc/exclude f (* R 2))
        vec_s (cond
                 (> s R) [0 1 1]
                 (and (< s R) (> s f)) [0 0 1]
                 (< s f) [1 0 0]
                 (= s R) [0 2 1]
               )
        rd (rand-int 4)
        data (cond
                 (= rd 0) (conj vsb vec_s)
                 (= rd 1) (conj vsb vec_s)
                 (= rd 2) (conj vsb [1 1 0])
                 (= rd 3) (conj vsb [0 2 1])
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu benda terletak " s " cm di depan cermin cekung yang memiliki jarak fokus " f " cm.
                              Sifat bayangan benda adalah ...")
                (= rd 1) (str "Suatu benda terletak " s " cm di depan cermin cekung yang memiliki jejari " R " cm.
                              Sifat bayangan benda adalah ...")
                (= rd 2) (str "Suatu benda terletak " s " cm di depan cermin cembung yang memiliki jarak fokus " f " cm.
                              Sifat bayangan benda adalah ...")
                (= rd 3) (str "Suatu benda terletak " R " cm di depan cermin cekung yang memiliki jarak fokus " f " cm.
                              Sifat bayangan benda adalah ..."))
         :pilihan (fnc/create-option8 data jwb)
         :jawaban jwb
         ;:teori "teori/fis10ktsp/C1X1FEAC-3.html"
         }))
(defn C1X1FEAB []
  "Cermin lengkung"
  ;(C1X1FEAB-0))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1X1FEAB-" x))))))

(defn C1X1FEAC-0 []
  (let [n1 1
        n2 (nth [8/7 9/8 4/3] (rand-int 3))
        s (fnc/random 5)
        sa (* (/ n2 n1) s)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) sa
                    (= rd 1) s
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seorang penyelam yang sedang berada di bawah permukaan air sedang mengamati suatu benda
                              yang berjarak " s " m di atas permukaan air. Jika indeks bias air tersebut " n2 " maka
                              bayangan benda yang dilihat penyelam berjarak .... m di atas permukaan air." )
                (= rd 1) (str "Seorang penyelam yang sedang berada di bawah permukaan air melihat bayangan suatu benda
                              berjarak " sa " m dari permukaan air. Jika indeks bias air tersebut " n2 " maka
                              jarak benda dari permukaan air adalah ... m."))
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C1X1FEAC-1 []
  (let [n1 (nth [8/7 9/8 4/3] (rand-int 3))
        n2 1
        s (fnc/random 5)
        sa (* (/ n2 n1) s)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) sa
                    (= rd 1) s
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seorang anak melihat ke dasar kolam yang dalamnya " s "  meter. Jika indeks bias air kolam
                              adalah " n1 " maka kedalaman kolam yang dilihat anak itu tampak sedalam .... meter." )
                (= rd 1) (str "Dasar kolam jika dilihat dari atas permukaan kolam tampak sedalam " sa " meter. Jika
                              indeks bias air kolam adalah " n1 " maka dalam kolam sebenarnya adalah ... meter."))
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C1X1FEAC-2 []
  (let [n1 1
        n2 (nth [8/7 9/8 4/3] (rand-int 3))
        lam1 (+ 500 (rand-int 100))
        lam2 (/ (* n1 lam1) n2)
        v1 3
        v2 (/ (* n1 v1) n2)
        theta1 (fnc/alpis)
        theta2 (* (Math/asin (/ (* n1 (fnc/sind theta1)) n2)) (/ 180 Math/PI))
        dev (- theta1 theta2)
        f (* (/ v1 lam1) 1000)
        rd (rand-int 4)
        angka (cond
                    (= rd 0) lam2
                    (= rd 1) v2
                    (= rd 2) dev
                    (= rd 3) f
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seberkas sinar monokromatik berpindah medium dari udara ke zat cair dengan indeks bias " n2 ".
                              Jika panjang gelombang sinar itu di udara adalah " lam1 " nm maka panjang gelombang sinar tersebut
                              di zat cair adalah ... nm.")
                (= rd 1) (str "Seberkas sinar monokromatik berpindah medium dari udara ke zat cair dengan indeks bias " n2 ".
                              cepat rambat gelombang sinar tersebut dalam zat cair adalah ... x 10$^8$ m/s.")
                (= rd 2) (str "Seberkas sinar monokromatik berpindah medium dari udara ke zat cair dengan indeks bias " n2 ".
                              Jika sudut datang sinar terhadap permukaan zat cair adalah " theta1 " derajat maka sudut deviasi sinar
                              adalah ... derajat.")
                (= rd 3) (str "Seberkas sinar monokromatik berpindah medium dari udara ke zat cair dengan indeks bias " n2 ".
                              frekuensi gelombang sinar tersebut dalam zat cair adalah ... x 10$^{14}$ Hz. (c = 3 x 10$^8$ m/s.)"))
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C1X1FEAC-3 []
  (let [n2 1
        n1 (nth [8/5 9/7 3/2] (rand-int 3))
        R (+ 20 (rand-int 20))
        s (+ 10 (rand-int 10))
        sa (/ 1 (/ (- (/ (- n2 n1) (* -1 R)) (/ n1 s)) n2))
        dsa (/ (Math/round (* sa 100.0)) 100.0)
        asa (Math/abs dsa)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) asa
                    (= rd 1) s
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu objek berada di dalam bola kristal yang berindeks bias " n1 " dan berjejari " R " cm
                              seperti pada gambar. Jika objek berjarak " s " cm dari permukaan bola, maka pengamat akan
                              melihat bayangan objek pada jarak ... cm dari permukaan bola.")
                (= rd 1) (str "Suatu objek berada di dalam bola kristal yang berindeks bias " n1 " dan berjejari " R " cm
                              seperti pada gambar. Jika bayangan objek yang dilihat pengamat berjarak " dsa " cm dari permukaan
                              bola, maka jarak objek adalah ... cm dari permukaan bola."))
         :pictures [{:obj 15 :param "#000000,070,100"},{:obj 6 :param "#000000,200,100,070"},
                    {:obj 4 :param "#000000,170,095,173,105"}, {:obj 8 :param "#000000,040,123,pengamat"},
                    {:obj 8 :param "#000000,160,120,objek"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/C1X1FEAC-3.html"
         }))
(defn C1X1FEAC-4 []
  (let [n1 1
        n2 (nth [8/5 9/7 3/2] (rand-int 3))
        R (+ 20 (rand-int 20))
        s (+ 10 (rand-int 10))
        sa (/ 1 (/ (- (/ (- n2 n1) R) (/ n1 s)) n2))
        dsa (/ (Math/round (* sa 100.0)) 100.0)
        asa (Math/abs dsa)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) asa
                    (= rd 1) s
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu pengamat yang berada dalam bola kaca tipis berisi cairan berindeks bias " n2 " sedang
                              mengamati obyek diluar bola kaca seperti pada gambar (medium di luar bola adalah udara).
                              Jika jejari bola " R " cm dan jarak obyek dari permukaan bola " s " cm maka bayangan
                              obyek akan terlihat .... cm dari permukaan bola.")
                (= rd 1) (str "Suatu pengamat yang berada dalam bola kaca tipis berisi cairan berindeks bias " n2 " sedang
                              mengamati obyek diluar bola kaca seperti pada gambar (medium di luar bola adalah udara).
                              Jika jejari bola " R " cm dan jarak bayangan obyek dari permukaan bola " asa " cm maka letak
                              obyek dari permukaan bola adalah ... cm"))
         :pictures [{:obj 16 :param "#000000,170,100"},{:obj 6 :param "#000000,200,100,070"},
                    {:obj 4 :param "#000000,070,095,073,105"}, {:obj 8 :param "#000000,040,123,obyek"},
                    {:obj 8 :param "#000000,155,120,pengamat"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         :teori "teori/fis10ktsp/C1X1FEAC-3.html"
         }))
(defn C1X1FEAC []
  "Permukaan bidang batas / lensa tebal"
  ;(C1X1FEAC-4))
  (let [x (rand-int 5)] ((resolve (symbol my-ns (str "C1X1FEAC-" x))))))

(defn C1X1FEAD-0 []
  "lensa cembung"
  (let [nL (nth [1.5 1.6 1.7] (rand-int 3))
        nm (nth [1.00 1.33 1.34 1.35] (rand-int 4))
        R1 (+ 1 (rand-int 10))
        R2 (+ 1 (rand-int 10))
        R2_ck (+ R1 (fnc/random 10))
        fm (/ 1 (* (- (/ nL nm) 1) (+ (/ 1 R1) (/ 1 R2)))) ; fokus cembung-cembung
        fm_R2th (/ 1 (* (- (/ nL nm) 1) (/ 1 R1))) ; fokus cembung-datar
        fm_ck (/ 1 (* (- (/ nL nm) 1) (+ (/ 1 R1) (/ -1 R2_ck)))) ; fokus cembung-cekung
        dfm (/ (Math/round (* fm 100.0)) 100.0)
        dfm_R2th (/ (Math/round (* fm_R2th 100.0)) 100.0)
        dfm_R2ck (/ (Math/round (* fm_ck 100.0)) 100.0)
        rd (rand-int 5)
        angka (cond
                    (= rd 0) dfm
                    (= rd 1) nm
                    (= rd 2) dfm_R2th
                    (= rd 3) dfm_R2ck
                    (= rd 4) R2_ck
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu lensa cembung-cembung berindeks bias " nL " memiliki jejari kelengkungan " R1 " m dan "
                              R2 " m. Jarak fokus lensa tersebut pada medium berindeks bias " nm " adalah ... m.")
                (= rd 1) (str "Suatu lensa cembung-cembung berindeks bias " nL " memiliki jejari kelengkungan " R1 " m dan "
                              R2 " m. Jika jarak fokus lensa tersebut adalah " dfm " m, maka lensa tersebut berada pada
                              medium berindeks bias ...")
                (= rd 2) (str "Suatu lensa cembung-datar berindeks bias " nL " memiliki permukaan lengkung berjejari " R1 " m.
                              Jarak fokus lensa tersebut pada medium berindeks bias " nm " adalah ... m.")
                (= rd 3) (str "Suatu lensa cembung-cekung berindeks bias " nL " memiliki jejari kelengkungan " R1 " m dan "
                              R2_ck " m. Jarak fokus lensa tersebut pada medium berindeks bias " nm " adalah ... m.")
                (= rd 4) (str "Suatu lensa cembung-cekung berindeks bias " nL " memiliki jarak fokus " dfm_R2ck " ketika berada
                              dalam medium berindeks bias " nm ". Jika jejari cembungnya adalah " R1 " m, maka jejari
                              cekungnya adalah ... m."))
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         ;:teori "teori/fis10ktsp/C1X1FEAC-3.html"
         }))
(defn C1X1FEAD-1 []
  "lensa cekung"
  (let [nL (nth [1.5 1.6 1.7] (rand-int 3))
        nm (nth [1.00 1.33 1.34 1.35] (rand-int 4))
        R1 (+ 1 (rand-int 10))
        R2 (+ 1 (rand-int 10))
        R2_cb (+ R1 (fnc/random 10))
        fm (/ 1 (* (- (/ nL nm) 1) (+ (/ -1 R1) (/ -1 R2)))) ; fokus cekung-cekung
        fm_R2th (/ 1 (* (- (/ nL nm) 1) (/ -1 R1))) ; fokus cekung-datar
        fm_cb (/ 1 (* (- (/ nL nm) 1) (+ (/ -1 R1) (/ 1 R2_cb)))) ; fokus cekung-cembung
        dfm (/ (Math/round (* fm 100.0)) 100.0)
        dfm_R2th (/ (Math/round (* fm_R2th 100.0)) 100.0)
        dfm_R2cb (/ (Math/round (* fm_cb 100.0)) 100.0)
        rd (rand-int 5)
        angka (cond
                    (= rd 0) (Math/abs dfm)
                    (= rd 1) nm
                    (= rd 2) (Math/abs dfm_R2th)
                    (= rd 3) (Math/abs dfm_R2cb)
                    (= rd 4) R2_cb
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu lensa cekung-cekung berindeks bias " nL " memiliki jejari kelengkungan " R1 " m dan "
                              R2 " m. Jarak fokus lensa tersebut pada medium berindeks bias " nm " adalah ... m.")
                (= rd 1) (str "Suatu lensa cekung-cekung berindeks bias " nL " memiliki jejari kelengkungan " R1 " m dan "
                              R2 " m. Jika jarak fokus lensa tersebut adalah " (Math/abs dfm) " m, maka lensa tersebut berada pada
                              medium berindeks bias ...")
                (= rd 2) (str "Suatu lensa cekung-datar berindeks bias " nL " memiliki permukaan lengkung berjejari " R1 " m.
                              Jarak fokus lensa tersebut pada medium berindeks bias " nm " adalah ... m.")
                (= rd 3) (str "Suatu lensa cekung-cembung berindeks bias " nL " memiliki jejari kelengkungan " R1 " m dan "
                              R2_cb " m. Jarak fokus lensa tersebut pada medium berindeks bias " nm " adalah ... m.")
                (= rd 4) (str "Suatu lensa cekung-cembung berindeks bias " nL " memiliki jarak fokus " (Math/abs dfm_R2cb) " ketika berada
                              dalam medium berindeks bias " nm ". Jika jejari cekungnya adalah " R1 " m, maka jejari
                              cembungnya adalah ... m."))
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         ;:teori "teori/fis10ktsp/C1X1FEAC-3.html"
         }))
(defn C1X1FEAD []
  "Lensa tipis"
  ;(C1X1FEAD-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FEAD-" x))))))

(defn C1X1FEADA-0 []
  "lensa gabungan"
  (let [tambahan (range 10 201 10)
        f1 (+ 40 (nth tambahan (rand-int (count tambahan))))
        f1t (if (= (rand-int 2) 0) (* -1 f1) f1)
        f2 (+ f1 (nth tambahan (rand-int (count tambahan))))
        f2t (if (= (rand-int 2) 0) (* -1 f2) f2)
        fg (/ (* f1t f2t) (+ f1t f2t))
        rd (rand-int 3)
        angka (cond
                    (= rd 0) fg
                    (= rd 1) f2t
                    (= rd 2) f1t
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Dua buah lensa tipis yang masing-masing fokusnya " f1t " cm dan " f2t " cm digabungkan sehingga
                              menghasilkan lensa gabungan dengan fokus gabungan ... cm (tanda - berarti lensa cekung)." )
                (= rd 1) (str "Dua buah lensa tipis jika digabungkan akan menghasilkan fokus gabungan " fg " cm. Jika fokus
                              lensa pertama adalah " f1t " cm, maka fokus lensa kedua adalah ... cm (tanda - berarti lensa cekung).")
                (= rd 2) (str "Dua buah lensa tipis jika digabungkan akan menghasilkan fokus gabungan " fg " cm. Jika fokus
                              lensa kedua adalah " f2t " cm, maka fokus lensa pertama adalah ... cm (tanda - berarti lensa cekung)."))
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         ;:teori "teori/fis10ktsp/C1X1FEAC-3.html"
         }))
(defn C1X1FEADA []
  "Lensa gabungan"
  (C1X1FEADA-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FEAD-" x))))))

(defn C1X1FEAE-0 []
  "Sifat bayangan lensa cembung dan cekung"
  (let [f (+ 10 (rand-int 101))
        R (* f 2)
        vsb [["nyata" "maya"] ["diperbesar" "diperkecil" "sama besar"] ["tegak" "terbalik"]]
        s (fnc/exclude f (* R 2))
        vec_s (cond
                 (> s R) [0 1 1]
                 (and (< s R) (> s f)) [0 0 1]
                 (< s f) [1 0 0]
                 (= s R) [0 2 1]
               )
        rd (rand-int 4)
        data (cond
                 (= rd 0) (conj vsb vec_s)
                 (= rd 1) (conj vsb vec_s)
                 (= rd 2) (conj vsb [1 1 0])
                 (= rd 3) (conj vsb [0 2 1])
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu benda terletak " s " cm di depan lensa cembung yang memiliki jarak fokus " f " cm.
                              Sifat bayangan benda adalah ...")
                (= rd 1) (str "Suatu benda terletak " s " cm di depan lensa cembung yang memiliki jejari " R " cm.
                              Sifat bayangan benda adalah ...")
                (= rd 2) (str "Suatu benda terletak " s " cm di depan lensa cekung yang memiliki jarak fokus " f " cm.
                              Sifat bayangan benda adalah ...")
                (= rd 3) (str "Suatu benda terletak " R " cm di depan lensa cembung yang memiliki jarak fokus " f " cm.
                              Sifat bayangan benda adalah ..."))
         :pilihan (fnc/create-option8 data jwb)
         :jawaban jwb
         ;:teori "teori/fis10ktsp/C1X1FEAC-3.html"
         }))
(defn C1X1FEAE-1 []
  (let [data (read-string (slurp "data/fis10ktsp/C1X1FEAB-0.txt"))
        datum (nth data (rand-int (count data)))
        s (first datum)
        sa (second datum)
        ket_sa (if (< sa 0) "maya" "nyata")
        a_sa (Math/abs sa)
        f (last datum)
        R (* f 2)
        M (/ a_sa s)
        rd (rand-int 6)
        angka (cond
                    (= rd 0) a_sa
                    (= rd 1) s
                    (= rd 2) f
                    (= rd 3) R
                    (= rd 4) M
                    (= rd 5) s
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu benda berada " s " cm di depan lensa cembung yang berjejari " R " cm. Jarak bayangan benda
                              dari lensa adalah ... cm.")
                (= rd 1) (str "Suatu benda diletakkan di depan lensa cembung yang jari-jarinya " R " cm sehingga menghasilkan
                              bayangan " ket_sa " yang berjarak " a_sa " cm dari lensa. Jarak benda tersebut dari lensa
                              adalah ... cm.")
                (= rd 2) (str "Suatu benda berada " s " cm di depan lensa cembung sehingga menghasilkan bayangan " ket_sa "
                              yang berjarak " a_sa " cm dari lensa. Jarak fokus lensa tersebut adalah ... cm.")
                (= rd 3) (str "Suatu benda berada " s " cm di depan lensa cembung sehingga menghasilkan bayangan " ket_sa "
                              yang berjarak " a_sa " cm dari lensa. Jejari lensa tersebut adalah ... cm.")
                (= rd 4) (str "Suatu benda berada " s " cm di depan lensa cembung berjejari " R " cm. Pembesaran bayangan
                              lensa adalah ... kali.")
                (= rd 5) (str "Jika bayangan yang terbentuk oleh lensa cembung dengan jari-jari kelengkungan " R " cm " ket_sa "
                              dan pembesarannya " M " kali, maka bendanya terletak di depan lensa sejauh .... cm."))
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAE-2 []
  (let [data (read-string (slurp "data/fis10ktsp/C1X1FEAB-1.txt"))
        datum (nth data (rand-int (count data)))
        s (first datum)
        sa (second datum)
        a_sa (Math/abs sa)
        f (last datum)
        a_f (Math/abs f)
        R (* 2 a_f)
        M (/ a_sa s)
        rd (rand-int 5)
        angka (cond
                    (= rd 0) a_sa
                    (= rd 1) s
                    (= rd 2) a_f
                    (= rd 3) R
                    (= rd 4) M
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu benda berada " s " cm di depan lensa cekung yang berjejari " R " cm. Jarak bayangan benda
                              dari lensa adalah ... cm." )
                (= rd 1) (str "Suatu benda diletakkan di depan lensa cekung yang jari-jarinya " R " cm sehingga menghasilkan
                              bayangan yang berjarak " a_sa " cm dari lensa. Jarak benda tersebut dari lensa
                              adalah ... cm.")
                (= rd 2) (str "Suatu benda berada " s " cm di depan lensa cekung sehingga menghasilkan bayangan
                              yang berjarak " a_sa " cm dari lensa. Jarak fokus lensa tersebut adalah ... cm.")
                (= rd 3) (str "Suatu benda berada " s " cm di depan lensa cekung sehingga menghasilkan bayangan
                              yang berjarak " a_sa " cm dari lensa. Jejari lensa tersebut adalah ... cm.")
                (= rd 4) (str "Suatu benda berada " s " cm di depan lensa cekung berjejari " R " cm. Pembesaran bayangan
                              lensa adalah ... kali."))
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAE []
  "Pembentukan bayangan pada lensa tipis"
  ;(C1X1FEAE-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1X1FEAE-" x))))))

(defn C1X1FEAG-0 []
  "Kacamata minus / Rabun jauh"
  (let [PR (+ 50 (* 50 (fnc/random 7)))
        P (/ -100 PR)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) P
                    (= rd 1) PR
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Orang yang menderita rabun jauh dengan titik jauh " PR " cm memerlukan kacamata dengan
                              kekuatan ... dioptri." )
                (= rd 1) (str "Kacamata dengan kekuatan " P " dioptri digunakan untuk menolong orang rabun jauh dengan
                              titik jauh ... cm."))
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAG-1 []
  "Kacamata plus / Rabun dekat"
  (let [vP [1/4 1/2 1 3/2 2 5/4 5/2]
        P (nth vP (rand-int (count vP)))
        PP (/ 100 (- 4 P))
        dP (fnc/nd P 2)
        dPP (fnc/nd PP 2)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) P
                    (= rd 1) dPP
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Orang yang menderita rabun dekat dengan titik dekat " dPP " cm memerlukan kacamata dengan
                              kekuatan ... dioptri." )
                (= rd 1) (str "Kacamata dengan kekuatan " dP " dioptri digunakan untuk menolong orang dekat dengan
                              titik dekat ... cm."))
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C1X1FEAG []
  "Kacamata"
  ;(C1X1FEAG-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FEAG-" x))))))

(defn C1X1FEAH-0 []
  "Kaca Pembesar berakomodasi minimum"
  (let [data (read-string (slurp "data/fis10ktsp/C1X1FEAH-0.txt"))
        datum (nth data (rand-int (count data)))
        PP (first datum)
        f (second datum)
        M (last datum)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) PP
                    (= rd 1) f
                    (= rd 2) M
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seseorang menggunakan kaca pembesar dengan fokus " f " cm untuk melihat obyek secara
                              berakomodasi minimum sehingga pembesaran obyek yang dilihat adalah " M " kali. Titik dekat
                              mata orang tersebut adalah ... cm." )
                (= rd 1) (str "Orang dengan titik dekat " PP " cm mengamati benda dengan kaca pembesar secara
                              berakomodasi minimum sehingga diperoleh
                              pembesaran " M " kali. Fokus lensa kaca pembesar yang digunakan adalah ... cm.")
                (= rd 2) (str "Orang dengan titik dekat " PP " cm mengamati benda dengan kaca pembesar berfokus " f " cm
                              secara berakomodasi minimum. Pembesaran obyek yang dilihat adalah ... kali.")
                )
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAH-1 []
  "Kaca Pembesar berakomodasi maksimum"
  (let [data (read-string (slurp "data/fis10ktsp/C1X1FEAH-1.txt"))
        datum (nth data (rand-int (count data)))
        PP (first datum)
        f (second datum)
        M (last datum)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) PP
                    (= rd 1) f
                    (= rd 2) M
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seseorang menggunakan kaca pembesar dengan fokus " f " cm untuk melihat obyek secara
                              berakomodasi maksimum sehingga pembesaran obyek yang dilihat adalah " M " kali. Titik dekat
                              mata orang tersebut adalah ... cm." )
                (= rd 1) (str "Orang dengan titik dekat " PP " cm mengamati benda dengan kaca pembesar secara
                              berakomodasi maksimum sehingga diperoleh
                              pembesaran " M " kali. Fokus lensa kaca pembesar yang digunakan adalah ... cm.")
                (= rd 2) (str "Orang dengan titik dekat " PP " cm mengamati benda dengan kaca pembesar berfokus " f " cm
                              secara berakomodasi maksimum. Pembesaran obyek yang dilihat adalah ... kali.")
                )
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAH []
  "Kaca Pembesar"
  ;(C1X1FEAH-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FEAH-" x))))))


(defn C1X1FEAI-0 []
  "Teropong bintang"
  (let [M (+ 5 (rand-int 46))
        fok (fnc/random 10)
        Rok (* fok 2)
        fob (* M fok)
        Rob (* fob 2)
        d (+ fok fob)
        rd (rand-int 4)
        angka (cond
                    (= rd 0) M
                    (= rd 1) fob
                    (= rd 2) fok
                    (= rd 3) d
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu teropong bintang memiliki lensa okuler berjejari " Rok " cm dan lensa obyektif berjejari
                              " Rob " cm. Pembesaran teropong bintang tersebut adalah ... ")
                (= rd 1) (str "Teropong bintang dengan pembesaran " M " kali memiliki lensa okuler berjarak fokus " fok " cm.
                              Jarak fokus lensa obyektifnya adalah ... cm.")
                (= rd 2) (str "Teropong bintang dengan panjang " d " cm memiliki lensa obyektif berjerari " Rob " cm. Jarak
                              fokus lensa okulernya adalah ... cm.")
                (= rd 3) (str "Teropong bintang dengan pembesaran " M " kali memiliki lensa obyektif berjerari " Rob " cm. Panjang
                              teropong tersebut adalah ... cm.")
                )
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAI []
  "Teropong bintang"
  (C1X1FEAI-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FEAI-" x))))))

(defn C1X1FEAJ-0 []
  "Teropong bumi"
  (let [M (+ 5 (rand-int 46))
        fok (fnc/random 10)
        Rok (* fok 2)
        fob (* M fok)
        Rob (* fob 2)
        fp (+ 2 (rand-int 9))
        Rp (* fp 2)
        d (+ fob fok (* Rp 2))
        rd (rand-int 4)
        angka (cond
                    (= rd 0) M
                    (= rd 1) fob
                    (= rd 2) fok
                    (= rd 3) d
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu teropong bumi memiliki lensa okuler berjejari " Rok " cm dan lensa obyektif berjejari
                              " Rob " cm. Pembesaran teropong bumi tersebut adalah ... ")
                (= rd 1) (str "Teropong bumi dengan pembesaran " M " kali memiliki lensa okuler berjarak fokus " fok " cm.
                              Jarak fokus lensa obyektifnya adalah ... cm.")
                (= rd 2) (str "Teropong bumi dengan panjang " d " cm memiliki lensa obyektif berjerari " Rob " cm. Jika
                              jejari lensa pembaliknya adalah " Rp " cm maka jarak fokus lensa okulernya adalah ... cm.")
                (= rd 3) (str "Teropong bumi dengan pembesaran " M " kali memiliki lensa obyektif berjerari " Rob " cm. Jika
                              fokus lensa pembaliknya adalah " fp " cm maka panjang teropong tersebut adalah ... cm.")
                )
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAJ []
  "Teropong bumi"
  (C1X1FEAJ-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FEAJ-" x))))))

(defn C1X1FEAK-0 []
  "Mikroskop tak berakomodasi"
  (let [data (read-string (slurp "data/fis10ktsp/C1X1FEAK-0.txt"))
        datum (nth data (rand-int (count data)))
        fob (first datum) sob (second datum) saob (last datum)
        Mob (/ saob sob)
        Mok (/ (+ 15 (rand-int 10)) Mob)
        PP (+ 24 (rand-int 7))
        fok (/ (* PP 10.0) Mok)
        dfok (Math/round fok)
        M (* Mok Mob)
        d (+ saob dfok)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) M
                    (= rd 1) d
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seseorang mengamati obyek secara tak berakomodasi menggunakan mikroskop yang memiliki
                              lensa obyektif dan okuler
                              dengan panjang fokus berturut-turut " fob " mm dan " dfok " mm. Jika obyek berjarak " sob " mm
                              dari lensa obyektif dan titik dekat mata pengamat adalah " PP " cm, maka pembesaran
                              mikroskop adalah ... kali")
                (= rd 1) (str "Seseorang mengamati obyek secara tak berakomodasi menggunakan mikroskop yang memiliki
                              lensa obyektif dan okuler
                              dengan panjang fokus berturut-turut " fob " mm dan " dfok " mm. Jika obyek berjarak " sob " mm
                              dari lensa obyektif dan titik dekat mata pengamat adalah " PP " cm, maka panjang
                              mikroskop adalah ... mm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAK-1 []
  "Mikroskop berakomodasi maksimum"
  (let [data (read-string (slurp "data/fis10ktsp/C1X1FEAK-0.txt"))
        datum (nth data (rand-int (count data)))
        fob (first datum) sob (second datum) saob (last datum)
        Mob (/ saob sob)
        Mok (/ (+ 15 (rand-int 10)) Mob)
        PP (+ 24 (rand-int 7))
        fok (/ (* PP 10.0) (- Mok 1))
        dfok (Math/round fok)
        M (* Mok Mob)
        sok (/ (* fok (* PP 10.0)) (+ fok (* PP 10.0)))
        dsok (Math/round sok)
        d (+ saob dsok)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) M
                    (= rd 1) d
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seseorang mengamati obyek secara berakomodasi maksimum menggunakan mikroskop yang memiliki
                              lensa obyektif dan okuler
                              dengan panjang fokus berturut-turut " fob " mm dan " dfok " mm. Jika obyek berjarak " sob " mm
                              dari lensa obyektif dan titik dekat mata pengamat adalah " PP " cm, maka pembesaran
                              mikroskop adalah ... kali.")
                (= rd 1) (str "Seseorang mengamati obyek secara berakomodasi maksimum menggunakan mikroskop yang memiliki
                              lensa obyektif dan okuler
                              dengan panjang fokus berturut-turut " fob " mm dan " dfok " mm. Jika obyek berjarak " sob " mm
                              dari lensa obyektif dan titik dekat mata pengamat adalah " PP " cm, maka panjang
                              mikroskop adalah ... mm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1X1FEAK []
  "Mikroskop"
  ;(C1X1FEAK-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1X1FEAK-" x))))))
