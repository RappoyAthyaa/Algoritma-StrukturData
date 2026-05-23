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