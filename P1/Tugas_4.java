package P1;
import java.util.Scanner;

public class Tugas_4 {
    public static void tampilkanPendapatan(String namaCabang, int aglonemaCabang, int keladiCabang, 
                                           int alokasiaCabang, int mawarCabang) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlokasia = 60000;
        int hargaMawar = 10000;
        
        int totalPendapatan = (aglonemaCabang * hargaAglonema) + 
                              (keladiCabang * hargaKeladi) + 
                              (alokasiaCabang * hargaAlokasia) + 
                              (mawarCabang * hargaMawar);
        
        System.out.println("Pendapatan " + namaCabang + ": Rp." + totalPendapatan);
    }
    
    public static void tampilkanStatus(String namaCabang, int aglonemaCabang, int keladiCabang, 
                                       int alokasiaCabang, int mawarCabang) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlokasia = 60000;
        int hargaMawar = 10000;
        
        int totalPendapatan = (aglonemaCabang * hargaAglonema) + 
                              (keladiCabang * hargaKeladi) + 
                              (alokasiaCabang * hargaAlokasia) + 
                              (mawarCabang * hargaMawar);
        
        String status;
        if (totalPendapatan > 1500000) {
            status = "Sangat Baik";
        } else {
            status = "Perlu Evaluasi";
        }
        
        System.out.println("Status " + namaCabang + ": " + status);
    }
    
    public static void main(String[] args) {
        Scanner rappyAthaya_02 = new Scanner(System.in);
        
        String[] namaCabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int[] aglonema = {10, 6, 2, 5};
        int[] keladi = {5, 11, 10, 7};
        int[] alokasia = {15, 9, 10, 12};
        int[] mawar = {7, 12, 5, 9};
        
        System.out.println("===== ROYAL GARDEN - TOKO BUNGA =====");
        System.out.println("\nData Stock Bunga:");
        System.out.println("Baris = Cabang Toko, Kolom = Stock bunga pada hari x");
        System.out.println("\n-------------------------------------------------------");
        System.out.printf("%-15s | %10s | %10s | %10s | %10s\n", "Cabang", "Aglonema", "Keladi", "Alokasia", "Mawar");
        System.out.println("-------------------------------------------------------");
        
        for (int i = 0; i < namaCabang.length; i++) {
            System.out.printf("%-15s | %10d | %10d | %10d | %10d\n", 
                            namaCabang[i], aglonema[i], keladi[i], alokasia[i], mawar[i]);
        }
        System.out.println("-------------------------------------------------------");
        
        System.out.println("\nRincian Harga:");
        System.out.println("Aglonema = Rp.75.000");
        System.out.println("Keladi = Rp.50.000");
        System.out.println("Alokasia = Rp.60.000");
        System.out.println("Mawar = Rp.10.000");
        
        System.out.println("\n===== 1. PENDAPATAN SETIAP CABANG =====");
        for (int i = 0; i < namaCabang.length; i++) {
            tampilkanPendapatan(namaCabang[i], aglonema[i], keladi[i], alokasia[i], mawar[i]);
        }
        
        System.out.println("\n===== 2. STATUS SETIAP CABANG =====");
        System.out.println("Ketentuan:");
        System.out.println("a. Jika pendapatan cabang > Rp.1.500.000, maka cabang tersebut mendapat status 'Sangat Baik'");
        System.out.println("b. Jika pendapatan ≤ Rp.1.500.000, status 'Perlu Evaluasi'\n");
        
        for (int i = 0; i < namaCabang.length; i++) {
            tampilkanStatus(namaCabang[i], aglonema[i], keladi[i], alokasia[i], mawar[i]);
        }
        
        System.out.println("\n======================================");
        
    }
}