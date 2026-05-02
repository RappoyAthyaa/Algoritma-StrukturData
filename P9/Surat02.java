package P9;

public class Surat02 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    Surat02() {
        this.idSurat = "";
        this.namaMahasiswa = "";
        this.kelas = "";
        this.jenisIzin = ' ';
        this.durasi = 0;
    }


    Surat02 (String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    String getJenisIzin() {
        if (jenisIzin == 'S' || jenisIzin == 's') {
            return "Sakit";
        } else if (jenisIzin == 'I' || jenisIzin == 'i') {
            return "Izin Keperluan Lain";
        } else {
            return "Tidak Diketahui";
        }
    }
}
