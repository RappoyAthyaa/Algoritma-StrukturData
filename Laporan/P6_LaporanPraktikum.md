|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020063 |
| Nama |  Ahmad Raffie Athaya H. |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/RappoyAthyaa/Algoritma-StrukturData) |

# Jobsheet #6 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

## 6.2 Percobaan 1

### 6.2.1 Langkah-langkah Percobaan
#### a. SORTING – BUBBLE SORT
➡ Kode program untuk percobaan 1 a (Sorting02)
```
package P6;

public class Sorting02 {

    int [] data;
    int jumData;

    Sorting02 (int Data[], int jmlDat){
        jumData=jmlDat;
        data=new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i]=Data[i];
        }
    }

    void bubbleSort(){
        int temp=0;
        for (int i = 0; i < jumData-1; i++) {
            for (int j = 1; j < jumData-i; j++) {
                if (data[j-1]>data[j]){
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }

    void tampil(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
```

➡ Kode program untuk percobaan 1 a (SortingMain02 (Main))

```
package P6;

public class SortingMain02 {
    public static void main(String[] args) {
        int a[]= {20, 10, 2, 7, 12};
        Sorting02 dataurut1 = new Sorting02(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }
}

```

### 6.2.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 a
```
Data awal 1
20 10 2 7 12 
Data sudah diurutkan dengan BUBBLE SORT (ASC)
2 7 10 12 20 
PS C:\Project2026\Algoritma-StrukturData>
```

#### b. SORTING – SELECTION SORT
➡ Kode program untuk percobaan 1 b (Sorting02)
```
package P6;

public class Sorting02 {

    int [] data;
    int jumData;

    Sorting02 (int Data[], int jmlDat){
        jumData=jmlDat;
        data=new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i]=Data[i];
        }
    }

    void bubbleSort(){
        int temp=0;
        for (int i = 0; i < jumData-1; i++) {
            for (int j = 1; j < jumData-i; j++) {
                if (data[j-1]>data[j]){
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i = 0; i < jumData-1; i++) {
            int min=i;
            for (int j = i+1; j < jumData; j++) {
                if (data[j]<data[min]) {
                    min=j;
                }
            }
            int temp=data[i];
            data[i]=data[min];
            data[min]=temp;
        }
    }

    void tampil(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
```

➡ Kode program untuk percobaan 1 b (SortingMain02 (Main))

```
package P6;

public class SortingMain02 {
    public static void main(String[] args) {
        int a[]= {20, 10, 2, 7, 12};
        int b[]= {30, 20, 2, 8, 14};
        Sorting02 dataurut1 = new Sorting02(a, a.length);
        Sorting02 dataurut2 = new Sorting02(b, b.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.bubbleSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
    }
}
```

### 6.2.3 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 b
```
Data awal 2
30 20 2 8 14 
Data sudah diurutkan dengan SELECTION SORT (ASC)
2 8 14 20 30 
PS C:\Project2026\Algoritma-StrukturData>
```

#### c. SORTING – INSERTION SORT
➡ Kode program untuk percobaan 1 c (Sorting02)
```
package P6;

public class Sorting02 {

    int [] data;
    int jumData;

    Sorting02 (int Data[], int jmlDat){
        jumData=jmlDat;
        data=new int[jmlDat];
        for (int i = 0; i < jumData; i++) {
            data[i]=Data[i];
        }
    }

    void bubbleSort(){
        int temp=0;
        for (int i = 0; i < jumData-1; i++) {
            for (int j = 1; j < jumData-i; j++) {
                if (data[j-1]>data[j]){
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }

    void SelectionSort(){
        for (int i = 0; i < jumData-1; i++) {
            int min=i;
            for (int j = i+1; j < jumData; j++) {
                if (data[j]<data[min]) {
                    min=j;
                }
            }
            int temp=data[i];
            data[i]=data[min];
            data[min]=temp;
        }
    }

    void insertionSort(){
        for (int i = 1; i < data.length-1; i++) {
            int temp=data[i];
            int j=i-1;
            while (j>=0 && data[j]>temp){
                data[j+1]=data[j];
                j--;
            }
            data[j+1]=temp;
        }
    }

    void tampil(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
```

➡ Kode program untuk percobaan 1 c (SortingMain02 (Main))

