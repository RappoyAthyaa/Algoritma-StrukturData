package P1;
import java.util.Scanner;

public class Tugas_2 {
    public static void main(String[] args) {
        Scanner raffieAthaya_02 = new Scanner(System.in);
        
        System.out.println("Program Menampilkan Deretan Bilangan");
        System.out.println("=====================================");
        System.out.print("Masukkan NIM Anda: ");
        String nim = raffieAthaya_02.nextLine();
        
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        
        if (n < 10) {
            n = n + 10;
        }
        
        System.out.println("Nilai n = " + n);
        System.out.println("=====================================");
        System.out.print("Output: ");
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("#");
            }
            else if (i % 2 == 0) {
                System.out.print(i);
            }
            else {
                System.out.print("*");
            }
            if (i < n) {
                System.out.print(" ");
            }
        }
        
        System.out.println();
    }
}