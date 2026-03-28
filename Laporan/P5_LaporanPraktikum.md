|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020063 |
| Nama |  Ahmad Raffie Athaya H. |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/RappoyAthyaa/Algoritma-StrukturData) |

# Jobsheet #5 BRUTE FORCE DAN DIVIDE CONQUER

## 5.2 Percobaan 1

### 5.2.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (Faktorial02)
```
package P5.BruteForceDivineConquer;

public class Faktorial02 {
    
    int faktorialBF(int n) {
        int fakto = 1;
        for (int i = 1; i <= n; i++) {
            fakto = fakto * i;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
```

➡ Kode program untuk percobaan 1 (MainFaktorial02 (Main))

```
package P5.BruteForceDivineConquer;

import java.util.Scanner;

public class MainFaktorial02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
            System.out.print("Masukkan Nilai: ");
            int nilai = rappyAthya.nextInt();

            Faktorial02 fk = new Faktorial02();
            System.out.println("Nilai faktorial " + nilai +
                " Menggunakan BF: " + fk.faktorialBF(nilai));
            System.out.println("Nilai faktorial " + nilai +
                " Menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
```

### 5.2.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
Masukkan Nilai: 5
Nilai faktorial 5 Menggunakan BF: 120
Nilai faktorial 5 Menggunakan DC: 120
PS C:\Project2026\Algoritma-StrukturData> 
```

### 5.2.3 Pertanyaan

    1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan
       perbedaan bagian kode pada penggunaan if dan else!
        : Bagian if dan else pada fungsi faktorialDC dan faktorialBF merupakan dua komponen yang saling melengkapi dalam 
          Algoritma Divide and Conquer. Bagian if memastikan rekursi memiliki titik berhenti yang jelas, sedangkan bagian else 
          bertugas memecah masalah secara bertahap hingga mencapai titik berhenti tersebut. Keduanya bekerja secara 
          bersama-sama sehingga nilai faktorial dari suatu bilangan dapat dihitung dengan benar menggunakan pendekatan rekursif.

    2. Apakah memungkinkan perulangan pada method faktorialBF() diubah selain menggunakan for? Buktikan!
        : Kode program untuk pertanyaan 1 Percobaan 2 (Faktorial02)
```
package P5.BruteForceDivineConquer;

public class Faktorial02 {
    
    int faktorialBF(int n) {
        int fakto = 1;
        int i =1;
        while (i <= n) {
            fakto = fakto * i;
            i++;
        }
        return fakto;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
```
          Hasil kode program untuk pertanyaan 1 percobaan 2
```
Masukkan Nilai: 5
Nilai faktorial 5 Menggunakan BF: 120
Nilai faktorial 5 Menggunakan DC: 120
PS C:\Project2026\Algoritma-StrukturData>
```

    3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !
        : Perbedaan utama keduanya terletak pada pendekatan perhitungan. (fakto *= i) menghitung faktorial secara 
          iteratif dari bawah ke atas menggunakan perulangan, sedangkan (int fakto = n * faktorialDC(n-1)) menghitung 
          faktorial secara rekursif dengan memecah masalah menjadi sub-masalah yang lebih kecil hingga mencapai kondisi dasar. 
          Keduanya menghasilkan nilai yang sama, namun berbeda dalam cara kerja dan penggunaan memori.

    4. Buat Kesimpulan tentang perbedaan cara kerja method faktorialBF() dan faktorialDC()!
        : method faktorialBF() dan faktorialDC() merupakan dua pendekatan berbeda untuk menghitung nilai faktorial dari bilangan bulat positif n.
        
          Method faktorialBF() menggunakan pendekatan Brute Force yang bersifat iteratif, yaitu menghitung faktorial secara berurutan dari 
          i = 1 hingga i = n menggunakan perulangan while. Proses berjalan linear dari bawah ke atas tanpa memanggil fungsi lain, sehingga lebih hemat memori. 

          Sedangkan method faktorialDC() menggunakan pendekatan Divide and Conquer yang bersifat rekursif, yaitu memecah masalah menjadi sub-masalah lebih kecil 
          dengan memanggil dirinya sendiri hingga mencapai base case n == 1, kemudian nilai dikembalikan bertahap hingga menghasilkan nilai akhir.
          
          Pendekatan ini lebih mudah dipahami secara logika, namun membutuhkan memori lebih besar karena setiap pemanggilan rekursif disimpan sementara 
          di dalam call stack.

          Dengan demikian, kedua method menghasilkan nilai yang sama, namun berbeda dalam cara kerja dan efisiensi memori.

## 5.3 Percobaan 2

### 5.3.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 2 (Pangkat02)
```
package P5.BruteForceDivineConquer;

public class Pangkat02 {
    int nilai, pangkat;

    Pangkat02(int n, int p){
        nilai = n;
        pangkat = p;
    }

    int pangkatBF(int a, int n){
        int hasil =1;
        for (int i = 0; i < n; i++) {
            hasil = hasil*a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n){
        if (n==1) {
            return a;
        }else{
            if (n%2==1) {
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a);
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2));
            }
        }
    }
}

