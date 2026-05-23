|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020063 |
| Nama |  Ahmad Raffie Athaya H. |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/RappoyAthyaa/Algoritma-StrukturData) |

# Jobsheet #12 Double Linked List

## 12.1 Percobaan 1

### 12.1.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (Mahasiswa02)
```
package P12;

public class Mahasiswa02 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    public Mahasiswa02(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println(
            "NIM    : " + nim +
            "\nNAMA   : " + nama +
            "\nKelas  : " + kelas +
            "\nIPK    : " + ipk
        );
    }
}
```

➡ Kode program untuk percobaan 1 (Node02)
```
package P12;

public class Node02 {
    Mahasiswa02 data;
    Node02 prev;
    Node02 next;

    public Node02(Mahasiswa02 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
```

➡ Kode program untuk percobaan 1 (DoblelinkdeList02)
```
package P12;

public class DoublelinkedList02 {
    Node02 head;
    Node02 tail;

    public DoublelinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node02 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }
}
```

➡ Kode program untuk percobaan 1 (DoubleLinkedListMain02 (Main))
```
package P12;

import java.util.Scanner;

public class DoubleLinkedListMain02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        DoublelinkedList02 list = new DoublelinkedList02();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine(); 

            switch (pilihan) {
                case 1:
                    Mahasiswa02 mhsAwal = inputMahasiswa(rappyAthya);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa02 mhsAkhir = inputMahasiswa(rappyAthya);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = rappyAthya.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa02 mhsBaru = inputMahasiswa(rappyAthya);
                    list.insertAfter(keyNim, mhsBaru);
                    break;
                case 4:
                    // list.removeFirst();
                    break;
                case 5:
                    // list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        rappyAthya.close();
    }

    private static Mahasiswa02 inputMahasiswa(Scanner rappyAthya) {
        System.out.print("Masukkan NIM   : ");
        String nim = rappyAthya.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = rappyAthya.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = rappyAthya.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = Double.parseDouble(rappyAthya.nextLine());
        return new Mahasiswa02(nim, nama, kelas, ipk);
    }
}
```

