package P3;

import java.util.Scanner;

public class MatakuliahDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);
        Matakuliah02[] arrayOfMatakuliah = new Matakuliah02[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode      : ");
            kode = rappyAthaya.nextLine();
            System.out.print("Nama      : ");
            nama = rappyAthaya.nextLine();
            System.out.print("Sks       : ");
            dummy = rappyAthaya.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("JumlahJam : ");
            dummy = rappyAthaya.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------");

            arrayOfMatakuliah[i] = new Matakuliah02 (kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama        : " + arrayOfMatakuliah[i].nama);
            System.out.println("Sks         : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam  : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("-----------------------------");
        }
    }
}
