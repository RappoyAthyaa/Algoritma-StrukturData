package P11;

import java.util.Scanner;

public class SLIMain02 {
    public static void main(String[] args) {
        Scanner rappyAthya = new Scanner(System.in);
        SingleLinkedList02 sll = new SingleLinkedList02();
        int pilihan;

        do {
            System.out.println("\n===== MENU LINKED LIST =====");
            System.out.println("1. Add First");
            System.out.println("2. Add Last");
            System.out.println("3. Insert After");
            System.out.println("4. Insert At (index)");
            System.out.println("5. Tampilkan List");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = rappyAthya.nextInt();
            rappyAthya.nextLine(); 

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Nama   : "); String nama = rappyAthya.nextLine();
                System.out.print("NIM    : "); String nim = rappyAthya.nextLine();
                System.out.print("Kelas  : "); String kelas = rappyAthya.nextLine();
                System.out.print("IPK    : "); double ipk = rappyAthya.nextDouble();
                rappyAthya.nextLine();
                Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas, ipk);

                switch (pilihan) {
                    case 1:
                        sll.addFirst(mhs);
                        System.out.println("Data berhasil ditambahkan di awal.");
                        break;
                    case 2:
                        sll.addLast(mhs);
                        System.out.println("Data berhasil ditambahkan di akhir.");
                        break;
                    case 3:
                        System.out.print("Masukkan nama setelah node mana: ");
                        String key = rappyAthya.nextLine();
                        sll.insertAfter(key, mhs);
                        System.out.println("Data berhasil disisipkan setelah " + key);
                        break;
                    case 4:
                        System.out.print("Masukkan index: ");
                        int index = rappyAthya.nextInt();
                        rappyAthya.nextLine();
                        sll.insertAt(index, mhs);
                        System.out.println("Data berhasil disisipkan di index " + index);
                        break;
                }
            } else if (pilihan == 5) {
                sll.print();
            } else if (pilihan != 0) {
                System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        System.out.println("Program selesai.");
        rappyAthya.close();
    }
}