|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020063 |
| Nama |  Ahmad Raffie Athaya H. |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/RappoyAthyaa/Algoritma-StrukturData) |

# Jobsheet #10 QUEUE

## 10.1 Percobaan 1

### 10.1.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (Queue02)
```
package P10;

public class Queue02 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue02 (int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1; 
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull () {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            }else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            } 
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue() {
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max -1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}
```

➡ Kode program untuk percobaan 1 (QueueMain02 (Main))
```
package P10;

import java.util.Scanner;

public class QueueMain02 {
        public static void menu() {
            System.out.println("Masukkan operasi yang diinginkan:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("-------------------");
        }
    public static void main(String[] args) {
        Scanner rappyathya = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = rappyathya.nextInt();
        Queue02 Q = new Queue02(n);
        int pilih;

        do {
            menu();
            pilih = rappyathya.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = rappyathya.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                
                case 2:
                    int dataKeluar =Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }

                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
```

### 10.1.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
Masukkan kapasitas queue: 4
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. print
4. Peek
5. Clear
-------------------
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. print
4. Peek
5. Clear
-------------------
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. print
4. Peek
5. Clear
-------------------
4
Elemen terdepan: 15
```

### 10.1.3 Pertanyaan

    1. Pada konstruktor, mengapa nilai awal atribut front dan rear bernilai -1, sementara atribut size bernilai 0?
        : front = rear = -1 digunakan sebagai penanda bahwa queue masih kosong (kondisi awal/belum ada data). Nilai -1 dipilih karena bukan index valid dari array,
          sehingga bisa dijadikan "flag" khusus.
          size = 0 karena size adalah penghitung jumlah elemen, dan secara logika queue yang baru dibuat memang belum memiliki elemen sama sekali.

    2. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut!
       if (rear == max - 1) {
          rear = 0;
        : Penjelasan:
          Ini adalah mekanisme "wrap around" pada circular queue. Jika rear sudah berada di index terakhir array (max - 1), 
          maka rear kembali ke index 0 (memutar). Jika belum, rear maju satu langkah ke depan.

    3. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
       if (rear == max - 1) {
          front = 0;
        : Penjelasan:
          Sama seperti Enqueue, ini adalah "wrap around" untuk front. Setelah elemen terdepan diambil, front maju satu langkah. 
          Jika front sudah di index terakhir (max - 1), maka front kembali ke 0.

    4. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), melainkan int i=front?
        : Karena ini adalah circular queue, elemen pertama yang valid tidak selalu berada di index 0. Setelah beberapa kali Dequeue, front bisa berada di tengah atau akhir array.

    5. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
       i = (i + 1) % max;
        : bermaksud untuk maju satu langkah dengan wrap arround (circular) 

    6. Tunjukkan potongan kode program yang merupakan queue overflow!
        : Queue overflow terjadi saat Enqueue dipanggil padahal queue sudah penuh:
         // Di Queue02.java - method Enqueue()
            public void Enqueue(int dt) {
                if (IsFull()) {
                    System.out.println("Queue sudah penuh"); // ← OVERFLOW ditangani di sini
                    return;
            }
        }
          Dan kondisi IsFull():
            public boolean IsFull() {
                if (size == max) { // ← size sudah sama dengan kapasitas maksimal
                     return true;
            } else {
                return false;
            }
        }

    7. Pada saat terjadi queue overflow dan queue underflow, program tersebut tetap dapat berjalan
       dan hanya menampilkan teks informasi. Lakukan modifikasi program sehingga pada saat terjadi  
       queue overflow dan queue underflow, program dihentikan!
        : Kode program untuk pertanyaan ke-7 Percobaan 1 (Queue02)
```
package P10;

public class Queue02 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue02(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("OVERFLOW: Queue sudah penuh! Program dihentikan.");
            System.exit(1);
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
    }

    public int Dequeue() {
        if (IsEmpty()) {
            System.out.println("UNDERFLOW: Queue masih kosong! Program dihentikan.");
            System.exit(1);
        }
        int dt = data[front];
        size--;
        if (IsEmpty()) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
        return dt;
    }
}
```

          Kode program untuk pertanyaan ke-7 Percobaan 1 (QueueMain02 (Main))
```
package P10;

