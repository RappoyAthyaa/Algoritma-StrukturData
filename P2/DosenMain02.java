package P2;

public class DosenMain02 {
    public static void main(String[] args) {
        Dosen02 dosen1 = new Dosen02("KD-01", "Muhhamad Sunari", false, 2009, "Matematika Dasar");
        dosen1.tampilInformasi();
        System.out.println();
        dosen1.setStatusAktif(true);
        dosen1.hitungMasaKerja(2026);
        System.out.println();
        dosen1.tampilInformasi();

        System.out.println();

        Dosen02 dosen2 = new Dosen02("KD-02", "Siti Munawasih", true, 2005, "Agama");
        dosen2.tampilInformasi();
        System.out.println();
        dosen2.setStatusAktif(true);
        dosen2.hitungMasaKerja(2026);
        dosen2.ubahKeahlian("Pancasila");
        System.out.println();
        dosen2.tampilInformasi();
    }
}