### 12.1.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 2
Masukkan NIM   : 123005
Masukkan Nama  : Harry
Masukkan Kelas : 1A
Masukkan IPK   : 3.76

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 3
Masukkan NIM yang dicari : 123005
Masukkan data baru: 
Masukkan NIM   : 123010
Masukkan Nama  : Potter
Masukkan Kelas : 1B
Masukkan IPK   : 3.55
Data berhasil disisipkan setelah NIM 123005

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 6
NIM    : 123005
NAMA   : Harry
Kelas  : 1A
IPK    : 3.76
NIM    : 123010
NAMA   : Potter
Kelas  : 1B
IPK    : 3.55

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 0
Program selesai.
PS C:\Project2026\Algoritma-StrukturData> 
```

### 12.1.3 Pertanyaan

    1. Jelaskan perbedaan struktur dan mekanisme traversal antara Single Linked List dan Double Linked List!
        : Single Linked List adalah struktur data linear di mana setiap node hanya memiliki satu pointer, yaitu next, yang menunjuk ke node berikutnya. 
          Karena hanya memiliki satu arah, traversal pada Single Linked List hanya dapat dilakukan dari head menuju tail (maju/forward). 
          Ketika ingin mengakses node sebelumnya, tidak ada cara langsung selain mengulang traversal dari awal.
          
          Double Linked List memiliki struktur yang lebih lengkap, di mana setiap node memiliki dua pointer yaitu next dan prev. 
          Pointer next menunjuk ke node sesudahnya, sedangkan prev menunjuk ke node sebelumnya. Dengan adanya dua pointer ini, 
          traversal dapat dilakukan dua arah — dari head ke tail maupun sebaliknya dari tail ke head — tanpa perlu mengulang dari awal.

    2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Jelaskan fungsi masing-masing atribut tersebut pada proses traversal dan manipulasi node!
        : Atribut next berfungsi sebagai penghubung dari node saat ini ke node yang berada sesudahnya dalam urutan linked list. 
          Dalam proses traversal maju, pointer next digunakan untuk berpindah dari satu node ke node berikutnya hingga mencapai null yang menandakan akhir dari list. 
          Dalam manipulasi node seperti penyisipan atau penghapusan, next digunakan untuk menyambungkan kembali node-node yang terdampak.

          Atribut prev berfungsi sebagai penghubung dari node saat ini ke node yang berada sebelumnya. Pointer ini memungkinkan traversal mundur dari tail menuju head. 
          Dalam proses manipulasi, prev sangat penting untuk menjaga konsistensi hubungan dua arah antar node, misalnya saat menyisipkan node baru di tengah list, 
          pointer prev dari node sesudahnya harus diperbarui agar tetap menunjuk ke node baru.

    3. Perhatikan konstruktor pada class DoubleLinkedList. Jelaskan fungsi konstruktor tersebut terhadap kondisi awal linked list!
        : Konstruktor pada class DoublelinkedList02 berfungsi untuk menginisialisasi kondisi awal linked list ketika objek pertama kali dibuat. 
          Dengan menetapkan head = null dan tail = null, konstruktor menyatakan bahwa linked list dalam keadaan kosong, belum memiliki node satu pun. 
          Kondisi ini menjadi acuan bagi method-method lain seperti isEmpty(), addFirst(), dan addLast() untuk menentukan perilaku yang tepat. Tanpa inisialisasi ini, 
          nilai head dan tail bisa berisi data sampah (garbage value) yang dapat menyebabkan error saat program berjalan.

    4. Perhatikan potongan kode berikut:
       if (isEmpty()) {
        head = tail = newNode;
       }
       Mengapa head dan tail harus menunjuk node yang sama ketika linked list masih kosong?
        : Ketika linked list masih kosong dan node pertama ditambahkan, node tersebut sekaligus menjadi node paling depan sekaligus paling belakang dalam list. 
          Oleh karena itu, baik head maupun tail harus menunjuk ke node yang sama. Jika hanya head yang diperbarui tanpa memperbarui tail, maka tail masih bernilai null, 
          sehingga operasi seperti addLast() yang bergantung pada tail akan gagal karena mencoba mengakses tail.next pada referensi null. Begitu pula sebaliknya. 
          Dengan memastikan keduanya menunjuk ke node yang sama sejak awal, integritas struktur linked list tetap terjaga untuk semua operasi selanjutnya.

    5. Modifikasi method print() agar menampilkan pesan "Linked List masih kosong" ketika tidak terdapat data pada linked list!
        : Kode program untuk pertanyaan ke-5 Percobaan 1 (DoublelinkedList02)
```
package P12;

public class DoublelinkedList02 {
    Node02 head;
    Node02 tail;

    public DoublelinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return; 
        }
        Node02 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.next;
        }
    }
}
```

          Hasil kode program untuk pertanyaan ke-5 Percobaan 1
```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 6
Linked List masih kosong.

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
0. Keluar
Pilih menu : 0
Program selesai.
PS C:\Project2026\Algoritma-StrukturData> 
```

    6. Modifikasi kode program dengan menambahkan method printReverse() untuk menampilkan seluruh data pada Double Linked List secara terbalik, dimulai dari node tail menuju head!
        : Kode program untuk pertanyaan ke-6 Percobaan 1 (DoublelinkedList02)
```
package P12;

public class DoublelinkedList02 {
    Node02 head;
    Node02 tail;

    public DoublelinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return; 
        }
        Node02 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        System.out.println("===== DATA (TERBALIK) =====");
        Node02 current = tail; 
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.prev; 
        }
    }
}
```

          Kode program untuk pertanyaan ke-6 Percobaan 1 (DoublelinkedListMain02 (Main))
```
package P12;

import java.util.Scanner;

