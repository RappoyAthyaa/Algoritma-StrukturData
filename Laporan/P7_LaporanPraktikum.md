|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020063 |
| Nama |  Ahmad Raffie Athaya H. |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/RappoyAthyaa/Algoritma-StrukturData) |

# Jobsheet #5 BRUTE FORCE DAN DIVIDE CONQUER

## 7.2 Percobaan 1

### 7.2.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (MahasiswaBerprestasi02)
```
package P6;

public class MahasiswaBerprestasi02 {
    Mahasiswa02[] listMhs;
    int idx;

    void setUkuran(int n) {
        listMhs = new Mahasiswa02[n];
    }

    void tambah(Mahasiswa02 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa02 m : listMhs) {
            m.tampilkanInformasi();
            System.out.println("----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa02 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa02 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa02 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :" +x+ " ditemukan pada indeks " + pos );
        }
        else {
            System.out.println("data " +x+ "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos !=-1) {
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditemukan");
        }
    }
}
```

➡ Kode program untuk percobaan 1 (MahasiswaDemo02 (Main))

```
package P6;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();
        Scanner rappyAthya = new Scanner(System.in);
        int jumMhs=5;

        list.setUkuran(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = rappyAthya.nextLine();
            System.out.print("Nama    : ");
            String nama = rappyAthya.nextLine();
            System.out.print("Kelas   : ");
            String kelas = rappyAthya.nextLine();
            System.out.print("IPK     : ");
            String ip = rappyAthya.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------");
            list.tambah (new Mahasiswa02(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("-----------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = rappyAthya.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
```

### 7.2.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
Masukkan Data Mahasiswa ke-1
NIM     : 111
Nama    : adi
Kelas   : 2
IPK     : 3.1
--------------------------------
Masukkan Data Mahasiswa ke-2
NIM     : 222
Nama    : ila
Kelas   : 2
IPK     : 3.2
--------------------------------
Masukkan Data Mahasiswa ke-3
NIM     : 333
Nama    : lia
Kelas   : 2
IPK     : 3.3
--------------------------------
Masukkan Data Mahasiswa ke-4
NIM     : 444
Nama    : susi
Kelas   : 2
IPK     : 3.5
--------------------------------
Masukkan Data Mahasiswa ke-5
NIM     : 555   
Nama    : anita
Kelas   : 2
IPK     : 3.7
--------------------------------
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.1
----------------------
Nama: ila
NIM: 222
Kelas: 2
IPK: 3.2
----------------------
Nama: lia
NIM: 333
Kelas: 2
IPK: 3.3
----------------------
Nama: susi
NIM: 444
Kelas: 2
IPK: 3.5
----------------------
Nama: anita
NIM: 555
Kelas: 2
IPK: 3.7
----------------------
-----------------------------------------------------
Pencarian data
-----------------------------------------------------
masukkan ipk mahasiswa yang dicari: 
IPK: 3,7
menggunakan sequential searching
data mahasiswa dengan IPK :3.7 ditemukan pada indeks 4
nim      : 555
nama     : anita
kelas    : 2
ipk      : 3.7
PS C:\Project2026\Algoritma-StrukturData> 
```

### 7.2.3 Pertanyaan

    1. Jelaskan perbedaan metod tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
        : tampilPosisi hanya menampilkan informasi posisi/indeks tempat data ditemukan. Outputnya berupa pesan sederhana seperti 
          "data mahasiswa dengan IPK 3.5 ditemukan pada indeks 2" atau pesan tidak ditemukan.
          Sedangkan tampilDataSearch menampilkan detail lengkap data mahasiswa (NIM, nama, kelas, IPK) yang berada pada indeks hasil pencarian tersebut. 
          Fungsi ini menggunakan pos sebagai acuan untuk mengakses elemen listMhs[pos] dan menampilkan atribut-atributnya.

          Singkatnya: tampilPosisi → di mana datanya, tampilDataSearch → apa isi datanya.

    2. Jelaskan fungsi break pada kode program di bawah ini! 
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        : break berfungsi menghentikan perulangan for secara paksa begitu data yang dicari pertama kali ditemukan. 
          Tanpa break, loop akan terus berjalan hingga indeks terakhir meskipun data sudah ketemu, yang berarti membuang waktu dan sumber daya secara sia-sia.

    3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
        : Variabel pos menyimpan nilai indeks array tempat data yang cocok berada. Fungsinya sebagai "penunjuk lokasi" data dalam array listMhs.

            - Jika ditemukan → pos berisi angka ≥ 0 (misal 2), sehingga program bisa mengakses listMhs[2] untuk menampilkan detail data
            - Jika tidak ditemukan → pos bernilai -1 sebagai tanda bahwa pencarian gagal

          Nilai -1 dipilih karena tidak mungkin menjadi indeks array yang valid (indeks selalu dimulai dari 0), sehingga aman digunakan sebagai penanda "tidak ditemukan".

    4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.
        : Program akan menampilkan data yang pertama ditemukan, yaitu data dengan indeks terkecil (paling depan dalam array).
          Hal ini terjadi karena adanya perintah break — begitu kondisi listMhs[j].ipk == cari terpenuhi untuk pertama kalinya, 
          nilai posisi langsung disimpan dan loop langsung berhenti. Data duplikat di indeks berikutnya tidak pernah diperiksa.

    5. Berkaitan dengan pertanyaan nomor 2 di atas, apa yang terjadi jika perintah break dihapus dari kode di atas?
        : Loop akan terus berjalan hingga elemen terakhir array. Jika ada beberapa data dengan IPK yang sama, nilai posisi akan terus ditimpa 
          setiap kali ditemukan kecocokan. Akibatnya, yang tersimpan di posisi adalah indeks terakhir dari data yang cocok, bukan yang pertama.
          Selain itu, performa menjadi lebih lambat karena iterasi tidak berhenti meski data sudah ditemukan.

## 7.3 Percobaan 2

### 7.3.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 2 (MahasiswaBerprestasi02)
```
package P6;

