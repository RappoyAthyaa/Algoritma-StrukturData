|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020063 |
| Nama |  Ahmad Raffie Athaya H. |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/RappoyAthyaa/Algoritma-StrukturData) |

# Jobsheet #14 Tree

## 14.1 Percobaan 1

### 14.1.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (Mahasiswa02)
```
package P13;

public class Mahasiswa02 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa02() {
    }

    public Mahasiswa02(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + this.nim + " " +
                           "Nama: " + this.nama + " " +
                           "Kelas: " + this.kelas + " " +
                           "IPK: " + this.ipk);
    }
}
```

➡ Kode program untuk percobaan 1 (Node02)
```
package P13;

public class Node02 {
    Mahasiswa02 mahasiswa;
    Node02 left, right;

    public Node02() {
    }

    public Node02(Mahasiswa02 mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.left = null;
        this.right = null;
    }
}
```

➡ Kode program untuk percobaan 1 (BinaryTree02)
```
package P13;

public class BinaryTree02 {
    Node02 root;

    public BinaryTree02() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa02 mahasiswa) {
        Node02 newNode = new Node02(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node02 current = root;
            Node02 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node02 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node02 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node02 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node02 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    public Node02 getSuccessor(Node02 del) {
        Node02 successor = del.right;
        Node02 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node02 parent = root;
        Node02 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {

            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } 

            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } 

            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } 
            else {
                Node02 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }
}
```

➡ Kode program untuk percobaan 1 (BinaryTreeMain02 (Main))
```
package P13;

public class BinaryTreeMain02 {
    public static void main(String[] args) {
        BinaryTree02 bst = new BinaryTree02();

        bst.add(new Mahasiswa02("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa02("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa02("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa02("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 -> ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 -> ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa02("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa02("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa02("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);

        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);
    }
}
```

### 14.1.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
Daftar semua mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Pencarian data mahasiswa:
Cari mahasiswa dengan ipk: 3.54 -> Ditemukan
Cari mahasiswa dengan ipk: 3.22 -> Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa:
InOrder Traversal:
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

PreOrder Traversal:
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

PostOrder Traversal:
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57

