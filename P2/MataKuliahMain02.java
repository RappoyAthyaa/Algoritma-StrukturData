package P2;

public class MataKuliahMain02 {
    public static void main(String[] args) {
        MataKuliah02 mhsKuliah1 = new MataKuliah02("KD-01", "Praktikum ASD", 2, 4);
        mhsKuliah1.tampilInformasi();

        System.out.println();

        MataKuliah02 mhsKuliah2 = new MataKuliah02("KD-02", "BasisData", 2, 5);
        mhsKuliah2.tampilInformasi();
        mhsKuliah2.ubahSKS(3);
        mhsKuliah2.tambahJam(1);
        System.out.println();
        mhsKuliah2.tampilInformasi();

        System.out.println();

        MataKuliah02 mhsKuliah3 = new MataKuliah02("KD-03", "Sistem Operasi", 2, 5);
        mhsKuliah3.tampilInformasi();
        mhsKuliah3.kurangiJam(2);
        System.out.println();
        mhsKuliah3.tampilInformasi();
    }
}