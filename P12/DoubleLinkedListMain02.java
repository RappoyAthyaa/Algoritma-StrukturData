package P12;

import java.util.Scanner;

public class DoubleLinkedListMain02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        DoublelinkedList02 list = new DoublelinkedList02();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine(); 

            switch (pilihan) {
                case 1:
                    Mahasiswa02 mhsAwal = inputMahasiswa(rappyAthya);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa02 mhsAkhir = inputMahasiswa(rappyAthya);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = rappyAthya.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa02 mhsBaru = inputMahasiswa(rappyAthya);
                    list.insertAfter(keyNim, mhsBaru);
                    break;
                case 4:
                    // list.removeFirst();
                    break;
                case 5:
                    // list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);

        rappyAthya.close();
    }

    private static Mahasiswa02 inputMahasiswa(Scanner rappyAthya) {
        System.out.print("Masukkan NIM   : ");
        String nim = rappyAthya.nextLine();
        System.out.print("Masukkan Nama  : ");
        String nama = rappyAthya.nextLine();
        System.out.print("Masukkan Kelas : ");
        String kelas = rappyAthya.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = Double.parseDouble(rappyAthya.nextLine());
        return new Mahasiswa02(nim, nama, kelas, ipk);
    }
}