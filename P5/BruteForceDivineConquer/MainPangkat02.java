package P5.BruteForceDivineConquer;

import java.util.Scanner;

public class MainPangkat02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        System.out.print("Masukan jumlah elemen: ");
        int elemen = rappyAthya.nextInt();

        Pangkat02[] png = new Pangkat02[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan nilai basis elemen ke-"+(i+1)+": ");
            int basis = rappyAthya.nextInt();
            System.out.print("Masukan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = rappyAthya.nextInt();
            png[i] = new Pangkat02(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat02 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (Pangkat02 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}