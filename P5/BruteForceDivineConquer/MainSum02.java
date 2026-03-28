package P5.BruteForceDivineConquer;

import java.util.Scanner;

public class MainSum02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = rappyAthya.nextInt();

        Sum02 sm = new Sum02(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = rappyAthya.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan,0, elemen-1));
    }
}