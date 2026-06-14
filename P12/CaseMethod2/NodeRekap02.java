package P12.CaseMethod2;

public class NodeRekap02 { 
        // class untuk node rekap
        String namaPesanan;
        int jumlah;
        NodeRekap02 next;

        NodeRekap02(String namaPesanan) { // Node baru untuk rekap 
            this.namaPesanan = namaPesanan;
            this.jumlah = 1;
            this.next = null;
        }
    }