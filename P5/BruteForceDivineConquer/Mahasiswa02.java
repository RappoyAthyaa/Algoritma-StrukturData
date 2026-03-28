package P5.BruteForceDivineConquer;

public class Mahasiswa02 {

    String[] nama;
    String[] nim;
    int[] tahunMasuk;
    double[] nilaiUTS;
    double[] nilaiUAS;

    Mahasiswa02(String[] nama, String[] nim, int[] tahunMasuk, double[] nilaiUTS, double[] nilaiUAS) {
        this.nama      = nama;
        this.tahunMasuk = tahunMasuk;
        this.nim       = nim;
        this.nilaiUTS  = nilaiUTS;
        this.nilaiUAS  = nilaiUAS;
    }

    double maxUTSDC(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        double leftMax  = maxUTSDC(arr, l, mid);
        double rightMax = maxUTSDC(arr, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    double minUTSDC(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;

        double leftMin  = minUTSDC(arr, l, mid);
        double rightMin = minUTSDC(arr, mid + 1, r);

        return Math.min(leftMin, rightMin);
    }

    double rataUASBF() {
        double total = 0;
        for (int i = 0; i < nilaiUAS.length; i++) {
            total = total + nilaiUAS[i];
        }
        return total / nilaiUAS.length;
    }
}