```
package P6;

public class SortingMain02 {
    public static void main(String[] args) {
        int a[]= {20, 10, 2, 7, 12};
        int b[]= {30, 20, 2, 8, 14};
        int c[]= {40, 10, 4, 9, 3};

        Sorting02 dataurut1 = new Sorting02(a, a.length);
        Sorting02 dataurut2 = new Sorting02(b, b.length);
        Sorting02 dataurut3 = new Sorting02(c, c.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.bubbleSort();
        System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.bubbleSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}
```

### 6.2.4 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 c
```
Data awal 3
40 10 4 9 3 
Data sudah diurutkan dengan INSERTION SORT (ASC)
3 4 9 10 40 
PS C:\Project2026\Algoritma-StrukturData>
```

### 6.2.5 Pertanyaan

    1. Jelaskan fungsi kode program berikut
        if (data[j-1]>data[j]){
            temp=data[j];
            data[j]=data[j-1];
            data[j-1]=temp;
        }
        : Kode tersebut adalah proses pertukaran (swap) dua elemen array yang merupakan inti dari algoritma Bubble Sort.
          Cara Kerjanya:
            Kondisi pengecekan:
                ( if (data[j-1] > data[j]) )
            Mengecek apakah elemen sebelumnya lebih besar dari elemen saat ini. Jika ya, maka kedua elemen ditukar posisinya.

    2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada selection sort!
        : Berikut bagian kode yang merupakan pencarian nilai minimum:
                int min = i;                        // ← Asumsikan indeks minimum adalah i (posisi saat ini)
                for (int j = i+1; j < jumData; j++) {
                    if (data[j] < data[min]) {      // ← Bandingkan elemen j dengan elemen minimum saat ini
                        min = j;                    // ← Update indeks minimum jika ditemukan yang lebih kecil
                }
            }

    3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan
       ( while (j>=0 && data[j]>temp) )
        : Kondisi while (j >= 0 && data[j] > temp) tersebut, berfungsi untuk menggeser elemen-elemen yang lebih besar ke kanan selama masih 
          dalam batas array, guna mencari posisi yang tepat untuk menyisipkan nilai temp.

    4. Pada Insertion sort, apakah tujuan dari perintah ( data[j+1]=data[j]; ) 
        : data[j+1] = data[j] adalah perintah untuk menggeser elemen yang lebih besar ke kanan, sehingga nilai temp dapat disisipkan di posisi 
          yang benar untuk menjaga urutan array tetap terurut.


## 6.3 Percobaan 2

### 6.3.2 Langkah-langkah Percobaan

➡ Kode program untuk percobaan 2 (Mahasiswa02)
```
package P6;

public class Mahasiswa02 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa02() {

    }

    Mahasiswa02(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }
}
```

➡ Kode program untuk percobaan 2 (MahasiswaBerprestasi02)

```
package P6;

public class MahasiswaBerprestasi02 {
    Mahasiswa02 [] listMhs = new Mahasiswa02[5];
    int idx;

    void tambah (Mahasiswa02 m) {
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil (){
        for (Mahasiswa02 m : listMhs) {
            m.tampilkanInformasi();
            System.out.println("----------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa02 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
}
```

➡ Kode program untuk percobaan 2 (MahasiswaDemo02 (Main))

```
package P6;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
    MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();
    Mahasiswa02 m1 = new Mahasiswa02("123", "Zidan", "2A", 3.2);
    Mahasiswa02 m2 = new Mahasiswa02("124", "Ayu", "2A", 3.5);
    Mahasiswa02 m3 = new Mahasiswa02("125", "Sofi", "2A", 3.1);
    Mahasiswa02 m4 = new Mahasiswa02("126", "Sita", "2A", 3.9);
    Mahasiswa02 m5 = new Mahasiswa02("127", "Miki", "2A", 3.7);

    list.tambah(m1);
    list.tambah(m2);
    list.tambah(m3);
    list.tambah(m4);
    list.tambah(m5);

    System.out.println("Data mahasiswa sebelum sorting: ");
    list.tampil();

    System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
    list.bubbleSort();
    list.tampil();
    }
}
```

### 6.3.4 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2 
```
Data mahasiswa sebelum sorting: 
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
----------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
----------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
----------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
----------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
----------------------
Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : 
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
----------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
----------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
----------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
----------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
----------------------
PS C:\Project2026\Algoritma-StrukturData>
```

