package P4;

public class PaketPengiriman02 {
    String nomorResi; // digunakan sebagai  Encapsulation (Enkapsulasi) Class dalam Java dapat menyembunyikan 
    double berat; //data (atribut) dan hanya mengizinkan akses melalui method tertentu. Ini dilakukan
    double ongkosDasar; //  menggunakan access modifier seperti private, public, dan protected.

    double totalOngkos(double ongkosBaru) {
        if (ongkosDasar <= 100000) {
            ongkosBaru= ongkosDasar * 0.10;
        }
        for (int i = 0; 10.0 < berat; i++) {
            System.out.println("Paket lebih dari 10kg: ");
        }
        
    }

    void prtintData() {
        System.out.println("Nomor Resi: " + nomorResi); // digunakan sebagai template untuk mencetak data dimain
        System.out.println("Berat Paket: " + berat);
        System.out.println("Ongkir: " + ongkosDasar);
    }
}
