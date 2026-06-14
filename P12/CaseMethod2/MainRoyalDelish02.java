package P12.CaseMethod2;

import java.util.Scanner;

public class MainRoyalDelish02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        DoubleLinkedListAntrian02 antrian = new DoubleLinkedListAntrian02();
        DoubleLinkedListPesanan02 pesanan = new DoubleLinkedListPesanan02();
        int pilihan;

        do {
            System.out.println("\n==============================");
            System.out.println("  SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Rekap Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = rappyAthya.nextLine();
                    int noAntrian = antrian.tambahAntrian(nama, noHp);
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + noAntrian);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong! Tidak ada pembeli.");
                        break;
                    }
                    Pembeli02 dipanggil = antrian.hapusAntrian();
                    System.out.println("Memanggil: " + dipanggil.namaPembeli);
                    System.out.println("Silakan input pesanan:");

                    System.out.print("Kode Pesanan  : ");
                    int kode = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    System.out.print("Nama Pesanan  : ");
                    String namaPesanan = rappyAthya.nextLine();
                    System.out.print("Harga         : ");
                    int harga = rappyAthya.nextInt();
                    rappyAthya.nextLine();

                    pesanan.tambahPesanan(kode, namaPesanan, harga, dipanggil.namaPembeli);
                    System.out.println(dipanggil.namaPembeli + " telah memesan " + namaPesanan);
                    break;

                case 4:
                    pesanan.laporan();
                    break;

                case 5:
                    pesanan.laporanRekap();
                    break;

                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
    }
}
