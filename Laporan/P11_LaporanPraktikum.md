|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020063 |
| Nama |  Ahmad Raffie Athaya H. |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/RappoyAthyaa/Algoritma-StrukturData) |

# Jobsheet #11 LINKED LIST

## 11.1 Percobaan 1

### 11.1.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (Mahasiswa02)
```
package P11;

public class Mahasiswa02 {
    String nim;
    String nama;
    String kelas;
    double ipk;

        public Mahasiswa02(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilkanInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
```

➡ Kode program untuk percobaan 1 (NodeMahasiswa02)
```
package P11;

public class NodeMahasiswa02 {
    Mahasiswa02 data;
    NodeMahasiswa02 next;

    public NodeMahasiswa02(Mahasiswa02 data, NodeMahasiswa02 next) {
        this.data = data;
        this.next = next;
    }
}
```

➡ Kode program untuk percobaan 1 (SingleLinkedList02)
```
package P11;

public class SingleLinkedList02 {
    NodeMahasiswa02 head;
    NodeMahasiswa02 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa02 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa02 input) {
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa02 input) {
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa02 input) {
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        NodeMahasiswa02 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa02 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa02 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa02(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}
```

➡ Kode program untuk percobaan 1 (SLIMain02 (Main))
```
package P11;

public class SLIMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();

        Mahasiswa02 mhs1 = new Mahasiswa02("21212203", "Dirga", "4D", 3.6);
        Mahasiswa02 mhs2 = new Mahasiswa02("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa02 mhs3 = new Mahasiswa02("22212227", "Cintia", "3C", 3.5);
        Mahasiswa02 mhs4 = new Mahasiswa02("23212201", "Simon", "2B", 3.8);

        sll.print(); 

        sll.addFirst(mhs1);
        sll.print();

        sll.addLast(mhs2); 
        sll.print(); 

        sll.insertAfter("Dirga", mhs3); 
        sll.insertAt(2, mhs4); 
        sll.print(); 
    }
}
```

### 11.1.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
Linked list kosong
Isi Linked List:
Dirga   21212203        4D      3.6

Isi Linked List:
Dirga   21212203        4D      3.6
Alvaro  24212200        1A      4.0

Isi Linked List:
Dirga   21212203        4D      3.6
Cintia  22212227        3C      3.5
Simon   23212201        2B      3.8
Alvaro  24212200        1A      4.0

PS C:\Project2026\Algoritma-StrukturData> 
```

### 11.1.3 Pertanyaan

    1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
        : Karena saat sll.print() pertama kali dipanggil, belum ada data yang dimasukkan ke dalam linked list. Di method print():
          Saat objek sll baru dibuat, head = null dan tail = null secara default. Maka isEmpty() mengembalikan true, sehingga program mencetak "Linked List Kosong".

    2. Jelaskan kegunaan variable temp secara umum pada setiap method!
        : Variabel temp digunakan sebagai pointer sementara untuk menelusuri node tanpa mengubah posisi head atau tail.

    3. Lakukan modifikasi agar data dapat ditambahkan dari keyboard!
        : Kode program untuk pertanyaan ke-3 Percobaan 1 (SLIMain02 (Main))
```
package P11;

import java.util.Scanner;

public class SLIMain02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        SingleLinkedList02 sll = new SingleLinkedList02();
        int pilihan;

        do {
            System.out.println("\n===== MENU LINKED LIST =====");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Insert After");
            System.out.println("4. Insert At (index)");
            System.out.println("5. Tampilkan List");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine(); 

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Nama   : "); String nama = rappyAthya.nextLine();
                System.out.print("NIM    : "); String nim = rappyAthya.nextLine();
                System.out.print("Kelas  : "); String kelas = rappyAthya.nextLine();
                System.out.print("IPK    : "); double ipk = rappyAthya.nextDouble();
                rappyAthya.nextLine();
                Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas, ipk);

                switch (pilihan) {
                    case 1:
                        sll.addFirst(mhs);
                        System.out.println("Data berhasil ditambahkan di awal.");
                        break;
                    case 2:
                        sll.addLast(mhs);
                        System.out.println("Data berhasil ditambahkan di akhir.");
                        break;
                    case 3:
                        System.out.print("Masukkan nama setelah node mana: ");
                        String key = rappyAthya.nextLine();
                        sll.insertAfter(key, mhs);
                        System.out.println("Data berhasil disisipkan setelah " + key);
                        break;
                    case 4:
                        System.out.print("Masukkan index: ");
                        int index = rappyAthya.nextInt();
                        rappyAthya.nextLine();
                        sll.insertAt(index, mhs);
                        System.out.println("Data berhasil disisipkan di index " + index);
                        break;
                }
            } else if (pilihan == 5) {
                sll.print();
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        System.out.println("Program selesai.");
        rappyAthya.close();
    }
}
```

          Hasil kode program untuk pertanyaan ke-3 Percobaan 1
```
===== MENU LINKED LIST =====
1. Add First
2. Add Last
3. Insert After
4. Insert At (index)
5. Tampilkan List
0. Keluar
Pilihan: 1
Nama   : Dirga
NIM    : 21212203
Kelas  : 4D
IPK    : 3,6
Data berhasil ditambahkan di awal.

