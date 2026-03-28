package P5.BruteForceDivineConquer;

public class MainMahasiswa02 {

    public static void main(String[] args) {

        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        String[] nim  = {"220101001", "220101002", "220101003", "220101004",
                          "220101005", "220101006", "220101007", "220101008"};
        int[]    tahunMasuk = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
        double[] nilaiUTS   = {78, 85, 90, 76, 92, 88, 80, 82};
        double[] nilaiUAS   = {82, 88, 87, 79, 95, 85, 83, 84};

        Mahasiswa02 mhs = new Mahasiswa02(nama, nim, tahunMasuk, nilaiUTS, nilaiUAS);

        int n = nilaiUTS.length;

        double maxUTS = mhs.maxUTSDC(nilaiUTS, 0, n - 1);
        System.out.println("=== a) Nilai UTS Tertinggi (Divide and Conquer) ===");
        System.out.println("Nilai UTS Tertinggi : " + maxUTS);

        System.out.print("Nama Mahasiswa      : ");
        for (int i = 0; i < n; i++) {
            if (nilaiUTS[i] == maxUTS) {
                System.out.println(nama[i] + " (NIM: " + nim[i] + ")");
            }
        }
        System.out.println();

        double minUTS = mhs.minUTSDC(nilaiUTS, 0, n - 1);
        System.out.println("=== b) Nilai UTS Terendah (Divide and Conquer) ===");
        System.out.println("Nilai UTS Terendah  : " + minUTS);

        System.out.print("Nama Mahasiswa      : ");
        for (int i = 0; i < n; i++) {
            if (nilaiUTS[i] == minUTS) {
                System.out.println(nama[i] + " (NIM: " + nim[i] + ")");
            }
        }
        System.out.println();

        double rataUAS = mhs.rataUASBF();
        System.out.println("=== c) Rata-rata Nilai UAS (Brute Force) ===");
        System.out.printf("Rata-rata Nilai UAS : %.2f%n", rataUAS);
    }
}