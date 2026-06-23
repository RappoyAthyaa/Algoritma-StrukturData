|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020063 |
| Nama |  Ahmad Raffie Athaya H. |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/RappoyAthyaa/Algoritma-StrukturData) |

# Jobsheet #15 Collection

## 15.1 Percobaan 1

### 15.1.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (ContohList02 (Main))
```
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList02 {
    public static void main(String[] args) {
        List<Object> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));
        
        l.add(4);
        l.remove(0);
        
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));
                
        List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        
        names.set(0, "My kid");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        
        System.out.println("Names: " + names.toString());
    }
}
```

### 15.1.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
Elemen 0: 1 total elemen: 4 elemen terakhir: Cireng
Elemen 0: 2 total elemen: 4 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
PS C:\Project2026\Algoritma-StrukturData> 
```

### 15.1.3 Pertanyaan

    1. Perhatikan baris kode 25-36, mengapa semua jenis data bisa ditampung ke dalam sebuah Arraylist?
        : Karena instansiasi List l = new ArrayList(); dibuat secara raw type (tanpa menggunakan generics <T>). Secara default, objek tersebut akan menganggap elemen yang dimasukkan bertipe dasar Object. 
          Karena semua class di Java adalah turunan dari Object, maka tipe data apa pun (Integer, String, dll) bisa dimasukkan ke dalamnya. 

    2. Modifikasi baris kode 25-36 seingga data yang ditampung hanya satu jenis atau spesifik tipe tertentu!
        : Kode modifikasi program untuk percobaan 1 pertanyaan No 2 (ContohList02 (Main))
```
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList02 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));

        l.add(4);
        l.remove(0);

        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));

        List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));

        names.set(0, "My kid");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));

        System.out.println("Names: " + names.toString());
    }
}
```

          Hasil modifikasi kode program untuk percobaan 1 pertanyaan No 2
```
Elemen 0: 1 total elemen: 3 elemen terakhir: 3
Elemen 0: 2 total elemen: 3 elemen terakhir: 4
Elemen 0: Noureen total elemen: 5 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 5 elemen terakhir: Al-Qarni
Names: [My kid, Akhleema, Shannum, Uwais, Al-Qarni]
PS C:\Project2026\Algoritma-StrukturData> 
```

    3. Ubah kode pada baris kode 38 menjadi seperti ini
       LinkedList<String> names = new LinkedList<>();
        : Kode modifikasi program untuk percobaan 1 pertanyaan No 3 (ContohList02 (Main))
```
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList02 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add("Cireng");
        
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));
        
        l.add(4);
        l.remove(0);
        
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n",
                l.get(0), l.size(), l.get(l.size() - 1));
                
        List<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        
        names.set(0, "My kid");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));
        
        System.out.println("Names: " + names.toString());
    }
}
```

          Hasil modifikasi kode program untuk percobaan 1 pertanyaan No 3
```
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        l cannot be resolved
        Duplicate local variable names

        at ContohList02.main(ContohList02.java:8)
