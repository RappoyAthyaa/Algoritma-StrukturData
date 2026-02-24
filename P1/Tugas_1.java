package P1;
import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        Scanner raffieAthaya_02 = new Scanner(System.in);
        System.out.println("Program menghitung nilai akhir");
        System.out.println("=================================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas_02 = raffieAthaya_02.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis_02 = raffieAthaya_02.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts_02 = raffieAthaya_02.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas_02 = raffieAthaya_02.nextInt();

        double nilaiTotal_Index_02 = 0;
        double nilai_Bobot_02 = 0, hitung_IndexMahasiswa_02 = 0, nilaiTugas = 0, nilaiKuis = 0, nilaiUts = 0, nilaiUas = 0;
        String huruf_Bobot_02 = "", status_Kelulusan_02 = "";


       if (tugas_02 < 0 || tugas_02 > 100 || kuis_02 < 0 || kuis_02 > 100 || uts_02 < 0 || uts_02 > 100 || uas_02 < 0 || uas_02 > 100) {
        System.out.println("===================");
        System.out.println("===================");
        System.out.println("Nilai Tidak Valid ");
        System.out.println("===================");
        System.out.println("===================");
        return;
       }
        
        nilaiTugas = (0.2 * tugas_02);
        nilaiKuis = (0.2 * kuis_02);
        nilaiUts = (0.3 * uts_02);
        nilaiUas = (0.3 * uas_02);
        hitung_IndexMahasiswa_02 = (nilaiTugas + nilaiKuis + nilaiUts + nilaiUas);
        nilaiTotal_Index_02 = hitung_IndexMahasiswa_02;

        if (nilaiTotal_Index_02 >= 80 && nilaiTotal_Index_02 <=100 ) {
            nilai_Bobot_02 = 4;
            huruf_Bobot_02 = "A";
        } else if (nilaiTotal_Index_02 >= 73 && nilaiTotal_Index_02 <= 80) {
            nilai_Bobot_02 = 3.5;
            huruf_Bobot_02 = "B+";
        } else if (nilaiTotal_Index_02 >= 65 && nilaiTotal_Index_02 <= 73) {
            nilai_Bobot_02 = 3;
            huruf_Bobot_02 = "B";
        } else if (nilaiTotal_Index_02 >= 60 && nilaiTotal_Index_02 <= 65) {
            nilai_Bobot_02 = 2.5;
            huruf_Bobot_02 = "C+";
        } else if (nilaiTotal_Index_02 >= 50 && nilaiTotal_Index_02 <= 60) {
            nilai_Bobot_02 = 2;
            huruf_Bobot_02 = "C";
        } else if (nilaiTotal_Index_02 >= 39 && nilaiTotal_Index_02 <= 50) {
            nilai_Bobot_02 = 1;
            huruf_Bobot_02 = "D";
        }else if (nilaiTotal_Index_02 <= 39) {
            nilai_Bobot_02 = 0;
            huruf_Bobot_02 = "E";
        } 
        

        if (nilaiTotal_Index_02>2.00) {
        if (tugas_02>50) {
            if (huruf_Bobot_02.equals("E")) {
                status_Kelulusan_02 = "TIDAK LULUS (terdapat nilai E)";
            } else {
                status_Kelulusan_02 = "SELAMAT ANDA LULUS"; 
            }
        }else {
                status_Kelulusan_02 = "TIDAK LULUS (Terdapat Nilai D)";
            }
    }else {
            status_Kelulusan_02 = "TIDAK LULUS (IP anda kurang dari 2.00)";
    }

        System.out.println("===================");
        System.out.println("===================");
        System.out.println("nilai akhir : " + nilaiTotal_Index_02); 
        System.out.println("Nilai Huruf : " + huruf_Bobot_02);
        System.out.println("===================");
        System.out.println("===================");
        System.out.printf(status_Kelulusan_02);  
    }
}