```

➡ Kode program untuk percobaan 2 (MainPangkat02 (Main))

```
package P5.BruteForceDivineConquer;

import java.util.Scanner;

public class MainPangkat02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen: ");
        int elemen = rappyAthya.nextInt();

        Pangkat02[] png = new Pangkat02[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan nilai basis elemen ke-"+(i+1)+": ");
            int basis = rappyAthya.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = rappyAthya.nextInt();
            png[i] = new Pangkat02(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat02 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (Pangkat02 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
```

### 5.3.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2 
```
Masukan jumlah elemen: 3
Masukan nilai basis elemen ke-1: 2
Masukan nilai pangkat elemen ke-1: 3
Masukan nilai basis elemen ke-2: 4
Masukan nilai pangkat elemen ke-2: 5
Masukan nilai basis elemen ke-3: 6
Masukan nilai pangkat elemen ke-3: 7
HASIL PANGKAT BRUTEFORCE: 
2^3: 8
4^5: 1024
6^7: 279936
HASIL PANGKAT DIVIDE AND CONQUER: 
2^3: 8
4^5: 1024
6^7: 279936
PS C:\Project2026\Algoritma-StrukturData> 
```

### 5.3.3 Pertanyaan

    1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu pangkatBF() dan pangkatDC()!
        : Perbedaan pangkatBF() dan pangkatDC()

          pangkatBF() — Brute Force
          Menghitung aⁿ dengan cara mengalikan a sebanyak n kali secara berulang menggunakan loop. Kompleksitas waktu O(n).
          pangkatDC() — Divide and Conquer
          Menghitung aⁿ dengan membagi masalah menjadi sub-masalah yang lebih kecil secara rekursif:

          Jika n genap → aⁿ = a^(n/2) × a^(n/2)
          Jika n ganjil → aⁿ = a^(n/2) × a^(n/2) × a

          Kompleksitas waktu O(log n).

    2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!
        : Tahap Combine pada Method pangkatDC()
          Tahap combine sudah termasuk dalam kode pangkatDC(). 
          Metode Divide and Conquer memiliki tiga tahap utama, yaitu Divide, Conquer, dan Combine. Ketiga tahap tersebut dapat diidentifikasi pada kode berikut:

            int pangkatDC(int a, int n){
                if (n==1) {
                    return a;              // BASE CASE
                } else {
                    if (n%2==1) {
                        return (pangkatDC(a, n/2) * pangkatDC(a, n/2) * a);  // Divide, Conquer, Combine
                    } else {
                        return (pangkatDC(a, n/2) * pangkatDC(a, n/2));       // Divide, Conquer, Combine
                    }
                }
            }

    3. Pada method pangkatBF()terdapat parameter untuk melewatkan nilai yang akan dipangkatkan dan pangkat berapa, padahal di sisi lain di class Pangkat 
       telah ada atribut nilai dan pangkat, apakah menurut Anda method tersebut tetap relevan untuk memiliki parameter? Apakah bisa jika method tersebut 
       dibuat dengan tanpa parameter? Jika bisa, seperti apa method pangkatBF() yang tanpa parameter?
        : Parameter pada pangkatBF(int a, int n) kurang relevan karena class Pangkat02 sudah memiliki atribut nilai dan pangkat yang menyimpan data yang sama,
          sehingga menimbulkan redundansi data. Namun, parameter masih dapat dipertahankan apabila method perlu menghitung pangkat dengan nilai yang berbeda dari atribut yang tersimpan.

          Method pangkatBF() Tanpa Parameter
          Method pangkatBF() bisa dibuat tanpa parameter dengan langsung menggunakan atribut nilai dan pangkat yang sudah tersedia di dalam class, seperti berikut:
            int pangkatBF(){
                int hasil = 1;
                for (int i = 0; i < pangkat; i++) {
                    hasil = hasil * nilai;
                }
                return hasil;
            }

          Cara pemanggilannya pada MainPangkat02 pun menjadi lebih sederhana:
            // Sebelum
            p.pangkatBF(p.nilai, p.pangkat);

            // Sesudah
            p.pangkatBF();

    4. Tarik tentang cara kerja method pangkatBF() dan pangkatDC()!
        : pangkatBF() — Brute ForceMethod ini menghitung pangkat dengan cara paling sederhana: kalikan nilai sebanyak pangkat kali menggunakan loop biasa.
          Contoh: 2^5 → loop 5 kali, setiap iterasi kalikan dengan 2.
          Kompleksitas: O(n) — jumlah operasi linear terhadap nilai pangkat.

          pangkatDC(a, n) — Divide & Conquer
          Method ini jauh lebih cerdas. Prinsipnya adalah memecah masalah besar menjadi setengahnya secara rekursif.
          Idenya: a^n = a^(n/2) × a^(n/2) — daripada perkalian n kali, cukup hitung setengahnya lalu kuadratkan hasilnya.
          Dua kasus:
            - Jika n genap → a^(n/2) × a^(n/2)
            - Jika n ganjil → a^(n/2) × a^(n/2) × a (sisa satu faktor ekstra)

          Kompleksitas: O(log n) — jauh lebih efisien!


## 5.4 Percobaan 3

### 5.4.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (Sum02)
```
package P5.BruteForceDivineConquer;

public class Sum02 {
    double keuntungan[];

    Sum02(int el){
        keuntungan = new double[el];
    }
    double totalBF(){
        double total=0;
        for (int i = 0; i < keuntungan.length; i++) {
            total = total+keuntungan[i];
        }
        return total;
    }

    double totalDC(double arr[],int l, int r){
        if (l==r) {
            return arr[l];
        }

        int mid = (l+r)/2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid+1, r);
        return lsum+rsum;
    }
}

```

➡ Kode program untuk percobaan 1 (MainSum02 (Main))

```
package P5.BruteForceDivineConquer;

import java.util.Scanner;

public class MainSum02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = rappyAthya.nextInt();

        Sum02 sm = new Sum02(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = rappyAthya.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan,0, elemen-1));
    }
}
```

### 5.4.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
Masukkan jumlah elemen: 5
Masukkan keuntungan ke-1: 10
Masukkan keuntungan ke-2: 20
Masukkan keuntungan ke-3: 30
Masukkan keuntungan ke-4: 40
Masukkan keuntungan ke-5: 50
Total keuntungan menggunakan Bruteforce: 150.0
Total keuntungan menggunakan Divide and Conquer: 150.0
PS C:\Project2026\Algoritma-StrukturData> 
```

