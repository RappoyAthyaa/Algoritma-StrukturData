package P5.BruteForceDivineConquer;

import java.util.Scanner;

public class MainFaktorial02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
            System.out.print("Masukkan Nilai: ");
            int nilai = rappyAthya.nextInt();

            Faktorial02 fk = new Faktorial02();
            System.out.println("Nilai faktorial " + nilai +
                " Menggunakan BF: " + fk.faktorialBF(nilai));
            System.out.println("Nilai faktorial " + nilai +
                " Menggunakan DC: " + fk.faktorialDC(nilai));
    }
}