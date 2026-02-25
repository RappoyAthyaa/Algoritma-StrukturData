package P2;

public class MataKuliah02 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilInformasi() {
        System.out.println("KodeMK: " + kodeMK);
        System.out.println("Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("jumlahJam: " + jumlahJam);
    }

    void ubahSKS (int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS anda telah diubah menjadi: " + sks);
    }

    void tambahJam (int jam) {
        jumlahJam = jumlahJam + jam;
        System.out.println("Jumlah jam anda setelahditambah: " + jumlahJam);
    }

    void kurangiJam (int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        } else {
            jumlahJam = jumlahJam - jam;
            System.out.println("Jumlah jam anda setelah dikurangi: " + jumlahJam);
        }
    }

    public MataKuliah02() {
    }

    public MataKuliah02(String kdMK, String matkul, int sks, int jumlahJam) {
        kodeMK = kdMK;
        nama = matkul;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}