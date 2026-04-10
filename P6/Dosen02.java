package P6;

public class Dosen02 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    Dosen02(String kd, String name, Boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        System.out.printf("%-10s %-25s %-15s %d%n",
            kode,
            nama,
            jenisKelamin ? "Laki-laki" : "Perempuan",
            usia);
    }
}