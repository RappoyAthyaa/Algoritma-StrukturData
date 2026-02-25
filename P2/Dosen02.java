package P2;

public class Dosen02 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilInformasi() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Dosen: " + statusAktif);
        System.out.println("Tahun Dosen Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (status) {
            System.out.println("Dosen Aktif");
        } else {
            System.out.println("Dosen Nonaktif");
        }
    }

    int hitungMasaKerja (int thnSkrng) {
        int masaKerja = thnSkrng - tahunBergabung;
        System.out.println("Masa kerja dosen: " + masaKerja + " tahun");
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }

    public Dosen02() {
    }

    public Dosen02(String kdDS, String nama, boolean status, int tahunGabung, String keahlian) {
        idDosen = kdDS;
        this.nama = nama;
        statusAktif = status;
        tahunBergabung = tahunGabung;
        bidangKeahlian = keahlian;
    }

}