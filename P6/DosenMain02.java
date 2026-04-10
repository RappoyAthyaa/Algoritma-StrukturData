package P6;

import java.util.Scanner;

public class DosenMain02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        DataDosen02 dd = new DataDosen02();
        int pilihan;

        do {
            System.out.println("\n=============================");
            System.out.println("     MENU DATA DOSEN");
            System.out.println("=============================");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Bubble Sort)");
            System.out.println("4. Sorting DSC (Selection/Insertion Sort)");
            System.out.println("5. Keluar");
            System.out.println("=============================");
            System.out.print("Pilih menu: ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Tambah Data Dosen ---");
                    System.out.print("Kode Dosen  : ");
                    String kode = rappyAthya.nextLine();
                    System.out.print("Nama Dosen  : ");
                    String nama = rappyAthya.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jkInput = rappyAthya.nextLine();
                    Boolean jk = jkInput.equalsIgnoreCase("L");
                    System.out.print("Usia        : ");
                    int usia = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    dd.tambah(new Dosen02(kode, nama, jk, usia));
                    break;

                case 2:
                    System.out.println("\n--- Data Seluruh Dosen ---");
                    dd.tampil();
                    break;

                case 3:
                    System.out.println("\n--- Sorting ASC berdasarkan Usia (Bubble Sort) ---");
                    dd.SortingASC();
                    dd.tampil();
                    break;

                case 4:
                    System.out.println("\n--- Sorting DSC berdasarkan Usia ---");
                    System.out.println("Pilih algoritma:");
                    System.out.println("  1. Selection Sort");
                    System.out.println("  2. Insertion Sort");
                    System.out.print("Pilihan: ");
                    int pilihanSort = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    if (pilihanSort == 1) {
                        dd.sortingDSC();
                    } else if (pilihanSort == 2) {
                        dd.insertionSort();
                        for (int i = 0; i < dd.idx / 2; i++) {
                            Dosen02 temp = dd.dataDosen[i];
                            dd.dataDosen[i] = dd.dataDosen[dd.idx - 1 - i];
                            dd.dataDosen[dd.idx - 1 - i] = temp;
                        }
                        System.out.println("(Dibalik menjadi DSC)");
                    } else {
                        System.out.println("Pilihan tidak valid.");
                    }
                    dd.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
            
        } while (pilihan != 5);
    }
}