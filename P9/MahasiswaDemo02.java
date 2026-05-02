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