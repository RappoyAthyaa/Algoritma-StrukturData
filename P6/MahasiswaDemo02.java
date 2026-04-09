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