### 6.3.4 Pertanyaan

    1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:

       for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {

       a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
        : Karena setiap selesai satu putaran i, satu elemen terbesar sudah berada di posisi akhir yang benar. 
          Dengan n data, hanya dibutuhkan n-1 putaran untuk mengurutkan seluruh data.

       b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
        : Karena setiap selesai satu putaran i, elemen di posisi akhir sudah pasti terurut dan tidak perlu diperiksa lagi.
          Pengurangan i membuat perulangan semakin efisien karena tidak mengecek elemen yang sudah terurut.

       c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan berlangsung? 
          Dan ada berapa Tahap bubble sort yang ditempuh?
        : i < listMhs.length - 1
          i < 50 - 1
          i < 49
          → Perulangan i berlangsung sebanyak 49 kali (i = 0, 1, 2, ..., 48)

          Total perbandingan = 49 + 48 + 47 + ... + 1
                   = (49 × 50) / 2
                   = 1.225 perbandingan
          Jadi Perulangan i berlangsung 49 kali dan Bubble Sort menempuh 49 tahap dengan Total perbandingan yang dilakukan sebanyak 1.225 kali.

    2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad) yang terdiri dari nim, nama, kelas, dan ipk!
        : Kode program untuk pertanyaan 2 Percobaan 2 (MahasiswaBerprestasi02)
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
}
```

          Kode program untuk pertanyaan 2 Percobaan 2 (MahasiswaDemo02 (Main))
```
package P6;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = rappyAthya.nextInt();
        rappyAthya.nextLine(); 

        list.setUkuran(n); 

        for (int i = 1; i <= n; i++) {
            System.out.println("\n--- Input Mahasiswa ke-" + i + " ---");

            System.out.print("Nama  : ");
            String nama = rappyAthya.nextLine();

            System.out.print("NIM   : ");
            String nim = rappyAthya.nextLine();

            System.out.print("IPK   : ");
            double ipk = rappyAthya.nextDouble();
            rappyAthya.nextLine(); 

            System.out.print("Kelas : ");
            String kelas = rappyAthya.nextLine();

            Mahasiswa02 m = new Mahasiswa02(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("\n=============================");
        System.out.println("Data Mahasiswa Sebelum Sorting:");
        System.out.println("=============================");
        list.tampil();

        list.bubbleSort();
        System.out.println("=============================");
        System.out.println("Data Mahasiswa Setelah Sorting (IPK DESC):");
        System.out.println("=============================");
        list.tampil();
    }
}
```

          Hasil kode program untuk pertanyaan 2 percobaan 2 
```
Masukkan jumlah mahasiswa: 5

--- Input Mahasiswa ke-1 ---
Nama  : Zidan
NIM   : 123
IPK   : 3,2
Kelas : 2A

--- Input Mahasiswa ke-2 ---
Nama  : Ayu
NIM   : 124
IPK   : 3,5
Kelas : 2A

--- Input Mahasiswa ke-3 ---
Nama  : Sofi
NIM   : 125
IPK   : 3,1
Kelas : 2A

--- Input Mahasiswa ke-4 ---
Nama  : Sita
NIM   : 126
IPK   : 3,9
Kelas : 2A

--- Input Mahasiswa ke-5 ---
Nama  : Miki
NIM   : 127
IPK   : 3,7
Kelas : 2A

=============================
Data Mahasiswa Sebelum Sorting:
=============================
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
----------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
----------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
----------------------
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
----------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
----------------------
=============================
Data Mahasiswa Setelah Sorting (IPK DESC):
=============================
Nama: Sita
NIM: 126
Kelas: 2A
IPK: 3.9
----------------------
Nama: Miki
NIM: 127
Kelas: 2A
IPK: 3.7
----------------------
Nama: Ayu
NIM: 124
Kelas: 2A
IPK: 3.5
----------------------
Nama: Zidan
NIM: 123
Kelas: 2A
IPK: 3.2
----------------------
Nama: Sofi
NIM: 125
Kelas: 2A
IPK: 3.1
----------------------
PS C:\Project2026\Algoritma-StrukturData> 
```

### 6.3.5 Mengurutkan Data Mahasiswa Berdasarkan IPK (Selection Sort)

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
}
```