### 5.4.3 Pertanyaan

    1. Kenapa dibutuhkan variable mid pada method TotalDC()?
        : Mengapa membuntuhkan variabel mid karena mid adalah titik pembagi array — ia membelah array menjadi dua bagian 
          yang kemudian dijumlahkan secara rekursif. Tanpa mid, kita tidak tahu di mana harus memotong array menjadi dua bagian.

    2. Untuk apakah statement di bawah ini dilakukan dalam TotalDC()?
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid+1, r);
        : Tujuan dua statement itu:
          Kedua baris itu adalah inti dari strategi Divide & Conquer — tugasnya adalah menyimpan hasil dari dua sub-masalah 
          yang sudah dibagi oleh mid.

          lsum dan rsum adalah "wadah penampung" hasil kerja rekursi kiri dan kanan, supaya keduanya bisa dijumlahkan di baris terakhir. 
          Tanpa dua variabel ini, tidak ada yang bisa dikembalikan ke pemanggil di atasnya.

    3. Kenapa diperlukan penjumlahan hasil lsum dan rsum seperti di bawah ini?
       return lsum+rsum;
        : Alasannya karena: array dipecah dua, maka hasilnya pun harus digabung dua.
          lsum hanya menyimpan jumlah separuh kiri array, dan rsum hanya menyimpan jumlah separuh kanan array. 
          Keduanya masing-masing tidak tahu apa yang ada di sisi lainnya.

          Maka return lsum + rsum adalah satu-satunya cara untuk mendapatkan total keseluruhan.
          Kalau hanya return lsum → separuh kanan array tidak pernah dihitung. Kalau hanya return rsum → separuh kiri array tidak pernah dihitung.

    4. Apakah base case dari totalDC()?
        : Base casenya adalah
            if (l == r) {
                return arr[l];
            }

    5. Tarik Kesimpulan tentang cara kerja totalDC()
        : totalDC() bekerja dalam 3 tahap Divide & Conquer secara rekursif:
          ① DIVIDE — mid = (l+r)/2
            Array terus dipotong menjadi dua bagian yang sama besar di setiap pemanggilan rekursif, sampai tidak bisa dipecah lagi.
          ② CONQUER — if (l==r) return arr[l]
            Ketika sudah tersisa satu elemen (l==r), rekursi berhenti dan langsung mengembalikan nilai elemen tersebut. Inilah base 
            case yang mencegah rekursi tak terbatas.
          ③ COMBINE — return lsum + rsum
            Hasil dari kiri (lsum) dan kanan (rsum) dijumlahkan dan dikembalikan ke pemanggil di atasnya, berlapis-lapis sampai kembali 
            ke pemanggilan pertama dengan total keseluruhan.

          Kesimpulannya: totalDC() tidak menjumlahkan satu per satu seperti loop, melainkan memecah masalah besar menjadi sub-masalah kecil,
          menyelesaikan tiap sub-masalah secara mandiri, lalu menyatukan hasilnya kembali dari bawah ke atas. Hasilnya sama dengan totalBF(), 
          namun pendekatannya berbeda secara fundamental.