===== MENU LINKED LIST =====
1. Add First
2. Add Last
3. Insert After
4. Insert At (index)
5. Tampilkan List
0. Keluar
Pilihan: 2
Nama   : Alvaro 
NIM    : 24212200
Kelas  : 1A
IPK    : 4,0
Data berhasil ditambahkan di akhir.

===== MENU LINKED LIST =====
1. Add First
2. Add Last
3. Insert After
4. Insert At (index)
5. Tampilkan List
0. Keluar
Pilihan: 3
Nama   : Cinta
NIM    : 22212202
Kelas  : 3C
IPK    : 3,5
Masukkan nama setelah node mana: Dirga
Data berhasil disisipkan setelah Dirga

===== MENU LINKED LIST =====
1. Add First
2. Add Last
3. Insert After
4. Insert At (index)
5. Tampilkan List
0. Keluar
Pilihan: 4
Nama   : Bimon 
NIM    : 23212201
Kelas  : 2B
IPK    : 3,8
Masukkan index: 2
Data berhasil disisipkan di index 2

===== MENU LINKED LIST =====
1. Add First
2. Add Last
3. Insert After
4. Insert At (index)
5. Tampilkan List
0. Keluar
Pilihan: 5
Isi Linked List:
Dirga   21212203        4D      3.6
Cinta   22212202        3C      3.5
Bimon   23212201        2B      3.8
Alvaro  24212200        1A      4.0


===== MENU LINKED LIST =====
1. Add First
2. Add Last
3. Insert After
4. Insert At (index)
5. Tampilkan List
0. Keluar
Pilihan: 0
Program selesai.
PS C:\Project2026\Algoritma-StrukturData> 
```

## 11.2 Percobaan 2

### 11.2.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 2 (SingleLinkedList02)
```
package P11;

import org.w3c.dom.Node;

