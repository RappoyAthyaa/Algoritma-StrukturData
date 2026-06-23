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