PS C:\Project2026\Algoritma-StrukturData> 
```

    4. Tambahkan juga baris berikut ini, untuk memberikan perbedaan dari tampilan yang sebelumnya
       names.push("Mei-mei");
       System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.getFirst(), names.size(), names.getLast());
       System.out.println("Names: " + names.toString());
        : Kode modifikasi program untuk percobaan 1 pertanyaan No 4 (ContohList02 (Main))
```
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ContohList02 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.getFirst(), names.size(), names.getLast());
        System.out.println("Names: " + names.toString());

        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));

        names.set(0, "My kid");
        System.out.printf("Elemen 0: %s total elemen: %s elemen terakhir: %s\n",
                names.get(0), names.size(), names.get(names.size() - 1));

        System.out.println("Names: " + names.toString());
    }
}
```

          Hasil modifikasi kode program untuk percobaan 1 pertanyaan No 4
```
Elemen 0: Mei-mei total elemen: 1 elemen terakhir: Mei-mei
Names: [Mei-mei]
Elemen 0: Mei-mei total elemen: 6 elemen terakhir: Al-Qarni
Elemen 0: My kid total elemen: 6 elemen terakhir: Al-Qarni
Names: [My kid, Noureen, Akhleema, Shannum, Uwais, Al-Qarni]
PS C:\Project2026\Algoritma-StrukturData> 
```

    5. Dari penambahan kode tersebut, silakan dijalankan dan apakah yang dapat Anda jelaskan!
        : Fungsi push() memasukkan data baru di baris/urutan paling depan (indeks 0 atau bertindak sebagai head). 
          Hal ini dikarenakan LinkedList mengimplementasikan interface Deque yang mendukung operasi Stack (LIFO). 
          Akibatnya, "Mei-mei" bergeser ke elemen paling awal menggantikan "Noureen".

## 15.2 Percobaan 2

### 15.2.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 2 (LoopCollection02 (Main))
```
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection02 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());
        
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }
        
        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
        System.out.println("");
    }
}
```

### 15.2.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2
```
Banana Orange Watermelon Leci Salak 
[Banana, Orange, Watermelon, Leci, Salak]
Salak Leci Watermelon Orange Banana 
Melon Durian 
Melon Durian 
Melon Durian 
PS C:\Project2026\Algoritma-StrukturData> 
```

### 15.2.3 Pertanyaan

    1. Apakah perbedaan fungsi push() dan add() pada objek fruits?
        : push() adalah method spesifik milik class Stack yang digunakan untuk memasukkan elemen ke puncak stack (top). 
          Sedangkan add() merupakan method bawaan dari interface Collection/List yang berfungsi memasukkan elemen ke akhir urutan.

    2. Silakan hilangkan baris 43 dan 44, apakah yang akan terjadi? Mengapa bisa demikian?
        : Perulangan setelah baris tersebut (Iterator, Stream, dan for-loop biasa) tidak akan menampilkan data apa pun atau menghasilkan output kosong. 
          Hal ini terjadi karena data pada objek fruits sebelumnya sudah habis dikuras habis oleh perintah fruits.pop() di dalam blok while (!fruits.empty()).

    3. Jelaskan fungsi dari baris 46-49?
        : Berfungsi untuk melakukan perulangan (traversing) dan menampilkan semua elemen di dalam collection memanfaatkan interface Iterator.
          Method hasNext() mengecek ketersediaan elemen berikutnya, dan next() mengambil elemen tersebut.

    4. Silakan ganti baris kode 25, Stack<String> menjadi List<String> dan apakah yang terjadi? Mengapa bisa demikian?
        : Terjadi error kompilasi (compile error). Penyebabnya karena method push(), empty(), dan pop() adalah method spesifik milik class Stack, 
          bukan bagian dari interface List.

    5. Ganti elemen terakhir dari dari objek fruits menjadi “Strawberry”!
        : untuk hasil kode ketika dirun begini:
            Banana Orange Watermelon Leci Strawberry 
            [Banana, Orange, Watermelon, Leci, Strawberry]
            Strawberry Leci Watermelon Orange Banana 
            Melon Durian 
            Melon Durian 
            Melon Durian 
            PS C:\Project2026\Algoritma-StrukturData> 

    6. Tambahkan 3 buah seperti “Mango”,”guava”, dan “avocado” kemudian dilakukan sorting!
        : Kode modifikasi program untuk percobaan 2 pertanyaan No 6 (LoopCollection02 (Main))
```
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection02 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Mango");
        fruits.add("guava");
        fruits.add("avocado");
        fruits.set(fruits.size() - 1, "Strawberry");
        java.util.Collections.sort(fruits);
        
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());
        
        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }
        
        fruits.push("Melon");
        fruits.push("Durian");
        System.out.println("");
        
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
        System.out.println("");
    }
}
```

          Hasil modifikasi kode program untuk percobaan 2 pertanyaan No 6
```
Banana Leci Mango Orange Strawberry Watermelon guava 
[Banana, Leci, Mango, Orange, Strawberry, Watermelon, guava]
guava Watermelon Strawberry Orange Mango Leci Banana 
Melon Durian 
Melon Durian 
Melon Durian 
PS C:\Project2026\Algoritma-StrukturData> 
```

## 15.3 Percobaan 3

### 15.3.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 3 (Mahasiswa02)
```
public class Mahasiswa02 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa02() {
    }

    public Mahasiswa02(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}
