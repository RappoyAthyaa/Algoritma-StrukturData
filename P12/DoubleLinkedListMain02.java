package P12;

import java.util.Scanner;

public class DoubleLinkedListMain02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        DoublelinkedList02 list = new DoublelinkedList02();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1.  Tambah data di awal");
            System.out.println("2.  Tambah data di akhir");
            System.out.println("3.  Sisipkan data setelah NIM");
            System.out.println("4.  Hapus data di awal");
            System.out.println("5.  Hapus data di akhir");
            System.out.println("6.  Tampilkan data");
            System.out.println("7.  Tampilkan data terbalik");
            System.out.println("8.  Tambah data pada indeks tertentu");
            System.out.println("9.  Hapus data setelah NIM");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Lihat data pertama");
            System.out.println("12. Lihat data terakhir");
            System.out.println("13. Lihat data pada indeks tertentu");
            System.out.println("14. Jumlah data dalam list");
            System.out.println("0.  Keluar");
            System.out.print("Pilih menu : ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine();

            switch (pilihan) {
                case 1:
                    list.addFirst(inputMahasiswa(rappyAthya));
                    break;
                case 2:
                    list.addLast(inputMahasiswa(rappyAthya));
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = rappyAthya.nextLine();
                    list.insertAfter(keyNim, inputMahasiswa(rappyAthya));
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 8:
                    System.out.print("Masukkan indeks tujuan : ");
                    int idxAdd = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    list.add(idxAdd, inputMahasiswa(rappyAthya));
                    break;
                case 9:
                    System.out.print("Masukkan NIM : ");
                    String nimAfter = rappyAthya.nextLine();
                    list.removeAfter(nimAfter);
                    break;
                case 10:
                    System.out.print("Masukkan indeks yang dihapus : ");
                    int idxRemove = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    list.remove(idxRemove);
                    break;
                case 11:
                    list.getFirst();
                    break;
                case 12:
                    list.getLast();
                    break;
                case 13:
                    System.out.print("Masukkan indeks : ");
                    int idxGet = rappyAthya.nextInt();
                    rappyAthya.nextLine();
                    list.getIndex(idxGet);
                    break;
                case 14:
                    list.printSize();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilihan != 0);
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