public class DoubleLinkedListMain02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        DoublelinkedList02 list = new DoublelinkedList02();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data terbalik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine(); 

            switch (pilihan) {
                case 1:
                    Mahasiswa02 mhsAwal = inputMahasiswa(rappyAthya);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa02 mhsAkhir = inputMahasiswa(rappyAthya);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = rappyAthya.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa02 mhsBaru = inputMahasiswa(rappyAthya);
                    list.insertAfter(keyNim, mhsBaru);
                    break;
                case 4:
                    // list.removeFirst();
                    break;
                case 5:
                    // list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        rappyAthya.close();
    }

    private static Mahasiswa02 inputMahasiswa(Scanner rappyAthya) {
        System.out.print("Masukkan NIM   : ");
        String nim = rappyAthya.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = rappyAthya.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = rappyAthya.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = Double.parseDouble(rappyAthya.nextLine());
        return new Mahasiswa02(nim, nama, kelas, ipk);
    }
}
```

          Hasil kode program untuk pertanyaan ke-6 Percobaan 1
```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 2
Masukkan NIM   : 123005
Masukkan Nama  : Harry
Masukkan Kelas : 1A
Masukkan IPK   : 3.76

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 3
Masukkan NIM yang dicari : 123005
Masukkan data baru: 
Masukkan NIM   : 123010
Masukkan Nama  : Potter
Masukkan Kelas : 1B
Masukkan IPK   : 3.55
Data berhasil disisipkan setelah NIM 123005

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 1
Masukkan NIM   : 123009
Masukkan Nama  : Bruno
Masukkan Kelas : 1G
Masukkan IPK   : 3.45

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 6
NIM    : 123009
NAMA   : Bruno
Kelas  : 1G
IPK    : 3.45
---------------------------
NIM    : 123005
NAMA   : Harry
Kelas  : 1A
IPK    : 3.76
---------------------------
NIM    : 123010
NAMA   : Potter
Kelas  : 1B
IPK    : 3.55
---------------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 7
===== DATA (TERBALIK) =====
NIM    : 123010
NAMA   : Potter
Kelas  : 1B
IPK    : 3.55
---------------------------
NIM    : 123005
NAMA   : Harry
Kelas  : 1A
IPK    : 3.76
---------------------------
NIM    : 123009
NAMA   : Bruno
Kelas  : 1G
IPK    : 3.45
---------------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 0
Program selesai.
PS C:\Project2026\Algoritma-StrukturData> 
```

## 12.2 Percobaan 2

### 12.2.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 2 (DoblelinkdeList02)
```
package P12;

public class DoublelinkedList02 {
    Node02 head;
    Node02 tail;

    public DoublelinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return; 
        }
        Node02 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        System.out.println("===== DATA (TERBALIK) =====");
        Node02 current = tail; 
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.prev; 
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}
```

➡ Kode program untuk percobaan 2 (DoubleLinkedListMain02 (Main))
```
package P12;

import java.util.Scanner;

