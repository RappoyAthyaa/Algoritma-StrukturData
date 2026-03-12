package P3;

import java.util.Scanner;

public class MatakuliahDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);
        Matakuliah02[] arrayOfMatakuliah = new Matakuliah02[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah02();
            arrayOfMatakuliah[i].tambahData(rappyAthaya);
            System.out.println("-----------------------------");
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("-----------------------------");
        }
    }
}