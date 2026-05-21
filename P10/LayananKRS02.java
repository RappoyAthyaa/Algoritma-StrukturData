package P10;

import java.util.Scanner;

public class LayananKRS02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        AntrianKRS02 q = new AntrianKRS02();
        int pilihan;

        do {
            System.out.println("\n=== SISTEM ANTRIAN PERSETUJUAN KRS ===");
            System.out.println("1. Daftarkan mahasiswa ke antrian");
            System.out.println("2. Panggil antrian (proses KRS)");
            System.out.println("3. Lihat 2 antrian terdepan");
            System.out.println("4. Tampilkan semua antrian");
            System.out.println("5. Lihat antrian paling akhir");
            System.out.println("6. Cek antrian kosong");
            System.out.println("7. Cek antrian penuh");
            System.out.println("8. Kosongkan antrian");
            System.out.println("9. Jumlah mahasiswa dalam antrian");
            System.out.println("10. Jumlah mahasiswa sudah KRS");
            System.out.println("11. Jumlah mahasiswa belum KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine();

            switch (pilihan) {
                case 1:
                    if (q.isFull()) {
                        System.out.println("Antrian penuh! Tidak dapat mendaftar.");
                        break;
                    }
                    System.out.print("NIM   : ");
                    String nim = rappyAthya.nextLine();
                    System.out.print("Nama  : ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = rappyAthya.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = rappyAthya.nextLine();
                    q.tambahAntrian(new MahasiswaClass02(nim, nama, prodi, kelas));
                    break;
                case 2:
                    MahasiswaClass02[] dipanggil = q.panggilAntrian();
                    if (dipanggil != null) {
                        System.out.println("Memanggil " + dipanggil.length + " mahasiswa untuk proses KRS:");
                        for (int i = 0; i < dipanggil.length; i++) {
                            System.out.print((i + 1) + ". ");
                            dipanggil[i].tampilkanData();
                        }
                        System.out.println("Total sudah KRS  : " + q.getTotalDilayani());
                        System.out.println("Sisa kapasitas DPA: " + q.getSisaKapasitasDPA());
                    }
                    break;
                case 3:
                    q.lihatDuaTerdepan();
                    break;
                case 4:
                    q.tampilkanSemua();
                    break;
                case 5:
                    q.lihatAkhir();
                    break;
                case 6:
                    System.out.println(q.isEmpty()
                            ? "Antrian KOSONG."
                            : "Antrian TIDAK kosong (isi: " + q.getJumlahAntrian() + ").");
                    break;
                case 7:
                    System.out.println(q.isFull()
                            ? "Antrian PENUH (10/10)."
                            : "Antrian belum penuh (" + q.getJumlahAntrian() + "/10).");
                    break;
                case 8:
                    System.out.print("Yakin ingin mengosongkan antrian? (y/n): ");
                    if (rappyAthya.nextLine().equalsIgnoreCase("y"))
                        q.clearAntrian();
                    else
                        System.out.println("Dibatalkan.");
                    break;
                case 9:
                    System.out.println("Mahasiswa dalam antrian    : " + q.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Mahasiswa sudah proses KRS : " + q.getTotalDilayani());
                    break;
                case 11:
                    System.out.println("Mahasiswa belum proses KRS : " + q.getBelumKRS());
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }
}
