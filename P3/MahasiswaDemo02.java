package P3;
import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner rappyAthaya = new Scanner(System.in);
        Mahasiswa02[] arrayOfMahasiswa = new Mahasiswa02[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa02();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = rappyAthaya.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = rappyAthaya.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = rappyAthaya.nextLine();
            System.out.print("IPK   : ");
            dummy = rappyAthaya.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);
            System.out.println("-----------------------------");
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa[i].ipk);
            System.out.println("-----------------------------");
        }
    }
}