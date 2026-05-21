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