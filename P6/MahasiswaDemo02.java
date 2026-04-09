package P6;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
    MahasiswaBerprestasi02 list = new MahasiswaBerprestasi02();
    Mahasiswa02 m1 = new Mahasiswa02("123", "Zidan", "2A", 3.2);
    Mahasiswa02 m2 = new Mahasiswa02("124", "Ayu", "2A", 3.5);
    Mahasiswa02 m3 = new Mahasiswa02("125", "Sofi", "2A", 3.1);
    Mahasiswa02 m4 = new Mahasiswa02("126", "Sita", "2A", 3.9);
    Mahasiswa02 m5 = new Mahasiswa02("127", "Miki", "2A", 3.7);

    list.tambah(m1);
    list.tambah(m2);
    list.tambah(m3);
    list.tambah(m4);
    list.tambah(m5);

    System.out.println("Data mahasiswa sebelum sorting: ");
    list.tampil();

    System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
    list.bubbleSort();
    list.tampil();
    }
}