Penghapusan data mahasiswa
Jika 2 anak, current = 
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
PS C:\Project2026\Algoritma-StrukturData> 
```

### 14.1.3 Pertanyaan

    1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa?
        : Karena Binary Search Tree (BST) memiliki aturan penempatan data yang terstruktur : semua node di sebelah kiri parent pasti memiliki nilai yang lebih kecil, 
          dan semua  node di sebelah kanan pasti memiliki nilai yang lebih besar.
          Aturan ini membuat kompleksitas waktu pencarian rata-rata menjadi $O(\log n)$ karena setiap kali kita melakukan perbandingan di sebuah node, kita bisa langsung mengeliminasi setengah sisa jalur pohon yang tidak sesuai.
          Sementara pada Binary Tree biasa, datanya diacak tanpa aturan tertentu, sehingga untuk mencari data kita harus memeriksa seluruh node satu per satu (seperti pencarian linier) dengan kompleksitas $O(n)$.  

    2. Untuk apakah di class Node, kegunaan dari atribut left dan right?
        : Atribut left dan right bertindak sebagai pointer atau referensi alamat memori untuk menghubungkan node saat ini dengan node-node anaknya (child nodes).
          * left digunakan untuk menunjuk/menyimpan referensi ke anak kiri (left child).
          * right digunakan untuk menunjuk/menyimpan referensi ke anak kanan (right child).
          Tanpa kedua atribut ini, struktur pohon (tree) tidak akan bisa terbentuk karena antar-simpul tidak saling terhubung.

    3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree?
       b. Ketika objek tree pertama kali dibuat, apakah nilai dari root?
        : a. Kegunaan root: Sebagai pintu masuk utama atau titik awal (akar) untuk mengakses seluruh struktur Binary Tree. 
             Karena tree diakses secara hierarki dari atas ke bawah, kita wajib mengetahui posisi paling atas (root) agar bisa melakukan operasi 
             seperti pencarian, penambahan, atau penghapusan data.  
          b. Nilai root di awal: Ketika objek tree pertama kali dibuat lewat konstruktor, nilai dari root adalah null. 
             Nilai null ini menandakan bahwa tree tersebut masih dalam keadaan kosong.

    4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi?
        : Program akan mengecek kondisi awal melalui fungsi isEmpty(). Jika terdeteksi bahwa tree masih kosong (root == null), maka node baru (newNode) yang baru saja dibuat 
          akan langsung ditunjuk dan diangkat menjadi root dari tree tersebut. Setelah itu, proses fungsi penambahan langsung selesai (return) tanpa menjalankan perulangan pencarian posisi.

    5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut?
            parent = current;
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current = current.left;
            if (current == null) {
                parent.left = newNode;
                return;
            }
        } else {
            current = current.right;
            if (current == null) {
                parent.right = newNode;
                return;
            }
        }
        : Potongan kode di atas digunakan untuk mencari posisi kosong yang tepat bagi node baru berdasarkan aturan Binary Search Tree secara non-rekursif:
            1. parent = current; $\rightarrow$ Menyimpan node saat ini sebagai orang tua (parent) sebelum program melangkah turun ke node anak di bawahnya.
            2. if (mahasiswa.ipk < current.mahasiswa.ipk) $\rightarrow$ Mengecek apakah IPK mahasiswa baru lebih kecil dari IPK node saat ini. Jika ya, 
               program bergeser ke kiri dengan perintah current = current.left;.
            3. if (current == null) $\rightarrow$ Jika setelah bergeser ternyata jalurnya kosong (null), artinya posisi tersebut adalah tempat yang tepat. 
               Program akan memasang node baru di sebelah kiri parent (parent.left = newNode;) dan menghentikan fungsi (return;).
            4. else { current = current.right; ... } $\rightarrow$ Jika IPK mahasiswa baru lebih besar atau sama dengan IPK node saat ini, 
               program akan bergeser ke kanan (current = current.right;). Jika jalurnya kosong, node baru dipasang di sebelah kanan parent 
               (parent.right = newNode;) dan fungsi selesai.

    6. Jelaskan langkah-langkah pada method delete() saat menghapus sebuah node yang memiliki dua anak. Bagaimana method getSuccessor() membantu dalam proses ini?
        : Langkah-langkah penghapusan node dengan 2 anak:
          1. Program mendeteksi bahwa node yang ingin dihapus (current) memiliki left != null dan right != null.
          2. Program memanggil method getSuccessor(current) untuk mencari node pengganti yang paling cocok.
          3. Setelah node successor (pengganti) ditemukan, posisi current pada tree akan digantikan oleh successor tersebut (baik sebagai root baru atau sebagai anak 
             dari parent milik current).
          4. Ikat kembali anak kiri dari node lama yang dihapus ke anak kiri milik successor (successor.left = current.left;) agar struktur pohon tidak patah. 
             Bagaimana getSuccessor() membantu:Method getSuccessor() membantu dengan cara mencari nilai terkecil dari sub-pohon sebelah kanan (in-order successor) dari node yang akan dihapus.
          Caranya adalah dengan pergi ke anak kanan dari data yang mau dihapus (del.right), lalu menelusuri silsilah anak kiri sekecil mungkin sampai mentok 
          (while(successor.left != null)).
          Node inilah yang paling aman menggantikan posisi node yang dihapus agar struktur dan aturan urutan Binary Search Tree tetap terjaga 
          (tidak merusak posisi data lainnya). 

## 14.2 Percobaan 2

### 14.2.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (BinaryTreeArray02)
```
package P13;

