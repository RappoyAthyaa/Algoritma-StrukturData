public class Mahasiswa02 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa02() {
    }

    public Mahasiswa02(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}