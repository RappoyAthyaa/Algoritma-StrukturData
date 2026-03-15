|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020063 |
| Nama |  Ahmad Raffie Athaya H. |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/RappoyAthyaa/Algoritma-StrukturData) |

# Jobsheet #3 ARRAY OF OBJECTS

## 3.2. Percobaan 1

### 3.2.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (Mahasiswa02)
```
package P3;

public class Mahasiswa02 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
}
```

➡ Kode program untuk percobaan 1 (MahasiswaDemo (main))

```
package P3;
import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Mahasiswa02[] arrayOfMahasiswa = new Mahasiswa02[3];
        arrayOfMahasiswa[0] = new Mahasiswa02();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = (float) 3.75;

        arrayOfMahasiswa[1] = new Mahasiswa02();
        arrayOfMahasiswa[1].nim = "2341720172";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = (float) 3.36;

        arrayOfMahasiswa[2] = new Mahasiswa02();
        arrayOfMahasiswa[2].nim = "244107023006";
        arrayOfMahasiswa[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = (float) 3.80;

        System.out.println("NIM     : "+ arrayOfMahasiswa[0].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa[0].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa[0].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[0].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM     : "+ arrayOfMahasiswa[1].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa[1].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa[1].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[1].ipk);
        System.out.println("-----------------------------------");
        System.out.println("NIM     : "+ arrayOfMahasiswa[2].nim);
        System.out.println("Nama    : "+ arrayOfMahasiswa[2].nama);
        System.out.println("Kelas   : "+ arrayOfMahasiswa[2].kelas);
        System.out.println("IPK     : "+ arrayOfMahasiswa[2].ipk);
        System.out.println("-----------------------------------");
    }
}
```

