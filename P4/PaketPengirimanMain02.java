package P4;

public class PaketPengirimanMain02 {
    public static void main(String[] args) {
        PaketPengiriman02 pelanggan1 = new PaketPengiriman02(); // untuk mengambil template yang sudah disiapkan di file class
        pelanggan1.nomorResi = "ID001";
        pelanggan1.berat = 5.70;
        pelanggan1.ongkosDasar = 2000;
        pelanggan1.totalOngkos(0.10);
    }
}