➡ Kode program untuk percobaan 2 (MahasiswaDemo02 (Main))

```
package P6;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = rappyAthya.nextInt();
        rappyAthya.nextLine(); 

        list.setUkuran(n); 

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
            System.out.print("Masukkan Data Mahasiswa ke-" + i + "\n");
            } else {
            System.out.print("Masukkan Data Mahasiswa ke-" + i + "\n");
            }

        System.out.print("NIM   : ");
        String nim = rappyAthya.nextLine();

        System.out.print("Nama  : ");
        String nama = rappyAthya.nextLine();

        System.out.print("Kelas : ");
        String kelas = rappyAthya.nextLine();

        System.out.print("IPK   : ");
        double ipk = Double.parseDouble(rappyAthya.nextLine());
        System.out.println("--------------------------------");

        Mahasiswa02 m = new Mahasiswa02(nim, nama, kelas, ipk);
        list.tambah(m);
    }

        System.out.println("\n=============================");
        System.out.println("Data Mahasiswa Sebelum Sorting:");
        System.out.println("=============================");
        list.tampil();

        list.bubbleSort();
        System.out.println("=============================");
        System.out.println("Data Mahasiswa Setelah Sorting (IPK DESC):");
        System.out.println("=============================");
        list.tampil();

        list.selectionSort();
        System.out.println("=============================");
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        System.out.println("=============================");
        list.tampil();
    }
}
```

### 6.3.6 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2 
```
Masukkan jumlah mahasiswa: 5
Masukkan Data Mahasiswa ke-1
NIM   : 123
Nama  : Ali
Kelas : 2B
IPK   : 3.9
--------------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 124
Nama  : ila
Kelas : 2B
IPK   : 3.1
--------------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 125
Nama  : agus
Kelas : 2B
IPK   : 3.6
--------------------------------
Masukkan Data Mahasiswa ke-4
NIM   : 126
Nama  : tika
Kelas : 2B
IPK   : 3.3
--------------------------------
Masukkan Data Mahasiswa ke-5
NIM   : 127
Nama  : udin
Kelas : 2B
IPK   : 3.2
--------------------------------

=============================
Data Mahasiswa Sebelum Sorting:
=============================
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
----------------------
Nama: ila
NIM: 124
Kelas: 2B
IPK: 3.1
----------------------
Nama: agus
NIM: 125
Kelas: 2B
IPK: 3.6
----------------------
Nama: tika
NIM: 126
Kelas: 2B
IPK: 3.3
----------------------
Nama: udin
NIM: 127
Kelas: 2B
IPK: 3.2
----------------------
=============================
Data Mahasiswa Setelah Sorting (IPK DESC):
=============================
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
----------------------
Nama: agus
NIM: 125
Kelas: 2B
IPK: 3.6
----------------------
Nama: tika
NIM: 126
Kelas: 2B
IPK: 3.3
----------------------
Nama: udin
NIM: 127
Kelas: 2B
IPK: 3.2
----------------------
Nama: ila
NIM: 124
Kelas: 2B
IPK: 3.1
----------------------
=============================
Data yang sudah terurut menggunakan SELECTION SORT (ASC)
=============================
Nama: ila
NIM: 124
Kelas: 2B
IPK: 3.1
----------------------
Nama: udin
NIM: 127
Kelas: 2B
IPK: 3.2
----------------------
Nama: tika
NIM: 126
Kelas: 2B
IPK: 3.3
----------------------
Nama: agus
NIM: 125
Kelas: 2B
IPK: 3.6
----------------------
Nama: Ali
NIM: 123
Kelas: 2B
IPK: 3.9
----------------------
PS C:\Project2026\Algoritma-StrukturData> 
```

### 6.3.7 Pertanyaan

    Di dalam method selection sort, terdapat baris program seperti di bawah ini:
        int idxMin=i;
        for (int j = i+1; j < listMhs.length; j++) {
            if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                idxMin=j;
            }
        }
    Untuk apakah proses tersebut, jelaskan!
        : Proses tersebut berfungsi untuk mencari index elemen terkecil (minimum) dari posisi i sampai akhir array.