### 3.2.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
NIM     : 244107060033
Nama    : AGNES TITANIA KINANTI
Kelas   : SIB-1E
IPK     : 3.75
-----------------------------------
NIM     : 2341720172
Nama    : ACHMAD MAULANA HAMZAH
Kelas   : TI-2A
IPK     : 3.36
-----------------------------------
NIM     : 244107023006
Nama    : DIRHAMAWAN PUTRANTO
Kelas   : TI-2E
IPK     : 3.8
-----------------------------------
PS C:\Project2026\Algoritma-StrukturData> 
```

### 3.2.3 Pertanyaan

    1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki
       atribut dan sekaligus method? Jelaskan!
        : Tidak harus. Class yang digunakan sebagai array of object tidak wajib memiliki method — cukup 
          memiliki atribut saja sudah bisa        dijadikan array of object.
          Bukti dari Uji Coba 3.2
            Pada kode MahasiswaDemo02, class Mahasiswa02 hanya digunakan untuk menyimpan data melalui atribut:
              javaarrayOfMahasiswa[0].nim   = "244107060033";
              arrayOfMahasiswa[0].nama  = "AGNES TITANIA KINANTI";
              arrayOfMahasiswa[0].kelas = "SIB-1E";
              arrayOfMahasiswa[0].ipk   = (float) 3.75;

            Tidak ada pemanggilan method sama sekali — program tetap berjalan normal hanya dengan atribut.

    2. Apa yang dilakukan oleh kode program berikut?
       " Mahasiswa02[] arrayOfMahasiswa = new Mahasiswa02[3]; "
        : Kode tersebut hanya menyiapkan "wadah" berisi 3 slot kosong (null) untuk menampung objek Mahasiswa02, 
          bukan langsung membuat   objeknya. Pembuatan objek dilakukan secara terpisah dengan new Mahasiswa02() di setiap indeks.

    3. Apakah class Mahasiswa memiliki konstruktor? Jika tidak, kenapa bisa dilakukan pemanggilan
       konstruktur pada baris program berikut?
       " arrayOfMahasiswa[1] = new Mahasiswa02(); "
        : Class Mahasiswa02 tidak memiliki konstruktor yang ditulis secara eksplisit. 
          Namun pemanggilan new Mahasiswa02() tetap bisa dilakukan karena Java secara otomatis menyediakan Default Constructor.

    4. Apa yang dilakukan oleh kode program berikut? 
       arrayOfMahasiswa[0] = new Mahasiswa02();
       arrayOfMahasiswa[0].nim = "244107060033";
       arrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
       arrayOfMahasiswa[0].kelas = "SIB-1E";
       arrayOfMahasiswa[0].ipk = (float) 3.75;
        : Kode tersebut melakukan dua hal sekaligus, yaitu menginstansiasi objek Mahasiswa02 baru di indeks ke-0, 
          kemudian mengisi seluruh atributnya secara langsung menggunakan notasi dot (.) untuk menyimpan data mahasiswa pertama.

    5. Mengapa class Mahasiswa dan MahasiswaDemo dipisahkan pada uji coba 3.2?
        : Pemisahan ini merupakan penerapan konsep OOP yaitu Single Responsibility Principle, di mana setiap class sebaiknya hanya memiliki  
          satu tanggung jawab utama. Mahasiswa02 bertanggung jawab mendefinisikan struktur data, sementara MahasiswaDemo02 bertanggung jawab menjalankan logika program.


## 3.3. Percobaan 2

### 3.3.1. Langkah-langkah Percobaan
➡ Kode program untuk percobaan 2 (MahasiswaDemo02)
```
package P3;
import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);
        Mahasiswa02[] arrayOfMahasiswa = new Mahasiswa02[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa02();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = rappyAthaya.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = rappyAthaya.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = rappyAthaya.nextLine();
            System.out.print("IPK   : ");
            dummy = rappyAthaya.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa[i].ipk);
            System.out.println("-----------------------------");
        }
    }
}
```

### 3.3.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2 
```
Masukkan Data Mahasiswa ke-1
NIM   : 244107060033
Nama  : AGNES TITANIA KINANTI
Kelas : SIB-1E
IPK   : 3.75
-----------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 2341720172
Nama  : ACHMAD MAULANA HAMZAH
Kelas : TI-2A
IPK   : 3.36
-----------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 244107023006
Nama  : DIRHAMAWAN PUTRANTO
Kelas : TI-2E
IPK   : 3.80
-----------------------------
Data Mahasiswa ke-1
NIM     : 244107060033
Nama    : AGNES TITANIA KINANTI
Kelas   : SIB-1E
IPK     : 3.75
-----------------------------
Data Mahasiswa ke-2
NIM     : 2341720172
Nama    : ACHMAD MAULANA HAMZAH
Kelas   : TI-2A
IPK     : 3.36
-----------------------------
Data Mahasiswa ke-3
NIM     : 244107023006
Nama    : DIRHAMAWAN PUTRANTO
Kelas   : TI-2E
IPK     : 3.8
-----------------------------
PS C:\Project2026\Algoritma-StrukturData> 
```

### 3.3.3 Pertanyaan

    1. Tambahkan method cetakInfo() pada class Mahasiswa kemudian modifikasi kode program pada langkah no 3. 
        : Kode program untuk pertanyaan 1 Percobaan 2 (Mahasiswa02)
```
package P3;

