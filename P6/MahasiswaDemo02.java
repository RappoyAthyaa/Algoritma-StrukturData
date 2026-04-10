package P6;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();
        Scanner rappyAthya = new Scanner(System.in);
        int jumMhs=5;

        list.setUkuran(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM     : ");
            String nim = rappyAthya.nextLine();
            System.out.print("Nama    : ");
            String nama = rappyAthya.nextLine();
            System.out.print("Kelas   : ");
            String kelas = rappyAthya.nextLine();
            System.out.print("IPK     : ");
            String ip = rappyAthya.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------");
            list.tambah (new Mahasiswa02(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("-----------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = rappyAthya.nextDouble();

        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        System.out.println("--------------------------------");

        System.out.println("-----------------------------------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-----------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari1 = rappyAthya.nextDouble();
         System.out.println("--------------------------------");
         System.out.println("menggunakan binary search");
         System.out.println("--------------------------------");
         double posisi2 = list.findBinarySearch(cari1, 0, jumMhs-1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari1, pss2);
        list.tampilDataSearch(cari1, pss2);
    }
}

        // System.out.print("Masukkan jumlah mahasiswa: ");
        // int n = rappyAthya.nextInt();
        // rappyAthya.nextLine(); 

        // list.setUkuran(n); 

        

    //     for (int i = 1; i <= n; i++) {
    //         if (i == 1) {
    //         System.out.print("Masukkan Data Mahasiswa ke-" + i + "\n");
    //         } else {
    //         System.out.print("Masukkan Data Mahasiswa ke-" + i + "\n");
    //         }

    //     System.out.print("NIM   : ");
    //     String nim = rappyAthya.nextLine();

    //     System.out.print("Nama  : ");
    //     String nama = rappyAthya.nextLine();

    //     System.out.print("Kelas : ");
    //     String kelas = rappyAthya.nextLine();

    //     System.out.print("IPK   : ");
    //     double ipk = Double.parseDouble(rappyAthya.nextLine());
    //     System.out.println("--------------------------------");

    //     Mahasiswa02 m = new Mahasiswa02(nim, nama, kelas, ipk);
    //     list.tambah(m);
    // }

    //     System.out.println("\n=============================");
    //     System.out.println("Data Mahasiswa Sebelum Sorting:");
    //     System.out.println("=============================");
    //     list.tampil();

    //     list.bubbleSort();
    //     System.out.println("=============================");
    //     System.out.println("Data Mahasiswa Setelah Sorting (IPK DESC):");
    //     System.out.println("=============================");
    //     list.tampil();

    //     list.selectionSort();
    //     System.out.println("=============================");
    //     System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
    //     System.out.println("=============================");
    //     list.tampil();

    //     list.insertionSort();
    //     System.out.println("=============================");
    //     System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
    //     System.out.println("=============================");
    //     list.tampil();