public class DoubleLinkedListMain02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        DoublelinkedList02 list = new DoublelinkedList02();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data terbalik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine(); 

            switch (pilihan) {
                case 1:
                    Mahasiswa02 mhsAwal = inputMahasiswa(rappyAthya);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa02 mhsAkhir = inputMahasiswa(rappyAthya);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = rappyAthya.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa02 mhsBaru = inputMahasiswa(rappyAthya);
                    list.insertAfter(keyNim, mhsBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        rappyAthya.close();
    }

    private static Mahasiswa02 inputMahasiswa(Scanner rappyAthya) {
        System.out.print("Masukkan NIM   : ");
        String nim = rappyAthya.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = rappyAthya.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = rappyAthya.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = Double.parseDouble(rappyAthya.nextLine());
        return new Mahasiswa02(nim, nama, kelas, ipk);
    }
}
```

### 12.2.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2 
```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 1
Masukkan NIM   : 123010
Masukkan Nama  : Potter
Masukkan Kelas : 1B
Masukkan IPK   : 3.55

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 2
Masukkan NIM   : 123005
Masukkan Nama  : Harry
Masukkan Kelas : 1A
Masukkan IPK   : 3.76

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 6
NIM    : 123010
NAMA   : Potter
Kelas  : 1B
IPK    : 3.55
---------------------------
NIM    : 123005
NAMA   : Harry
Kelas  : 1A
IPK    : 3.76
---------------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 4

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 6
NIM    : 123005
NAMA   : Harry
Kelas  : 1A
IPK    : 3.76
---------------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 0
Program selesai.
```

### 12.2.3 Pertanyaan

    1. Perhatikan potongan kode berikut pada method removeFirst():
       head = head.next;
       head.prev = null;
        : Statement pertama head = head.next berfungsi untuk memindahkan pointer head agar tidak lagi menunjuk ke node pertama yang akan dihapus, 
          melainkan menunjuk ke node kedua yang sebelumnya berada tepat setelah node pertama. Setelah statement ini dijalankan, 
          node pertama sudah tidak lagi dapat diakses melalui head, sehingga secara logika sudah terputus dari linked list. 
          Di Java, node yang tidak lagi direferensikan oleh apapun akan otomatis dibersihkan dari memori oleh Garbage Collector.

          Statement kedua head.prev = null berfungsi untuk memutus pointer prev dari node yang sekarang menjadi head baru (node kedua). 
          Sebelum statement ini dijalankan, pointer prev dari node kedua masih menunjuk ke node pertama yang sudah dihapus.
          Jika tidak diputus, maka secara teknis masih ada jalur untuk mengakses node yang seharusnya sudah dihapus tersebut, 
          yang dapat menyebabkan kebocoran memori atau inkonsistensi struktur. Dengan menetapkan head.prev = null, 
          node head yang baru benar-benar tidak lagi terhubung ke node manapun di belakangnya, sesuai dengan sifat node pertama dalam linked list.

        2. Modifikasi method removeFirst() dan removeLast() agar program menampilkan data yang berhasil dihapus!
        : Kode program untuk pertanyaan ke-2 Percobaan 2 (DoublelinkedList02)
```
package P12;

public class DoublelinkedList02 {
    Node02 head;
    Node02 tail;

    public DoublelinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return; 
        }
        Node02 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        System.out.println("===== DATA (TERBALIK) =====");
        Node02 current = tail; 
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.prev; 
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data yang dihapus.");
            return;
        }

        System.out.println("Data yang dihapus dari awal:");
        System.out.println("---------------------------");
        head.data.tampil();
        System.out.println("---------------------------");

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data berhasil dihapus dari awal list.\n");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data yang dihapus.");
            return;
        }

        System.out.println("Data yang dihapus dari akhir:");
        System.out.println("---------------------------");
        tail.data.tampil(); 
        System.out.println("---------------------------");

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data berhasil dihapus dari akhir list.\n");
    }
}
```

          Hasil kode program untuk pertanyaan ke-2 Percobaan 2
```
===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 1
Masukkan NIM   : 123010
Masukkan Nama  : Potter
Masukkan Kelas : 1B
Masukkan IPK   : 3.55

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 2
Masukkan NIM   : 123005
Masukkan Nama  : Harry
Masukkan Kelas : 1A
Masukkan IPK   : 3.76

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 5
Data yang dihapus dari akhir:
---------------------------
NIM    : 123005
NAMA   : Harry
Kelas  : 1A
IPK    : 3.76
---------------------------
Data berhasil dihapus dari akhir list.


===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 6
NIM    : 123010
NAMA   : Potter
Kelas  : 1B
IPK    : 3.55
---------------------------

===== MENU DOUBLE LINKED LIST =====
1. Tambah data di awal
2. Tambah data di akhir
3. Sisipkan data di tengah (setelah NIM)
4. Hapus data di awal
5. Hapus data di akhir
6. Tampilkan data
7. Tampilkan data terbalik
0. Keluar
Pilih menu : 0
Program selesai.
PS C:\Project2026\Algoritma-StrukturData> 
```

#### Latihan 1
➡ Kode program untuk Tugas 1 (DoublelinkedList02)
```
package P12;

public class DoublelinkedList02 {
    Node02 head;
    Node02 tail;
    private int size; 