public class SingleLinkedList02 {
    NodeMahasiswa02 head;
    NodeMahasiswa02 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa02 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilkanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa02 input) {
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa02 input) {
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa02 input) {
        NodeMahasiswa02 ndInput = new NodeMahasiswa02(input, null);
        NodeMahasiswa02 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa02 input) {
        if (index < 0) {
            System.out.println("indeks salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa02 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa02(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }

    public void getData(int index) {
        NodeMahasiswa02 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        tmp.data.tampilkanInformasi();
    }

    public int indexDf(String key) {
        NodeMahasiswa02 tmp = head;
        int index = 0;
        while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
            tmp = tmp.next;
            index++;
        }

        if (tmp == null) {
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa02 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    public void remove(String key) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else {
            NodeMahasiswa02 temp = head;
            while (temp != null) {
                if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
                    this.removeFirst();
                    break;
                } else if (temp.data.nama.equalsIgnoreCase(key)) {
                    temp.next = temp.next.next;
                    if (temp.next == null) {
                        tail = temp;
                    }
                    break;
                }
                temp = temp.next;
            }
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa02 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
```

➡ Kode program untuk percobaan 2 (SLIMain02 (Main))
```
package P11;

public class SLIMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();

        Mahasiswa02 mhs0 = new Mahasiswa02("21212200", "Andi", "3C", 3.2);  
        Mahasiswa02 mhs1 = new Mahasiswa02("22212202", "Cintia", "3C", 3.5); 
        Mahasiswa02 mhs2 = new Mahasiswa02("23212201", "Bimon", "2B", 3.8);  

        sll.addFirst(mhs0);
        sll.addLast(mhs1);
        sll.addLast(mhs2);

        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println();

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexDf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.print();

        sll.removeFirst();
        sll.print();
    }
}
```

### 11.2.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2 
```
data index 1 : 
Cintia  22212202        3C      3.5

data mahasiswa an Bimon berada pada index : 2

Isi Linked List:
Cintia  22212202        3C      3.5
Bimon   23212201        2B      3.8

Isi Linked List:
Bimon   23212201        2B      3.8

PS C:\Project2026\Algoritma-StrukturData> 
```

### 11.2.3 Pertanyaan

    1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan! 
        : Keyword break digunakan karena proses penghapusan hanya perlu dilakukan sekali — yaitu saat node dengan nama yang cocok (key) ditemukan pertama kali.
          Tanpa break, loop while akan terus berjalan meskipun node sudah ditemukan dan dihapus, yang bisa menyebabkan:
            - Pemborosan iterasi — mengecek sisa node yang tidak perlu
            - Error / bug — karena pointer temp sudah berubah akibat penghapusan, melanjutkan iterasi bisa menyebabkan NullPointerException

     2. Jelaskan kegunaan kode dibawah pada method remove
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        : temp.next = temp.next.next;
          Kode ini memotong node target dari linked list dengan cara melewatinya (bypass).

          if (temp.next == null) {
          tail = temp;
          }
          Setelah temp.next = temp.next.next dijalankan, jika temp.next bernilai null, artinya node yang dihapus tadi adalah node terakhir (tail). 
          Maka tail harus diperbarui menjadi temp (node sebelumnya), agar pointer tail tetap menunjuk ke node terakhir yang valid.

#### Latihan 1
➡ Kode program untuk Tugas 1 (MahasiswaClass02)
```
package P11;

public class MahasiswaClass02 {
    String nim;
    String nama;
    String keperluan;

    public MahasiswaClass02(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilkanInformasi() {
        System.out.printf("NIM: %-12s | Nama: %-15s | Keperluan: %s%n",
                nim, nama, keperluan);
    }
}
```

➡ Kode program untuk Tugas 1 (NodeTugas02)
```
package P11;

public class NodeTugas02 {
    MahasiswaClass02 data;
    NodeTugas02 next;

    public NodeTugas02(MahasiswaClass02 data) {
        this.data = data;
        this.next = null;
    }
}
```

➡ Kode program untuk Tugas 1 (QueueMahasiswa02)
```
package P11;

public class QueueMahasiswa02 {
    private NodeTugas02 head; 
    private NodeTugas02 tail; 
    private int size;

    public QueueMahasiswa02() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        int MAX = 10;
        return size >= MAX;
    }

    public void enqueue(MahasiswaClass02 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah antrian.");
            return;
        }
        NodeTugas02 newNode = new NodeTugas02(mhs);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk antrian. " +
                           "Nomor antrian: " + size);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dipanggil.");
            return;
        }
        System.out.println("\n>>> Memanggil mahasiswa:");
        head.data.tampilkanInformasi();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("Mahasiswa selesai dilayani. Sisa antrian: " + size + " orang.\n");
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian terdepan:");
        head.data.tampilkanInformasi();
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian paling akhir:");
        tail.data.tampilkanInformasi();
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + size + " orang.");
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("           DAFTAR ANTRIAN UNIT KEMAHASISWAAN            ");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        NodeTugas02 temp = head;
        int nomor = 1;
        while (temp != null) {
            System.out.print("No." + nomor + " | ");
            temp.data.tampilkanInformasi();
            temp = temp.next;
            nomor++;
        }
        System.out.println("──────────────────────────────────────────────────────");
    }

    public void clearQueue() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }
}
```

➡ Kode program untuk Tugas 1 (MainAntrian02 (Main))
```
package P11;

import java.util.Scanner;

public class MainAntrian02 {
    static Scanner rappyAthy = new Scanner(System.in);
    static QueueMahasiswa02 queue = new QueueMahasiswa02();

