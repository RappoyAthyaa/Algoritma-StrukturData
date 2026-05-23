package P11;

public class MahasiswaClass02 {
    String nim;
    String nama;
    String keperluan;

    public MahasiswaClass02(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampilkanInformasi() {
        System.out.printf("NIM: %-12s | Nama: %-15s | Keperluan: %s%n",
                nim, nama, keperluan);
    }
}