### 6.4.1 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort

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
            while (j>0 && listMhs[j-1].ipk>temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j]=temp;
        }
    }
}
```

➡ Kode program untuk percobaan 2 (MahasiswaDemo02 (Main))

```
package P6;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = rappyAthya.nextInt();
        rappyAthya.nextLine(); 

        list.setUkuran(n); 

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
            System.out.print("Masukkan Data Mahasiswa ke-" + i + "\n");
            } else {
            System.out.print("Masukkan Data Mahasiswa ke-" + i + "\n");
            }

        System.out.print("NIM   : ");
        String nim = rappyAthya.nextLine();

        System.out.print("Nama  : ");
        String nama = rappyAthya.nextLine();

        System.out.print("Kelas : ");
        String kelas = rappyAthya.nextLine();

        System.out.print("IPK   : ");
        double ipk = Double.parseDouble(rappyAthya.nextLine());
        System.out.println("--------------------------------");

        Mahasiswa02 m = new Mahasiswa02(nim, nama, kelas, ipk);
        list.tambah(m);
    }

        System.out.println("\n=============================");
        System.out.println("Data Mahasiswa Sebelum Sorting:");
        System.out.println("=============================");
        list.tampil();

        list.bubbleSort();
        System.out.println("=============================");
        System.out.println("Data Mahasiswa Setelah Sorting (IPK DESC):");
        System.out.println("=============================");
        list.tampil();

        list.selectionSort();
        System.out.println("=============================");
        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        System.out.println("=============================");
        list.tampil();

        list.insertionSort();
        System.out.println("=============================");
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        System.out.println("=============================");
        list.tampil();
    }
}
```

### 6.4.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2 
```
Masukkan jumlah mahasiswa: 5
Masukkan Data Mahasiswa ke-1
NIM   : 111
Nama  : ayu
Kelas : 2c
IPK   : 3.7
--------------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 222
Nama  : dika
Kelas : 2c
IPK   : 3.0
--------------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 333
Nama  : ila
Kelas : 2c
IPK   : 3.8
--------------------------------
Masukkan Data Mahasiswa ke-4
NIM   : 444
Nama  : susi
Kelas : 2c
IPK   : 3.1
--------------------------------
Masukkan Data Mahasiswa ke-5
NIM   : 555
Nama  : yayuk
Kelas : 2c
IPK   : 3.4
--------------------------------

=============================
Data Mahasiswa Sebelum Sorting:
=============================
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
----------------------
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
----------------------
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
----------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
----------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
----------------------
=============================
Data Mahasiswa Setelah Sorting (IPK DESC):
=============================
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
----------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
----------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
----------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
----------------------
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
----------------------
=============================
Data yang sudah terurut menggunakan SELECTION SORT (ASC)
=============================
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
----------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
----------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
----------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
----------------------
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
----------------------
=============================
Data yang sudah terurut menggunakan INSERTION SORT (ASC)
=============================
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
----------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
----------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
----------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
----------------------
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
----------------------
PS C:\Project2026\Algoritma-StrukturData> 
```

### 6.4.3 Pertanyaan

    Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.
        : Kode program untuk pertanyaan InsertionSort descending Percobaan 2 (MahasiswaBerprestasi02)
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
}
```

          Hasil kode program untuk pertanyaan InsertionSort descending percobaan 2 
```
Masukkan jumlah mahasiswa: 5
Masukkan Data Mahasiswa ke-1
NIM   : 111
Nama  : ayu
Kelas : 2c
IPK   : 3.7
--------------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 222
Nama  : dika
Kelas : 2c
IPK   : 3.0
--------------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 333
Nama  : ila
Kelas : 2c
IPK   : 3.8
--------------------------------
Masukkan Data Mahasiswa ke-4
NIM   : 444
Nama  : susi
Kelas : 2c
IPK   : 3.1
--------------------------------
Masukkan Data Mahasiswa ke-5
NIM   : 555
Nama  : yayuk
Kelas : 2c
IPK   : 3.4
--------------------------------

=============================
Data Mahasiswa Sebelum Sorting:
=============================
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
----------------------
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
----------------------
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
----------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
----------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
----------------------
=============================
Data Mahasiswa Setelah Sorting (IPK DESC):
=============================
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
----------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
----------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
----------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
----------------------
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
----------------------
=============================
Data yang sudah terurut menggunakan SELECTION SORT (ASC)
=============================
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
----------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
----------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
----------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
----------------------
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
----------------------
=============================
Data yang sudah terurut menggunakan INSERTION SORT (ASC)
=============================
Nama: ila
NIM: 333
Kelas: 2c
IPK: 3.8
----------------------
Nama: ayu
NIM: 111
Kelas: 2c
IPK: 3.7
----------------------
Nama: yayuk
NIM: 555
Kelas: 2c
IPK: 3.4
----------------------
Nama: susi
NIM: 444
Kelas: 2c
IPK: 3.1
----------------------
Nama: dika
NIM: 222
Kelas: 2c
IPK: 3.0
----------------------
PS C:\Project2026\Algoritma-StrukturData> 
```