```

➡ Kode program untuk percobaan 3 (ListMahasiswa02 (Main))
```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa02 {
    List<Mahasiswa02> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa02... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa02 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ListMahasiswa02 lm = new ListMahasiswa02();
        Mahasiswa02 m = new Mahasiswa02("201234", "Noureen", "021xx1");
        Mahasiswa02 m1 = new Mahasiswa02("201235", "Akhleema", "021xx2");
        Mahasiswa02 m2 = new Mahasiswa02("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();
        
        lm.update(lm.linearSearch("201235"), new Mahasiswa02("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }
}
```

### 15.3.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 3
```
Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema Lela, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}
PS C:\Project2026\Algoritma-StrukturData> 
```

### 15.3.3 Pertanyaan

    1. Pada fungsi tambah() yang menggunakan unlimited argument itu menggunakan konsep apa? Dan kelebihannya apa?
        : Menggunakan konsep Varargs (Variable Arguments) yang ditandai dengan sintaks tiga titik (...). Kelebihannya adalah fleksibilitas; 
          kita bisa mengirimkan argumen objek Mahasiswa dalam jumlah berapapun (satu, dua, banyak, atau bahkan berupa array langsung) tanpa perlu membuat banyak metode overloading.

    2. Pada fungsi linearSearch() di atas, silakan diganti dengan fungsi binarySearch() dari collection!
        : Agar bisa menggunakan Collections.binarySearch(), class Mahasiswa wajib mengimplementasikan interface Comparable terlebih dahulu untuk menentukan dasar perbandingannya (misal berdasarkan NIM).
          Kode modifikasi program untuk percobaan 3 pertanyaan No 2 (ListMahasiswa02 (Main))
```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa02 {
    List<Mahasiswa02> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa02... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa02 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public void sortingAsc() {
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    int pakaiBinarySearch(String nim) {
        this.sortingAsc();
        Mahasiswa02 cari = new Mahasiswa02(nim, "", "");
        return java.util.Collections.binarySearch(mahasiswas, cari, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa02 lm = new ListMahasiswa02();
        Mahasiswa02 m = new Mahasiswa02("201234", "Noureen", "021xx1");
        Mahasiswa02 m1 = new Mahasiswa02("201235", "Akhleema", "021xx2");
        Mahasiswa02 m2 = new Mahasiswa02("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();

        lm.update(lm.linearSearch("201235"), new Mahasiswa02("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();

        System.out.println("\n--- Uji Coba Pencarian Binary Search ---");
        int hasilCari = lm.pakaiBinarySearch("201236");
        if (hasilCari >= 0) {
            System.out.println("Mahasiswa ditemukan pada indeks ke-" + hasilCari);
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }
}
```

          Hasil modifikasi kode program untuk percobaan 3 pertanyaan No 2
```
Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema Lela, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

--- Uji Coba Pencarian Binary Search ---
Mahasiswa ditemukan pada indeks ke-2
PS C:\Project2026\Algoritma-StrukturData> 
```

    3. Tambahkan fungsi sorting baik secara ascending ataupun descending pada class tersebut!
        : Kode modifikasi program untuk percobaan 2 pertanyaan No 3 (ListMahasiswa02 (Main))
```
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa02 {
    List<Mahasiswa02> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa02... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa02 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) { 
            if (nim.equals(mahasiswas.get(i).nim)) { 
                return i;
            }
        }
        return -1; 
    }

    public void sortingAsc() {
        mahasiswas.sort((m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public void sortingDesc() {
        mahasiswas.sort((m1, m2) -> m2.nim.compareTo(m1.nim));
    }

    int pakaiBinarySearch(String nim) {
        this.sortingAsc();
        Mahasiswa02 cari = new Mahasiswa02(nim, "", "");
        return java.util.Collections.binarySearch(mahasiswas, cari, (m1, m2) -> m1.nim.compareTo(m2.nim));
    }

    public static void main(String[] args) {
        ListMahasiswa02 lm = new ListMahasiswa02();
        Mahasiswa02 m = new Mahasiswa02("201234", "Noureen", "021xx1");
        Mahasiswa02 m1 = new Mahasiswa02("201235", "Akhleema", "021xx2");
        Mahasiswa02 m2 = new Mahasiswa02("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        System.out.println("--- Data Awal ---");
        lm.tampil();

        lm.update(lm.linearSearch("201235"), new Mahasiswa02("201235", "Akhleema Lela", "021xx2"));
        System.out.println("\n--- Setelah Update ---");
        lm.tampil();

        System.out.println("\n--- Uji Coba Pencarian Binary Search ---");
        int hasilCari = lm.pakaiBinarySearch("201236");
        if (hasilCari >= 0) {
            System.out.println("Mahasiswa ditemukan pada indeks ke-" + hasilCari);
        } else {
            System.out.println("Mahasiswa tidak ditemukan.");
        }
    }
}
```

          Hasil modifikasi kode program untuk percobaan 2 pertanyaan No 3
```
--- Data Awal ---
Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

--- Setelah Update ---
Mahasiswa{nim=201234, nama=Noureen, notelp=021xx1}
Mahasiswa{nim=201235, nama=Akhleema Lela, notelp=021xx2}
Mahasiswa{nim=201236, nama=Shannum, notelp=021xx3}

--- Uji Coba Pencarian Binary Search ---
Mahasiswa ditemukan pada indeks ke-2
PS C:\Project2026\Algoritma-StrukturData> 
```

#### Tugas Praktikum 1 dan 2
    1. Buatlah implementasi program daftar nilai mahasiswa semester, minimal memiliki 3 class yaitu Mahasiswa, Nilai, dan Mata Kuliah.
       Data Mahasiswa dan Mata Kuliah perlu melalui penginputan data terlebih dahulu.

    2. Tambahkan prosedur hapus data mahasiswa melalui implementasi Queue pada collections Tugas nomor 1

➡ Kode program untuk Tugas (MahasiswaTgs02)
```
public class MahasiswaTgs02 {
    String nim;
    String nama;
    String telf;

    public MahasiswaTgs02(String nim, String nama, String telf) {
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }
}
```

➡ Kode program untuk Tugas (MataKuliah02)
```
public class MataKuliah02 {
    String kode;
    String namaMK;
    int sks;

    public MataKuliah02(String kode, String namaMK, int sks) {
        this.kode = kode;
        this.namaMK = namaMK;
        this.sks = sks;
    }
}
```

➡ Kode program untuk Tugas (Nilai02)
```
public class Nilai02 {
    MahasiswaTgs02 mhs;
    MataKuliah02 mk;
    double nilaiAngka;

    public Nilai02(MahasiswaTgs02 mhs, MataKuliah02 mk, double nilaiAngka) {
        this.mhs = mhs;
        this.mk = mk;
        this.nilaiAngka = nilaiAngka;
    }
}
```

➡ Kode program untuk Tugas (MainSistemNilai02 (Main))
```
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class MainSistemNilai02 {
    static List<MahasiswaTgs02> daftarMhs = new ArrayList<>();
    static List<MataKuliah02> daftarMK = new ArrayList<>();
    static List<Nilai02> daftarNilai = new ArrayList<>();
    static Queue<MahasiswaTgs02> antreanHapusMhs = new LinkedList<>();

    public static void main(String[] args) {
        Scanner rapptAthya = new Scanner(System.in);
        initData(); 

        while (true) {
            System.out.println("*************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa Terdepan (Queue)");
            System.out.println("6. Keluar");
            System.out.println("*************************************************");
            System.out.print("Pilih     : ");
            int menu = rapptAthya.nextInt();
            rapptAthya.nextLine();

            if (menu == 1) {
                System.out.print("Masukkan data\nKode      : ");
                String kodeInputKosongAtauDummy = rapptAthya.nextLine();
                System.out.print("Nilai     : ");
                double nilaiInput = rapptAthya.nextDouble();
                rapptAthya.nextLine();
                System.out.println("");
                
                System.out.println("DAFTAR MAHASISWA");
                System.out.println("*************************************************");
                System.out.printf("%-10s %-20s %-10s\n", "NIM", "Nama", "Telf");
                for (MahasiswaTgs02 m : daftarMhs) {
                    System.out.printf("%-10s %-20s %-10s\n", m.nim, m.nama, m.telf);
                }
                System.out.print("Pilih mahasiswa by nim: ");
                String nimCari = rapptAthya.nextLine();
                MahasiswaTgs02 mhsTerpilih = null;
                for (MahasiswaTgs02 m : daftarMhs) {
                    if (m.nim.equals(nimCari)) { mhsTerpilih = m; break; }
                }
                System.out.println("");

                System.out.println("DAFTAR MATA KULIAH");
                System.out.println("*************************************************");
                System.out.printf("%-10s %-40s %-5s\n", "Kode", "Mata Kuliah", "SKS");
                for (MataKuliah02 mk : daftarMK) {
                    System.out.printf("%-10s %-40s %-5d\n", mk.kode, mk.namaMK, mk.sks);
                }
                System.out.print("Pilih MK by kode: ");
                String kodeCari = rapptAthya.nextLine();
                MataKuliah02 mkTerpilih = null;
                for (MataKuliah02 mk : daftarMK) {
                    if (mk.kode.equals(kodeCari)) { mkTerpilih = mk; break; }
                }

                if (mhsTerpilih != null && mkTerpilih != null) {
                    daftarNilai.add(new Nilai02(mhsTerpilih, mkTerpilih, nilaiInput));
                }
                System.out.println("");

            } else if (menu == 2) {
                System.out.println("\nDAFTAR NILAI MAHASISWA");
                System.out.println("*************************************************");
                System.out.printf("%-10s %-15s %-40s %-5s %-6s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                for (Nilai02 n : daftarNilai) {
                    System.out.printf("%-10s %-15s %-40s %-5d %-6.2f\n", 
                            n.mhs.nim, n.mhs.nama, n.mk.namaMK, n.mk.sks, n.nilaiAngka);
                }
                System.out.println("");

            } else if (menu == 3) {
                System.out.println("\nDAFTAR NILAI MAHASISWA");
                System.out.println("*************************************************");
                System.out.printf("%-10s %-15s %-40s %-5s %-6s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                for (Nilai02 n : daftarNilai) {
                    System.out.printf("%-10s %-15s %-40s %-5d %-6.2f\n", 
                            n.mhs.nim, n.mhs.nama, n.mk.namaMK, n.mk.sks, n.nilaiAngka);
                }
                
                System.out.print("Masukkan data mahasiswa[nim] :");
                String searchNim = rapptAthya.nextLine();
                
                System.out.printf("%-10s %-15s %-40s %-5s %-6s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                int totalSKS = 0;
                for (Nilai02 n : daftarNilai) {
                    if (n.mhs.nim.equals(searchNim)) {
                        System.out.printf("%-10s %-15s %-40s %-5d %-6.2f\n", 
                                n.mhs.nim, n.mhs.nama, n.mk.namaMK, n.mk.sks, n.nilaiAngka);
                        totalSKS += n.mk.sks;
                    }
                }
                System.out.println("Total SKS " + totalSKS + " telah diambil.\n");

            } else if (menu == 4) {
                daftarNilai.sort((n1, n2) -> Double.compare(n1.nilaiAngka, n2.nilaiAngka));
                
                System.out.println("\nDAFTAR NILAI MAHASISWA");
                System.out.println("*************************************************");
                System.out.printf("%-10s %-15s %-45s %-10s %-5s\n", "Nim", "Nama", "Mata Kuliah", "Nilai", "SKS");
                for (Nilai02 n : daftarNilai) {
                    System.out.printf("%-10s %-15s %-45s %-10.2f %-5d\n", 
                            n.mhs.nim, n.mhs.nama, n.mk.namaMK, n.nilaiAngka, n.mk.sks);
                }
                System.out.println("");

            } else if (menu == 5) {
                if (!antreanHapusMhs.isEmpty()) {
                    MahasiswaTgs02 mhsDihapus = antreanHapusMhs.poll();
                    daftarMhs.remove(mhsDihapus);
                    daftarNilai.removeIf(n -> n.mhs.nim.equals(mhsDihapus.nim));
                    System.out.println("Mahasiswa bernama " + mhsDihapus.nama + " [NIM: " + mhsDihapus.nim + "] berhasil dihapus dari sistem antrean.\n");
                } else {
                    System.out.println("Antrean hapus kosong! Memasukkan semua mahasiswa aktif ke antrean hapus...\n");
                    antreanHapusMhs.addAll(daftarMhs);
                }

            } else if (menu == 6) {
                break;
            }
        }
        rapptAthya.close();
    }

    static void initData() {
        daftarMhs.add(new MahasiswaTgs02("20001", "Thalhah", "021xxx"));
        daftarMhs.add(new MahasiswaTgs02("20002", "Zubair", "021xxx"));
        daftarMhs.add(new MahasiswaTgs02("20003", "Abdur-Rahman", "021xxx"));
        daftarMhs.add(new MahasiswaTgs02("20004", "Sa'ad", "021xxx"));
        daftarMhs.add(new MahasiswaTgs02("20005", "Sa'id", "021xxx"));
        daftarMhs.add(new MahasiswaTgs02("20006", "Ubaidah", "021xxx"));

        daftarMK.add(new MataKuliah02("00001", "Internet of Things", 3));
        daftarMK.add(new MataKuliah02("00002", "Algoritma dan Struktur Data", 2));
        daftarMK.add(new MataKuliah02("00003", "Algoritma dan Pemrograman", 2));
        daftarMK.add(new MataKuliah02("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMK.add(new MataKuliah02("00005", "Praktikum Algoritma dan Pemrograman", 3));
    }
}
```

➡ Hasil kode program untuk Tugas No 1 dan 2
```
*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Mahasiswa Terdepan (Queue)
6. Keluar
*************************************************
Pilih     : 1
Masukkan data
Kode      : 0001 
Nilai     : 80,75

DAFTAR MAHASISWA
*************************************************
NIM        Nama                 Telf      
20001      Thalhah              021xxx    
20002      Zubair               021xxx    
20003      Abdur-Rahman         021xxx    
20004      Sa'ad                021xxx    
20005      Sa'id                021xxx    
20006      Ubaidah              021xxx    
Pilih mahasiswa by nim: 20001

DAFTAR MATA KULIAH
*************************************************
Kode       Mata Kuliah                              SKS  
00001      Internet of Things                       3    
00002      Algoritma dan Struktur Data              2    
00003      Algoritma dan Pemrograman                2    
00004      Praktikum Algoritma dan Struktur Data    3    
00005      Praktikum Algoritma dan Pemrograman      3    
Pilih MK by kode: 00001

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Mahasiswa Terdepan (Queue)
6. Keluar
*************************************************
Pilih     : 2

DAFTAR NILAI MAHASISWA
*************************************************
Nim        Nama            Mata Kuliah                              SKS   Nilai 
20001      Thalhah         Internet of Things                       3     80,75 

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Mahasiswa Terdepan (Queue)
6. Keluar
*************************************************
Pilih     : 3

DAFTAR NILAI MAHASISWA
*************************************************
Nim        Nama            Mata Kuliah                              SKS   Nilai 
20001      Thalhah         Internet of Things                       3     80,75 
Masukkan data mahasiswa[nim] :20001
Nim        Nama            Mata Kuliah                              SKS   Nilai 
20001      Thalhah         Internet of Things                       3     80,75 
Total SKS 3 telah diambil.

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Mahasiswa Terdepan (Queue)
6. Keluar
*************************************************
Pilih     : 1
Masukkan data
Kode      : 0002
Nilai     : 80,21

DAFTAR MAHASISWA
*************************************************
NIM        Nama                 Telf      
20001      Thalhah              021xxx    
20002      Zubair               021xxx    
20003      Abdur-Rahman         021xxx    
20004      Sa'ad                021xxx    
20005      Sa'id                021xxx    
20006      Ubaidah              021xxx    
Pilih mahasiswa by nim: 20002

DAFTAR MATA KULIAH
*************************************************
Kode       Mata Kuliah                              SKS  
00001      Internet of Things                       3    
00002      Algoritma dan Struktur Data              2    
00003      Algoritma dan Pemrograman                2    
00004      Praktikum Algoritma dan Struktur Data    3    
00005      Praktikum Algoritma dan Pemrograman      3    
Pilih MK by kode: 00002

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Mahasiswa Terdepan (Queue)
6. Keluar
*************************************************
Pilih     : 4

DAFTAR NILAI MAHASISWA
*************************************************
Nim        Nama            Mata Kuliah                                   Nilai      SKS  
20002      Zubair          Algoritma dan Struktur Data                   80,21      2    
20001      Thalhah         Internet of Things                            80,75      3    

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Mahasiswa Terdepan (Queue)
6. Keluar
*************************************************
Pilih     : 5
Antrean hapus kosong! Memasukkan semua mahasiswa aktif ke antrean hapus...

*************************************************
SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER
*************************************************
1. Input Nilai
2. Tampil Nilai
3. Mencari Nilai Mahasiswa
4. Urut Data Nilai
5. Hapus Mahasiswa Terdepan (Queue)
6. Keluar
*************************************************
Pilih     : 6
PS C:\Project2026\Algoritma-StrukturData>
```