public class Mahasiswa02 {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public void cetakInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("-----------------------------");
    }
}
```
          Kode program untuk pertanyaan 1 Percobaan 2 (MahasiswaDemo02)
```
package P3;
import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);
        Mahasiswa02[] arrayOfMahasiswa = new Mahasiswa02[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa02();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = rappyAthaya.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = rappyAthaya.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = rappyAthaya.nextLine();
            System.out.print("IPK   : ");
            dummy = rappyAthaya.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        }
    }
}
```
          Hasil kode program untuk pertanyaan 1 percobaan 2
```
Masukkan Data Mahasiswa ke-1
NIM   : 244107060033
Nama  : AGNES TITANIA KINANTI
Kelas : SIB-1E
IPK   : 3.75
-----------------------------
Masukkan Data Mahasiswa ke-2
NIM   : 2341720172
Nama  : ACHMAD MAULANA HAMZAH
Kelas : TI-2A
IPK   : 3.36
-----------------------------
Masukkan Data Mahasiswa ke-3
NIM   : 244107023006
Nama  : DIRHAMAWAN PUTRANTO
Kelas : TI-2E
IPK   : 3.80
-----------------------------
Data Mahasiswa ke-1
NIM     : 244107060033
Nama    : AGNES TITANIA KINANTI
Kelas   : SIB-1E
IPK     : 3.75
-----------------------------
Data Mahasiswa ke-2
NIM     : 2341720172
Nama    : ACHMAD MAULANA HAMZAH
Kelas   : TI-2A
IPK     : 3.36
-----------------------------
Data Mahasiswa ke-3
NIM     : 244107023006
Nama    : DIRHAMAWAN PUTRANTO
Kelas   : TI-2E
IPK     : 3.8
-----------------------------
PS C:\Project2026\Algoritma-StrukturData> 
```

    2. Misalkan Anda punya array baru bertipe array of Mahasiswa dengan nama myArrayOfMahasiswa. Mengapa kode berikut menyebabkan error?
       Mahasiswa02[] myArrayOfMahasiswa = new Mahasiswa02[3];
       myArrayOfMahasiswa[0].nim = "244107060033";
       myArrayOfMahasiswa[0].nama = "AGNES TITANIA KINANTI";
       myArrayOfMahasiswa[0].nim = "SIB-1E";
       myArrayOfMahasiswa[0].ipk = (float) 3.75;
        : Kode tersebut menyebabkan NullPointerException saat runtime.
          Mahasiswa02[] myarrMahasiswa02s = new Mahasiswa02[3];
          Baris ini hanya membuat array kosong yang berisi 3 slot, namun setiap slot masih bernilai `null` — belum ada objek 
          `Mahasiswa02` yang dibuat di dalamnya.


### 3.4. Percobaan 3

### 3.4.1. Langkah-langkah Percobaan
➡ Kode program untuk percobaan 3 (Matakuliah02)
```
package P3;

public class Matakuliah02 { 
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah02 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
```

➡ Kode program untuk percobaan 3 (MatakuliahDemo02)
```
package P3;

import java.util.Scanner;

public class MatakuliahDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);
        Matakuliah02[] arrayOfMatakuliah = new Matakuliah02[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode      : ");
            kode = rappyAthaya.nextLine();
            System.out.print("Nama      : ");
            nama = rappyAthaya.nextLine();
            System.out.print("Sks       : ");
            dummy = rappyAthaya.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("JumlahJam : ");
            dummy = rappyAthaya.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMatakuliah[i] = new Matakuliah02 (kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks         : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("-----------------------------");
        }
    }
}
```

### 3.4.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 3 
```
Masukkan Data Matakuliah ke-1
Kode      : 12345
Nama      : Algoritma & Struktur Data
Sks       : 2
JumlahJam : 6
-----------------------------
Masukkan Data Matakuliah ke-2
Kode      : 54321
Nama      : Sistem Basis Data
Sks       : 2
JumlahJam : 4
-----------------------------
Masukkan Data Matakuliah ke-3
Kode      : 83652
Nama      : Dasar Pemrograman
Sks       : 2
JumlahJam : 4
-----------------------------
Data Matakuliah ke-1
Kode        : 12345
Nama        : Algoritma & Struktur Data
Sks         : 2
Jumlah Jam  : 6
-----------------------------
Data Matakuliah ke-2
Kode        : 54321
Nama        : Sistem Basis Data
Sks         : 2
Jumlah Jam  : 4
-----------------------------
Data Matakuliah ke-3
Kode        : 83652
Nama        : Dasar Pemrograman
Sks         : 2
Jumlah Jam  : 4
-----------------------------
PS C:\Project2026\Algoritma-StrukturData>
```

### 3.4.3 Pertanyaan

    1. Apakah suatu class dapat memiliki lebih dari 1 constructor? Jika iya, berikan contohnya
        : Ya, suatu class dapat memiliki lebih dari 1 constructor. Konsep ini disebut Constructor Overloading.
          Constructor overloading memungkinkan sebuah class memiliki beberapa constructor dengan parameter yang berbeda 
          (jumlah, tipe, atau urutan parameter berbeda). Java akan menentukan constructor mana yang dipanggil berdasarkan 
          argumen yang diberikan saat pembuatan objek.
**Contoh Program:**
```
package P3;