public class BinaryTreeArray02 {
    Mahasiswa02[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray02() {
        this.dataMahasiswa = new Mahasiswa02[10];
    }

    void populateData(Mahasiswa02 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa[idxStart].tampilInformasi(); 
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}
```

➡ Kode program untuk percobaan 1 (BinaryTreeMain02 (Main))
```
package P13;

public class BinaryTreeArrayMain02 {
    public static void main(String[] args) {
        BinaryTreeArray02 bta = new BinaryTreeArray02();

        Mahasiswa02 mhs1 = new Mahasiswa02("244160121", "Ali", "A", 3.57);
        Mahasiswa02 mhs2 = new Mahasiswa02("244160185", "Candra", "C", 3.41);
        Mahasiswa02 mhs3 = new Mahasiswa02("244160221", "Badar", "B", 3.75);
        Mahasiswa02 mhs4 = new Mahasiswa02("244160220", "Dewi", "B", 3.35);
        Mahasiswa02 mhs5 = new Mahasiswa02("244160131", "Devi", "A", 3.48);
        Mahasiswa02 mhs6 = new Mahasiswa02("244160205", "Ehsan", "D", 3.61);
        Mahasiswa02 mhs7 = new Mahasiswa02("244160170", "Fizi", "B", 3.86);

        Mahasiswa02[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;

        bta.populateData(dataMahasiswas, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}
```

### 14.2.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
Inorder Traversal Mahasiswa: 
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.35
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.41
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.48
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.61
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.75
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.86
PS C:\Project2026\Algoritma-StrukturData> 
```

### 14.2.3 Pertanyaan

    1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
        : Atribut dataMahasiswa (atau data): Berfungsi sebagai wadah atau tempat penyimpanan utama untuk menyimpan 
          objek-objek data mahasiswa di dalam memori berurutan (array).

          Atribut idxLast: Berfungsi untuk mencatat nilai indeks terakhir dari elemen array yang terisi oleh data pohon biner. 
          Atribut ini sangat penting digunakan sebagai batas akhir atau kondisi berhenti (boundary) saat melakukan penelusuran secara rekursif agar program tidak mengakses 
          indeks array kosong yang melebihi batas data yang ada.

    2. Apakah kegunaan dari method populateData()?
        : Method populateData() digunakan untuk memasukkan sekumpulan data (dalam bentuk array parameter) beserta batas indeks terakhirnya secara langsung ke dalam objek 
          BinaryTreeArray00. Proses ini mempermudah inisialisasi awal atau pengisian seluruh data pohon biner secara instan dari method main tanpa harus
          memasukkan datanya satu per satu.

    3. Apakah kegunaan dari method traverseInOrder()?
        : Method traverseInOrder() kegunaannya adalah untuk menelusuri (traverse) dan menampilkan seluruh informasi data mahasiswa yang tersimpan di dalam pohon biner 
          berbasis array. Penelusuran ini menggunakan urutan pola In-Order, yaitu mengunjungi anak kiri (left child) terlebih dahulu, 
          lalu memproses/menampilkan data node induk (current), dan terakhir mengunjungi anak kanan (right child).

    4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan right child masing-masing?
        : Penentuan posisi indeks anak di dalam array menggunakan rumus representasi pohon biner:
          Left Child = 2 x idxStart + 1
          Right Child = 2 x idxStart + 2

          Jika node parent berada di indeks 2 ($\text{idxStart} = 2$), maka perhitungannya adalah:
          Posisi Left Child = 2 x 2 + 1 = 5
          Posisi Right Child = 2 x 2 + 2 = 6

    5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4?
        : Pernyataan int idxLast = 6; digunakan untuk memberikan batas kepada sistem bahwa data pohon biner yang valid di dalam array tersebut hanya terisi sampai indeks ke-6 
          (yaitu objek mhs7 atau "Fizi"). Angka ini menjadi acuan kondisi berhenti pada fungsi rekursif traverseInOrder() lewat pengecekan if (idxStart <= idxLast)
           agar program tidak terus membaca ruang kosong sisa array (indeks 7, 8, 9) yang bernilai null.

    6. Mengapa indeks 2*idxStart+1 dan 2*idxStart+2 digunakan dalam pemanggilan rekursif, dan apa kaitannya dengan struktur pohon biner yang disusun dalam array?
        : Formula rumus 2 * idxStart + 1 dan 2 * idxStart + 2 digunakan karena merupakan rumus standar pemetaan matematis untuk merepresentasikan hierarki hubungan orang tua-anak 
          (parent-child relationship) dari sebuah Binary Tree ke dalam sebuah array linier tunggal.Kaitannya dengan struktur pohon biner adalah:
          Perkalian dengan angka 2 mencerminkan karakteristik pohon biner di mana setiap simpul/node bercabang maksimal menjadi 2 anak (kiri dan kanan).
          Penambahan $+1$ secara konsisten akan selalu mengarah pada posisi slot indeks anak sebelah kiri (left child) di dalam susunan level array.
          Penambahan $+2$ secara konsisten akan selalu mengarah pada posisi slot indeks anak sebelah kanan (right child) di dalam susunan level array.
          Dengan rumus ini, hubungan hierarki antar-node tetap terjaga dengan rapi dan dapat ditelusuri dengan tepat menggunakan pola indeks array tanpa membutuhkan pointer seperti pada linked list.

#### Latihan 1-3
➡ Kode program untuk Tugas (BinaryTree02)
```
package P14;

public class BinaryTree02 {
    Node02 root;

    public BinaryTree02() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa02 mahasiswa) {
        Node02 newNode = new Node02(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node02 current = root;
            Node02 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(double ipk) {
        boolean result = false;
        Node02 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    public void traversePreOrder(Node02 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traverseInOrder(Node02 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePostOrder(Node02 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    public Node02 getSuccessor(Node02 del) {
        Node02 successor = del.right;
        Node02 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }

        Node02 parent = root;
        Node02 current = root;
        boolean isLeftChild = false;

        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {

            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } 

            else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } 

            else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } 
            else {
                Node02 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // Tugas 1
    public void addRekursif(Mahasiswa02 mahasiswa) {
        root = addRekursifHadir(root, mahasiswa);
    }

    private Node02 addRekursifHadir(Node02 current, Mahasiswa02 mahasiswa) {
        if (current == null) {
            return new Node02(mahasiswa);
        }

        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifHadir(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursifHadir(current.right, mahasiswa);
        }
        
        return current;
    }

    // Tugas 2
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }
        Node02 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.print("Mahasiswa dengan IPK Terkecil -> ");
        current.mahasiswa.tampilInformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong!");
            return;
        }
        Node02 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.print("Mahasiswa dengan IPK Terbesar -> ");
        current.mahasiswa.tampilInformasi();
    }

    // Tugas 3
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Daftar Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilIPKdiAtasRekursif(root, ipkBatas);
    }

    private void tampilIPKdiAtasRekursif(Node02 node, double ipkBatas) {
        if (node != null) {
            tampilIPKdiAtasRekursif(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilIPKdiAtasRekursif(node.right, ipkBatas);
        }
    }
}
```

➡ Kode program untuk Tugas (BinaryTreeMain02 (Main))
```
package P14;

public class BinaryTreeMain02 {
    public static void main(String[] args) {
        BinaryTree02 bst = new BinaryTree02();

        bst.add(new Mahasiswa02("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa02("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa02("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa02("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPencarian data mahasiswa:");
        System.out.print("Cari mahasiswa dengan ipk: 3.54 -> ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.print("Cari mahasiswa dengan ipk: 3.22 -> ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa02("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa02("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa02("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.root);

        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.root);

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);

        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        System.out.println("\n--- PENGUJIAN TUGAS BST LINKED LIST ---");
        
        bst.cariMinIPK();
        bst.cariMaxIPK();
        
        bst.tampilMahasiswaIPKdiAtas(3.50);
    }
}
```

➡ Hasil kode program untuk Tugas 
```

Daftar semua mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

Pencarian data mahasiswa:
Cari mahasiswa dengan ipk: 3.54 -> Ditemukan
Cari mahasiswa dengan ipk: 3.22 -> Tidak ditemukan

Daftar semua mahasiswa setelah penambahan 3 mahasiswa:
InOrder Traversal:
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

PreOrder Traversal:
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

PostOrder Traversal:
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57

Penghapusan data mahasiswa
Jika 2 anak, current = 
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72

Daftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.37
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.46
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85

--- PENGUJIAN TUGAS BST LINKED LIST ---
Mahasiswa dengan IPK Terkecil -> NIM: 244160185 Nama: Candra Kelas: C IPK: 3.21
Mahasiswa dengan IPK Terbesar -> NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
Daftar Mahasiswa dengan IPK di atas 3.5:
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.54
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.72
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.85
PS C:\Project2026\Algoritma-StrukturData> 
```

#### Latihan 4
➡ Kode program untuk Tugas (BinaryTreeArray02)
```
package P14;

public class BinaryTreeArray02 {
    Mahasiswa02[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray02() {
        this.dataMahasiswa = new Mahasiswa02[10];
        this.idxLast = -1;
    }

    void populateData(Mahasiswa02 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // Method add() Tugas 4
    public void add(Mahasiswa02 data) {
        if (idxLast >= dataMahasiswa.length - 1) {
            System.out.println("Tree Array sudah penuh!");
            return;
        }
        idxLast++; 
        dataMahasiswa[idxLast] = data;
        System.out.println("Berhasil menambahkan " + data.nama + " di indeks ke-" + idxLast);
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
```

➡ Kode program untuk Tugas (BinaryTreeMain02 (Main))
```
package P14;

public class BinaryTreeArrayMain02 {
    public static void main(String[] args) {
        BinaryTreeArray02 bta = new BinaryTreeArray02();

        Mahasiswa02 mhs1 = new Mahasiswa02("244160121", "Ali", "A", 3.57);
        Mahasiswa02 mhs2 = new Mahasiswa02("244160185", "Candra", "C", 3.41);
        Mahasiswa02 mhs3 = new Mahasiswa02("244160221", "Badar", "B", 3.75);
        Mahasiswa02 mhs4 = new Mahasiswa02("244160220", "Dewi", "B", 3.35);
        Mahasiswa02 mhs5 = new Mahasiswa02("244160131", "Devi", "A", 3.48);
        Mahasiswa02 mhs6 = new Mahasiswa02("244160205", "Ehsan", "D", 3.61);
        Mahasiswa02 mhs7 = new Mahasiswa02("244160170", "Fizi", "B", 3.86);

        System.out.println("=== PENGUJIAN TUGAS 4: METHOD add() ===");
        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs7);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\n=== PENGUJIAN TUGAS 4: METHOD traversePreOrder() ===");
        System.out.println("PreOrder Traversal Mahasiswa: ");
        bta.traversePreOrder(0);
    }
}
```

➡ Hasil kode program untuk Tugas 
```
=== PENGUJIAN TUGAS 4: METHOD add() ===
Berhasil menambahkan Ali di indeks ke-0
Berhasil menambahkan Candra di indeks ke-1
Berhasil menambahkan Badar di indeks ke-2
Berhasil menambahkan Dewi di indeks ke-3
Berhasil menambahkan Devi di indeks ke-4
Berhasil menambahkan Ehsan di indeks ke-5
Berhasil menambahkan Fizi di indeks ke-6

Inorder Traversal Mahasiswa: 
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.35
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.41
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.48
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.61
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.75
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.86

=== PENGUJIAN TUGAS 4: METHOD traversePreOrder() ===
PreOrder Traversal Mahasiswa: 
NIM: 244160121 Nama: Ali Kelas: A IPK: 3.57
NIM: 244160185 Nama: Candra Kelas: C IPK: 3.41
NIM: 244160220 Nama: Dewi Kelas: B IPK: 3.35
NIM: 244160131 Nama: Devi Kelas: A IPK: 3.48
NIM: 244160221 Nama: Badar Kelas: B IPK: 3.75
NIM: 244160205 Nama: Ehsan Kelas: D IPK: 3.61
NIM: 244160170 Nama: Fizi Kelas: B IPK: 3.86
PS C:\Project2026\Algoritma-StrukturData> 
```