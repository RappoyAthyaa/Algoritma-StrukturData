package P2;

public class MahasiswaMain02 {
    public static void main(String[] args) {
        Mahasiswa02 mhs1 = new Mahasiswa02();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        System.out.println(mhs1.nilaiKinerja());
        System.out.println();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
        System.out.println(mhs1.nilaiKinerja());

        System.out.println();

        Mahasiswa02 mhs2 = new Mahasiswa02("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
        System.out.println(mhs2.nilaiKinerja());

        System.out.println();

        Mahasiswa02 mhs3 = new Mahasiswa02("Ahmad Subhan", "2241720129", 3.75, "SI 2A");
        mhs3.tampilkanInformasi();
        System.out.println(mhs3.nilaiKinerja());
    }
}