    public DoublelinkedList02() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void printSize() {
        System.out.println("Jumlah data dalam list: " + size);
    }

    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa02 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks tidak valid! Indeks harus antara 0 dan " + size);
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node02 newNode = new Node02(data);
        Node02 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
        System.out.println("Data berhasil ditambahkan pada indeks " + index);
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim);
            return;
        }

        Node02 toDelete = current.next;
        System.out.println("Data yang dihapus setelah NIM " + keyNim + ":");
        System.out.println("---------------------------");
        toDelete.data.tampil();
        System.out.println("---------------------------");

        if (toDelete == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }
        size--;
        System.out.println("Data berhasil dihapus.");
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid! Indeks harus antara 0 dan " + (size - 1));
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }

        Node02 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data yang dihapus pada indeks " + index + ":");
        System.out.println("---------------------------");
        current.data.tampil();
        System.out.println("---------------------------");

        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        System.out.println("Data berhasil dihapus.\n");
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("Data pertama (head):");
        System.out.println("---------------------------");
        head.data.tampil();
        System.out.println("---------------------------");
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("Data terakhir (tail):");
        System.out.println("---------------------------");
        tail.data.tampil();
        System.out.println("---------------------------");
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid! Indeks harus antara 0 dan " + (size - 1));
            return;
        }

        Node02 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada indeks " + index + ":");
        System.out.println("---------------------------");
        current.data.tampil();
        System.out.println("---------------------------");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("===== DAFTAR DATA =====");
        Node02 current = head;
        int i = 0;
        while (current != null) {
            System.out.println("[Indeks " + i + "]");
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.next;
            i++;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("===== DATA (TERBALIK) =====");
        Node02 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data yang dihapus.");
            return;
        }
        System.out.println("Data yang dihapus dari awal:");
        System.out.println("---------------------------");
        head.data.tampil();
        System.out.println("---------------------------");

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data berhasil dihapus dari awal list.\n");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data yang dihapus.");
            return;
        }
        System.out.println("Data yang dihapus dari akhir:");
        System.out.println("---------------------------");
        tail.data.tampil();
        System.out.println("---------------------------");

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data berhasil dihapus dari akhir list.\n");
    }
}
```

➡ Kode program untuk Tugas 1 (DoubleLinkedListMain02 (Main))
```
package P12;

import java.util.Scanner;

