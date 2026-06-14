package P12.CaseMethod2;

public class DoubleLinkedListRekap02 { // Pembuatan Class baru untuk list rekap
    NodeRekap02 head;

    DoubleLinkedListRekap02() {
        head = null;
    }

    // Tambah atau update rekap setiap ada pesanan yang baru
    void tambahAtauUpdate(String namaPesanan) {
        NodeRekap02 curr = head;

        // Mencari apakah namanya sudah ada
        while (curr != null) {
            if (curr.namaPesanan.equalsIgnoreCase(namaPesanan)) {
                curr.jumlah++; // jika sudah ketemu tinggal ditambah jumlah
                return;
            }
            curr = curr.next;
        }

        // jika belum ada, buat node baru dengan jumlah = 1 sesuai soal CM A
        NodeRekap02 newNode = new NodeRekap02(namaPesanan);
        newNode.next = head;
        head = newNode;
    }

    void sortDescending() { // mengunakan bubble sort untuk mengurutkan data yang paling besar ke paling
                            // kecil (desc) pada method listRekap pada setiap menu yang diinput
        if (head == null || head.next == null)
            return;

        boolean swap;
        do {
            swap = false;
            NodeRekap02 curr = head;
            while (curr.next != null) {
                if (curr.jumlah < curr.next.jumlah) {
                    // ini hanya untuk Tukar data saja
                    String tmpNama = curr.namaPesanan;
                    int tmpJumlah = curr.jumlah;
                    curr.namaPesanan = curr.next.namaPesanan;
                    curr.jumlah = curr.next.jumlah;
                    curr.next.namaPesanan = tmpNama;
                    curr.next.jumlah = tmpJumlah;
                    swap = true;
                }
                curr = curr.next;
            }
        } while (swap);
    }

    void tampilkanRekap() { // Method untuk menampilkan rekapan
        if (head == null) {
            System.out.println("Belum ada data untuk rekap.");
            return;
        }
        sortDescending();
        System.out.println("==========================================");
        System.out.println("   Rekapan Pesanan Per-Menu (DESC)");
        System.out.println("==========================================");
        System.out.printf("%-25s %-10s%n", "Nama Pesanan", "Jumlah");
        System.out.println("------------------------------------------");
        NodeRekap02 curr = head;
        while (curr != null) {
            System.out.printf("%-25s %-10d%n", curr.namaPesanan, curr.jumlah);
            curr = curr.next;
        }
        System.out.println("==========================================");
    }

    DoubleLinkedListRekap02 linkedListRekap;
}