### Latihan 1
➡ Kode program untuk Tugas 1 (Dosen02)

```
package P6;

public class Dosen02 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen02(String kd, String name, Boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        System.out.printf("%-10s %-25s %-15s %d%n",
            kode,
            nama,
            jenisKelamin ? "Laki-laki" : "Perempuan",
            usia);
    }
}
```

➡ Kode program untuk Tugas 1 (DataDosen02)
```
package P6;

public class DataDosen02 {
    Dosen02[] dataDosen = new Dosen02[10];
    int idx = 0;

    void tambah(Dosen02 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data dosen berhasil ditambahkan.");
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        System.out.println("=".repeat(65));
        System.out.printf("%-10s %-25s %-15s %s%n", "Kode", "Nama", "Jenis Kelamin", "Usia");
        System.out.println("=".repeat(65));
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
        System.out.println("=".repeat(65));
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen02 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan secara ASC (Bubble Sort).");
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen02 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data berhasil diurutkan secara DSC (Selection Sort).");
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen02 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia > key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
        System.out.println("Data berhasil diurutkan secara ASC (Insertion Sort).");
    }
}
```

➡ Kode program untuk Tugas 1 (DosenMain02 (Main))
```
package P6;

import java.util.Scanner;

public class DosenMain02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        DataDosen02 dd = new DataDosen02();
        int pilihan;

        do {
            System.out.println("\n=============================");
            System.out.println("     MENU DATA DOSEN");
            System.out.println("=============================");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection/Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.println("=============================");
            System.out.print("Pilih menu: ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Data Dosen ---");
                    System.out.print("Kode Dosen  : ");
                    String kode = rappyAthya.nextLine();
                    System.out.print("Nama Dosen  : ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = rappyAthya.nextLine();
                    Boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Usia        : ");
                    int usia = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    dd.tambah(new Dosen02(kode, nama, jk, usia));
                    break;

                case 2:
                    System.out.println("\n--- Data Seluruh Dosen ---");
                    dd.tampil();
                    break;

                case 3:
                    System.out.println("\n--- Sorting ASC berdasarkan Usia (Bubble Sort) ---");
                    dd.SortingASC();
                    dd.tampil();
                    break;

                case 4:
                    System.out.println("\n--- Sorting DSC berdasarkan Usia ---");
                    System.out.println("Pilih algoritma:");
                    System.out.println("  1. Selection Sort");
                    System.out.println("  2. Insertion Sort");
                    System.out.print("Pilihan: ");
                    int pilihanSort = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    if (pilihanSort == 1) {
                        dd.sortingDSC();
                    } else if (pilihanSort == 2) {
                        dd.insertionSort();
                        for (int i = 0; i < dd.idx / 2; i++) {
                            Dosen02 temp = dd.dataDosen[i];
                            dd.dataDosen[i] = dd.dataDosen[dd.idx - 1 - i];
                            dd.dataDosen[dd.idx - 1 - i] = temp;
                        }
                        System.out.println("(Dibalik menjadi DSC)");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    dd.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
            
        } while (pilihan != 5);
    }
}
```

