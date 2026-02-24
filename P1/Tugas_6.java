package P1;
import java.util.Scanner;

public class Tugas_6 {
    
    
    public static void inputJadwal(String[][] jadwal, int n, Scanner rappyathaya_02) {
        System.out.println("\n=== INPUT JADWAL KULIAH ===");
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1) + ":");
            
            rappyathaya_02.nextLine(); 
            
            System.out.print("Nama Mata Kuliah: ");
            jadwal[i][0] = rappyathaya_02.nextLine();
            
            System.out.print("Ruang: ");
            jadwal[i][1] = rappyathaya_02.nextLine();
            
            System.out.print("Hari Kuliah: ");
            jadwal[i][2] = rappyathaya_02.nextLine();
            
            System.out.print("Jam Kuliah: ");
            jadwal[i][3] = rappyathaya_02.nextLine();
        }
        System.out.println("\nData jadwal berhasil disimpan!");
    }
    
    public static void tampilkanSemuaJadwal(String[][] jadwal, int n) {
        System.out.println("\n=== SELURUH JADWAL KULIAH ===");
        System.out.println("================================================================================");
        System.out.printf("| %-3s | %-25s | %-15s | %-10s | %-15s |\n", 
                         "No", "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("================================================================================");
        
        for (int i = 0; i < n; i++) {
            System.out.printf("| %-3d | %-25s | %-15s | %-10s | %-15s |\n",
                             (i + 1), 
                             jadwal[i][0], 
                             jadwal[i][1], 
                             jadwal[i][2], 
                             jadwal[i][3]);
        }
        System.out.println("================================================================================");
    }
    
    public static void tampilkanJadwalPerHari(String[][] jadwal, int n, String hari) {
        System.out.println("\n=== JADWAL KULIAH HARI " + hari.toUpperCase() + " ===");
        System.out.println("================================================================================");
        System.out.printf("| %-3s | %-25s | %-15s | %-15s |\n", 
                         "No", "Mata Kuliah", "Ruang", "Jam");
        System.out.println("================================================================================");
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                count++;
                System.out.printf("| %-3d | %-25s | %-15s | %-15s |\n",
                                 count, 
                                 jadwal[i][0], 
                                 jadwal[i][1], 
                                 jadwal[i][3]);
            }
        }
        System.out.println("================================================================================");
        
        if (count == 0) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
        } else {
            System.out.println("Total: " + count + " jadwal");
        }
    }
    
    public static void tampilkanJadwalPerMataKuliah(String[][] jadwal, int n, String mataKuliah) {
        System.out.println("\n=== JADWAL MATA KULIAH: " + mataKuliah.toUpperCase() + " ===");
        System.out.println("========================================================================");
        System.out.printf("| %-3s | %-15s | %-10s | %-15s |\n", 
                         "No", "Ruang", "Hari", "Jam");
        System.out.println("========================================================================");
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mataKuliah)) {
                count++;
                System.out.printf("| %-3d | %-15s | %-10s | %-15s |\n",
                                 count, 
                                 jadwal[i][1], 
                                 jadwal[i][2], 
                                 jadwal[i][3]);
            }
        }
        System.out.println("========================================================================");
        
        if (count == 0) {
            System.out.println("Mata kuliah '" + mataKuliah + "' tidak ditemukan");
        } else {
            System.out.println("Total: " + count + " jadwal");
        }
    }
    
    public static void main(String[] args) {
        Scanner rappyathaya_02 = new Scanner (System.in);
        
        System.out.println("========================================");
        System.out.println("   PROGRAM JADWAL KULIAH MAHASISWA");
        System.out.println("========================================");
        
        System.out.print("\nMasukkan jumlah jadwal kuliah: ");
        int n = rappyathaya_02.nextInt();
        
        String[][] jadwal = new String[n][4];
        
        inputJadwal(jadwal, n, rappyathaya_02);
        
        int pilihan;
        do {
            System.out.println("\n========================================");
            System.out.println("              MENU UTAMA");
            System.out.println("========================================");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("4. Input Ulang Jadwal");
            System.out.println("0. Keluar");
            System.out.println("========================================");
            System.out.print("Pilihan Anda: ");
            pilihan = rappyathaya_02.nextInt();
            
            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal(jadwal, n);
                    break;
                    
                case 2:
                    rappyathaya_02.nextLine(); 
                    System.out.print("\nMasukkan nama hari: ");
                    String hari = rappyathaya_02.nextLine();
                    tampilkanJadwalPerHari(jadwal, n, hari);
                    break;
                    
                case 3:
                    rappyathaya_02.nextLine(); 
                    System.out.print("\nMasukkan nama mata kuliah: ");
                    String mataKuliah = rappyathaya_02.nextLine();
                    tampilkanJadwalPerMataKuliah(jadwal, n, mataKuliah);
                    break;
                    
                case 4:
                    inputJadwal(jadwal, n, rappyathaya_02);
                    break;
                    
                case 0:
                    System.out.println("\nTerima kasih telah menggunakan program ini!");
                    break;
                    
                default:
                    System.out.println("\nPilihan tidak valid!");
            }
        } while (pilihan != 0);
        
    }
}