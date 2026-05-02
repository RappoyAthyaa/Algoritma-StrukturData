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
