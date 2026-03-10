package P3;

import java.util.Scanner;

public class Matakuliah02 { 
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah02 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public Matakuliah02() {}

    public void tambahData(Scanner scanner) {
        System.out.print("Kode      : ");
        this.kode = scanner.nextLine();
        System.out.print("Nama      : ");
        this.nama = scanner.nextLine();
        System.out.print("Sks       : ");
        this.sks = Integer.parseInt(scanner.nextLine());
        System.out.print("JumlahJam : ");
        this.jumlahJam = Integer.parseInt(scanner.nextLine());
    }
}