    public static void main(String[] args) {
        int pilihan;
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("       SISTEM ANTRIAN UNIT KEMAHASISWAAN                ");
        System.out.println("╚══════════════════════════════════════════════════════╝");

        do {
            tampilkanMenu();
            System.out.print("Pilih menu: ");
            pilihan = rappyAthy.nextInt();
            rappyAthy.nextLine(); 
            System.out.println();

            switch (pilihan) {
                case 1 -> daftarAntrian();
                case 2 -> queue.dequeue();
                case 3 -> queue.tampilkanAntrian();
                case 4 -> queue.peekFront();
                case 5 -> queue.peekRear();
                case 6 -> queue.jumlahAntrian();
                case 7 -> cekStatus();
                case 8 -> queue.clearQueue();
                case 0 -> System.out.println("Terima kasih! Program selesai.");
                default -> System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (pilihan != 0);
    }

    static void tampilkanMenu() {
        System.out.println("──────────────────────────────────────────────────────");
        System.out.println("  1. Daftar Antrian (Tambah Mahasiswa)");
        System.out.println("  2. Panggil Antrian (Layani Mahasiswa)");
        System.out.println("  3. Tampilkan Semua Antrian");
        System.out.println("  4. Lihat Antrian Terdepan");
        System.out.println("  5. Lihat Antrian Paling Akhir");
        System.out.println("  6. Jumlah Mahasiswa Mengantri");
        System.out.println("  7. Cek Status Antrian (Kosong/Penuh)");
        System.out.println("  8. Kosongkan Semua Antrian");
        System.out.println("  0. Keluar");
        System.out.println("──────────────────────────────────────────────────────");
    }

    static void daftarAntrian() {
        System.out.println("=== PENDAFTARAN ANTRIAN ===");
        System.out.print("NIM        : ");
        String nim = rappyAthy.nextLine();
        System.out.print("Nama       : ");
        String nama = rappyAthy.nextLine();
        System.out.print("Keperluan  : ");
        String keperluan = rappyAthy.nextLine();

        MahasiswaClass02 mhs = new MahasiswaClass02(nim, nama, keperluan);
        queue.enqueue(mhs);
    }

    static void cekStatus() {
        if (queue.isEmpty()) {
            System.out.println("Status antrian: KOSONG");
        } else if (queue.isFull()) {
            System.out.println("Status antrian: PENUH");
        } else {
            System.out.println("Status antrian: TERSEDIA");
        }
    }
}
```

➡ Hasil kode program untuk Tugas 1 
```
╔══════════════════════════════════════════════════════╗
       SISTEM ANTRIAN UNIT KEMAHASISWAAN                
╚══════════════════════════════════════════════════════╝
──────────────────────────────────────────────────────
  1. Daftar Antrian (Tambah Mahasiswa)
  2. Panggil Antrian (Layani Mahasiswa)
  3. Tampilkan Semua Antrian
  4. Lihat Antrian Terdepan
  5. Lihat Antrian Paling Akhir
  6. Jumlah Mahasiswa Mengantri
  7. Cek Status Antrian (Kosong/Penuh)
  8. Kosongkan Semua Antrian
  0. Keluar
──────────────────────────────────────────────────────
Pilih menu: 1

=== PENDAFTARAN ANTRIAN ===
NIM        : 22212202
Nama       : Cintia
Keperluan  : Mengambil kertas sks
Mahasiswa Cintia berhasil masuk antrian. Nomor antrian: 1

──────────────────────────────────────────────────────
  1. Daftar Antrian (Tambah Mahasiswa)
  2. Panggil Antrian (Layani Mahasiswa)
  3. Tampilkan Semua Antrian
  4. Lihat Antrian Terdepan
  5. Lihat Antrian Paling Akhir
  6. Jumlah Mahasiswa Mengantri
  7. Cek Status Antrian (Kosong/Penuh)
  8. Kosongkan Semua Antrian
  0. Keluar
──────────────────────────────────────────────────────
Pilih menu: 1

=== PENDAFTARAN ANTRIAN ===
NIM        : 23212201
Nama       : Bimon
Keperluan  : Bertemu dengan pak samsul
Mahasiswa Bimon berhasil masuk antrian. Nomor antrian: 2

──────────────────────────────────────────────────────
  1. Daftar Antrian (Tambah Mahasiswa)
  2. Panggil Antrian (Layani Mahasiswa)
  3. Tampilkan Semua Antrian
  4. Lihat Antrian Terdepan
  5. Lihat Antrian Paling Akhir
  6. Jumlah Mahasiswa Mengantri
  7. Cek Status Antrian (Kosong/Penuh)
  8. Kosongkan Semua Antrian
  0. Keluar
──────────────────────────────────────────────────────
Pilih menu: 3

╔══════════════════════════════════════════════════════╗
           DAFTAR ANTRIAN UNIT KEMAHASISWAAN            
╚══════════════════════════════════════════════════════╝
No.1 | NIM: 22212202     | Nama: Cintia          | Keperluan: Mengambil kertas sks
No.2 | NIM: 23212201     | Nama: Bimon           | Keperluan: Bertemu dengan pak samsul
──────────────────────────────────────────────────────

──────────────────────────────────────────────────────
  1. Daftar Antrian (Tambah Mahasiswa)
  2. Panggil Antrian (Layani Mahasiswa)
  3. Tampilkan Semua Antrian
  4. Lihat Antrian Terdepan
  5. Lihat Antrian Paling Akhir
  6. Jumlah Mahasiswa Mengantri
  7. Cek Status Antrian (Kosong/Penuh)
  8. Kosongkan Semua Antrian
  0. Keluar
──────────────────────────────────────────────────────
Pilih menu: 4

Antrian terdepan:
NIM: 22212202     | Nama: Cintia          | Keperluan: Mengambil kertas sks

──────────────────────────────────────────────────────
  1. Daftar Antrian (Tambah Mahasiswa)
  2. Panggil Antrian (Layani Mahasiswa)
  3. Tampilkan Semua Antrian
  4. Lihat Antrian Terdepan
  5. Lihat Antrian Paling Akhir
  6. Jumlah Mahasiswa Mengantri
  7. Cek Status Antrian (Kosong/Penuh)
  8. Kosongkan Semua Antrian
  0. Keluar
──────────────────────────────────────────────────────
Pilih menu: 5

Antrian paling akhir:
NIM: 23212201     | Nama: Bimon           | Keperluan: Bertemu dengan pak samsul

──────────────────────────────────────────────────────
  1. Daftar Antrian (Tambah Mahasiswa)
  2. Panggil Antrian (Layani Mahasiswa)
  3. Tampilkan Semua Antrian
  4. Lihat Antrian Terdepan
  5. Lihat Antrian Paling Akhir
  6. Jumlah Mahasiswa Mengantri
  7. Cek Status Antrian (Kosong/Penuh)
  8. Kosongkan Semua Antrian
  0. Keluar
──────────────────────────────────────────────────────
Pilih menu: 6

Jumlah mahasiswa yang masih mengantri: 2 orang.

──────────────────────────────────────────────────────
  1. Daftar Antrian (Tambah Mahasiswa)
  2. Panggil Antrian (Layani Mahasiswa)
  3. Tampilkan Semua Antrian
  4. Lihat Antrian Terdepan
  5. Lihat Antrian Paling Akhir
  6. Jumlah Mahasiswa Mengantri
  7. Cek Status Antrian (Kosong/Penuh)
  8. Kosongkan Semua Antrian
  0. Keluar
──────────────────────────────────────────────────────
Pilih menu: 7

Status antrian: TERSEDIA

──────────────────────────────────────────────────────
  1. Daftar Antrian (Tambah Mahasiswa)
  2. Panggil Antrian (Layani Mahasiswa)
  3. Tampilkan Semua Antrian
  4. Lihat Antrian Terdepan
  5. Lihat Antrian Paling Akhir
  6. Jumlah Mahasiswa Mengantri
  7. Cek Status Antrian (Kosong/Penuh)
  8. Kosongkan Semua Antrian
  0. Keluar
──────────────────────────────────────────────────────
Pilih menu: 2


>>> Memanggil mahasiswa:
NIM: 22212202     | Nama: Cintia          | Keperluan: Mengambil kertas sks
Mahasiswa selesai dilayani. Sisa antrian: 1 orang.


──────────────────────────────────────────────────────
  1. Daftar Antrian (Tambah Mahasiswa)
  2. Panggil Antrian (Layani Mahasiswa)
  3. Tampilkan Semua Antrian
  4. Lihat Antrian Terdepan
  5. Lihat Antrian Paling Akhir
  6. Jumlah Mahasiswa Mengantri
  7. Cek Status Antrian (Kosong/Penuh)
  8. Kosongkan Semua Antrian
  0. Keluar
──────────────────────────────────────────────────────
Pilih menu: 8

Semua antrian telah dikosongkan.

──────────────────────────────────────────────────────
  1. Daftar Antrian (Tambah Mahasiswa)
  2. Panggil Antrian (Layani Mahasiswa)
  3. Tampilkan Semua Antrian
  4. Lihat Antrian Terdepan
  5. Lihat Antrian Paling Akhir
  6. Jumlah Mahasiswa Mengantri
  7. Cek Status Antrian (Kosong/Penuh)
  8. Kosongkan Semua Antrian
  0. Keluar
──────────────────────────────────────────────────────
Pilih menu: 0

Terima kasih! Program selesai.

PS C:\Project2026\Algoritma-StrukturData> 
```