public class Matakuliah02 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    // Constructor 1: tanpa parameter (default)
    public Matakuliah02() {
        this.kode = "Tidak Diketahui";
        this.nama = "Tidak Diketahui";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Constructor 2: hanya kode dan nama
    public Matakuliah02(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.sks = 0;
        this.jumlahJam = 0;
    }

    // Constructor 3: kode, nama, dan sks
    public Matakuliah02(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = 0;
    }

    // Constructor 4: semua parameter (constructor asli)
    public Matakuliah02(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("----------");
    }

    public static void main(String[] args) {
        // Menggunakan Constructor 1
        Matakuliah02 mk1 = new Matakuliah02();

        // Menggunakan Constructor 2
        Matakuliah02 mk2 = new Matakuliah02("IF101", "Algoritma");

        // Menggunakan Constructor 3
        Matakuliah02 mk3 = new Matakuliah02("IF102", "Struktur Data", 3);

        // Menggunakan Constructor 4
        Matakuliah02 mk4 = new Matakuliah02("IF103", "Pemrograman Lanjut", 4, 8);

        mk1.tampilInfo();
        mk2.tampilInfo();
        mk3.tampilInfo();
        mk4.tampilInfo();
    }
}
```

**Output:**
```
Kode       : Tidak Diketahui
Nama       : Tidak Diketahui
SKS        : 0
Jumlah Jam : 0
----------
Kode       : IF101
Nama       : Algoritma
SKS        : 0
Jumlah Jam : 0
----------
Kode       : IF102
Nama       : Struktur Data
SKS        : 3
Jumlah Jam : 0
----------
Kode       : IF103
Nama       : Pemrograman Lanjut
SKS        : 4
Jumlah Jam : 8
----------
```

    2. Tambahkan method tambahData() pada class Matakuliah, kemudian gunakan method tersebut di class MatakuliahDemo
       untuk menambahkan data Matakuliah
        : Kode program untuk pertanyaan 2 Percobaan 3 (Matakuliah02)
```
package P3;

import java.util.Scanner;

public class Matakuliah02 { 
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah02 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public Matakuliah02() {}

    public void tambahData(Scanner scanner) {
        System.out.print("Kode      : ");
        this.kode = scanner.nextLine();
        System.out.print("Nama      : ");
        this.nama = scanner.nextLine();
        System.out.print("Sks       : ");
        this.sks = Integer.parseInt(scanner.nextLine());
        System.out.print("JumlahJam : ");
        this.jumlahJam = Integer.parseInt(scanner.nextLine());
    }
}
```

          Kode program untuk pertanyaan 2 Percobaan 3 (MatakuliahDemo02)
```
package P3;

import java.util.Scanner;

public class MatakuliahDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);
        Matakuliah02[] arrayOfMatakuliah = new Matakuliah02[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah02();       
            arrayOfMatakuliah[i].tambahData(rappyAthaya);   
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks         : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("-----------------------------");
        }
    }
}
```

          Hasil kode program untuk percobaan 3 pertanyaan 2
```
Masukkan Data Matakuliah ke-1
Kode      : 12345
Nama      : Algoritma & Struktur Data
Sks       : 2
JumlahJam : 6
-----------------------------
Masukkan Data Matakuliah ke-2
Kode      : 54321
Nama      : Sistem Basis Data
Sks       : 2
JumlahJam : 4
-----------------------------
Masukkan Data Matakuliah ke-3
Kode      : 83652
Nama      : Dasar Pemrograman
Sks       : 2
JumlahJam : 4
-----------------------------
Data Matakuliah ke-1
Kode        : 12345
Nama        : Algoritma & Struktur Data
Sks         : 2
Jumlah Jam  : 6
-----------------------------
Data Matakuliah ke-2
Kode        : 54321
Nama        : Sistem Basis Data
Sks         : 2
Jumlah Jam  : 4
-----------------------------
Data Matakuliah ke-3
Kode        : 83652
Nama        : Dasar Pemrograman
Sks         : 2
Jumlah Jam  : 4
-----------------------------
PS C:\Project2026\Algoritma-StrukturData>
```

    3. Tambahkan method cetakInfo() pada class Matakuliah, kemudian gunakan method tersebut di class 
       MatakuliahDemo untuk menampilkan data hasil inputan di layar
        : Kode program untuk pertanyaan 3 Percobaan 3 (Matakuliah02)
```
package P3;

