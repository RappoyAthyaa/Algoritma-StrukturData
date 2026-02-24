package P1;
import java.util.Scanner;

public class Tugas_5 {
    public static void main(String[] args) {
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        String[] KOTA = {
            "BANTEN",
            "JAKARTA",
            "BANDUNG",
            "CIREBON",
            "BOGOR",
            "PEKALONGAN",
            "SEMARANG",
            "SURABAYA",
            "MALANG",
            "TEGAL"
        };
        
        System.out.println("DAFTAR KODE PLAT NOMOR DAN KOTA");
        System.out.println("================================");
        System.out.println("KODE\tKOTA");
        System.out.println("================================");
        for (int i = 0; i < KODE.length; i++) {
            System.out.println(KODE[i] + "\t" + KOTA[i]);
        }
        System.out.println("================================\n");
        
        Scanner rappyathaya_02 = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = rappyathaya_02.next().toUpperCase().charAt(0);
        
        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                System.out.println("Nama kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Kode plat nomor tidak ditemukan!");
        }
        
    }
}
