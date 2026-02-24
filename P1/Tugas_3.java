package P1;

import java.util.Scanner;

public class Tugas_3 {
    static Scanner raffieAthaya_02 = new Scanner(System.in);
    
    static String[] namaMatkul_02 = {
        "Pancasila",
        "Konsep Teknologi Informasi",
        "Critical thinking dan problem solving",
        "Matematika Dasar",
        "Bahasa Inggris",
        "Dasar Pemrograman",
        "Praktikum Dasar Pemrograman",
        "Keselamatan dan Kesehatan Kerja"
    };
    
    static int[] sks_02 = {2, 2, 2, 2, 2, 2, 3, 2};
    static double[] nilaiAngka_02;
    static String[] nilaiHuruf_02;
    static double[] bobotNilai_02;

    public static void inputNilai_02() {
        nilaiAngka_02 = new double[namaMatkul_02.length];
        nilaiHuruf_02 = new String[namaMatkul_02.length];
        bobotNilai_02 = new double[namaMatkul_02.length];
        
        for (int i = 0; i < namaMatkul_02.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + namaMatkul_02[i] + ": ");
            nilaiAngka_02[i] = raffieAthaya_02.nextDouble();
            
            nilaiHuruf_02[i] = konversiNilai_02(nilaiAngka_02[i]);
            
            bobotNilai_02[i] = konversiBobot_02(nilaiHuruf_02[i]);
        }
    }

    public static String konversiNilai_02(double nilai_02) {
        if (nilai_02 > 80 && nilai_02 <= 100) return "A";
        else if (nilai_02 >= 73 && nilai_02 <= 80) return "B+";
        else if (nilai_02 >= 65 && nilai_02 < 73) return "B";
        else if (nilai_02 >= 60 && nilai_02 < 65) return "C+";
        else if (nilai_02 >= 50 && nilai_02 < 60) return "C";
        else if (nilai_02 >= 39 && nilai_02 < 50) return "D";
        else return "E";
    }

    public static double konversiBobot_02(String nilaiPreHuruf_02) {
        switch (nilaiPreHuruf_02) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return 0.0;
        }
    }

    public static void tampilkanHasil_02() {
        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        
        System.out.printf("%-35s %-15s %-15s %-15s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        
        int totalSKS_02 = 0;
        double totalBobot_02 = 0.0;
        
        for (int i = 0; i < namaMatkul_02.length; i++) {
            System.out.printf("%-35s %-15.2f %-15s %-15.2f%n", 
                namaMatkul_02[i], 
                nilaiAngka_02[i], 
                nilaiHuruf_02[i], 
                bobotNilai_02[i]);
            
            totalSKS_02 += sks_02[i];
            totalBobot_02 += (sks_02[i] * bobotNilai_02[i]);
        }
        
        double IP = totalBobot_02 / totalSKS_02;
        
        System.out.println("======================");
        System.out.printf("IP : %.2f%n", IP);
    }

    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================");
        
        inputNilai_02();
        
        tampilkanHasil_02();
        
    }
}