import java.util.Scanner;

public class Matakuliah02 { 
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah02(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public Matakuliah02() {}

    public void tambahData(Scanner scanner) {
        System.out.print("Kode      : ");
        this.kode = scanner.nextLine();
        System.out.print("Nama      : ");
        this.nama = scanner.nextLine();
        System.out.print("Sks       : ");
        this.sks = Integer.parseInt(scanner.nextLine());
        System.out.print("JumlahJam : ");
        this.jumlahJam = Integer.parseInt(scanner.nextLine());
    }

    public void cetakInfo() {
        System.out.println("Kode        : " + this.kode);
        System.out.println("Nama        : " + this.nama);
        System.out.println("Sks         : " + this.sks);
        System.out.println("Jumlah Jam  : " + this.jumlahJam);
    }
}
```

          Kode program untuk pertanyaan 3 Percobaan 3 (Matakuliah02)
```
package P3;

import java.util.Scanner;

public class MatakuliahDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);
        Matakuliah02[] arrayOfMatakuliah = new Matakuliah02[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah02();
            arrayOfMatakuliah[i].tambahData(rappyAthaya);
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("-----------------------------");
        }
    }
}
```

          Hasil kode program untuk percobaan 3 pertanyaan 3
```
Masukkan Data Matakuliah ke-1
Kode      : 12345
Nama      : Algoritma & Struktur Data
Sks       : 2
JumlahJam : 6
-----------------------------
Masukkan Data Matakuliah ke-2
Kode      : 54321
Nama      : Sistem Basis Data
Sks       : 2
JumlahJam : 4
-----------------------------
Masukkan Data Matakuliah ke-3
Kode      : 83652
Nama      : Dasar Pemrograman
Sks       : 2
JumlahJam : 4
-----------------------------
Data Matakuliah ke-1
Kode        : 12345
Nama        : Algoritma & Struktur Data
Sks         : 2
Jumlah Jam  : 6
-----------------------------
Data Matakuliah ke-2
Kode        : 54321
Nama        : Sistem Basis Data
Sks         : 2
Jumlah Jam  : 4
-----------------------------
Data Matakuliah ke-3
Kode        : 83652
Nama        : Dasar Pemrograman
Sks         : 2
Jumlah Jam  : 4
-----------------------------
PS C:\Project2026\Algoritma-StrukturData>
```

    4. Modifikasi kode program pada class MatakuliahDemo agar panjang (jumlah elemen) dari  
       array of object Matakuliah ditentukan oleh user melalui input dengan Scanner
        : Kode program untuk pertanyaan 4 Percobaan 3 (MatakuliahDemo02)
```
package P3;

import java.util.Scanner;

public class MatakuliahDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah : ");
        int jumlah = Integer.parseInt(rappyAthaya.nextLine());
        System.out.println("-----------------------------");

        Matakuliah02[] arrayOfMatakuliah = new Matakuliah02[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah02();
            arrayOfMatakuliah[i].tambahData(rappyAthaya);
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("-----------------------------");
        }
    }
}
```
          Hasil kode program untuk percobaan 3 pertanyaan 4
```
Masukkan Data Matakuliah ke-1
Kode      : 12345
Nama      : Algoritma & Struktur Data
Sks       : 2
JumlahJam : 6
-----------------------------
Masukkan Data Matakuliah ke-2
Kode      : 54321
Nama      : Sistem Basis Data
Sks       : 2
JumlahJam : 4
-----------------------------
Data Matakuliah ke-1
Kode        : 12345
Nama        : Algoritma & Struktur Data
Sks         : 2
Jumlah Jam  : 6
-----------------------------
Data Matakuliah ke-2
Kode        : 54321
Nama        : Sistem Basis Data
Sks         : 2
Jumlah Jam  : 4
-----------------------------
PS C:\Project2026\Algoritma-StrukturData>
```

## 3.5 Latihan Tugas Praktikum

### Latihan 1
➡ Kode program untuk Tugas 1 (Dosen02)

```
package P3;

