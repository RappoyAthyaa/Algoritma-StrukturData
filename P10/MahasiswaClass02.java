package P10;

public class MahasiswaClass02 {
    public String nim;
    public String nama;
    public String prodi;
    public String kelas;

    public MahasiswaClass02(String nim, String nama, String prodi, String kelas) {
        this.nim   = nim;
        this.nama  = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