public class DoubleLinkedListMain02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        DoublelinkedList02 list = new DoublelinkedList02();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1.  Tambah data di awal");
            System.out.println("2.  Tambah data di akhir");
            System.out.println("3.  Sisipkan data setelah NIM");
            System.out.println("4.  Hapus data di awal");
            System.out.println("5.  Hapus data di akhir");
            System.out.println("6.  Tampilkan data");
            System.out.println("7.  Tampilkan data terbalik");
            System.out.println("8.  Tambah data pada indeks tertentu");
            System.out.println("9.  Hapus data setelah NIM");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Lihat data pertama");
            System.out.println("12. Lihat data terakhir");
            System.out.println("13. Lihat data pada indeks tertentu");
            System.out.println("14. Jumlah data dalam list");
            System.out.println("0.  Keluar");
            System.out.print("Pilih menu : ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine();

            switch (pilihan) {
                case 1:
                    list.addFirst(inputMahasiswa(rappyAthya));
                    break;
                case 2:
                    list.addLast(inputMahasiswa(rappyAthya));
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = rappyAthya.nextLine();
                    list.insertAfter(keyNim, inputMahasiswa(rappyAthya));
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 8:
                    System.out.print("Masukkan indeks tujuan : ");
                    int idxAdd = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    list.add(idxAdd, inputMahasiswa(rappyAthya));
                    break;
                case 9:
                    System.out.print("Masukkan NIM : ");
                    String nimAfter = rappyAthya.nextLine();
                    list.removeAfter(nimAfter);
                    break;
                case 10:
                    System.out.print("Masukkan indeks yang dihapus : ");
                    int idxRemove = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    list.remove(idxRemove);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan indeks : ");
                    int idxGet = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    list.getIndex(idxGet);
                    break;
                case 14:
                    list.printSize();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
    }

    private static Mahasiswa02 inputMahasiswa(Scanner rappyAthya) {
        System.out.print("Masukkan NIM   : ");
        String nim = rappyAthya.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = rappyAthya.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = rappyAthya.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = Double.parseDouble(rappyAthya.nextLine());
        return new Mahasiswa02(nim, nama, kelas, ipk);
    }
}
```

➡ Hasil kode program untuk Tugas 1 
```
===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 1
Masukkan NIM   : 123010
Masukkan Nama  : Potter
Masukkan Kelas : 1B
Masukkan IPK   : 3.55

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 2
Masukkan NIM   : 123005
Masukkan Nama  : Harry
Masukkan Kelas : 1A
Masukkan IPK   : 3.76

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 3
Masukkan NIM yang dicari : 123005
Masukkan NIM   : 123004
Masukkan Nama  : Bruno
Masukkan Kelas : 1D
Masukkan IPK   : 3.58
Data berhasil disisipkan setelah NIM 123005

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 6
===== DAFTAR DATA =====
[Indeks 0]
NIM    : 123010
NAMA   : Potter
Kelas  : 1B
IPK    : 3.55
---------------------------
[Indeks 1]
NIM    : 123005
NAMA   : Harry
Kelas  : 1A
IPK    : 3.76
---------------------------
[Indeks 2]
NIM    : 123004
NAMA   : Bruno
Kelas  : 1D
IPK    : 3.58
---------------------------

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 8
Masukkan indeks tujuan : 1
Masukkan NIM   : 123002
Masukkan Nama  : Sony
Masukkan Kelas : 1A
Masukkan IPK   : 3.45
Data berhasil ditambahkan pada indeks 1

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 11
Data pertama (head):
---------------------------
NIM    : 123010
NAMA   : Potter
Kelas  : 1B
IPK    : 3.55
---------------------------

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 12
Data terakhir (tail):
---------------------------
NIM    : 123004
NAMA   : Bruno
Kelas  : 1D
IPK    : 3.58
---------------------------

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 13
Masukkan indeks : 2
Data pada indeks 2:
---------------------------
NIM    : 123005
NAMA   : Harry
Kelas  : 1A
IPK    : 3.76
---------------------------

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 14
Jumlah data dalam list: 4

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 9
Masukkan NIM : 123004
Tidak ada node setelah NIM 123004

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 10
Masukkan indeks yang dihapus : 1
Data yang dihapus pada indeks 1:
---------------------------
NIM    : 123002
NAMA   : Sony
Kelas  : 1A
IPK    : 3.45
---------------------------
Data berhasil dihapus.


===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 6
===== DAFTAR DATA =====
[Indeks 0]
NIM    : 123010
NAMA   : Potter
Kelas  : 1B
IPK    : 3.55
---------------------------
[Indeks 1]
NIM    : 123005
NAMA   : Harry
Kelas  : 1A
IPK    : 3.76
---------------------------
[Indeks 2]
NIM    : 123004
NAMA   : Bruno
Kelas  : 1D
IPK    : 3.58
---------------------------

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 9
Masukkan NIM : 123010
Data yang dihapus setelah NIM 123010:
---------------------------
NIM    : 123005
NAMA   : Harry
Kelas  : 1A
IPK    : 3.76
---------------------------
Data berhasil dihapus.

===== MENU DOUBLE LINKED LIST =====
1.  Tambah data di awal
2.  Tambah data di akhir
3.  Sisipkan data setelah NIM
4.  Hapus data di awal
5.  Hapus data di akhir
6.  Tampilkan data
7.  Tampilkan data terbalik
8.  Tambah data pada indeks tertentu
9.  Hapus data setelah NIM
10. Hapus data pada indeks tertentu
11. Lihat data pertama
12. Lihat data terakhir
13. Lihat data pada indeks tertentu
14. Jumlah data dalam list
0.  Keluar
Pilih menu : 0
Program selesai.
PS C:\Project2026\Algoritma-StrukturData> 
```