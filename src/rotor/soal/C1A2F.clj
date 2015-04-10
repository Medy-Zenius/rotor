(ns rotor.soal.C1A2F
  (:require [compojure.core :refer :all]
            [rotor.models.genfunc :as fnc]
            [rotor.soal.C1X1F :as fis10]
            ))

(def my-ns "rotor.soal.C1A2F")

;;; Gerak Lurus
(defn C1A2FBAE []
  (fis10/C1X1FBAE))

(defn C1A2FBAF []
  (fis10/C1X1FBAF))

(defn C1A2FBAG []
  (fis10/C1X1FBAG))

(defn C1A2FBAI []
  (fis10/C1X1FBAI))

(defn C1A2FBAJ []
  (fis10/C1X1FBAJ))

(defn C1A2FBAK []
  (fis10/C1X1FBAK))

(defn C1A2FBAL []
  (fis10/C1X1FBAL))

;;; Gerak Melingkar Beraturan
(defn C1A2FCAA []
  (fis10/C1X1FCAA))

(defn C1A2FCAB []
  (fis10/C1X1FCAB))

(defn C1A2FCAC []
  (fis10/C1X1FCAC))

(defn C1A2FCAD []
  (fis10/C1X1FCAD))

(defn C1A2FCAE []
  (fis10/C1X1FCAE))

;;; Dinamika Partikel dan Hukum Newton
(defn C1A2FDAB []
  (fis10/C1X1FDAB))

(defn C1A2FDAC []
  (fis10/C1X1FDAC))

(defn C1A2FDAD []
  (fis10/C1X1FDAD))

(defn C1A2FDAE []
  (fis10/C1X1FDAE))

(defn C1A2FDAF []
  (fis10/C1X1FDAF))

(defn C1A2FDAG []
  (fis10/C1X1FDAG))

(defn C1A2FDAH []
  (fis10/C1X1FDAH))

(defn C1A2FDAI []
  (fis10/C1X1FDAJ))

;;; OPTIK GEOMETRI
(defn C1A2FGAA []
  (fis10/C1X1FEAA))

(defn C1A2FGAB []
  (fis10/C1X1FEAB))

(defn C1A2FGAC []
  (fis10/C1X1FEAC))

(defn C1A2FGAD []
  (fis10/C1X1FEAD))

(defn C1A2FGAE []
  (fis10/C1X1FEAE))

(defn C1A2FGAG []
  (fis10/C1X1FEAG))

(defn C1A2FGAH []
  (fis10/C1X1FEAH))

(defn C1A2FGAI []
  (fis10/C1X1FEAI))

(defn C1A2FGAJ []
  (fis10/C1X1FEAJ))

(defn C1A2FGAK []
  (fis10/C1X1FEAK))

