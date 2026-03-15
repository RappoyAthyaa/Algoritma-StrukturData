package P3;

import java.util.Scanner;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int n = rappyAthaya.nextInt();
        rappyAthaya.nextLine(); 

        Dosen02[] arrayOfDosen = new Dosen02[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = rappyAthaya.nextLine();

            System.out.print("Nama          : ");
            String nama = rappyAthaya.nextLine();

            System.out.print("Jenis Kelamin : ");
            String inputJK = rappyAthaya.nextLine();
            boolean jenisKelamin = inputJK.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            int usia = rappyAthaya.nextInt();
            rappyAthaya.nextLine();

            System.out.println("------------------------------");

            arrayOfDosen[i] = new Dosen02(kode, nama, jenisKelamin, usia);
        }

        int no = 1;
        for (Dosen02 d : arrayOfDosen) {
            String jk = d.jenisKelamin ? "Pria" : "Wanita";
            System.out.println(" Data Dosen ke-" + no);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("------------------------------");
            no++;
        }

        DataDosen02 dataDosen = new DataDosen02();

        dataDosen.dataSemuaDosen(arrayOfDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}