public class Dosen02 {
    String kode;
    String nama;
    Boolean jenisKelamin; 
    int usia;

    public Dosen02(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
}
```

➡ Kode program untuk Tugas 1 (DosenDemo02)

```
package P3;

import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int n = rappyAthaya.nextInt();
        rappyAthaya.nextLine(); 

        Dosen02[] arrayOfDosen = new Dosen02[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = rappyAthaya.nextLine();

            System.out.print("Nama          : ");
            String nama = rappyAthaya.nextLine();

            System.out.print("Jenis Kelamin : ");
            String inputJK = rappyAthaya.nextLine();
            boolean jenisKelamin = inputJK.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            int usia = rappyAthaya.nextInt();
            rappyAthaya.nextLine();

            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen02(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen02 d : arrayOfDosen) {
            String jk = d.jenisKelamin ? "Pria" : "Wanita";
            System.out.println(" Data Dosen ke-" + no);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("------------------------------");
            no++;
        }
    }
}
```
➡ Hasil kode program untuk Tugas 1 (DosenDemo02)
```
Masukkan jumlah dosen: 3
Masukkan Data Dosen ke-1
Kode          : 051032001
Nama          : Aisyah Kamila
Jenis Kelamin : Wanita
Usia          : 24
------------------------------
Masukkan Data Dosen ke-2
Kode          : 06041995
Nama          : Akmal Ahmad Ghozali
Jenis Kelamin : Pria
Usia          : 30
------------------------------
Masukkan Data Dosen ke-3
Kode          : 23061975
Nama          : Wahyuningtyas
Jenis Kelamin : Wanita
Usia          : 24
------------------------------
 Data Dosen ke-1
Kode          : 051032001
Nama          : Aisyah Kamila
Jenis Kelamin : Wanita
Usia          : 24
------------------------------
 Data Dosen ke-2
Kode          : 06041995
Nama          : Akmal Ahmad Ghozali
Jenis Kelamin : Pria
Usia          : 30
------------------------------
 Data Dosen ke-3
Kode          : 23061975
Nama          : Wahyuningtyas
Jenis Kelamin : Wanita
Usia          : 24
------------------------------
PS C:\Project2026\Algoritma-StrukturData>
```

### Latihan 2
➡ Kode program untuk Tugas 2 (DosenDemo2)

```
package P3;

