|  | Algorithm and Data Structure |
|--|--|
| NIM |  254107020063 |
| Nama |  Ahmad Raffie Athaya H. |
| Kelas | TI - 1F |
| Repository | [link] (https://github.com/RappoyAthyaa/Algoritma-StrukturData) |

# Jobsheet #9 STACK

## 9.1 Percobaan 1

### 9.1.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 1 (Mahasiswa02)
```
package P9;

public class Mahasiswa02 {
    String nama;
    String nim;
    String kelas;
    int nilai;

    Mahasiswa02(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
```

➡ Kode program untuk percobaan 1 (StackTugasMahasiswa02)

```
package P9;

public class StackTugasMahasiswa02 {
    Mahasiswa02[] stack;
    int top;
    int size;

    public StackTugasMahasiswa02(int size) {
        this.size = size;
        stack = new Mahasiswa02[size];
        top = -1;
    }

    public boolean isfull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa02 mhs) {
        if (!isfull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa02 pop() {
        if (!isEmpty()) {
            Mahasiswa02 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dikumpulkan.");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }
}
```
➡ Kode program untuk percobaan 1 (MahasiswaDemo02 (Main))
```
package P9;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(5);
        int pilih;
        Scanner rappyAthya = new Scanner(System.in);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menggumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = rappyAthya.nextInt();
            rappyAthya.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("NIM: ");
                    String nim = rappyAthya.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = rappyAthya.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                
                case 2:
                    Mahasiswa02 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = rappyAthya.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    } 
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
            {
        }
    }
}
```

### 9.1.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 1 
```
Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Dila
NIM: 1001
Kelas: 1A
Tugas Dila berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Erik
NIM: 1002
Kelas: 18
Tugas Erik berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 3
Tugas terakhir dikumpulkan oleh Erik

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 1
Nama: Tika
NIM: 1003
Kelas: 1C
Tugas Tika berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    18
Tika    1003    1C


Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai Tugas Tika adalah 87

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    18

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
Pilih: 
PS C:\Project2026\Algoritma-StrukturData> 
```

### 9.1.3 Pertanyaan

    1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi 
       hasil percobaan! Bagian mana yang perlu diperbaiki?
        : Kode program untuk pertanyaan ke-1 Percobaan 1 (MahasiswaDemo02 (Main))
```
package P9;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(5);
        int pilih;
        Scanner rappyAthya = new Scanner(System.in);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menggumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Keluar");          
            System.out.print("Pilih: ");
            pilih = rappyAthya.nextInt();
            rappyAthya.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("NIM: ");
                    String nim = rappyAthya.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = rappyAthya.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa02 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = rappyAthya.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;

                case 3:
                    Mahasiswa02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:                                
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 5);                         
    }
}
```
          Hasil kode program untuk pertanyaan ke-1 Percobaan 1
```
Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Keluar
Pilih: 1
Nama: dila
NIM: 1001
Kelas: 1A
Tugas dila berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Keluar
Pilih: 1
Nama: Erik
NIM: 1002
Kelas: 1B
Tugas Erik berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Keluar
Pilih: 3
Tugas terakhir dikumpulkan oleh Erik

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Keluar
Pilih: 1
Nama: Tika
NIM: 1003
Kelas: 1C
Tugas Tika berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Keluar
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
dila    1001    1A
Erik    1002    1B
Tika    1003    1C


Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Keluar
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai Tugas Tika adalah 87

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Keluar
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
dila    1001    1A
Erik    1002    1B


Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Keluar
Pilih: 5
Keluar dari program.
PS C:\Project2026\Algoritma-StrukturData> 
```

    2. Berapa banyak data tugas mahasiswa yang dapat ditampung di dalam Stack? Tunjukkan potongan kode programnya
        : 1. Inisialisasi ukuran Stack di MahasiswaDemo02.java
                ( StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(5); )
             Saat objek stack dibuat, angka 5 dikirim sebagai argumen ke constructor.

          2. Constructor StackTugasMahasiswa02.java
                ( public StackTugasMahasiswa02(int size) {
                    this.size = size;
                        stack = new Mahasiswa02[size];  
                        top = -1;
                  } )
             Nilai 5 disimpan ke this.size dan digunakan untuk membuat array Mahasiswa02[5].

          3. Pengecekan Stack Penuh di StackTugasMahasiswa02.java
                ( public boolean isfull() {
                    if (top == size - 1) {  
                        return true;
                    } else {
                        return false;
                    }
                  } )
             Stack dinyatakan penuh ketika top == 4 (indeks ke-4 = elemen ke-5).

             Ilustrasi Stack kapasitas 5
                Index [4]  ← top (maks)
                Index [3]
                Index [2]
                Index [1]
                Index [0]  ← bottom
             Jika mencoba menambahkan tugas ke-6, method push() akan mencetak:
                ( Stack penuh! Tidak bisa menambahkan tugas lagi. )

    3. Mengapa perlu pengecekan kondisi !isFull() pada method push? Kalau kondisi if-else tersebut dihapus, apa dampaknya?
        : Karena Stack menggunakan array dengan ukuran tetap (Mahasiswa02[5]), maka indeks array tidak boleh melebihi batas kapasitasnya.
          Pengecekan !isFull() berfungsi sebagai "penjaga" agar program tidak menulis data melebihi batas array. dan dampak dari ketidakadaan
          !isFull() maka akan terjadi ArrayIndexOutOfBoundsException saat data ke-6 di-push.

    4. Modifikasi kode program pada class MahasiswaDemo dan StackTugasMahasiswa sehingga pengguna juga dapat melihat mahasiswa yang pertama kali 
       mengumpulkan tugas melalui operasi lihat tugas terbawah!
        : Kode program untuk pertanyaan ke-4 Percobaan 1 (StackTugasMahasiswa02)
```
package P9;

public class StackTugasMahasiswa02 {
    Mahasiswa02[] stack;
    int top;
    int size;

    public StackTugasMahasiswa02(int size) {
        this.size = size;
        stack = new Mahasiswa02[size];
        top = -1;
    }

    public boolean isfull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa02 mhs) {
        if (!isfull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa02 pop() {
        if (!isEmpty()) {
            Mahasiswa02 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dikumpulkan.");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa02 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
            } else {
                System.out.println("Stack kosong! Tidak ada tugas untuk dilihat.");
            return null;
        }
    }
}
```
          Kode program untuk pertanyaan ke-4 Percobaan 1 (MahasiswaDemo02 (Main))
```
package P9;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(5);
        int pilih;
        Scanner rappyAthya = new Scanner(System.in);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menggumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");  
            System.out.println("6. Keluar");                  
            System.out.print("Pilih: ");
            pilih = rappyAthya.nextInt();
            rappyAthya.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("NIM: ");
                    String nim = rappyAthya.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = rappyAthya.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa02 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = rappyAthya.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;

                case 3:
                    Mahasiswa02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:                                     
                    Mahasiswa02 bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                        System.out.println("NIM   : " + bawah.nim);
                        System.out.println("Kelas : " + bawah.kelas);
                    }
                    break;

                case 6:                                       
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 6);                               
    }
}
```

          Hasil kode program untuk pertanyaan ke-4 Percobaan 1
```
Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Keluar
Pilih: 1 
Nama: Dila
NIM: 1001
Kelas: 1A
Tugas Dila berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Keluar
Pilih: 1
Nama: Erik
NIM: 1002
Kelas: 1B
Tugas Erik berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Keluar
Pilih: 3
Tugas terakhir dikumpulkan oleh Erik

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Keluar
Pilih: 1
Nama: Tika
NIM: 1003
Kelas: 1C
Tugas Tika berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Keluar
Pilih: 4
Daftar semua tugas
Nama    NIM     Kelas
Dila    1001    1A
Erik    1002    1B
Tika    1003    1C


Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Keluar
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai Tugas Tika adalah 87

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Keluar
Pilih: 5
Tugas pertama dikumpulkan oleh Dila
NIM   : 1001
Kelas : 1A

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Keluar
Pilih: 6
Keluar dari program.
PS C:\Project2026\Algoritma-StrukturData> 
```

    5. Tambahkan method untuk dapat menghitung berapa banyak tugas yang sudah dikumpulkan saat ini, serta tambahkan operasi menunya!
        : Kode program untuk pertanyaan ke-5 Percobaan 1 (StackTugasMahasiswa02)
```
package P9;

public class StackTugasMahasiswa02 {
    Mahasiswa02[] stack;
    int top;
    int size;

    public StackTugasMahasiswa02(int size) {
        this.size = size;
        stack = new Mahasiswa02[size];
        top = -1;
    }

    public boolean isfull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa02 mhs) {
        if (!isfull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa02 pop() {
        if (!isEmpty()) {
            Mahasiswa02 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dikumpulkan.");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa02 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
            } else {
                System.out.println("Stack kosong! Tidak ada tugas untuk dilihat.");
            return null;
        }
    }

    public int count() {
        return top + 1; 
    }
}
```
          Kode program untuk pertanyaan ke-5 Percobaan 1 (MahasiswaDemo02 (Main))
```
package P9;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(5);
        int pilih;
        Scanner rappyAthya = new Scanner(System.in);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menggumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Menghitung Jumlah Tugas");  
            System.out.println("7. Keluar");                   
            System.out.print("Pilih: ");
            pilih = rappyAthya.nextInt();
            rappyAthya.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("NIM: ");
                    String nim = rappyAthya.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = rappyAthya.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa02 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = rappyAthya.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;

                case 3:
                    Mahasiswa02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa02 bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                        System.out.println("NIM   : " + bawah.nim);
                        System.out.println("Kelas : " + bawah.kelas);
                    }
                    break;

                case 6:                                        
                    int jumlah = stack.count();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    System.out.println("Sisa kapasitas stack: " + (stack.size - jumlah));
                    break;

                case 7:                                        
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 7);                                 
    }
}
```

          Hasil kode program untuk pertanyaan ke-5 Percobaan 1
```
Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Menghitung Jumlah Tugas
7. Keluar
Pilih: 1
Nama: Dila
NIM: 1001
Kelas: 1A
Tugas Dila berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Menghitung Jumlah Tugas
7. Keluar
Pilih: 1
Nama: Erik
NIM: 1002
Kelas: 1B
Tugas Erik berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Menghitung Jumlah Tugas
7. Keluar
Pilih: 1
Nama: Tika
NIM: 1003
Kelas: 1C
Tugas Tika berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Menghitung Jumlah Tugas
7. Keluar
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai Tugas Tika adalah 87

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Menghitung Jumlah Tugas
7. Keluar
Pilih: 6
Jumlah tugas yang sudah dikumpulkan: 2
Sisa kapasitas stack: 3

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Menghitung Jumlah Tugas
7. Keluar
Pilih: 7
Keluar dari program.
PS C:\Project2026\Algoritma-StrukturData> 
```

## 9.2 Percobaan 2

### 9.2.1 Langkah-langkah Percobaan
➡ Kode program untuk percobaan 2 (StackKonversi02)
```
package P9;

public class StackKonversi02 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi02() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack ksosong.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}

```

➡ Kode program untuk percobaan 2 (StackTugasMahasiswa02)

```
package P9;

public class StackTugasMahasiswa02 {
    Mahasiswa02[] stack;
    int top;
    int size;

    public StackTugasMahasiswa02(int size) {
        this.size = size;
        stack = new Mahasiswa02[size];
        top = -1;
    }

    public boolean isfull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa02 mhs) {
        if (!isfull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    public Mahasiswa02 pop() {
        if (!isEmpty()) {
            Mahasiswa02 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    public Mahasiswa02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dikumpulkan.");
            return null;
        }
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
        System.out.println("");
    }

    public Mahasiswa02 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
            } else {
                System.out.println("Stack kosong! Tidak ada tugas untuk dilihat.");
            return null;
        }
    }

    public int count() {
        return top + 1; 
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi02 stack = new StackKonversi02();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
```
➡ Kode program untuk percobaan 2 (MahasiswaDemo02 (Main))
```
package P9;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(5);
        int pilih;
        Scanner rappyAthya = new Scanner(System.in);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Menggumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Menghitung Jumlah Tugas");  
            System.out.println("7. Keluar");                   
            System.out.print("Pilih: ");
            pilih = rappyAthya.nextInt();
            rappyAthya.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("NIM: ");
                    String nim = rappyAthya.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = rappyAthya.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa02 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = rappyAthya.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;

                case 3:
                    Mahasiswa02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5:
                    Mahasiswa02 bawah = stack.peekBottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                        System.out.println("NIM   : " + bawah.nim);
                        System.out.println("Kelas : " + bawah.kelas);
                    }
                    break;

                case 6:                                        
                    int jumlah = stack.count();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlah);
                    System.out.println("Sisa kapasitas stack: " + (stack.size - jumlah));
                    break;

                case 7:                                        
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 7);                                 
    }
}
```

### 9.2.2 Verivikasi Hasil Percobaan
➡ Hasil kode program untuk percobaan 2 
```
Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Menghitung Jumlah Tugas
7. Keluar
Pilih: 1
Nama: Tika
NIM: 1003
Kelas: 1C
Tugas Tika berhasil dikumpulkan

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Menghitung Jumlah Tugas
7. Keluar
Pilih: 2
Menilai tugas dari Tika
Masukkan nilai (0-100): 87
Nilai Tugas Tika adalah 87
Nilai Biner Tugas: 1010111

Menu:
1. Menggumpulkan Tugas
2. Menilai Tugas
3. Melihat Tugas Teratas
4. Melihat Daftar Tugas
5. Melihat Tugas Terbawah
6. Menghitung Jumlah Tugas
7. Keluar
Pilih: 7
Keluar dari program.
PS C:\Project2026\Algoritma-StrukturData> 
```

### 9.2.3 Pertanyaan

    1. Jelaskan alur kerja dari method konversiDesimalKeBiner! 
        : Method ini mengkonversi bilangan desimal → biner menggunakan Stack sebagai media penyimpanan sementara. 
          Stack digunakan karena sifatnya LIFO (Last In First Out) yang secara otomatis membalik urutan sisa hasil bagi, 
          sehingga hasil biner terbaca dari bit tertinggi ke terendah.

    2. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya? Jelaskan alasannya!
        : Hasilnya: Akan sama saja untuk bilangan positif
          Untuk input bilangan positif, hasil konversi while (nilai > 0) dan while (nilai != 0) tidak ada perbedaan, 
          karena: Inputwhile (nilai > 0)while (nilai != 0)13"1101" ✅"1101" ✅10"1010" ✅"1010" ✅0"" (kosong)"" (kosong).

#### Latihan 1
➡ Kode program untuk Tugas 1 (Surat02)
```
package P9;

public class Surat02 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat02() {
        this.idSurat = "";
        this.namaMahasiswa = "";
        this.kelas = "";
        this.jenisIzin = ' ';
        this.durasi = 0;
    }


    Surat02 (String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    String getJenisIzin() {
        if (jenisIzin == 'S' || jenisIzin == 's') {
            return "Sakit";
        } else if (jenisIzin == 'I' || jenisIzin == 'i') {
            return "Izin Keperluan Lain";
        } else {
            return "Tidak Diketahui";
        }
    }
}
```

➡ Kode program untuk Tugas 1 (StackSurat02)
```
package P9;

public class StackSurat02 {
    Surat02[] stack;
    int top;
    int size;

    public StackSurat02(int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat02 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat02 pop() {
        if (!isEmpty()) {
            Surat02 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dilihat.");
            return null;
        }
    }

    public boolean cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }

    public void tampilHasilCari(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("┌─────────────────────────────────────┐");
                System.out.println("  ID Surat  : " + stack[i].idSurat);
                System.out.println("  Nama      : " + stack[i].namaMahasiswa);
                System.out.println("  Kelas     : " + stack[i].kelas);
                System.out.println("  Jenis Izin: " + stack[i].getJenisIzin());
                System.out.println("  Durasi    : " + stack[i].durasi + " hari");
                System.out.println("└─────────────────────────────────────┘");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama \"" + namaMahasiswa + "\" tidak ditemukan.");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println((top - i + 1) + ". [" + stack[i].idSurat + "] "
                        + stack[i].namaMahasiswa
                        + " | Kelas: " + stack[i].kelas
                        + " | Izin: " + stack[i].getJenisIzin()
                        + " | Durasi: " + stack[i].durasi + " hari");
            }
        }
    }
}
```

➡ Kode program untuk Tugas 1 (SuratDemo02 (Main))
```
package P9;

import java.util.Scanner;

public class SuratDemo02 {
    public static void main(String[] args) {
        StackSurat02 stack = new StackSurat02(10);
        Scanner rappyathya = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=============================");
            System.out.println("  Sistem Surat Izin Prodi   ");
            System.out.println("=============================");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = rappyathya.nextInt();
            rappyathya.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n--- Terima Surat Izin ---");
                    System.out.print("ID Surat         : ");
                    String idSurat = rappyathya.nextLine();
                    System.out.print("Nama Mahasiswa   : ");
                    String nama = rappyathya.nextLine();
                    System.out.print("Kelas            : ");
                    String kelas = rappyathya.nextLine();
                    System.out.print("Jenis Izin (S/I) : ");
                    char jenisIzin = rappyathya.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari)    : ");
                    int durasi = rappyathya.nextInt();
                    rappyathya.nextLine();

                    if (jenisIzin != 'S' && jenisIzin != 'I') {
                        System.out.println("Jenis izin tidak valid! Gunakan S atau I.");
                        break;
                    }

                    Surat02 surat = new Surat02(idSurat, nama, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("Surat izin " + nama + " berhasil diterima.");
                    break;

                case 2:
                    System.out.println("\n--- Proses Surat Izin ---");
                    Surat02 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Surat berikut sedang diverifikasi:");
                        System.out.println("┌─────────────────────────────────────┐");
                        System.out.println("  ID Surat  : " + diproses.idSurat);
                        System.out.println("  Nama      : " + diproses.namaMahasiswa);
                        System.out.println("  Kelas     : " + diproses.kelas);
                        System.out.println("  Jenis Izin: " + diproses.getJenisIzin());
                        System.out.println("  Durasi    : " + diproses.durasi + " hari");
                        System.out.println("└─────────────────────────────────────┘");
                        System.out.println("Surat " + diproses.idSurat + 
                                           " atas nama " + diproses.namaMahasiswa + 
                                           " berhasil diverifikasi.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Lihat Surat Izin Terakhir ---");
                    Surat02 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("┌─────────────────────────────────────┐");
                        System.out.println("  ID Surat  : " + terakhir.idSurat);
                        System.out.println("  Nama      : " + terakhir.namaMahasiswa);
                        System.out.println("  Kelas     : " + terakhir.kelas);
                        System.out.println("  Jenis Izin: " + terakhir.getJenisIzin());
                        System.out.println("  Durasi    : " + terakhir.durasi + " hari");
                        System.out.println("└─────────────────────────────────────┘");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Cari Surat ---");
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = rappyathya.nextLine();
                    System.out.println("Hasil pencarian untuk \"" + cariNama + "\":");
                    stack.tampilHasilCari(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
    }
}

```

➡ Hasil kode program untuk Tugas 1 (SuratDemo02 (Main))
```
=============================
  Sistem Surat Izin Prodi   
=============================
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 1

--- Terima Surat Izin ---
ID Surat         : 001
Nama Mahasiswa   : Erik
Kelas            : 1B
Jenis Izin (S/I) : S
Durasi (hari)    : 2
Surat izin Erik berhasil diterima.

=============================
  Sistem Surat Izin Prodi   
=============================
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 1

--- Terima Surat Izin ---
ID Surat         : 002
Nama Mahasiswa   : Lina
Kelas            : 1A
Jenis Izin (S/I) : I
Durasi (hari)    : 1
Surat izin Lina berhasil diterima.

=============================
  Sistem Surat Izin Prodi   
=============================
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 2

--- Proses Surat Izin ---
Surat berikut sedang diverifikasi:
┌─────────────────────────────────────┐
  ID Surat  : 002
  Nama      : Lina
  Kelas     : 1A
  Jenis Izin: Izin Keperluan Lain
  Durasi    : 1 hari
└─────────────────────────────────────┘
Surat 002 atas nama Lina berhasil diverifikasi.

=============================
  Sistem Surat Izin Prodi   
=============================
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 3

--- Lihat Surat Izin Terakhir ---
┌─────────────────────────────────────┐
  ID Surat  : 001
  Nama      : Erik
  Kelas     : 1B
  Jenis Izin: Sakit
  Durasi    : 2 hari
└─────────────────────────────────────┘

=============================
  Sistem Surat Izin Prodi   
=============================
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 4

--- Cari Surat ---
Masukkan nama mahasiswa: Erik
Hasil pencarian untuk "Erik":
┌─────────────────────────────────────┐
  ID Surat  : 001
  Nama      : Erik
  Kelas     : 1B
  Jenis Izin: Sakit
  Durasi    : 2 hari
└─────────────────────────────────────┘

=============================
  Sistem Surat Izin Prodi   
=============================
1. Terima Surat Izin
2. Proses Surat Izin
3. Lihat Surat Izin Terakhir
4. Cari Surat
5. Keluar
Pilih: 5
Keluar dari program.
PS C:\Project2026\Algoritma-StrukturData>
```