### Latihan 1
➡ Kode program untuk Tugas 1 (Mahasiswa02)

```
package P5.BruteForceDivineConquer;

public class Mahasiswa02 {

    String[] nama;
    String[] nim;
    int[] tahunMasuk;
    double[] nilaiUTS;
    double[] nilaiUAS;

    Mahasiswa02(String[] nama, String[] nim, int[] tahunMasuk, double[] nilaiUTS, double[] nilaiUAS) {
        this.nama      = nama;
        this.tahunMasuk = tahunMasuk;
        this.nim       = nim;
        this.nilaiUTS  = nilaiUTS;
        this.nilaiUAS  = nilaiUAS;
    }

    double maxUTSDC(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        double leftMax  = maxUTSDC(arr, l, mid);
        double rightMax = maxUTSDC(arr, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    double minUTSDC(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;

        double leftMin  = minUTSDC(arr, l, mid);
        double rightMin = minUTSDC(arr, mid + 1, r);

        return Math.min(leftMin, rightMin);
    }

    double rataUASBF() {
        double total = 0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            total = total + nilaiUAS[i];
        }
        return total / nilaiUAS.length;
    }
}
```

➡ Kode program untuk Tugas 1 (MainMahasiswa02 (Main))
```
package P5.BruteForceDivineConquer;

public class MainMahasiswa02 {

    public static void main(String[] args) {

        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        String[] nim  = {"220101001", "220101002", "220101003", "220101004",
                          "220101005", "220101006", "220101007", "220101008"};
        int[]    tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
        double[] nilaiUTS   = {78, 85, 90, 76, 92, 88, 80, 82};
        double[] nilaiUAS   = {82, 88, 87, 79, 95, 85, 83, 84};

        Mahasiswa02 mhs = new Mahasiswa02(nama, nim, tahunMasuk, nilaiUTS, nilaiUAS);

        int n = nilaiUTS.length;

        double maxUTS = mhs.maxUTSDC(nilaiUTS, 0, n - 1);
        System.out.println("=== a) Nilai UTS Tertinggi (Divide and Conquer) ===");
        System.out.println("Nilai UTS Tertinggi : " + maxUTS);

        System.out.print("Nama Mahasiswa      : ");
        for (int i = 0; i < n; i++) {
            if (nilaiUTS[i] == maxUTS) {
                System.out.println(nama[i] + " (NIM: " + nim[i] + ")");
            }
        }
        System.out.println();

        double minUTS = mhs.minUTSDC(nilaiUTS, 0, n - 1);
        System.out.println("=== b) Nilai UTS Terendah (Divide and Conquer) ===");
        System.out.println("Nilai UTS Terendah  : " + minUTS);

        System.out.print("Nama Mahasiswa      : ");
        for (int i = 0; i < n; i++) {
            if (nilaiUTS[i] == minUTS) {
                System.out.println(nama[i] + " (NIM: " + nim[i] + ")");
            }
        }
        System.out.println();

        double rataUAS = mhs.rataUASBF();
        System.out.println("=== c) Rata-rata Nilai UAS (Brute Force) ===");
        System.out.printf("Rata-rata Nilai UAS : %.2f%n", rataUAS);
    }
}
```

➡ Hasil kode program untuk Tugas 1 (MainMahasiswa02 (Main))
```
=== a) Nilai UTS Tertinggi (Divide and Conquer) ===
Nilai UTS Tertinggi : 92.0
Nama Mahasiswa      : Eko (NIM: 220101005)

=== b) Nilai UTS Terendah (Divide and Conquer) ===
Nilai UTS Terendah  : 76.0
Nama Mahasiswa      : Dian (NIM: 220101004)

=== c) Rata-rata Nilai UAS (Brute Force) ===
Rata-rata Nilai UAS : 85,38
PS C:\Project2026\Algoritma-StrukturData> 
```