import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int n = rappyAthaya.nextInt();
        rappyAthaya.nextLine(); 

        Dosen02[] arrayOfDosen = new Dosen02[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = rappyAthaya.nextLine();

            System.out.print("Nama          : ");
            String nama = rappyAthaya.nextLine();

            System.out.print("Jenis Kelamin : ");
            String inputJK = rappyAthaya.nextLine();
            boolean jenisKelamin = inputJK.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            int usia = rappyAthaya.nextInt();
            rappyAthaya.nextLine();

            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen02(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen02 d : arrayOfDosen) {
            String jk = d.jenisKelamin ? "Pria" : "Wanita";
            System.out.println(" Data Dosen ke-" + no);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("------------------------------");
            no++;
        }

        DataDosen02 dataDosen = new DataDosen02();

        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
```

➡ Kode program untuk Tugas 2 (DosenDemo2)
```
package P3;

public class DataDosen02 {

    public void dataSemuaDosen(Dosen02[] arrayOfDosen) {
        System.out.println("\n========== DATA SEMUA DOSEN ==========");
        int no = 1;
        for (Dosen02 d : arrayOfDosen) {
            String jk = d.jenisKelamin ? "Pria" : "Wanita";
            System.out.println(" Data Dosen ke-" + no);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("------------------------------");
            no++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen02 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        System.out.println("Pria   : " + pria + " dosen");
        System.out.println("Wanita : " + wanita + " dosen");
        System.out.println("==========================================");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen02 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += d.usia;
                jumlahWanita++;
            }
        }

        double rerataUsiaPria   = jumlahPria   > 0 ? (double) totalUsiaPria   / jumlahPria   : 0;
        double rerataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("\n===== RATA-RATA USIA PER JENIS KELAMIN =====");
        System.out.printf("Pria   : %.2f tahun%n", rerataUsiaPria);
        System.out.printf("Wanita : %.2f tahun%n", rerataUsiaWanita);
        System.out.println("============================================");
    }

    public void infoDosenPalingTua(Dosen02[] arrayOfDosen) {
        Dosen02 palingTua = arrayOfDosen[0];
        for (Dosen02 d : arrayOfDosen) {
            if (d.usia > palingTua.usia) palingTua = d;
        }
        String jk = palingTua.jenisKelamin ? "Pria" : "Wanita";
        System.out.println("\n===== DOSEN PALING TUA =====");
        System.out.println("Kode          : " + palingTua.kode);
        System.out.println("Nama          : " + palingTua.nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + palingTua.usia + " tahun");
        System.out.println("------------------------------");
    }

    public void infoDosenPalingMuda(Dosen02[] arrayOfDosen) {
        Dosen02 palingMuda = arrayOfDosen[0];
        for (Dosen02 d : arrayOfDosen) {
            if (d.usia < palingMuda.usia) palingMuda = d;
        }
        String jk = palingMuda.jenisKelamin ? "Pria" : "Wanita";
        System.out.println("\n===== DOSEN PALING MUDA =====");
        System.out.println("Kode          : " + palingMuda.kode);
        System.out.println("Nama          : " + palingMuda.nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + palingMuda.usia + " tahun");
        System.out.println("------------------------------");
    }
}
```

➡ Hasil kode program untuk Tugas 2 (DosenDemo02)
```
Masukkan jumlah dosen: 3
Masukkan Data Dosen ke-1
Kode          : 051032001
Nama          : Aisyah Kamila
Jenis Kelamin : Wanita
Usia          : 24
------------------------------
Masukkan Data Dosen ke-2
Kode          : 06041995
Nama          : Akmal Ahmad Ghozali
Jenis Kelamin : Pria
Usia          : 30
------------------------------
Masukkan Data Dosen ke-3
Kode          : 23061975
Nama          : Wahyuningtyas
Jenis Kelamin : Wanita
Usia          : 24
------------------------------
 Data Dosen ke-1
Kode          : 051032001
Nama          : Aisyah Kamila
Jenis Kelamin : Wanita
Usia          : 24
------------------------------
 Data Dosen ke-2
Kode          : 06041995
Nama          : Akmal Ahmad Ghozali
Jenis Kelamin : Pria
Usia          : 30
------------------------------
 Data Dosen ke-3
Kode          : 23061975
Nama          : Wahyuningtyas
Jenis Kelamin : Wanita
Usia          : 24
------------------------------

========== DATA SEMUA DOSEN ==========
 Data Dosen ke-1
Kode          : 051032001
Nama          : Aisyah Kamila
Jenis Kelamin : Wanita
Usia          : 24
------------------------------
 Data Dosen ke-2
Kode          : 06041995
Nama          : Akmal Ahmad Ghozali
Jenis Kelamin : Pria
Usia          : 30
------------------------------
 Data Dosen ke-3
Kode          : 23061975
Nama          : Wahyuningtyas
Jenis Kelamin : Wanita
Usia          : 24
------------------------------

===== JUMLAH DOSEN PER JENIS KELAMIN =====
Pria   : 1 dosen
Wanita : 2 dosen
==========================================

===== RATA-RATA USIA PER JENIS KELAMIN =====
Pria   : 30,00 tahun
Wanita : 24,00 tahun
============================================

===== DOSEN PALING TUA =====
Kode          : 06041995
Nama          : Akmal Ahmad Ghozali
Jenis Kelamin : Pria
Usia          : 30 tahun
------------------------------

===== DOSEN PALING MUDA =====
Kode          : 051032001
Nama          : Aisyah Kamila
Jenis Kelamin : Wanita
Usia          : 24 tahun
------------------------------
PS C:\Project2026\Algoritma-StrukturData>
```