(defn C1A2FEAB-0 []
  "Parameter Elastisitas"
  (let [data (read-string (slurp "data/fis1013/C1A2FEAB-0.txt"))
        datum (nth data (rand-int (count data)))
        teg (nth datum 0)
        A (nth datum 1)
        F (nth datum 2)
        ;teg (+ 100 (fnc/random 400))   ; dalam 10^3 Pa
        ;A (+ 10 (rand-int 15)) ; dalam mm2
        ;F (* teg A)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) teg
                    (= rd 1) A
                    (= rd 2) F
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seutas kawat dengan luas penampang " A " mm$^2$ mendapat gaya tarikan " F " x $10^{-3}$ newton
                              di kedua ujungnya. Tegangan tarik yang dialami kawat adalah ... x $10^3$ Pascal.")
                (= rd 1) (str "Gaya " F " x $10^{-3}$ newton yang bekerja di kedua ujung seutas kawat menyebabkan
                              tegangan tarik sebesar " teg " $10^3$ Pa. Luas penampang kawat tersebut adalah ... mm$^2$.")
                (= rd 2) (str "Seutas kawat mengalami tegangan sebesar " teg " x $10^3$ Pa ketika mendapat gaya dikedua ujungnya. Jika
                              luas penampang kawat adalah " A " mm$^2$ maka gaya tersebut adalah ... x $10^{-3}$ newton.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1A2FEAB-1 []
  "Parameter Elastisitas"
  (let [reg (/ (fnc/random 50) 100.0)   ;tanpa satuan
        L (+ 5 (rand-int 40)) ;dalam cm
        dL (* L reg)          ;dalam cm
        dreg (fnc/nd reg 2)
        ddL (fnc/nd dL 2)
        Lf (+ L ddL)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) dreg
                    (= rd 1) L
                    (= rd 2) Lf
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Seutas kawat dengan panjang " L " cm mengalami gaya tarik di kedua ujungnya sehingga bertambah
                              panjang " ddL " cm. Regangan yang dialami kawat adalah ...")
                (= rd 1) (str "Regangan yang dialami kawat ketika mendapat gaya tarik di kedua ujungnya adalah " dreg ". Jika
                              pertambahan panjang kawat adalah " ddL " cm, maka panjang kawat mula-mula adalah ... cm.")
                (= rd 2) (str "Seutas kawat yang panjangnya " L " cm diberi gaya tarik di kedua ujungnya sehingga mengalami
                              regangan sebesar " dreg ". Panjang kawat setelah diberi regangan adalah ... cm.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C1A2FEAB-2 []
  "Parameter Elastisitas"
  (let [teg (+ 100 (fnc/random 400))   ; dalam 10^3 Pa
        r (+ 3 (rand-int 5)) ; dalam mm
        F (* teg r r)
        rd (rand-int 2)
        angka F
        jwb (fnc/jawaban)
       ]
        {:soal  (str "Seutas kawat mengalami tegangan sebesar " teg " $10^3$ Pa ketika mendapat gaya dikedua ujungnya. Jika
                              jejari penampang kawat adalah " r " mm maka gaya tersebut adalah ... x $10^{-3}$ newton.")
         :pilihan (fnc/create-option4a angka "$\\pi$" jwb)
         :jawaban jwb
         }))
(defn C1A2FEAB []
  "Elastisitas"
  ;(C1A2FEAB-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1A2FEAB-" x))))))

(defn C1A2FEAC-0 []
  "Tegangan/Regangan/Modulus Young"
  (let [teg (+ 100 (fnc/random 200))   ; dalam 10^4 Pa
        reg (fnc/random 10)            ; dalam 10^(-4)
        E (/ teg reg)
        dE (fnc/nd E 2)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) teg
                    (= rd 1) reg
                    (= rd 2) E
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sejenis kawat yang memiliki modulus elastisitas  " dE " x $10^8 N/m^2$ mengalami regangan " reg "
                              x $10^{-4}$. Tegangan tarik yang dialami kawat adalah ... x $10^4$ Pa.")
                (= rd 1) (str "Sejenis kawat yang memiliki modulus elastisitas  " dE " x $10^8 N/m^2$ mengalami tegangan " teg "
                              x $10^{4}$ Pa. Regangan yang dialami kawat adalah ... x $10^{-4}$.")
                (= rd 2) (str "Seutas kawat jika diberi tegangan  sebesar " teg " x $10^{4}$ Pa akan mengalami regangan
                              sebesar " reg " x $10^{-4}$. Modulus Young dari kawat tersebut adalah ... x $10^8 N/m^2$.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C1A2FEAC-1 []
  "Tegangan/Regangan/Modulus Young"
  (let [EA (fnc/random 30)   ; dalam 10^9 N/m^2
        EB (* EA (fnc/random 5)) ; dalam 10^9 N/m^2
        dlB (+ 5 (fnc/random 10))   ; dalam mm
        dlA (* dlB (/ EB EA)) ; dalam mm
        rd (rand-int 3)
        angka (cond
                    (= rd 0) dlA
                    (= rd 1) dlB
                    (= rd 2) EA
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Dua utas kawat A dan B memiliki ukuran yang sama tapi jenis yang berbeda. Modulus elastisitas
                              kawat A dan B berturut-turut " EA " x $10^9 N/m^2$ dan " EB " x $10^9 N/m^2$. Jika kedua kawat
                              diberi tegangan tarik yang sama, pertambahan panjang kawat B adalah " dlB " mm. Pertambahan
                              panjang kawat A adalah ...")
                (= rd 1) (str "Dua utas kawat A dan B memiliki ukuran yang sama tapi jenis yang berbeda. Modulus elastisitas
                              kawat A dan B berturut-turut " EA " x $10^9 N/m^2$ dan " EB " x $10^9 N/m^2$. Jika kedua kawat
                              diberi tegangan tarik yang sama, pertambahan panjang kawat A adalah " dlA " mm. Pertambahan
                              panjang kawat B adalah ...")
                (= rd 2) (str "Dua utas kawat A dan B memiliki ukuran yang sama tapi jenis yang berbeda. Modulus elastisitas
                              kawat B adalah " EB " x $10^9 N/m^2$. Jika kedua kawat diberi tegangan tarik yang sama,
                              pertambahan panjang kawat A dan B adalah " dlA " mm dan " dlB " mm. Modulus elastisitas kawat
                              A adalah ... x $10^9 N/m^2$.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1A2FEAC-2 []
  "Grafik Tegangan-Regangan"
  (let [R1 0                       ;Regangan 1 dalam 10^(-4)
        R2 (fnc/random 10)
        T1 0                       ;Tegangan dalam 10^5 N/m2
        T2 (* R2 (fnc/random 20))
        E (/ T2 R2)                ; dalam 10^9 N/m2
        L (+ 50 (rand-int 50))   ; dalam cm
        T (* E (fnc/random 10))    ; dalam 10^5 Pa
        dl (/ (* T L) E (Math/pow 10 3)) ; dalam mm
        ddl (fnc/nd dl 3)
        var1 "T"
        var2 "R"
        datax [R1 R2]
        datay [T1 T2]
        max1 R2
        max2 T2
        ja (count datax)
        angka ddl
        jwb (fnc/jawaban)
        ]
    {:soal (str "Seutas kawat yang panjangnya " L " cm memiliki sifat bahan seperti pada grafik T-R (Tegangan terhadap Regangan)
                di bawah. Jika kawat tersebut diberi tegangan " T " x $10^5 N/m^2$ maka pertambahan panjang kawat adalah ... mm.
                Keterangan grafik: T dalam $10^5 N/m^2$, R dalam $10^{-4}$.")
     :grafik {:var1 var1 :var2 var2 :max1 max1 :max2 max2 :pair ja :datax datax :datay datay}
     :pilihan (fnc/create-option3 angka 3 jwb)
     :jawaban jwb
     }
  ))
(defn C1A2FEAC []
  "Elastisitas - Tegangan/Regangan/Modulus Young"
  ;(C1A2FEAC-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1A2FEAC-" x))))))

(defn C1A2FEAD-0 []
  "Tegangan/Regangan/Modulus Young"
  (let [E1 (+ 100 (fnc/random 200))   ; dalam 10^9 N/m^2
        E2 (* E1 (fnc/random 5))      ; dalam 10^9 N/m^2
        T1 1                          ; dummy
        T2 (* (/ E2 E1) T1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) T2
                (= rd 1) (/ 1 T2)
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Terdapat dua kawat A dan B berukuran sama dengan modulus Young berturut-turut " E1 "
                              x $10^9 N/m^2$ dan " E2 " x $10^9 N/m^2$. Kedua kawat digantungi beban yang berbeda sehingga
                              perpanjangan kawat A sama dengan B. Jika berat beban pada kawat A adalah W maka berat beban
                              pada kawat B adalah ...")
                 (= rd 1) (str "Terdapat dua kawat A dan B berukuran sama dengan modulus Young berturut-turut " E1 "
                              x $10^9 N/m^2$ dan " E2 " x $10^9 N/m^2$. Kedua kawat digantungi beban yang berbeda sehingga
                              perpanjangan kawat A sama dengan B. Jika berat beban pada kawat B adalah W maka berat beban
                              pada kawat A adalah ..."))
         :pilihan (fnc/create-option4a angka "W" jwb)
         :jawaban jwb
         }))
(defn C1A2FEAD-1 []
  "Tegangan/Regangan/Modulus Young"
  (let [L1 1   ; dummy
        L2  (* L1 (fnc/random 10))
        D1 1   ; dummy
        D2 (* D1 (fnc/random 10))
        F1 1   ;dummy
        F2 (* F1 (fnc/random 10))
        x (/ (* F2 L2) (fnc/pangkat D2 2))
        angka x
        jwb (fnc/jawaban)
       ]
        {:soal (str "Kawat yang panjangnya L dan diameter D bertambah panjang x saat ujung bawahnya diberi beban F.
                               Kawat sejenis yang panjangnya " L2 "L, diameternya " D2 "D, dan diberi beban " F2 "F akan
                               bertambah panjang ... ")
         :pilihan (fnc/create-option4a angka "x" jwb)
         :jawaban jwb
         }))
(defn C1A2FEAD []
  "Elastisitas - Tegangan/Regangan/Modulus Young"
  ;(C1A2FEAD-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FEAD-" x))))))

(defn C1A2FEAE-0 []
  "Hukum Hooke"
  (let [k (* 10 (fnc/random 100)) ;dalam N/m
        dx (+ 5 (fnc/random 20)) ; dalam cm
        F (* k dx)
        rd (rand-int 3)
        angka (cond
                (= rd 0) F
                (= rd 1) k
                (= rd 2) dx
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Suatu pegas yang memiliki konstanta pegas " k " N/m ditarik ujungnya sehingga memanjang
                               sebesar " dx " cm. Gaya tarikan yang diberikan kepada pegas adalah ... x $10^{-2}$ Newton.")
                 (= rd 1) (str "Suatu pegas jika ditekan dengan gaya " F " x $10^{-2}$ Newton akan memendek " dx " cm.
                               konstanta pegas tersebut adalah ... N/m.")
                 (= rd 2) (str "Suatu pegas dengan konstanta pegas " k " N/m jika diberi gaya " F " x $10^{-2}$ Newton
                               akan berubah panjangnya sebesar ... cm."))
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1A2FEAE-1 []
  "Hukum Hooke"
  (let [Lo (+ 20 (rand-int 50))    ;dalam cm
        k (* 100 (fnc/random 10))  ; dalam N/m
        dL1 (+ 5 (rand-int 10))     ; dalam cm
        W1 (* k dL1 1/100)           ; dalam N
        L1 (+ Lo dL1)               ; dalam cm
        W2 (* W1 (fnc/random 4))   ; dalam N
        dL2 (* (/ W2 W1) dL1)
        L2 (+ L1 dL2)
        rd (rand-int 3)
        angka (cond
                (= rd 0) L2
                (= rd 1) W2
                (= rd 2) W1
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Suatu pegas yang panjangnya mula-mula " Lo " cm digantung vertikal tanpa beban.
                               Kemudian pegas tersebut digantungi beban seberat " W1 " Newton sehingga panjangnya bertambah
                               menjadi " L1 " cm. Kalau pegas tersebut ditambahi beban lagi sebesar " W2 " Newton, maka
                               panjangnya akan menjadi ...cm.")
                 (= rd 1) (str "Suatu pegas yang panjangnya mula-mula " Lo " cm digantung vertikal tanpa beban.
                               Kemudian pegas tersebut digantungi beban seberat " W1 " Newton sehingga panjangnya bertambah
                               menjadi " L1 " cm. Kalau pegas tersebut ditambahi beban lagi, maka panjangnya menjadi " L2 "
                               cm. Beban tambahan tersebut adalah ... Newton.")
                 (= rd 2) (str "Suatu pegas yang panjangnya mula-mula " Lo " cm digantung vertikal tanpa beban.
                               Kemudian pegas tersebut digantungi beban seberat " W2 " Newton sehingga panjangnya bertambah
                               sebesar " dL2 " cm. Kalau pegas tersebut ditambahi beban lagi, maka panjangnya menjadi " L2 "
                               cm. Beban tambahan tersebut adalah ... Newton."))
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1A2FEAE []
  "Elastisitas - Hukum Hooke"
  ;(C1A2FEAE-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FEAE-" x))))))


;;;;Fluida Statis

(defn C1A2FFAB-0 []
  "Tekanan"
  (let [A (+ 5 (fnc/random 20))   ;cm^2 = 10^(-4) m^2
        P (+ 10 (fnc/random 20))  ; dalam 10^4 Pa
        F (* P A)                 ; dalam N
        rd (rand-int 3)
        angka (cond
                (= rd 0) P
                (= rd 1) F
                (= rd 2) A
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Suatu gaya " F " newton bekerja pada bidang dengan luas penampang " A " $cm^2$. Tekanan
                               yang dialami bidang tersebut adalah ... x $10^4$ pascal.")
                 (= rd 1) (str "Suatu bidang dengan luas penampang " A " $cm^2$ mengalami tekanan sebesar " P " x $10^4$
                               pascal. Gaya yang menekan bidang tersebut adalah ... newton.")
                 (= rd 2) (str "Tekanan yang dialami suatu bidang jika diberi gaya " F " newton adalah " P " x $10^4$ pascal.
                               Luas penampang bidang tersebut adalah ... $cm^2$."))
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1A2FFAB-1 []
  "Tekanan"
  (let [r (+ 5 (fnc/random 5))   ;cm^2 = 10^(-4) m^2
        m (+ 40 (fnc/random 20))  ; dalam kg
        w (* m 10)
        P (/ w 0.314 r r)          ; dalam 10^3 Pa
        dP (fnc/nd P 3)
        rd (rand-int 3)
        angka (cond
                (= rd 0) dP
                (= rd 1) w
                (= rd 2) r
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Seorang pemain akrobat yang massanya " m " kg mengambang di udara dengan cara bertumpu
                               di lantai melalui sebatang tongkat yang massanya diabaikan. Jika penampang ujung tongkat
                               berupa lingkaran berjejari " r " $cm^2$, maka tekanan yang dialami ujung tongkat adalah ...
                               x $10^3$ pascal.")
                 (= rd 1) (str "Seorang pemain akrobat  mengambang di udara dengan cara bertumpu
                               di lantai melalui sebatang tongkat yang massanya diabaikan. Jika penampang ujung tongkat
                               berupa lingkaran berjejari " r " $cm^2$, dan tekanan yang dialami lantai tumpuan adalah " dP "
                               x $10^3$ pascal, maka berat pemain akrobat tersebut adalah ... newton.")
                 (= rd 2) (str "Seorang pemain akrobat yang massanya " m " kg mengambang di udara dengan cara bertumpu
                               di lantai melalui sebatang tongkat yang massanya diabaikan. Jika penampang ujung tongkat
                               berupa lingkaran, dan tekanan yang dialami ujung tongkat adalah " dP "
                               x $10^3$ pascal, maka jejari ujung tongkat adalah ... cm."))
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1A2FFAB []
  "Fluida Statis"
  ;(C1A2FFAB-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FFAB-" x))))))

(defn C1A2FFAC-0 []
  "Tekanan hidrostatis"
  (let [rho (+ 1000 (* 100 (fnc/random 100))) ;dalam kg/m^3
        g (nth [10 9.8] (rand-int 2))         ; dalam m/s^2
        h (+ 40 (fnc/random 200))             ; dalam cm
        P (* rho g h 0.01)                    ; dalam pascal
        rP (Math/round P)                     ; pembulatan P
        rd (rand-int 3)
        angka (cond
                (= rd 0) rP
                (= rd 1) h
                (= rd 2) rho
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Tekanan hidrosatis pada zat cair dengan massa jenis " rho " $kg/m^3$ di kedalaman " h " cm
                               adalah ... pascal. (g = " g " $m/s^2$).")
                 (= rd 1) (str "Tekanan hidrostatis di dasar kolam yang berisi zat cair dengan massa jenis " rho " $kg/m^3$
                               adalah " rP " pascal. Kedalaman kolam tersebut adalah ... cm. (g = " g " $m/s^2$).")
                 (= rd 2) (str "Tekanan hidrostatis di dasar kolam yang berisi suatu zat cair adalah " rP " pascal.
                               Jika kedalaman kolam tersebut adalah " h " cm, maka massa jenis zat
                               cair pengisi kolam tersebut adalah ... $kg/m^3$. (g = " g " $m/s^2$)."))
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1A2FFAC []
  "Fluida Statis"
  (C1A2FFAC-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FFAC-" x))))))

(defn C1A2FFAD-0 []
  "Tekanan Gauge"
  (let [Po1 (/ (+ 90 (rand-int 15)) 100.0)         ; atm
        dPo1 (fnc/nd Po1 2)
        Po2 (+ 90 (rand-int 15))                   ; 10^3 pascal
        Pg1 (* Po1 (+ 10 (rand-int 30)))           ; atm
        dPg1 (fnc/nd Pg1 2)
        Pg2 (* Po2 (+ 10 (rand-int 30)))           ; 10^3 pascal
        P1 (+ Po1 Pg1)                             ; atm
        dP1 (fnc/nd P1 2)
        P2 (+ Po2 Pg2)                             ; 10^3 pascal
        rd (rand-int 6)
        angka (cond
                (= rd 0) dP1
                (= rd 1) P2
                (= rd 2) dPg1
                (= rd 3) Pg2
                (= rd 4) dPo1
                (= rd 5) Po2
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Tekanan yang diukur (gauge) pada tabung tertutup berisi gas adalah " dPg1 " atm. Jika
                               tekanan udara luar adalah " dPo1" atm, maka tekanan absolut di dalam tabung tersebut
                               adalah... atm.")
                 (= rd 1) (str "Tekanan yang diukur (gauge) dalam ban mobil  berisi udara adalah " Pg2 " kPa.
                               Jika tekanan udara luar adalah " Po2" x $10^3$ pascal, maka tekanan absolut di dalam ban
                               tersebut adalah ... kPa.")
                 (= rd 2) (str "Tekanan absolut dalam balon karet yang dipompa  adalah " dP1 " atm. Jika tekanan udara luar
                               adalah " dPo1 " atm maka tekanan gauge dalam balon karet tersebut adalah ... atm.")
                 (= rd 3) (str "Tekanan absolut pada ruang tertutup berisi gas adalah " P2 " kPa. Jika tekanan
                               udara luar adalah " Po2 " kPa maka tekanan gauge dalam ruang itu adalah ... kPa.")
                 (= rd 4) (str "Tekanan mutlak dan tekanan gauge pada suatu ruang tertutup berisi cairan adalah " dP1 " atm dan
                               "dPg1" atm. Tekanan udara luar pada saat itu adalah ... atm.")
                 (= rd 5) (str "Sejenis cairan dipompakan pada wadah tertutup sehingga tekanan mutlak dan tekanan gauge dalam
                               wadah tersebut berturut-turut adalah " P2 " kPa dan " Pg2 " kPa. Tekanan udara
                               luar pada saat itu adalah ... kPa." ))
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1A2FFAD []
  "Tekanan Gauge"
  (C1A2FFAD-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FFAD-" x))))))

(defn C1A2FFAE-0 []
  "Tekanan Absolut"
  (let [Po (/ (+ 90 (rand-int 15)) 100.0)         ; atm
        dPo (fnc/nd Po 2)
        h (+ 10 (rand-int 50))                    ; meter
        g (nth [10 9.8] (rand-int 2))             ; m/s^2
        rho (/ (+ 100 (rand-int 10)) 100.0)       ; gr/cm^3
        P (+ dPo (/ (* rho g h) 100))             ; atm
        dP (fnc/nd P 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) dP
                (= rd 1) h
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Suatu danau berisi cairan yang massa jenisnya " rho " $gram/cm^3$. Bila tekanan pada
                               permukaan danau adalah " dPo " atm dan g = " g " $m/s^2$ maka tekanan mutlak pada kedalaman
                               " h " meter dari permukaan danau adalah ... atm. (1 atm = $10^5$ Pa)")
                 (= rd 1) (str "Tekanan mutlak (absolut) di dasar danau yang berisi zat cair dengan massa jenis " rho "
                               $gram/cm^3$ adalah " dP " atm. Jika tekanan pada permukaan danau adalah " dPo " atm, maka
                               kedalaman danau adalah ... meter. (g = " g " $m/s^2$ dan 1 atm = $10^5$ Pa)."))
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C1A2FFAE []
  "Fluida statik - Tekanan Absolut"
  (C1A2FFAE-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FFAE-" x))))))

(defn C1A2FFAF-0 []
  "Barometer"
  (let [Po (nth [75 76 77] (rand-int 3)) ; cmHg
        h (+ 10 (rand-int 20))           ; cm
        Pu (- Po h)
        rd (rand-int 2)
        angka (cond
                (= rd 0) Pu
                (= rd 1) h
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Gambar di bawah menunjukkan suatu pipa kaca yang berisi kolom udara dan raksa dalam
                               posisi vertikal dimana ujung terbuka menghadap ke bawah. Jika
                               tekanan udara luar adalah " Po " cmHg, dan tinggi kolom raksa adalah " h " cm, maka
                               tekanan pada kolom udara adalah ... cmHg.")
                 (= rd 1) (str "Gambar di bawah menunjukkan suatu pipa kaca yang berisi kolom udara dan raksa dalam
                               posisi vertikal dimana ujung terbuka menghadap ke bawah. Jika
                               tekanan udara luar adalah " Po " cmHg, dan tekanan pada kolom udara adalah " Pu " cmHg,
                               maka tinggi kolom raksa adalah ... cm."))
        :pictures [{:obj 1 :param "#000000,185,040,185,160"}, {:obj 1 :param "#000000,215,040,215,160"},
                   {:obj 13 :param "#000000,185,040,195,030,205,030,215,040"},
                   {:obj 5 :param "#d3d3d3,186,080,028,060"},
                   {:obj 3 :param "#000000,213,060,040,000"}, {:obj 8 :param "#000000,255,065, udara"},
                   {:obj 3 :param "#000000,213,110,040,000"}, {:obj 8 :param "#000000,255,115, raksa"}
                   ]
        :pilihan (fnc/create-option1a angka jwb)
        :jawaban jwb
        }))
(defn C1A2FFAF-1 []
  "Barometer"
  (let [Po (nth [75 76 77] (rand-int 3)) ; cmHg
        h (+ 10 (rand-int 20))           ; cm
        Pu (+ Po h)
        rd (rand-int 2)
        angka (cond
                (= rd 0) Pu
                (= rd 1) h
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Gambar di bawah menunjukkan suatu pipa kaca yang berisi kolom udara dan raksa dalam
                               posisi vertikal dimana ujung terbuka menghadap ke atas. Jika
                               tekanan udara luar adalah " Po " cmHg, dan tinggi kolom raksa adalah " h " cm, maka
                               tekanan pada kolom udara adalah ... cmHg.")
                 (= rd 1) (str "Gambar di bawah menunjukkan suatu pipa kaca yang berisi kolom udara dan raksa dalam
                               posisi vertikal dimana ujung terbuka menghadap ke atas. Jika
                               tekanan udara luar adalah " Po " cmHg, dan tekanan pada kolom udara adalah " Pu " cmHg,
                               maka tinggi kolom raksa adalah ... cm."))
        :pictures [{:obj 1 :param "#000000,185,040,185,160"}, {:obj 1 :param "#000000,215,040,215,160"},
                   {:obj 13 :param "#000000,185,160,195,170,205,170,215,160"},
                   {:obj 5 :param "#d3d3d3,186,060,028,060"},
                   {:obj 3 :param "#000000,213,095,040,000"}, {:obj 8 :param "#000000,255,100, raksa"},
                   {:obj 3 :param "#000000,213,145,040,000"}, {:obj 8 :param "#000000,255,150, udara"}
                   ]
        :pilihan (fnc/create-option1a angka jwb)
        :jawaban jwb
        }))
(defn C1A2FFAF-2 []
  "Barometer"
  (let [h (+ 40 (rand-int 60))          ; cm
        rHg 13.6                        ; gr/cm^3
        g 10                            ; kg/s^2
        Pc (* rHg g h 10)               ; pascal
        dPc (fnc/nd (/ Pc 100000) 2)    ; 10^5 pascal
        rd (rand-int 2)
        angka (cond
                (= rd 0) dPc
                (= rd 1) h
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Gambar di bawah menunjukkan barometer sederhana yang terbuat dari pipa kaca dan bejana
                               berisi raksa yang ditempatkan pada suatu ruang tertutup berisi gas seperti gambar di bawah.
                               Jika tinggi kolom raksa adalah " h " cm, maka tekanan gas pada ruang tertutup itu adalah ...
                               x $10^5$ pascal. (massa jenis raksa = 13.6 $gr/cm^3$, g = 10 $m/s^2$).")
                 (= rd 1) (str "Gambar di bawah menunjukkan barometer sederhana yang terbuat dari pipa kaca dan bejana
                               berisi raksa yang ditempatkan pada suatu ruang tertutup berisi gas seperti gambar di bawah.
                               Jika tekanan gas pada ruangan tertutup adalah " dPc " x $10^5$ pascal, maka tinggi kolom air raksa
                               pada pipa kaca adalah ... cm. (massa jenis raksa = 13.6 $gr/cm^3$, g = 10 $m/s^2$)."))
        :pictures [
                   {:obj 13 :param "#000000,190,030,195,025,205,025,210,030"},
                   {:obj 5 :param "#d3d3d3,191,060,018,100"},
                   {:obj 3 :param "#000000,207,040,040,000"}, {:obj 8 :param "#000000,249,045, hampa"},
                   {:obj 3 :param "#000000,207,110,040,000"}, {:obj 8 :param "#000000,249,115, raksa"},
                   {:obj 1 :param "#000000,100,155,100,195"}, {:obj 1 :param "#000000,300,155,300,195"},
                   {:obj 1 :param "#000000,100,195,300,195"}, {:obj 5 :param "#d3d3d3,101,157,198,038"},
                   {:obj 1 :param "#000000,190,030,190,160"}, {:obj 1 :param "#000000,210,030,210,160"}
                   ]
        :pilihan (fnc/create-option3 angka 2 jwb)
        :jawaban jwb
        }))
(defn C1A2FFAF []
  "Fluida statik - Barometer"
  ;(C1A2FFAF-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1A2FFAF-" x))))))

(defn C1A2FFAG-0 []
  "Bejana berhubungan"
  (let [h1 (+ 5 (rand-int 15))          ; cm
        h2 (+ 5 (rand-int 15))          ; cm
        mj1 (/ (+ 10 (rand-int 15)) 10.0) ; gr/cm^3
        mj2 (/ (* mj1 h1) h2)             ; gr/cm^3
        dmj1 (fnc/nd mj1 2)
        dmj2 (fnc/nd mj2 2)
        rd (rand-int 4)
        angka (cond
                (= rd 0) h1
                (= rd 1) h2
                (= rd 2) dmj2
                (= rd 3) dmj1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Suatu pipa U yang kedua ujungnya terbuka mula-mula diisi cairan A yang massa jenisnya
                               " dmj1 " $gr/cm^3$. Kemudian di ujung kiri pipa U diisi cairan B bermassa jenis " dmj2 " $gr/cm^3$ setinggi
                               " h2 " cm. Perbedaan tinggi permukaan cairan A antara ujung kiri dan kanan pipa U adalah ... cm.")
                 (= rd 1) (str "Suatu pipa U yang kedua ujungnya terbuka mula-mula diisi cairan A yang massa jenisnya
                               " dmj1 " $gr/cm^3$. Kemudian di ujung kanan pipa U diisi cairan B bermassa jenis " dmj2 " $gr/cm^3$ sehingga
                               perbedaan tinggi permukaan cairan A antara ujung kiri dan kanan pipa U adalah " h1 " cm. Tinggi
                               cairan B yang dituangkan ke ujung pipa U adalah ... cm.")
                 (= rd 2) (str "Suatu pipa U yang kedua ujungnya terbuka mula-mula diisi cairan A yang massa jenisnya
                               " dmj1 " $gr/cm^3$. Kemudian di salah satu ujung diisi cairan B setinggi
                               " h2 " cm. Jika perbedaan tinggi permukaan cairan A antara ujung kiri dan kanan pipa U adalah
                               " h1 " cm maka massa jenis cairan B adalah ... $gr/cm^3$.")
                 (= rd 3) (str "Suatu pipa U yang kedua ujungnya terbuka mula-mula diisi cairan A yang massa jenisnya belum
                               diketahui. Kemudian di ujung kanan pipa U diisi cairan B bermassa jenis " dmj2 " $gr/cm^3$ setinggi
                               " h2 " cm. Jika perbedaan tinggi permukaan cairan A antara ujung kiri dan kanan pipa U adalah
                               " h1 " cm maka massa jenis cairan A adalah ... $gr/cm^3$."))
        :pilihan (fnc/create-option3 angka 2 jwb)
        :jawaban jwb
        }))
(defn C1A2FFAG []
  "Fluida statik - Bejana berhubungan"
  (C1A2FFAG-0))
  ;(let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1A2FFAG-" x))))))

(defn C1A2FFAH-0 []
  "Hukum Pascal"
  (let [A1 (+ 10 (rand-int 5))            ; cm^2
        A2 (* A1 (inc (fnc/random 5)))    ; cm^2
        F1 (+ 200 (rand-int 100))         ; newton
        F2 (/ (* F1 A2) A1)               ; newton
        rd (rand-int 4)
        angka (cond
                (= rd 0) F2
                (= rd 1) F1
                (= rd 2) A2
                (= rd 3) A1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Suatu pompa hidrolik memiliki dua piston yang lebih kecil dan lebih besar. Luas penampang
                               pistonnya berturut-turut " A1 " $cm^2$ dan " A2 " $cm^2$. Jika pada piston yang lebih kecil
                               diberi gaya " F1 " newton, maka gaya angkat pada piston yang lebih besar adalah ... newton.")
                 (= rd 1) (str "Suatu pompa hidrolik memiliki dua piston yang lebih kecil dan lebih besar. Luas penampang
                               pistonnya berturut-turut " A1 " $cm^2$ dan " A2 " $cm^2$. Jika gaya angkat pada piston yang
                               lebih besar adalah " F2 " newton maka gaya yang diberikan pada piston yang lebih kecil adalah
                               ... newton.")
                 (= rd 2) (str "Suatu pompa hidrolik memiliki dua piston yang lebih kecil dan lebih besar. Luas penampang piston
                               yang lebih kecil adalah " A1 " $cm^2$. Jika piston yang lebih kecil diberi gaya " F1 " newton,
                               gaya angkat pada piston yang lebih besar menjadi " F2 " newton. Luas penampang piston yang lebih
                               besar adalah ... $cm^2$.")
                 (= rd 3) (str "Suatu pompa hidrolik memiliki dua piston yang lebih kecil dan lebih besar. Luas penampang piston
                               yang lebih besar adalah " A2 " $cm^2$. Jika piston yang lebih kecil diberi gaya " F1 " newton,
                               gaya angkat pada piston yang lebih besar menjadi " F2 " newton. Luas penampang piston yang lebih
                               kecil adalah ... $cm^2$."))
        :pilihan (fnc/create-option1a angka jwb)
        :jawaban jwb
        }))
(defn C1A2FFAH []
  "Fluida statik - Hukum Pascal"
  (C1A2FFAH-0))
  ;(let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1A2FFAG-" x))))))

(defn C1A2FFAJ-0 []
  "Hukum Archimedes"
  (let [rc (* (+ 8 (rand-int 13)) 0.1)   ; massa jenis zat cair dalam gr/cm^3
        rb (* rc (inc (fnc/random 100))) ; massa jenis benda
        mb (* rb (fnc/random 50))        ; massa benda gram
        g 10                             ; perc. gravitasi m/s^2
        Vb (/ mb rb)                     ; volume benda
        Fa (* rc g (/ mb rb))            ; gaya archimedes x 10^-3 newton
        drc (fnc/nd rc 1)
        drb (fnc/nd rb 1)
        dmb (fnc/nd mb 1)
        dFa (fnc/nd Fa 1)
        rd (rand-int 4)
        angka (cond
                (= rd 0) dFa
                (= rd 1) dmb
                (= rd 2) drc
                (= rd 3) drb
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa jenis " drb " $gr/cm^3$ dicelupkan ke dalam zat cair bermassa jenis
                               " drc " $gr/cm^3$. Jika massa benda adalah " dmb " gr, maka gaya yang diberikan oleh zat cair
                               kepada benda adalah ... x $10^{-3}$ newton.")
                 (= rd 1) (str "Sebuah benda bermassa jenis " drb " $gr/cm^3$ dicelupkan ke dalam zat cair bermassa jenis
                               " drc " $gr/cm^3$. Jika gaya yang diberikan oleh zat cair kepada benda adalah " dFa "
                               x $10^{-3}$ newton, maka massa benda adalah ... gr.")
                 (= rd 2) (str "Kedalam suatu zat cair dicelupkan suatu benda bermassa " dmb " gr dan bermassa jenis " drb "
                               $gr/cm^3$. Jika gaya archimedes yang dialami benda adalah " dFa " x $10^{-3}$ newton, maka
                               massa jenis zat cair adalah ... $gr/cm^3$.")
                 (= rd 3) (str "Kedalam suatu zat cair yang bermassa jenis " drc " $gr/cm^3$ dicelupkan suatu benda bermassa
                               " dmb " gr. Jika gaya archimedes yang dialami benda adalah " dFa " x $10^{-3}$ newton, maka
                               massa jenis benda adalah ... $gr/cm^3$."))
        :pilihan (fnc/create-option3 angka 1 jwb)
        :jawaban jwb
        }))
(defn C1A2FFAJ-1 []
  "Hukum Archimedes"
  (let [rc (* (+ 8 (rand-int 13)) 0.1)            ; massa jenis zat cair dalam gr/cm^3
        mb (* 2000 (fnc/random 50))               ; gr
        g 1000                                    ; cm/s^2
        wu (/ (* mb g) 100000)                    ; berat di udara newton
        wc (/ wu (nth [2 4 5 10] (rand-int 4)))   ; berat di zat cair newton
        Fa (- wu wc)                              ; gaya archimedes newton
        Vb (* (/ Fa rc g) 100000)                  ; volume tercelup benda cm^-3
        rb (/ mb Vb)
        drb (fnc/nd rb 2)
        drc (fnc/nd rc 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) rb
                (= rd 1) Fa
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Massa sebuah benda adalah " mb " gram. Ketika ditimbang di dalam zat cair yang
                               bermassa jenis " drc " $gr/cm^3$ berat terbaca adalah " wc " newton. Massa jenis benda
                               tersebut adalah ... $gram/cm^3$.")
                 (= rd 1) (str "Massa sebuah benda adalah " mb " gram. Ketika ditimbang di dalam zat cair yang
                               bermassa jenis " drc " $gr/cm^3$ berat terbaca adalah " wc " newton. Gaya archimedes
                               yang dialami benda adalah ... newton."))
        :pilihan (fnc/create-option3 angka 2 jwb)
        :jawaban jwb
        }))
(defn C1A2FFAJ []
  "Fluida statik - Hukum Archimedes"
  ;(C1A2FFAJ-0))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FFAJ-" x))))))

(defn C1A2FFAK-0 []
  "Hukum Archimedes"
  (let [rb (* (+ 5 (rand-int 10)) 0.1)          ; massa jenis benda dalam gram/cm^3
        rc (+ rb (/ (fnc/random 10) 10))        ; dalam gr/cm^3
        sisi (* rc 10 (fnc/random 5))           ; dalam cm
        tc (* (/ rb rc) sisi)                   ; tinggi tercelup
        dtc (fnc/nd tc 2)
        dtm (fnc/nd (- sisi tc) 2)
        drb (fnc/nd rb 2)
        drc (fnc/nd rc 2)
        dsisi (fnc/nd sisi 2)
        rd (rand-int 4)
        angka (cond
                (= rd 0) dtc
                (= rd 1) dtm
                (= rd 2) drb
                (= rd 3) drc
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Suatu benda berbentuk kubus bermassa jenis " drb " $gr/cm^3$ mengapung di dalam zat cair
                               yang bermassa jenis " drc " $gr/cm^3$. Jika sisi kubus tersebut adalah " dsisi " cm, maka
                               tinggi benda yang tercelup ke dalam zat cair adalah ... cm.")
                 (= rd 1) (str "Suatu benda berbentuk kubus bermassa jenis " drb " $gr/cm^3$ mengapung di dalam zat cair
                               yang bermassa jenis " drc " $gr/cm^3$. Jika sisi kubus tersebut adalah " dsisi " cm, maka
                               tinggi benda yang muncul dari permukaan zat cair adalah ... cm.")
                 (= rd 2) (str "Suatu benda berbentuk kubus dengan panjang sisi " dsisi " cm mengapung di dalam zat cair
                               yang bermassa jenis " drc " $gr/cm^3$. Jika tinggi kubus yang muncul dari permukaan air
                               adalah " dtm " cm, maka massa jenis benda tersebut adalah ... $gr/cm^3$.")
                 (= rd 3) (str "Suatu benda berbentuk kubus bermassa jenis " drb " $gr/cm^3$ dan dengan panjang sisi " dsisi " cm,
                               mengapung dalam suatu zat cair. Jika tinggi kubus yang tenggelam dalam zat cair adalah " dtc "
                               cm maka massa jenis zat cair adalah ... $gr/cm^3$.")
               )
        :pilihan (fnc/create-option3 angka 2 jwb)
        :jawaban jwb
        }))
(defn C1A2FFAK-1 []
  "Hukum Archimedes"
  (let [res (+ 700 (* 5 (rand-int 40)))  ; massa jenis es dalam kg/m^3
        ves (* 1000 (rand-int 100))       ; volume es m^3
        rair 1000                        ; massa jenis air dalam kg/m^3
        vt (/ (* res ves) rair)          ; volume tercelup dalam m^3
        vm (- ves vt)                     ; volume nongol dalam m^3
        rd (rand-int 3)
        angka (cond
                (= rd 0) ves
                (= rd 1) vt
                (= rd 2) vm
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Bongkahan es bermassa jenis " res " $kg/m^3$ mengapung pada permukaan air laut bermassa
                               jenis " rair " $kg/m^3$. Jika volume es yang tenggelam ke dalam air adalah " vt " $m^3$
                               maka volume total es tersebut adalah ... $m^3$.")
                 (= rd 1) (str "Bongkahan es bermassa jenis " res " $kg/m^3$ mengapung pada permukaan air laut bermassa
                               jenis " rair " $kg/m^3$. Jika volume es keseluruhan adalah " ves " $m^3$
                               maka volume  es yang berada di bawah permukaan air adalah ... $m^3$.")
                 (= rd 2) (str "Bongkahan es bermassa jenis " res " $kg/m^3$ mengapung pada permukaan air laut bermassa
                               jenis " rair " $kg/m^3$. Jika volume es keseluruhan adalah " ves " $m^3$
                               maka volume  es yang berada di atas permukaan air adalah ... $m^3$."))
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FFAK []
  "Fluida statik - Hukum Archimedes"
  (C1A2FFAK-1))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FFAK-" x))))))

(defn C1A2FFAL-0 []
  "Hukum Archimedes"
  (let [V (fnc/random 5)                        ; Volume m^3
        mp (+ 200 (rand-int 300))               ; massa perahu dalam kg
        g 10                                    ; gravitasi dalam m/s^2
        rair 1000                               ; massa jenis air  kg/m^3
        Fa_max (* rair g V)                     ; F archimedes max dalam newton
        mt_max (/ Fa_max g)                     ; mtotal maximum dalam kg
        mb_max (- mt_max mp)                    ; mbeban maximum dalam kg
        rd (rand-int 3)
        angka (cond
                (= rd 0) mb_max
                (= rd 1) mp
                (= rd 2) V
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Sebuah perahu memiliki massa " mp " kg dan volume " V " $m^3$. Massa maksimum penumpang
                               agar perahu tidak tenggelam di dalam air adalah ... kg. (g = " g " $m/s^2$, massa jenis air
                               = " rair" kg).")
                 (= rd 1) (str "Sebuah perahu dapat mengangkut penumpang dengan massa maksimum " mb_max " kg agar tidak
                               tenggelam dalam air (massa jenis air " rair " $kg/m^3$). Jika volume perahu " V " $m^3$
                               dan percepatan gravitasi bumi " g " $m/s^2$, maka massa perahu adalah ... kg.")
                 (= rd 2) (str "Sebuah perahu bermassa " mp " kg dapat mengangkut penumpang maksimum sebesar " mb_max " kg
                               agar tidak tenggelam dalam air. Jika massa jenis air " rair " $kg/m^3$ dan percepatan
                               gravitasi bumi " g " $m/s^2$ maka volume perahu adalah ... $m^3$.")
              )
        :pilihan (fnc/create-option1b angka jwb)
        :jawaban jwb
        }))
(defn C1A2FFAL []
  "Fluida statik - Hukum Archimedes"
  (C1A2FFAL-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FFAL-" x))))))


;;; Suhu dan kalor

(defn C1A2FHAE-0 []
  "Pengukuran suhu"
  (let [data (read-string (slurp "data/fis1013/C1A2FHAE-0.txt"))
        datum (nth data (rand-int (count data))) R (nth datum 0) C (nth datum 1) K (nth datum 2)
        ;R (nth (range -200 200 2) (rand-int (/ 400 2)))
        ;C (* 1.25 R)
        ;K (+ C 273)
        rd (rand-int 4)
        angka (cond
                (= rd 0) C
                (= rd 1) R
                (= rd 2) K
                (= rd 3) R
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Hasil pengukuran suhu dengan termometer Reamur adalah " R " $^oR$. Jika menggunakan
                               termometer Celcius pengukuran suhu tersebut akan menghasilkan ... $^oC$.")
                 (= rd 1) (str "Suhu suatu benda adalah " C " $^oC$. Jika dinyatakan dalam skala Reamur suhu tersebut adalah ...
                               $^oR$.")
                 (= rd 2) (str "Sebatang besi yang dipanaskan suhunya naik menjadi " R " $^oR$. Suhu besi tersebut jika dinyatakan
                               dalam Kelvin adalah ... Kelvin." )
                 (= rd 3) (str "Suatu benda diturunkan suhunya menjadi " K " Kelvin. Suhu tersebut dalam skala Reamur adalah ...
                               $^oR$." )
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHAE-1 []
  "Pengukuran suhu"
  (let [data (read-string (slurp "data/fis1013/C1A2FHAE-1.txt"))
        datum (nth data (rand-int (count data))) C (nth datum 0) F (nth datum 1) K (nth datum 2) R (nth datum 3)
        ;C (nth (range -200 800 5) (rand-int (/ 1000 5)))
        ;F (+ (* 9/5 C) 32)
        ;K (+ C 273)
        ;R (* 0.8 C)
        rd (rand-int 4)
        angka (cond
                (= rd 0) C
                (= rd 1) F
                (= rd 2) K
                (= rd 3) F
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Hasil pengukuran suhu dengan termometer Fahrenheit adalah " F " $^oF$. Jika menggunakan
                               termometer Celcius pengukuran suhu tersebut akan menghasilkan ... $^oC$.")
                 (= rd 1) (str "Suhu suatu benda adalah " C " $^oC$. Jika dinyatakan dalam skala Fahrenheit suhu tersebut adalah ...
                               $^oF$.")
                 (= rd 2) (str "Sebatang besi yang dipanaskan suhunya naik menjadi " F " $^oF$. Suhu besi tersebut jika dinyatakan
                               dalam Kelvin adalah ... Kelvin." )
                 (= rd 3) (str "Suatu benda diturunkan suhunya menjadi " R " $^oR$. Suhu tersebut dalam skala Fahrenheit adalah ...
                               $^oF$." )
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHAE []
  "Suhu dan Kalor - Pengukuran suhu"
  ;(C1A2FHAE-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FHAE-" x))))))

(defn C1A2FHAF-0 []
  "Termometer Jamal"
  (let [data (read-string (slurp "data/fis1013/C1A2FHAF-0.txt"))
        datum (nth data (rand-int (count data)))
        C (nth datum 0) F (nth datum 1) K (nth datum 2) xo (nth datum 3) x1 (nth datum 4) x (nth datum 5)
        ;xo (nth (range -50 50 10) (rand-int 10))
        ;dx (nth [50 80 100 120 150 180 200] (rand-int 7))
        ;x1 (+ xo dx)
        ;C (nth (range -200 200 5) (rand-int 80))
        ;F (+ (* 9/5 C) 32)
        ;K (+ C 273)
        ;x (+ (* C dx 1/100) xo)
        rd (rand-int 4)
        angka (cond
                (= rd 0) x
                (= rd 1) C
                (= rd 2) F
                (= rd 3) K
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Pada sebuah termometer x, titik beku air adalah " xo " $^ox$ dan titik didih air adalah
                               " x1 " $^ox$. Bila sebuah benda diukur dengan termometer Celcius, suhunya " C " $^oC$,
                               maka bila diukur dengan termometer x, suhunya ialah ... $^ox$.")
                 (= rd 1) (str "Pada sebuah termometer x, titik beku air adalah " xo " $^ox$ dan titik didih air adalah
                               " x1 " $^ox$. Bila sebuah benda diukur dengan termometer x, suhunya " x " $^ox$,
                               maka bila diukur dengan termometer Celcius, suhunya ialah ... $^oC$.")
                 (= rd 2) (str "Pada sebuah termometer x, titik beku air adalah " xo " $^ox$ dan titik didih air adalah
                               " x1 " $^ox$. Bila sebuah benda diukur dengan termometer x, suhunya " x " $^ox$,
                               maka bila diukur dengan termometer Fahrenheit, suhunya ialah ... $^oF$." )
                 (= rd 3) (str "Pada sebuah termometer x, titik beku air adalah " xo " $^ox$ dan titik didih air adalah
                               " x1 " $^ox$. Bila sebuah benda diukur dengan termometer x, suhunya " x " $^ox$,
                               maka bila diukur dengan termometer Kelvin, suhunya ialah ... Kelvin.")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHAF []
  "Suhu dan Kalor - Pengukuran suhu"
  (C1A2FHAF-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FHAF-" x))))))

(defn C1A2FHAG-0 []
  "Pemuaian panjang"
  (let [data (read-string (slurp "data/fis1013/C1A2FHAG-0.txt"))
        datum (nth data (rand-int (count data)))
        Lo (nth datum 0) alfa (nth datum 1) to (nth datum 2) t1 (nth datum 3) L (nth datum 4)
        rd (rand-int 4)
        angka (cond
                (= rd 0) L
                (= rd 1) Lo
                (= rd 2) alfa
                (= rd 3) t1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Sejenis logam yang panjangnya " Lo " m memiliki koefisien muai panjang " alfa "
                               x $10^{-6} K^{-1}$.
                               Jika logam tersebut dipanaskan dari " to " $^oC$ menjadi " t1 " $^oC$, maka panjangnya
                               akan menjadi ... m.")
                 (= rd 1) (str "Sebatang logam memiliki koefisien muai panjang " alfa " x $10^{-6} K^{-1}$.
                               Jika suhu awal logam " to " $^oC$ kemudian berubah menjadi " t1 " $^oC$, panjangnya
                               menjadi " L " m. Panjang logam mula-mula adalah ... m.")
                 (= rd 2) (str "Sebatang logam berubah panjangnya dari " Lo " m menjadi " L " m akibat perubahan suhu dari
                               " to " $^oC$ menjadi " t1 " $^oC$. Koefisien muai panjang logam tersebut adalah ... x $10^{-6} K^{-1}$.")
                 (= rd 3) (str "Sebatang logam berubah panjangnya dari " Lo " m menjadi " L " m akibat dipanaskan
                               dari " to " $^oC$. Jika koefisien muai panjang logam tersebut adalah " alfa " x $10^{-6} K^{-1}$ maka
                               suhu akhir logam adalah ... $^oC$.")
               )
        :pilihan (fnc/create-option3 angka 3 jwb)
        :jawaban jwb
        }))
(defn C1A2FHAG-1 []
  "Pemuaian panjang"
  (let [data (read-string (slurp "data/fis1013/C1A2FHAG-1.txt"))
        datum (nth data (rand-int (count data)))
        Lo (nth datum 0) alfa (nth datum 1) to (nth datum 2) t1 (nth datum 3) L (nth datum 4)
        rd (rand-int 4)
        angka (cond
                (= rd 0) L
                (= rd 1) Lo
                (= rd 2) alfa
                (= rd 3) t1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Sejenis logam yang panjangnya " Lo " m memiliki koefisien muai panjang " alfa "
                               x $10^{-6} K^{-1}$.
                               Jika logam tersebut didinginkan dari " to " $^oC$ menjadi " t1 " $^oC$, maka panjangnya
                               akan menjadi ... m.")
                 (= rd 1) (str "Sebatang logam memiliki koefisien muai panjang " alfa " x $10^{-6} K^{-1}$.
                               Jika suhu awal logam " to " $^oC$ kemudian berubah menjadi " t1 " $^oC$, panjangnya
                               menjadi " L " m. Panjang logam mula-mula adalah ... m.")
                 (= rd 2) (str "Sebatang logam berubah panjangnya dari " Lo " m menjadi " L " m akibat perubahan suhu dari
                               " to " $^oC$ menjadi " t1 " $^oC$. Koefisien muai panjang logam tersebut adalah ... x $10^{-6} K^{-1}$.")
                 (= rd 3) (str "Sebatang logam berubah panjangnya dari " Lo " m menjadi " L " m akibat didinginkan
                               dari " to " $^oC$. Jika koefisien muai panjang logam tersebut adalah " alfa " x $10^{-6} K^{-1}$ maka
                               suhu akhir logam adalah ... $^oC$.")
               )
        :pilihan (fnc/create-option3 angka 3 jwb)
        :jawaban jwb
        }))
(defn C1A2FHAG-2 []
  "Pemuaian bidang"
  (let [data (read-string (slurp "data/fis1013/C1A2FHAG-2.txt"))
        datum (nth data (rand-int (count data)))
        Ao (nth datum 0) beta (nth datum 1) to (nth datum 2) t1 (nth datum 3) A (nth datum 4)
        rd (rand-int 4)
        angka (cond
                (= rd 0) A
                (= rd 1) Ao
                (= rd 2) beta
                (= rd 3) t1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Sejenis logam yang luasnya " Ao " $m^2$ memiliki koefisien muai bidang " beta "
                               x $10^{-6} K^{-1}$.
                               Jika logam tersebut dipanaskan dari " to " $^oC$ menjadi " t1 " $^oC$, maka luasnya
                               akan menjadi ... $m^2$.")
                 (= rd 1) (str "Sebidang logam memiliki koefisien muai bidang " beta " x $10^{-6} K^{-1}$.
                               Jika suhu awal logam " to " $^oC$ kemudian berubah menjadi " t1 " $^oC$, luasnya
                               menjadi " A " $m^2$. Luas logam mula-mula adalah ... $m^2$.")
                 (= rd 2) (str "Sebidang logam berubah luasnya dari " Ao " $m^2$ menjadi " A " $m^2$ akibat perubahan suhu dari
                               " to " $^oC$ menjadi " t1 " $^oC$. Koefisien muai bidang logam tersebut adalah ... x $10^{-6} K^{-1}$.")
                 (= rd 3) (str "Sebidang logam berubah luasnya dari " Ao " $m^2$ menjadi " A " $m^2$ akibat dipanaskan
                               dari " to " $^oC$. Jika koefisien muai bidang logam tersebut adalah " beta " x $10^{-6} K^{-1}$ maka
                               suhu akhir logam adalah ... $^oC$.")
               )
        :pilihan (fnc/create-option3 angka 3 jwb)
        :jawaban jwb
        }))
(defn C1A2FHAG-3 []
  "Pemuaian bidang"
  (let [data (read-string (slurp "data/fis1013/C1A2FHAG-3.txt"))
        datum (nth data (rand-int (count data)))
        Ao (nth datum 0) beta (nth datum 1) to (nth datum 2) t1 (nth datum 3) A (nth datum 4)
        rd (rand-int 4)
        angka (cond
                (= rd 0) A
                (= rd 1) Ao
                (= rd 2) beta
                (= rd 3) t1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Sebidang logam yang luasnya " Ao " $m^2$ memiliki koefisien muai bidang " beta "
                               x $10^{-6} K^{-1}$.
                               Jika logam tersebut didinginkan dari " to " $^oC$ menjadi " t1 " $^oC$, maka luasnya
                               akan menjadi ... $m^2$.")
                 (= rd 1) (str "Sebidang logam memiliki koefisien muai bidang " beta " x $10^{-6} K^{-1}$.
                               Jika suhu awal logam " to " $^oC$ kemudian berubah menjadi " t1 " $^oC$, luasnyanya
                               menjadi " A " $m^2$. Luas logam mula-mula adalah ... $m^2$.")
                 (= rd 2) (str "Sebidang logam berubah luasnya dari " Ao " $m^2$ menjadi " A " $m^2$ akibat perubahan suhu dari
                               " to " $^oC$ menjadi " t1 " $^oC$. Koefisien muai bidang logam tersebut adalah ... x $10^{-6} K^{-1}$.")
                 (= rd 3) (str "Sebidang logam berubah luasnya dari " Ao " $m^2$ menjadi " A " $m^2$ akibat didinginkan
                               dari " to " K. Jika koefisien muai bidang logam tersebut adalah " beta " x $10^{-6} K^{-1}$ maka
                               suhu akhir logam adalah ... $^oC$.")
               )
        :pilihan (fnc/create-option3 angka 3 jwb)
        :jawaban jwb
        }))
(defn C1A2FHAG-4 []
  "Pemuaian bidang"
  (let [data (read-string (slurp "data/fis1013/C1A2FHAG-4.txt"))
        datum (nth data (rand-int (count data)))
        Vo (nth datum 0) gamma (nth datum 1) to (nth datum 2) t1 (nth datum 3) V (nth datum 4)
        rd (rand-int 4)
        angka (cond
                (= rd 0) V
                (= rd 1) Vo
                (= rd 2) gamma
                (= rd 3) t1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Sejenis logam yang volumenya " Vo " $m^3$ memiliki koefisien muai ruang " gamma "
                               x $10^{-6} K^{-1}$.
                               Jika logam tersebut dipanaskan dari " to " $^oC$ menjadi " t1 " $^oC$, maka volumenya
                               akan menjadi ... $m^3$.")
                 (= rd 1) (str "Suatu balok logam memiliki koefisien muai ruang " gamma " x $10^{-6} K^{-1}$.
                               Jika suhu awal logam " to " $^oC$ kemudian berubah menjadi " t1 " $^oC$, volumenya
                               menjadi " V " $m^3$. Volume logam mula-mula adalah ... $m^3$.")
                 (= rd 2) (str "Suatu balok logam berubah volumenya dari " Vo " $m^3$ menjadi " V " $m^3$ akibat perubahan suhu dari
                               " to " $^oC$ menjadi " t1 " $^oC$. Koefisien muai ruang logam tersebut adalah ... x $10^{-6} K^{-1}$.")
                 (= rd 3) (str "Suatu balok logam berubah volumenya dari " Vo " $m^3$ menjadi " V " $m^3$ akibat dipanaskan
                               dari " to " $^oC$. Jika koefisien muai ruang logam tersebut adalah " gamma " x $10^{-6} K^{-1}$ maka
                               suhu akhir logam adalah ... $^oC$.")
               )
        :pilihan (fnc/create-option3 angka 3 jwb)
        :jawaban jwb
        }))
(defn C1A2FHAG-5 []
  "Pemuaian bidang"
  (let [data (read-string (slurp "data/fis1013/C1A2FHAG-5.txt"))
        datum (nth data (rand-int (count data)))
        Vo (nth datum 0) gamma (nth datum 1) to (nth datum 2) t1 (nth datum 3) V (nth datum 4)
        rd (rand-int 4)
        angka (cond
                (= rd 0) V
                (= rd 1) Vo
                (= rd 2) gamma
                (= rd 3) t1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Suatu balok logam yang volumenya " Vo " $m^3$ memiliki koefisien muai rang " gamma "
                               x $10^{-6} K^{-1}$.
                               Jika logam tersebut didinginkan dari " to " $^oC$ menjadi " t1 " $^oC$, maka volumenya
                               akan menjadi ... $m^3$.")
                 (= rd 1) (str "Suatu balok logam memiliki koefisien muai ruang " gamma " x $10^{-6} K^{-1}$.
                               Jika suhu awal logam " to " $^oC$ kemudian berubah menjadi " t1 " $^oC$, volumenya
                               menjadi " V " $m^3$. Volume logam mula-mula adalah ... $m^3$.")
                 (= rd 2) (str "Suatu balok logam berubah volumenya dari " Vo " $m^3$ menjadi " V " $m^3$ akibat perubahan suhu dari
                               " to " $^oC$ menjadi " t1 " $^oC$. Koefisien muai ruang logam tersebut adalah ... x $10^{-6} K^{-1}$.")
                 (= rd 3) (str "Suatu balok logam berubah volumenya dari " Vo " $m^3$ menjadi " V " $m^3$ akibat didinginkan
                               dari " to " $^oC$. Jika koefisien muai ruang logam tersebut adalah " gamma " x $10^{-6} K^{-1}$ maka
                               suhu akhir logam adalah ... $^oC$.")
               )
        :pilihan (fnc/create-option3 angka 3 jwb)
        :jawaban jwb
        }))
(defn C1A2FHAG []
  "Suhu dan Kalor - Pemuaian"
  ;(C1A2FHAG-5))
  (let [x (rand-int 6)] ((resolve (symbol my-ns (str "C1A2FHAG-" x))))))

(defn C1A2FHCB-0 []
  "Pemuaian bidang"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCB-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) c (nth datum 1) to (nth datum 2) t1 (nth datum 3) Q (nth datum 4)
        rd (rand-int 4)
        angka (cond
                (= rd 0) Q
                (= rd 1) m
                (= rd 2) to
                (= rd 3) t1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Kalor yang dibutuhkan untuk memanaskan zat cair dari " to " $^oC$ menjadi " t1 " $^oC$ jika
                               massa dan kalor jenisnya berturut-turut " m " gram dan " c " $kal/gr^oC$ adalah ... kalori.")
                 (= rd 1) (str "Suatu bahan memiliki kalor jenis " c " $kal/gr^oC$. Jika kalor yang dibutuhkan untuk menaikkan
                               suhu bahan tersebut dari " to " $^oC$ menjadi " t1 " $^oC$ adalah " Q " kalori, maka massa
                               bahan tersebut adalah ... gram.")
                 (= rd 2) (str "Suatu zat cair memiliki kalor jenis " c " $kal/gr^oC$ dan massa " m " gr. Untuk memanaskan zat cair
                               tersebut menjadi " t1 " $^oC$ dibutuhkan kalor " Q " kalori. Suhu awal zat cair tersebut adalah ...
                               $^oC$.")
                 (= rd 3) (str "Suatu bahan memiliki kalor jenis " c " $kal/gr^oC$ dan massa " m " gr. Untuk memanaskan bahan
                               tersebut dari " to " $^oC$ dibutuhkan kalor " Q " kalori. Suhu akhir bahan tersebut adalah ...
                               $^oC$.")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCB-1 []
  "Perubahan suhu"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCB-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) c (nth datum 1) to (nth datum 2) t1 (nth datum 3) Q (nth datum 4)
        rd (rand-int 4)
        angka (cond
                (= rd 0) Q
                (= rd 1) m
                (= rd 2) to
                (= rd 3) t1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Suatu zat padat yang bermassa jenis " c " $Jkg^{-1}K^{-1}$ turun suhunya dari " to " K
                               menjadi " t1 " K. Jika massa zat itu " m " kg maka kalor yang dilepas zat tersebut adalah ... J.")
                 (= rd 1) (str "Suatu zat padat  memiliki kalor jenis " c " $Jkg^{-1}K^{-1}$. Jika kalor yang dilepas ketika
                                suhu bahan tersebut turun dari " to " K menjadi " t1 " K adalah " Q " Joule, maka massa
                               zat tersebut adalah ... kg.")
                 (= rd 2) (str "Suatu zat padat memiliki kalor jenis " c " $Jkg^{-1}K^{-1}$ dan massa " m " kg. Jika suhunya turun
                               menjadi " t1 " K kalor yang dilepas zat tersebut adalah  " Q " Joule. Suhu awal zat cair
                               tersebut adalah ... K.")
                 (= rd 3) (str "Suatu zat padat  memiliki kalor jenis " c " $Jkg^{-1}K^{-1}$ dan massa " m " kg. Untuk mendinginkan
                               zat tersebut dari " to " K, zat padat melepas kalor " Q " Joule. Suhu akhir zat tersebut adalah ...
                               K.")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCB []
  "Suhu dan Kalor - Perubahan suhu"
  ;(C1A2FHCB-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FHCB-" x))))))

(defn C1A2FHCC-0 []
  "Perubahan wujud - melebur"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCC-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) z (nth datum 1) L (nth datum 2) Q (nth datum 3)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Q
                (= rd 1) m
                (= rd 2) L
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Kalor yang dibutuhkan untuk melebur " m " gram " z " pada titik leburnya adalah ... kalori.
                               (kalor lebur " z " = " L " kal/gram).")
                 (= rd 1) (str "Untuk melebur " z " yang kalor leburnya " L " kal/gram pada titik leburnya dibutuhkan
                               energi panas sebesar " Q " kalori. Massa " z " yang dilebur tersebut adalah ... gram.")
                 (= rd 2) (str "Untuk melebur " m " gram zat padat pada titik leburnya dibutuhkan kalori sebesar " Q "
                               kalori. Kalor lebur zat tersebut adalah ... kal/gr.")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCC-1 []
  "Perubahan wujud - membeku"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCC-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) z (nth datum 1) L (nth datum 2) Q (nth datum 3)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Q
                (= rd 1) m
                (= rd 2) L
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Kalor yang dilepas oleh " m " gram " z " ketika membeku adalah ... kalori. (Kalor
                               lebur " z " = " L " kal/gr).")
                 (= rd 1) (str "Kalor yang dilepas sejumlah " z " yang kalor leburnya " L " kal/gram ketika
                               membeku adalah " Q " kalori. Massa " z " yang membeku adalah ... gram.")
                 (= rd 2) (str "Kalor yang dilepas " m " gram  " z " ketika membeku adalah " Q " kalori. Kalor
                               lebur " z " adalah ... kal/gr.")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCC-2 []
  "Perubahan wujud - menguap"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCC-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) z (nth datum 1) U (nth datum 2) Q (nth datum 3)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Q
                (= rd 1) m
                (= rd 2) U
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Kalor yang dibutuhkan untuk menguapkan " m " gram " z " pada titik uapnya adalah
                               ... kalori. (Kalor uap " z " = " U " kal/gr).")
                 (= rd 1) (str "Kalor yang dibutuhkan untuk menguapkan sejumlah " z " yang kalor uapnya
                               " U " kal/gram pada titik uapnya adalah " Q " kalori. Massa " z " yang
                               diuapkan adalah ... gram.")
                 (= rd 2) (str "Sejumlah " m " gram  " z " ketika diuapkan membutuhkan energi panas sebesar
                               " Q " kalori. Kalor uap " z " adalah ... kal/gr.")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCC []
  "Suhu dan Kalor - Perubahan wujud"
  ;(C1A2FHCC-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1A2FHCC-" x))))))

(defn C1A2FHCD-0 []
  "Perubahan wujud dan suhu"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCD-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) T (nth datum 1) Q (nth datum 2)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Q
                (= rd 1) m
                (= rd 2) T
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Balok es yang massanya " m " gram dan suhunya 0 $^oC$ hendak dilebur kemudian dinaikkan
                               suhunya menjadi " T " $^oC$. Kalor yang dibutuhkan adalah ... kalori. (Kalor lebur es =
                               80 kal/gr, kalor jenis air = 1 $kal/gr ^oC$).")
                 (= rd 1) (str "Kalor yang dibutuhkan untuk memperoleh air bersuhu " T " $^oC$ dari es bersuhu 0 $^oC$
                               adalah " Q " kalori. Besarnya massa es adalah ... gram. (Kalor lebur es =
                               80 kal/gr, kalor jenis air = 1 $kal/gr ^oC$).")
                 (= rd 2) (str "Es bersuhu 0$^oC$ dengan massa " m " gram hendak dilebur menjadi air. Jika kalor yang
                               diberikan adalah " Q " kalori maka suhu akhir air adalah ... $^oC$. (Kalor lebur es =
                               80 kal/gr, kalor jenis air = 1 $kal/gr^oC$).")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCD-1 []
  "Perubahan wujud dan suhu"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCD-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) To (nth datum 1) T1 (nth datum 2) Q (nth datum 3)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Q
                (= rd 1) m
                (= rd 2) T1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Balok es yang massanya " m " gram dan suhunya " To " $^oC$ hendak diubah menjadi
                               air bersuhu " T1 " $^oC$. Kalor yang dibutuhkan adalah ... kalori. (Kalor lebur es =
                               80 kal/gr, kalor jenis air = 1 $kal/gr ^oC$, kalor jenis es = 0.5 $kal/gr ^oC$).")
                 (= rd 1) (str "Kalor yang dibutuhkan untuk memperoleh air bersuhu " T1 " $^oC$ dari es bersuhu " To " $^oC$
                               adalah " Q " kalori. Besarnya massa es adalah ... gram. (Kalor lebur es =
                               80 kal/gr, kalor jenis air = 1 $kal/gr ^oC$, kalor jenis es = 0.5 $kal/gr ^oC$).")
                 (= rd 2) (str "Es bersuhu " To " $^oC$ dengan massa " m " gram hendak dilebur menjadi air. Jika kalor yang
                               diberikan adalah " Q " kalori maka suhu akhir air adalah ... $^oC$. (Kalor lebur es =
                               80 kal/gr, kalor jenis air = 1 $kal/gr^oC$, kalor jenis es = 0.5 $kal/gr ^oC$).")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCD-2 []
  "Perubahan wujud dan suhu"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCD-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) T (nth datum 1) Q (nth datum 2)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Q
                (= rd 1) m
                (= rd 2) T
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Air yang suhunya " T " $^oC$ hendak diuapkan seluruhnya. Jika massa air adalah " m "
                               gram, maka kalor yang dibutuhkan adalah ... kalori. (Kalor uap air = 538 kal/gram,
                               kalor jenis air = 1 $kal/gr ^oC$).")
                 (= rd 1) (str "Kalor yang dibutuhkan untuk menguapkan air bersuhu " T " $^oC$ adalah " Q " kalori.
                               Banyaknya air yang diuapkan adalah ... gram. (Kalor uap air = 538 kal/gram,
                               kalor jenis air = 1 $kal/gr ^oC$).")
                 (= rd 2) (str "Air dengan massa " m " gram hendak diuapkan seluruhnya. Jika kalor yang
                               dibutuhkan adalah " Q " kalori maka suhu awal air adalah ... $^oC$. (Kalor uap air = 538 kal/gram,
                               kalor jenis air = 1 $kal/gr ^oC$).")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCD []
  "Suhu dan Kalor - Perubahan wujud dan suhu"
  ;(C1A2FHCD-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1A2FHCD-" x))))))

(defn C1A2FHCF-0 []
  "Azas Black Air campur air"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCF-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) T1 (nth datum 2) T2 (nth datum 3) Tf (nth datum 4)
        rd (rand-int 5)
        angka (cond
                (= rd 0) Tf
                (= rd 1) m1
                (= rd 2) m2
                (= rd 3) T2
                (= rd 4) T1
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Jika " m1 " gram air bersuhu " T1 " $^oC$ dicampur dengan " m2 " gram air bersuhu " T2 "
                               $^oC$ pada suatu wadah yang tidak menyerap kalor maka suhu akhir campuran adalah ... $^oC$.")
                 (= rd 1) (str "Air yang bersuhu " T2 " $^oC$ pada wadah A dicampur dengan air bersuhu " T1 " $^oC$
                               dan bermassa " m1 " gram pada wadah B. Jika suhu akhir campuran adalah " Tf " $^oC$
                               maka massa air pada wadah A adalah ... gram.")
                 (= rd 2) (str "Air yang bersuhu " T1 " $^oC$ dan bermassa " m1 " gram pada wadah A dicampur dengan air
                               bersuhu " T2 " $^oC$ pada wadah B. Jika suhu akhir campuran adalah " Tf " $^oC$
                               maka massa air pada wadah B adalah ... gram.")
                 (= rd 3) (str "Air yang bersuhu " T1 " $^oC$ dan bermassa " m1 " gram pada wadah A dicampur dengan air
                               bermassa " m2 " gram pada wadah B. Jika suhu akhir campuran adalah " Tf " $^oC$
                               maka suhu air pada wadah B adalah ... $^oC$.")
                 (= rd 4) (str "Air yang bersuhu " T2 " $^oC$ dan bermassa " m2 " gram pada wadah A dicampur dengan air
                               bermassa " m1 " gram pada wadah B. Jika suhu akhir campuran adalah " Tf " $^oC$
                               maka suhu air pada wadah B adalah ... $^oC$.")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCF-1 []
  "Azas Black Air campur air"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCF-1.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) zat (nth datum 2) cz (nth datum 3) T1 (nth datum 4) T2 (nth datum 5) Tf (nth datum 6)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Tf
                (= rd 1) m2
                (= rd 2) T2
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Jika " m1 " gram air bersuhu " T1 " $^oC$ dicampur dengan " m2 " gram " zat " bersuhu " T2 "
                               $^oC$ pada suatu wadah yang tidak menyerap kalor maka suhu akhir campuran adalah ... $^oC$.
                               (kalor jenis " zat " = " cz " kal/gr).")
                 (= rd 1) (str "Dalam suatu wadah yang tidak menyerap kalor terdapat balok " zat " bersuhu " T2 "
                               $^oC$. Air bersuhu " T1 " $^oC$ sejumlah " m1 " gram dituangkan ke wadah tersebut. Jika
                               suhu akhir air dan " zat " adalah " Tf " $^oC$ maka massa " zat " adalah ... gram.
                               (kalor jenis " zat " = " cz " kal/gr).")
                 (= rd 2) (str "Dalam suatu wadah yang tidak menyerap kalor terdapat balok " zat " bermassa " m2 "
                               gram. Air bersuhu " T1 " $^oC$ sejumlah " m1 " gram dituangkan ke wadah tersebut. Jika
                               suhu akhir air dan balok " zat " adalah " Tf " $^oC$ maka suhu awal " zat " adalah ...
                               $^oC$. (kalor jenis " zat " = " cz " kal/gr).")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCF []
  "Suhu dan Kalor - Azas Black"
  ;(C1A2FHCF-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FHCD-" x))))))

(defn C1A2FHCG-0 []
  "Azas Black Air campur air"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCG-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m1c (nth datum 1) T1 (nth datum 2) T2 (nth datum 3) m2 (nth datum 4)
        rd (rand-int 4)
        angka (cond
                (= rd 0) m1c
                (= rd 1) m1
                (= rd 2) T2
                (= rd 3) m2
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Sebongkah es bermassa " m1 " gram dan bersuhu " T1 " $^oC$ dicampurkan dengan air
                               bermassa " m2 " gram dan bersuhu " T2 " $^oC$ dalam suatu bejana yang penyerapan kalornya
                               diabaikan. Jumlah massa es yang mencair adalah ... gram. (Kalor lebur es =
                               80 kal/gr, kalor jenis air = 1 kal/grK, kalor jenis es = 0.5 kal/grK).")
                 (= rd 1) (str "Kubus es bersuhu " T1" $^oC$ dicampur dengan " m2 " gram air bersuhu " T2 " $^oC$ dalam
                               suatu bejana yang tidak menyerap kalor. Jika massa es yang mencair adalah " m1c " gram
                               maka massa es mula-mula adalah ... gram. (Kalor lebur es =
                               80 kal/gr, kalor jenis air = 1 kal/grK, kalor jenis es = 0.5 kal/grK).")
                 (= rd 2) (str "Dalam suatu wadah yang tidak menyerap kalor terdapat balok es bermassa " m1 "
                               gram dan bersuhu " T1 " $^oC$. Air sejumlah " m2 " gram dituangkan ke wadah tersebut. Jika
                               pada keadaan setimbang massa es yang mencair adalah " m1c " gram, maka suhu awal
                               air yang dituang adalah ... $^oC$. (Kalor lebur es =
                               80 kal/gr, kalor jenis air = 1 kal/grK, kalor jenis es = 0.5 kal/grK).")
                 (= rd 3) (str "Kubus es bermassa " m1 " gram dan bersuhu " T1" $^oC$ dicampur sejumlah air bersuhu
                               " T2 " $^oC$ dalam
                               suatu bejana yang tidak menyerap kalor. Jika massa es yang mencair adalah " m1c " gram
                               maka massa air mula-mula adalah ... gram. (Kalor lebur es =
                               80 kal/gr, kalor jenis air = 1 kal/grK, kalor jenis es = 0.5 kal/grK).")
               )
        :pilihan (fnc/create-option1 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHCG-1 []
  "Azas Black Air-Wadah-es 0 derjat"
  (let [data (read-string (slurp "data/fis1013/C1A2FHCG-1.txt"))
        datum (nth data (rand-int (count data)))
        va (nth datum 0) me (nth datum 1) Ta (nth datum 2) H (nth datum 3) Tf (nth datum 4)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Tf
                (= rd 1) me
                (= rd 2) va
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Ke dalam bejana berisi " va " $cm^3$ air bersuhu " Ta " $^oC$ dimasukkan balok es bermassa
                               " me " gram yang suhunya 0 $^oC$. Suhu setimbang yang dicapai adalah ... $^oC$.
                               (kapasitas kalor gelas = " H " kal/K, massa jenis air =
                               1 $gram/cm^3$, kalor lebur es = 80 kal/gram, dan kalor jenis air 1 kal/grK).")
                 (= rd 1) (str "Balok es bersuhu 0 $^oC$ dimasukkan ke dalam bejana berisi " va " $cm^3$ air bersuhu
                               " Ta " $^oC$. Jika suhu setimbang yang dicapai adalah " Tf " $^oC$ maka massa balok es
                               yang dimasukkan adalah ... gram. (kapasitas kalor gelas = " H " kal/K, massa jenis air =
                               1 $gram/cm^3$, kalor lebur es = 80 kal/gram, dan kalor jenis air 1 kal/grK).")
                 (= rd 2) (str "Ke dalam bejana berisi sejumlah air bersuhu " Ta " $^oC$ dimasukkan balok es bermassa
                               " me " gram yang suhunya 0 $^oC$. Jika Suhu setimbang yang dicapai adalah " Tf " $^oC$ maka
                               volume air mula-mula adalah ... $cm^3$. (kapasitas kalor gelas = " H " kal/K, massa jenis air =
                               1 $gram/cm^3$, kalor lebur es = 80 kal/gram, dan kalor jenis air 1 kal/grK).")
               )
        :pilihan (fnc/create-option3 angka 2 jwb)
        :jawaban jwb
        }))
(defn C1A2FHCG []
  "Suhu dan Kalor - Azas Black"
  ;(C1A2FHCG-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FHCG-" x))))))

(defn C1A2FHED-0 []
  "Konduksi"
  (let [data (read-string (slurp "data/fis1013/C1A2FHED-0.txt"))
        datum (nth data (rand-int (count data)))
        k (nth datum 0) A (nth datum 1) T1 (nth datum 2) T2 (nth datum 3) L (nth datum 4) H (nth datum 5)
        rd (rand-int 3)
        angka (cond
                (= rd 0) H
                (= rd 1) A
                (= rd 2) L
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Sebatang silinder logam berluas penampang " A " $cm^2$ dan panjang " L " cm dipanaskan
                               salah satu ujungnya dengan suhu " T2 " $^oC$. Jika suhu ujung satunya lagi " T1 " $^oC$
                               dan konduktifitas termal logam " k " watt/(meter kelvin) maka laju aliran kalor pada
                               logam tersebut adalah ... watt.")
                 (= rd 1) (str "Suhu ujung-ujung suatu batang logam berturut-turut " T1 " $^oC$ dan " T2 " $^oC$, sehingga
                               terjadi perpindahan kalor dengan laju " H " joule/detik. Jika panjang batang logam tersebut
                               adalah " L " cm dan konduktifitas termalnya " k " watt/mK maka luas penampang logam tersebut
                               adalah ... $cm^2$.")
                 (= rd 2) (str "Suatu silinder logam yang luas penampangnya " A " $cm^2$ suhu diujung-ujungnya berturut-turut
                               " T1 " dan " T2 " $^oC$. Jika laju aliran kalor yang terjadi pada batang logam tersebut adalah
                               " H " watt, maka panjang silinder logam tersebut adalah... cm. (konduktifitas termal silinder
                               logam = " k " W/mK).")
               )
        :pilihan (fnc/create-option3 angka 2 jwb)
        :jawaban jwb
        }))
(defn C1A2FHED-1 []
  "Konduksi"
  (let [data (read-string (slurp "data/fis1013/C1A2FHED-1.txt"))
        datum (nth data (rand-int (count data)))
        k (nth datum 0) A (nth datum 1) T1 (nth datum 2) T2 (nth datum 3) L (nth datum 4) H (nth datum 5)
        rd (rand-int 3)
        angka (cond
                (= rd 0) H
                (= rd 1) A
                (= rd 2) L
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Laju aliran kalor melalui suatu jendela kaca yang tebalnya " L " mm, luas permukaannya " A "
                               $m^2$, konduktifitas termalnya " k " W/mK dan suhu permukaan luar dan dalamnya berturut-turut
                               " T1 " $^oC$ dan " T2 " $^oC$ adalah ... watt.")
                 (= rd 1) (str "Pada kaca berketebalan " L " mm dan konduktifitas termalnya " k " W/mK terjadi alirran kalor
                               sebesar " H " joule/sekon. Jika suhu permukaan dalam dan luar kaca tersebut berturut-turut
                               " T1 " $^oC$ dan " T2 " $^oC$ maka luas permukaan kaca tersebut adalah ... $m^2$.")
                 (= rd 2) (str "Perpindahan kalor pada permukaan kaca dengan luas " A " $m^2$ yang konduktifitas termalnya
                               " k " W/mK adalah " H " J/s. Jika temperatur luar dan dalam kaca tersebut berturut-turut
                               " T2 " $^oC$ dan " T1 " $^oC$ maka ketebalan kaca tersebut adalah ... milimeter.")
               )
        :pilihan (fnc/create-option3 angka 1 jwb)
        :jawaban jwb
        }))
(defn C1A2FHED-2 []
  "Konduksi"
  (let [data (read-string (slurp "data/fis1013/C1A2FHED-2.txt"))
        datum (nth data (rand-int (count data)))
        A1 (nth datum 0) A2 (nth datum 1) L1 (nth datum 2) L2 (nth datum 3) pH (nth datum 4)
        spH (fnc/sbanding pH)
        rd (rand-int 3)
        angka (cond
                (= rd 0) pH
                (= rd 1) (/ A1 A2)
                (= rd 2) (/ L1 L2)
              )
        jwb (fnc/jawaban)
       ]
       {:soal (cond

                (= rd 0) (str "Dua batang logam sejenis A dan B panjangnya berbanding " L1 " : " L2 ", luas penampangnya berbanding
                               " A1 " : " A2 ". Jika perbedaan suhu diantara ujung-ujung batang A dan B sama, maka laju aliran kalor
                               antara ujung-ujung A dan B berbanding sebagai ...")
                (= rd 1) (str "Dua batang logam sejenis A dan B panjangnya berbanding " L1 " : " L2 " dan perbedaan suhu
                              diantara ujung-ujung batang A dan B sama. Jika laju aliran kalor
                               antara ujung-ujung A dan B berbanding sebagai " spH " maka perbandingan luas
                              penampang A dan B adalah ...")
                (= rd 2) (str "Dua batang logam sejenis A dan B luas penampangnya berbanding " A1 " : " A2 " dan perbedaan suhu
                               diantara ujung-ujung batang A dan B sama. Jika laju aliran kalor
                               antara ujung-ujung A dan B berbanding sebagai " spH " maka perbandingan panjang batang
                              A dan B adalah ...")
               )
        :pilihan (fnc/create-option9 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHED []
  "Suhu dan Kalor - Perpindahan Kalor"
  ;(C1A2FHED-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1A2FHED-" x))))))

(defn C1A2FHEE-0 []
  "Konduksi antar dua logam"
  (let [data (read-string (slurp "data/fis1013/C1A2FHEE-0.txt"))
        datum (nth data (rand-int (count data)))
        T1 (nth datum 0) T2 (nth datum 1) mk (nth datum 2) T (nth datum 3)
        rd (rand-int 3)
        angka (cond
                (= rd 0) T
                (= rd 1) T1
                (= rd 2) T2
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Dua batang logam A dan B yang ukurannya sama tetapi jenisnya berbeda, ditempelkan
                               seperti pada gambar di bawah. Jika suhu ujung kiri batang A " T1 " $^oC$, suhu ujung kanan
                               batang B " T2 " $^oC$, dan konduktivitas termal batang B " mk " kali batang A, maka suhu
                               pada batas batang A dan B adalah ... $^oC$.")
                 (= rd 1) (str "Dua batang logam A dan B yang ukurannya sama tetapi jenisnya berbeda, ditempelkan
                               seperti pada gambar di bawah. Jika suhu ujung kanan batang B " T2 " $^oC$, suhu pada batas
                               batang A dan B " T " $^oC$, dan konduktivitas termal batang B " mk " kali batang A, maka suhu
                               pada ujung kiri batang A adalah ... $^oC$.")
                 (= rd 2) (str "Dua batang logam A dan B yang ukurannya sama tetapi jenisnya berbeda, ditempelkan
                               seperti pada gambar di bawah. Jika suhu ujung kiri batang A " T1 " $^oC$, suhu pada batas
                               batang A dan B " T " $^oC$, dan konduktivitas termal batang B " mk " kali batang A, maka suhu
                               pada ujung kanan batang B adalah ... $^oC$.")
               )
        :pictures [
                   {:obj 5 :param "#d3d3d3,140,080,060,030"},
                   {:obj 5 :param "#000000,201,080,060,030"},
                   {:obj 8 :param "#000000,170,120,A"},
                   {:obj 8 :param "#000000,230,120,B"}
                   ]
        :pilihan (fnc/create-option3 angka 1 jwb)
        :jawaban jwb
        }))
(defn C1A2FHEE []
  "Suhu dan Kalor - Perpindahan Kalor"
  (C1A2FHEE-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FHEE-" x))))))

(defn C1A2FHEG-0 []
  "Konduksi"
  (let [data (read-string (slurp "data/fis1013/C1A2FHEG-0.txt"))
        datum (nth data (rand-int (count data)))
        A1 (nth datum 0) A2 (nth datum 1) T1 (nth datum 2) T2 (nth datum 3) pH (nth datum 4)
        spH (fnc/sbanding pH)
        rd (rand-int 3)
        angka (cond
                (= rd 0) pH
                (= rd 1) (/ A1 A2)
                (= rd 2) (/ T1 T2)
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Dua buah permukaan sejenis A dan B memiliki perbandingan luas penampang " A1 " : " A2 " dan
                               suhu mutlak " T1 " : " T2 ". Perbandingan pancaran kalor antara permukaan A dan B adalah ...")
                 (= rd 1) (str "Perbandingan pancaran kalor antara dua permukaan A dan B yang sejenis adalah " spH " Jika
                               suhu mutlak permukaan A dan B berbanding " T1 " : " T2 " maka perbandingan luas penampang A dan B
                               adalah ...")
                 (= rd 2) (str "Perbandingan luas permukaan logam A dan B yang sejenis adalah " A1 " : " A2 ". Jika pancaran kalor
                               permukaan logam A dan B adalah " spH " maka suhu mutlak permukaan A dan B berbanding ...")
               )
        :pilihan (fnc/create-option9 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHEG-1 []
  "Konduksi"
  (let [data (read-string (slurp "data/fis1013/C1A2FHEG-1.txt"))
        datum (nth data (rand-int (count data)))
        A1 (nth datum 0) A2 (nth datum 1) e1 (nth datum 2) e2 (nth datum 3) pH (nth datum 4)
        spH (fnc/sbanding pH)
        rd (rand-int 3)
        angka (cond
                (= rd 0) pH
                (= rd 1) (/ A1 A2)
                (= rd 2) (/ e1 e2)
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Dua buah permukaan A dan B yang suhunya mutlaknya sama memiliki perbandingan luas penampang
                               " A1 " : " A2 " dan
                               emisivitas " e1 " : " e2 ". Perbandingan pancaran kalor antara permukaan A dan B adalah ...")
                 (= rd 1) (str "Perbandingan pancaran kalor antara dua permukaan A dan B adalah " spH " Jika
                               suhu mutlak permukaan A dan B sama dan emisivitas A dan B berbanding sebagai " e1 " : " e2 ", maka
                               perbandingan luas permukaan A dan B adalah ...")
                 (= rd 2) (str "Perbandingan luas permukaan A logam A dan B yang suhunya mutlaknya sama adalah " A1 " : " A2 ".
                               Jika perbandinga pancaran
                               kalor permukaan logam A dan B adalah " spH " maka emisivitas panas A dan B berbanding sebagai ...")
               )
        :pilihan (fnc/create-option9 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHEG-2 []
  "Konduksi"
  (let [data (read-string (slurp "data/fis1013/C1A2FHEG-2.txt"))
        datum (nth data (rand-int (count data)))
        r1 (nth datum 0) r2 (nth datum 1) T1 (nth datum 2) T2 (nth datum 3) pH (nth datum 4)
        spH (fnc/sbanding pH)
        rd (rand-int 3)
        angka (cond
                (= rd 0) pH
                (= rd 1) (/ r1 r2)
                (= rd 2) (/ T1 T2)
               )
        jwb (fnc/jawaban)
       ]
       {:soal (cond
                 (= rd 0) (str "Dua buah bola logam sejenis A dan B memiliki perbandingan jejari " r1 " : " r2 " dan
                               suhu mutlak " T1 " : " T2 ". Perbandingan pancaran kalor antara permukaan A dan B adalah ...")
                 (= rd 1) (str "Perbandingan pancaran kalor antara dua bola logam  A dan B yang sejenis adalah " spH " Jika
                               suhu mutlak bola A dan B berbanding " T1 " : " T2 " maka perbandingan jejari bola A dan B
                               adalah ...")
                 (= rd 2) (str "Perbandingan jejari bola logam  A dan B yang sejenis adalah " r1 " : " r2 ". Jika pancaran kalor
                               bola logam A dan B adalah " spH " maka suhu mutlak bola A dan B berbanding sebagai ...")
               )
        :pilihan (fnc/create-option9 angka jwb)
        :jawaban jwb
        }))
(defn C1A2FHEG []
  "Suhu dan Kalor - Perpindahan Kalor"
  (C1A2FHEG-2))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C1A2FHEG-" x))))))