➡ Hasil kode program untuk Tugas 1 (DosenMain02 (Main))
```
=============================
     MENU DATA DOSEN
=============================
1. Tambah Data Dosen
2. Tampil Data Dosen
3. Sorting ASC (Bubble Sort)
4. Sorting DSC (Selection/Insertion Sort)
5. Keluar
=============================
Pilih menu: 1

--- Tambah Data Dosen ---
Kode Dosen  : KD01
Nama Dosen  : Sunari
Jenis Kelamin (L/P): L
Usia        : 38
Data dosen berhasil ditambahkan.

=============================
     MENU DATA DOSEN
=============================
1. Tambah Data Dosen
2. Tampil Data Dosen
3. Sorting ASC (Bubble Sort)
4. Sorting DSC (Selection/Insertion Sort)
5. Keluar
=============================
Pilih menu: 1

--- Tambah Data Dosen ---
Kode Dosen  : KD02
Nama Dosen  : Susi
Jenis Kelamin (L/P): P
Usia        : 27
Data dosen berhasil ditambahkan.

=============================
     MENU DATA DOSEN
=============================
1. Tambah Data Dosen
2. Tampil Data Dosen
3. Sorting ASC (Bubble Sort)
4. Sorting DSC (Selection/Insertion Sort)
5. Keluar
=============================
Pilih menu: 1

--- Tambah Data Dosen ---
Kode Dosen  : KD03
Nama Dosen  : Setiawan
Jenis Kelamin (L/P): l
Usia        : 23
Data dosen berhasil ditambahkan.

=============================
     MENU DATA DOSEN
=============================
1. Tambah Data Dosen
2. Tampil Data Dosen
3. Sorting ASC (Bubble Sort)
4. Sorting DSC (Selection/Insertion Sort)
5. Keluar
=============================
Pilih menu: 2

--- Data Seluruh Dosen ---
=================================================================
Kode       Nama                      Jenis Kelamin   Usia
=================================================================
KD01       Sunari                    Laki-laki       38
KD02       Susi                      Perempuan       27
KD03       Setiawan                  Laki-laki       23
=================================================================

=============================
     MENU DATA DOSEN
=============================
1. Tambah Data Dosen
2. Tampil Data Dosen
3. Sorting ASC (Bubble Sort)
4. Sorting DSC (Selection/Insertion Sort)
5. Keluar
=============================
Pilih menu: 3

--- Sorting ASC berdasarkan Usia (Bubble Sort) ---
Data berhasil diurutkan secara ASC (Bubble Sort).
=================================================================
Kode       Nama                      Jenis Kelamin   Usia
=================================================================
KD03       Setiawan                  Laki-laki       23
KD02       Susi                      Perempuan       27
KD01       Sunari                    Laki-laki       38
=================================================================

=============================
     MENU DATA DOSEN
=============================
1. Tambah Data Dosen
2. Tampil Data Dosen
3. Sorting ASC (Bubble Sort)
4. Sorting DSC (Selection/Insertion Sort)
5. Keluar
=============================
Pilih menu: 4

--- Sorting DSC berdasarkan Usia ---
Pilih algoritma:
  1. Selection Sort
  2. Insertion Sort
Pilihan: 1
Data berhasil diurutkan secara DSC (Selection Sort).
=================================================================
Kode       Nama                      Jenis Kelamin   Usia
=================================================================
KD01       Sunari                    Laki-laki       38
KD02       Susi                      Perempuan       27
KD03       Setiawan                  Laki-laki       23
=================================================================

=============================
     MENU DATA DOSEN
=============================
1. Tambah Data Dosen
2. Tampil Data Dosen
3. Sorting ASC (Bubble Sort)
4. Sorting DSC (Selection/Insertion Sort)
5. Keluar
=============================
Pilih menu: 4

--- Sorting DSC berdasarkan Usia ---
Pilih algoritma:
  1. Selection Sort
  2. Insertion Sort
Pilihan: 2
Data berhasil diurutkan secara ASC (Insertion Sort).
(Dibalik menjadi DSC)
=================================================================
Kode       Nama                      Jenis Kelamin   Usia
=================================================================
KD01       Sunari                    Laki-laki       38
KD02       Susi                      Perempuan       27
KD03       Setiawan                  Laki-laki       23
=================================================================

=============================
     MENU DATA DOSEN
=============================
1. Tambah Data Dosen
2. Tampil Data Dosen
3. Sorting ASC (Bubble Sort)
4. Sorting DSC (Selection/Insertion Sort)
5. Keluar
=============================
Pilih menu: 5
Terima kasih. Program selesai.
PS C:\Project2026\Algoritma-StrukturData> 
```