public class MahasiswaBerprestasi02 {
    Mahasiswa02[] listMhs;
    int idx;

    void setUkuran(int n) {
        listMhs = new Mahasiswa02[n];
    }

    void tambah(Mahasiswa02 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa02 m : listMhs) {
            m.tampilkanInformasi();
            System.out.println("----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa02 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa02 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa02 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :" +x+ " ditemukan pada indeks " + pos );
        }
        else {
            System.out.println("data " +x+ "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos !=-1) {
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid =(left+right)/2;
            if (cari ==listMhs[mid].ipk) {
                return (mid);
            }
            else if (listMhs[mid].ipk>cari) {
                return findBinarySearch(cari, left, mid-1);
            }
            else {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}
```

➡ Kode program untuk percobaan 2 (MahasiswaDemo02 (Main))

```
package P6;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();
        Scanner rappyAthya = new Scanner(System.in);
        int jumMhs=5;

        list.setUkuran(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = rappyAthya.nextLine();
            System.out.print("Nama    : ");
            String nama = rappyAthya.nextLine();
            System.out.print("Kelas   : ");
            String kelas = rappyAthya.nextLine();
            System.out.print("IPK     : ");
            String ip = rappyAthya.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------");
            list.tambah (new Mahasiswa02(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("-----------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = rappyAthya.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        System.out.println("--------------------------------");

        System.out.println("-----------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari1 = rappyAthya.nextDouble();
         System.out.println("--------------------------------");
         System.out.println("menggunakan binary search");
         System.out.println("--------------------------------");
         double posisi2 = list.findBinarySearch(cari1, 0, jumMhs-1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari1, pss2);
        list.tampilDataSearch(cari1, pss2);
    }
}
```

### 7.3.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2
```
Masukkan Data Mahasiswa ke-1
NIM     : 111
Nama    : adi
Kelas   : 2
IPK     : 3.1
--------------------------------
Masukkan Data Mahasiswa ke-2
NIM     : 222
Nama    : ila 
Kelas   : 2
IPK     : 3.2
--------------------------------
Masukkan Data Mahasiswa ke-3
NIM     : 333
Nama    : lia
Kelas   : 2
IPK     : 3.3
--------------------------------
Masukkan Data Mahasiswa ke-4
NIM     : 444
Nama    : susi
Kelas   : 2
IPK     : 3.5
--------------------------------
Masukkan Data Mahasiswa ke-5
NIM     : 555
Nama    : anita
Kelas   : 2
IPK     : 3.7
--------------------------------
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.1
----------------------
Nama: ila
NIM: 222
Kelas: 2
IPK: 3.2
----------------------
Nama: lia
NIM: 333
Kelas: 2
IPK: 3.3
----------------------
Nama: susi
NIM: 444
Kelas: 2
IPK: 3.5
----------------------
Nama: anita
NIM: 555
Kelas: 2
IPK: 3.7
----------------------
-----------------------------------------------------
Pencarian data
-----------------------------------------------------
masukkan ipk mahasiswa yang dicari: 
IPK: 3,7
menggunakan sequential searching
data mahasiswa dengan IPK :3.7 ditemukan pada indeks 4
nim      : 555
nama     : anita
kelas    : 2
ipk      : 3.7
--------------------------------
-----------------------------------------------------
Pencarian Data
-----------------------------------------------------
masukkan ipk mahasiswa yang dicari: 
IPK: 3,7
--------------------------------
menggunakan binary search
--------------------------------
data mahasiswa dengan IPK :3.7 ditemukan pada indeks 4
nim      : 555
nama     : anita
kelas    : 2
ipk      : 3.7
PS C:\Project2026\Algoritma-StrukturData> 
```

### 7.3.3 Pertanyaan

    1. Tunjukkan pada kode program yang mana proses divide dijalankan!
        : Proses divide (pembagian) terjadi pada baris ini:
            mid = (left + right) / 2;

          Di sinilah array "dibagi" menjadi dua bagian dengan mencari titik tengah. Kemudian dilanjutkan dengan memilih salah satu bagian:
            else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1); // ambil bagian KIRI
            } else {
                return findBinarySearch(cari, mid + 1, right); // ambil bagian KANAN
            }

    2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
        : Proses conquer (penyelesaian masalah) terjadi ketika data ditemukan:
            if (cari == listMhs[mid].ipk) {
                return mid; // ← data ditemukan, kembalikan posisinya
            }

          Dan juga ketika kondisi basis tercapai (data tidak ditemukan):
            return -1;

    3. Apa fungsi left, right, dan mid?
        : Jadi Fungsi variabel left adalah Batas indeks kiri (awal) dari area pencarian saat ini, right adalah Batas indeks kanan (akhir) dari area pencarian saat ini,
          dan terakhir mid adalah Indeks tengah hasil perhitungan (left+right)/2, digunakan sebagai titik pembanding.

    4. Jika data IPK yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa demikian?
        : Program tetap bisa berjalan tanpa error, namun hasilnya bisa salah (tidak akurat). 
          Binary search mengasumsikan data sudah terurut — ia memutuskan untuk bergerak ke kiri atau kanan berdasarkan perbandingan nilai mid. 
          Jika data tidak urut, keputusan arah pencarian menjadi keliru sehingga data yang sebenarnya ada bisa dinyatakan tidak ditemukan.

    5. Jika IPK yang dimasukkan dari IPK terbesar ke terkecil (misal: 3.8, 3.7, 3.5, 3.4, 3.2) dan elemen
       yang dicari adalah 3.2. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka
       ubahlah kode program binary seach agar hasilnya sesuai
        : Karena data di program ini sudah diurutkan descending oleh bubbleSort() dan insertionSort(), maka kondisi perbandingan arah pencarian harus dibalik seperti di atas.
          Kode program untuk pertanyaan ke-5 Percobaan 2 (MahasiswaBerprestasi02)
```
package P6;

public class MahasiswaBerprestasi02 {
    Mahasiswa02[] listMhs;
    int idx;

    void setUkuran(int n) {
        listMhs = new Mahasiswa02[n];
    }

    void tambah(Mahasiswa02 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa02 m : listMhs) {
            m.tampilkanInformasi();
            System.out.println("----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa02 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa02 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa02 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :" +x+ " ditemukan pada indeks " + pos );
        }
        else {
            System.out.println("data " +x+ "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos !=-1) {
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid =(left+right)/2;
            if (cari ==listMhs[mid].ipk) {
                return (mid);
            }
            else if (listMhs[mid].ipk < cari) {
                return findBinarySearch(cari, left, mid-1);
            }
            else {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}
```

          Hasil kode program untuk pertanyaan ke-5 percobaan 2 
```
Masukkan Data Mahasiswa ke-1
NIM     : 111
Nama    : adi
Kelas   : 2
IPK     : 3.1
--------------------------------
Masukkan Data Mahasiswa ke-2
NIM     : 222
Nama    : ila
Kelas   : 2
IPK     : 3.2
--------------------------------
Masukkan Data Mahasiswa ke-3
NIM     : 333
Nama    : lia
Kelas   : 2
IPK     : 3.3
--------------------------------
Masukkan Data Mahasiswa ke-4
NIM     : 444
Nama    : susi
Kelas   : 2
IPK     : 3.5
--------------------------------
Masukkan Data Mahasiswa ke-5
NIM     : 555
Nama    : anita
Kelas   : 2
IPK     : 3.7
--------------------------------
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.1
----------------------
Nama: ila
NIM: 222
Kelas: 2
IPK: 3.2
----------------------
Nama: lia
NIM: 333
Kelas: 2
IPK: 3.3
----------------------
Nama: susi
NIM: 444
Kelas: 2
IPK: 3.5
----------------------
Nama: anita
NIM: 555
Kelas: 2
IPK: 3.7
----------------------
-----------------------------------------------------
Pencarian data
-----------------------------------------------------
masukkan ipk mahasiswa yang dicari: 
IPK: 3.7
menggunakan sequential searching
data mahasiswa dengan IPK :3.7 ditemukan pada indeks 4
nim      : 555
nama     : anita
kelas    : 2
ipk      : 3.7
--------------------------------
-----------------------------------------------------
Pencarian Data
-----------------------------------------------------
masukkan ipk mahasiswa yang dicari: 
IPK: 3.7
--------------------------------
menggunakan binary search
--------------------------------
data 3.7tidak ditemukan
Data mahasiswa dengan IPK 3.7 tidak ditemukan
PS C:\Project2026\Algoritma-StrukturData> 
```

    6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array.
        : Binary search menentukan data tidak ditemukan melalui kondisi basis rekursi:
            if (right >= left) { // selama area pencarian masih valid...
            // ...lakukan pencarian
            }
            return -1; // jika right < left, area habis → tidak ditemukan
        Setiap pemanggilan rekursif, area pencarian menyempit setengahnya. Jika cari tidak pernah cocok dengan listMhs[mid].ipk, maka:
          - left terus bertambah, atau right terus berkurang
          - Hingga akhirnya right < left — artinya tidak ada lagi elemen yang bisa diperiksa
          - Saat itulah return -1 dieksekusi sebagai tanda data tidak ditemukan

    7. Modifikasi program di atas yang mana jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard.
        : Kode program untuk pertanyaan ke-5 Percobaan 2 (MahasiswaDemo02 (Main))
```
package P6;

public class MahasiswaBerprestasi02 {
    Mahasiswa02[] listMhs;
    int idx;

    void setUkuran(int n) {
        listMhs = new Mahasiswa02[n];
    }

    void tambah(Mahasiswa02 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa02 m : listMhs) {
            m.tampilkanInformasi();
            System.out.println("----------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - i; j++) {
                if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                    Mahasiswa02 tmp = listMhs[j];
                    listMhs[j] = listMhs[j - 1];
                    listMhs[j - 1] = tmp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa02 tmp = listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa02 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk==cari) {
                posisi=j;
                break;
            }
        }
        return posisi;
    }

    void tampilPosisi(double x, int pos){
        if (pos!=-1) {
            System.out.println("data mahasiswa dengan IPK :" +x+ " ditemukan pada indeks " + pos );
        }
        else {
            System.out.println("data " +x+ "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos !=-1) {
            System.out.println("nim\t : "+listMhs[pos].nim);
            System.out.println("nama\t : "+listMhs[pos].nama);
            System.out.println("kelas\t : "+listMhs[pos].kelas);
            System.out.println("ipk\t : "+x);
        }
        else {
            System.out.println("Data mahasiswa dengan IPK " +x+ " tidak ditemukan");
        }
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right>=left) {
            mid =(left+right)/2;
            if (cari ==listMhs[mid].ipk) {
                return (mid);
            }
            else if (listMhs[mid].ipk < cari) {
                return findBinarySearch(cari, left, mid-1);
            }
            else {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }
}
```
         Hasil kode program untuk pertanyaan ke-5 percobaan 2 
```
Masukkan jumlah mahasiswa: 5
Masukkan Data Mahasiswa ke-1
NIM     : 111
Nama    : adi
Kelas   : 2
IPK     : 3.1
--------------------------------
Masukkan Data Mahasiswa ke-2
NIM     : 222
Nama    : ila
Kelas   : 2
IPK     : 3.2
--------------------------------
Masukkan Data Mahasiswa ke-3
NIM     : 333
Nama    : lia
Kelas   : 2
IPK     : 3.3
--------------------------------
Masukkan Data Mahasiswa ke-4
NIM     : 444
Nama    : susi
Kelas   : 2
IPK     : 3.5
--------------------------------
Masukkan Data Mahasiswa ke-5
NIM     : 555
Nama    : anita
Kelas   : 2
IPK     : 3.7
--------------------------------
Nama: adi
NIM: 111
Kelas: 2
IPK: 3.1
----------------------
Nama: ila
NIM: 222
Kelas: 2
IPK: 3.2
----------------------
Nama: lia
NIM: 333
Kelas: 2
IPK: 3.3
----------------------
Nama: susi
NIM: 444
Kelas: 2
IPK: 3.5
----------------------
Nama: anita
NIM: 555
Kelas: 2
IPK: 3.7
----------------------
-----------------------------------------------------
Pencarian data
-----------------------------------------------------
masukkan ipk mahasiswa yang dicari: 
IPK: 3.7
menggunakan sequential searching
data mahasiswa dengan IPK :3.7 ditemukan pada indeks 4
nim      : 555
nama     : anita
kelas    : 2
ipk      : 3.7
--------------------------------
-----------------------------------------------------
Pencarian Data
-----------------------------------------------------
masukkan ipk mahasiswa yang dicari: 
IPK: 3.7
--------------------------------
menggunakan binary search
--------------------------------
data 3.7tidak ditemukan
Data mahasiswa dengan IPK 3.7 tidak ditemukan
PS C:\Project2026\Algoritma-StrukturData> 
```