import java.util.Scanner;

public class QueueMain02 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue02 Q = new Queue02(n);
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;

                case 2:
                    int dataKeluar = Q.Dequeue();
                    System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    break;

                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih >= 1 && pilih <= 5);
    }
}
```

          Hasil kode program untuk pertanyaan ke-7 Percobaan 1
```
Masukkan kapasitas queue: 4
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------
1
Masukkan data baru: 15
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------
1
Masukkan data baru: 31
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------
1
Masukkan data baru: 52
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------
1
Masukkan data baru: 72
Masukkan operasi yang diinginkan:
1. Enqueue
2. Dequeue
3. Print
4. Peek
5. Clear
-------------------
1
Masukkan data baru: 82
OVERFLOW: Queue sudah penuh! Program dihentikan.
PS C:\Project2026\Algoritma-StrukturData> 
```

## 10.2 Percobaan 2

### 10.2.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 2 (Mahasiswa02)
```
package P10;

public class Mahasiswa02 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa02(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
```

➡ Kode program untuk percobaan 2 (AntrianLayanan02)
```
package P10;

public class AntrianLayanan02 {
    Mahasiswa02[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan02(int max) {
        this.max = max;
        this.data = new Mahasiswa02[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull () {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa02 mhs) {
        if (IsFull()) {
            System.out.println("Antrian Penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa02 layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa02 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public int getJumlahAntrian() {
        return size;
    }
}
```

➡ Kode program untuk percobaan 2 (LayananAkademikSIAKAD02 (Main))
```
package P10;

import java.util.Scanner;

public class LayananAkademikSIAKAD02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        AntrianLayanan02 antrian = new AntrianLayanan02(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = rappyAthya.nextInt(); rappyAthya.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = rappyAthya.nextLine();
                    System.out.print("Nama  : ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = rappyAthya.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = rappyAthya.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa02 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        rappyAthya.close();
    }
}
```

### 10.2.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2 
```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 1
NIM   : 124
Nama  : Bobi
Prodi : TI
Kelas : 1G
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 2
Melayani mahasiswa: 123 - Aldi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 5
Jumlah dalam antrian: 1

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
0. Keluar
Pilih menu: 0
Terima Kasih.
PS C:\Project2026\Algoritma-StrukturData> 
```

### 10.2.3 Pertanyaan

    1. Lakukan modifikasi program dengan menambahkan method baru bernama LihatAkhir pada class AntrianLayanan yang digunakan untuk mengecek 
       antrian yang berada di posisi belakang. Tambahkan pula daftar menu 6. Cek Antrian paling belakang pada class LayananAkademikSIAKAD 
       sehingga method LihatAkhir dapat dipanggil!
        : Kode program untuk pertanyaan ke-1 Percobaan 2 (AntrianLayanan02)
```
package P10;

public class AntrianLayanan02 {
    Mahasiswa02[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan02(int max) {
        this.max = max;
        this.data = new Mahasiswa02[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull () {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa02 mhs) {
        if (IsFull()) {
            System.out.println("Antrian Penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }

    public Mahasiswa02 layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa02 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.print("Mahasiswa paling belakang: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
}
```

          Kode program untuk pertanyaan ke-1 Percobaan 2 (LayananAkademikSIAKAD02 (Main))
```
package P10;

import java.util.Scanner;

public class LayananAkademikSIAKAD02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        AntrianLayanan02 antrian = new AntrianLayanan02(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = rappyAthya.nextInt(); rappyAthya.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = rappyAthya.nextLine();
                    System.out.print("Nama  : ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = rappyAthya.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = rappyAthya.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa02 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.lihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        rappyAthya.close();
    }
}
```

          Hasil kode program untuk pertanyaan ke-1 Percobaan 2
```
=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu: 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu: 1
NIM   : 124
Nama  : Bobi
Prodi : TI
Kelas : 1G
Bobi berhasil masuk ke antrian.

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu: 4
Daftar Mahasiswa dalam Antrian:
NIM - NAMA - PRODI - KELAS
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu: 3
Mahasiswa terdepan: NIM - NAMA - PRODI - KELAS
123 - Aldi - TI - 1A

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu: 6
Mahasiswa paling belakang: NIM - NAMA - PRODI - KELAS
124 - Bobi - TI - 1G

=== Menu Antrian Layanan Akademik ===
1. Tambah Mahasiswa ke Antrian
2. Layani Mahasiswa
3. Lihat Mahasiswa Terdepan
4. Lihat Semua Antrian
5. Jumlah Mahasiswa dalam Antrian
6. Cek Antrian Paling Belakang
0. Keluar
Pilih menu: 0
Terima Kasih.
PS C:\Project2026\Algoritma-StrukturData> 
```

#### Latihan 1
➡ Kode program untuk Tugas 1 (MahasiswaClass02)
```
package P10;

public class MahasiswaClass02 {
    public String nim;
    public String nama;
    public String prodi;
    public String kelas;

    public MahasiswaClass02(String nim, String nama, String prodi, String kelas) {
        this.nim   = nim;
        this.nama  = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}

```

➡ Kode program untuk Tugas 1 (AntrianKRS02)
```
package P10;

public class AntrianKRS02 {
    private MahasiswaClass02[] data;
    private int front;
    private int rear;
    private int size;
    private final int MAX = 10;
    private int totalDilayani;
    private final int KAPASITAS_DPA = 30;

    public AntrianKRS02() {
        data           = new MahasiswaClass02[MAX];
        front          = 0;
        rear           = -1;
        size           = 0;
        totalDilayani  = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX;
    }

    public void clearAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
            return;
        }
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(MahasiswaClass02 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh (maks " + MAX + "). " +
                    mhs.nama + " tidak dapat masuk antrian.");
            return;
        }
        rear = (rear + 1) % MAX;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian. " +
                "Nomor antrian: " + size);
    }

    public MahasiswaClass02[] panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil.");
            return null;
        }
        if (totalDilayani >= KAPASITAS_DPA) {
            System.out.println("DPA sudah mencapai batas " + KAPASITAS_DPA +
                    " mahasiswa. Sesi selesai.");
            return null;
        }

        int ambil = Math.min(2, size);
        ambil = Math.min(ambil, KAPASITAS_DPA - totalDilayani);

        MahasiswaClass02[] dipanggil = new MahasiswaClass02[ambil];
        for (int i = 0; i < ambil; i++) {
            dipanggil[i] = data[front];
            front = (front + 1) % MAX;
            size--;
            totalDilayani++;
        }
        return dipanggil;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n=== DAFTAR ANTRIAN KRS MAHASISWA ===");
        System.out.println("NIM - Nama - Prodi - Kelas");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % MAX;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int idx = (front + i) % MAX;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa Paling Akhir:");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getTotalDilayani() {
        return totalDilayani;
    }

    public int getBelumKRS() {
        return size;
    }

    public int getSisaKapasitasDPA() {
        return KAPASITAS_DPA - totalDilayani;
    }
}

```

➡ Kode program untuk Tugas 1 (LayananKRS02 (Main))
```
package P10;

import java.util.Scanner;

public class LayananKRS02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        AntrianKRS02 q = new AntrianKRS02();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN PERSETUJUAN KRS ===");
            System.out.println("1. Daftarkan mahasiswa ke antrian");
            System.out.println("2. Panggil antrian (proses KRS)");
            System.out.println("3. Lihat 2 antrian terdepan");
            System.out.println("4. Tampilkan semua antrian");
            System.out.println("5. Lihat antrian paling akhir");
            System.out.println("6. Cek antrian kosong");
            System.out.println("7. Cek antrian penuh");
            System.out.println("8. Kosongkan antrian");
            System.out.println("9. Jumlah mahasiswa dalam antrian");
            System.out.println("10. Jumlah mahasiswa sudah KRS");
            System.out.println("11. Jumlah mahasiswa belum KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine();

            switch (pilihan) {
                case 1:
                    if (q.isFull()) {
                        System.out.println("Antrian penuh! Tidak dapat mendaftar.");
                        break;
                    }
                    System.out.print("NIM   : ");
                    String nim = rappyAthya.nextLine();
                    System.out.print("Nama  : ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = rappyAthya.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = rappyAthya.nextLine();
                    q.tambahAntrian(new MahasiswaClass02(nim, nama, prodi, kelas));
                    break;
                case 2:
                    MahasiswaClass02[] dipanggil = q.panggilAntrian();
                    if (dipanggil != null) {
                        System.out.println("Memanggil " + dipanggil.length + " mahasiswa untuk proses KRS:");
                        for (int i = 0; i < dipanggil.length; i++) {
                            System.out.print((i + 1) + ". ");
                            dipanggil[i].tampilkanData();
                        }
                        System.out.println("Total sudah KRS  : " + q.getTotalDilayani());
                        System.out.println("Sisa kapasitas DPA: " + q.getSisaKapasitasDPA());
                    }
                    break;
                case 3:
                    q.lihatDuaTerdepan();
                    break;
                case 4:
                    q.tampilkanSemua();
                    break;
                case 5:
                    q.lihatAkhir();
                    break;
                case 6:
                    System.out.println(q.isEmpty()
                            ? "Antrian KOSONG."
                            : "Antrian TIDAK kosong (isi: " + q.getJumlahAntrian() + ").");
                    break;
                case 7:
                    System.out.println(q.isFull()
                            ? "Antrian PENUH (10/10)."
                            : "Antrian belum penuh (" + q.getJumlahAntrian() + "/10).");
                    break;
                case 8:
                    System.out.print("Yakin ingin mengosongkan antrian? (y/n): ");
                    if (rappyAthya.nextLine().equalsIgnoreCase("y"))
                        q.clearAntrian();
                    else
                        System.out.println("Dibatalkan.");
                    break;
                case 9:
                    System.out.println("Mahasiswa dalam antrian    : " + q.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Mahasiswa sudah proses KRS : " + q.getTotalDilayani());
                    break;
                case 11:
                    System.out.println("Mahasiswa belum proses KRS : " + q.getBelumKRS());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}

```

➡ Hasil kode program untuk Tugas 1 ( (Main))
```
=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 1
NIM   : 123
Nama  : Aldi
Prodi : TI
Kelas : 1A
Aldi berhasil masuk antrian. Nomor antrian: 1

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 1
NIM   : 124
Nama  : Bobi
Prodi : TI
Kelas : 1G
Bobi berhasil masuk antrian. Nomor antrian: 2

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 3
2 Mahasiswa Terdepan:
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 4

=== DAFTAR ANTRIAN KRS MAHASISWA ===
NIM - Nama - Prodi - Kelas
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 5
Mahasiswa Paling Akhir:
124 - Bobi - TI - 1G

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 6
Antrian TIDAK kosong (isi: 2).

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 7
Antrian belum penuh (2/10).

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 9
Mahasiswa dalam antrian    : 2

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 11
Mahasiswa belum proses KRS : 2

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 2
Memanggil 2 mahasiswa untuk proses KRS:
1. 123 - Aldi - TI - 1A
2. 124 - Bobi - TI - 1G
Total sudah KRS  : 2
Sisa kapasitas DPA: 28

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 10
Mahasiswa sudah proses KRS : 2

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 8
Yakin ingin mengosongkan antrian? (y/n): y
Antrian sudah kosong.

=== SISTEM ANTRIAN PERSETUJUAN KRS ===
1. Daftarkan mahasiswa ke antrian
2. Panggil antrian (proses KRS)
3. Lihat 2 antrian terdepan
4. Tampilkan semua antrian
5. Lihat antrian paling akhir
6. Cek antrian kosong
7. Cek antrian penuh
8. Kosongkan antrian
9. Jumlah mahasiswa dalam antrian
10. Jumlah mahasiswa sudah KRS
11. Jumlah mahasiswa belum KRS
0. Keluar
Pilih menu: 0
Terima kasih.
PS C:\Project2026\Algoritma-StrukturData> 
```