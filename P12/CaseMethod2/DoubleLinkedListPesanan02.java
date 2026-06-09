package P12.CaseMethod2;

public class DoubleLinkedListPesanan02 {
    NodePesanan02 head;
    NodePesanan02 tail;
    int totalPendapatan;

    public DoubleLinkedListPesanan02() {
        head = null;
        tail = null;
        totalPendapatan = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahPesanan(int kode, String nama, int harga, String namaPembeli) {
        Pesanan02 p = new Pesanan02(kode, nama, harga, namaPembeli);
        NodePesanan02 newNode = new NodePesanan02(p);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        totalPendapatan += harga;
    }

    public void sortByNamaPesanan() {
        if (isEmpty() || head == tail) return;

        boolean swapped;
        do {
            swapped = false;
            NodePesanan02 curr = head;
            while (curr.next != null) {
                if (curr.data.namaPesanan.compareToIgnoreCase(curr.next.data.namaPesanan) > 0) {
                    Pesanan02 temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
    }

    public void laporan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan masuk.");
            return;
        }
        sortByNamaPesanan();
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-15s %-20s %-10s%n", "Kode Pesanan", "Nama Pesanan", "Harga");
        NodePesanan02 tmp = head;
        while (tmp != null) {
            System.out.printf("%-15d %-20s %-10d%n",
                tmp.data.kodePesanan,
                tmp.data.namaPesanan,
                tmp.data.harga);
            tmp = tmp.next;
        }
        System.out.println("--------------------------------------");
        System.out.println("Total Pendapatan : Rp " + totalPendapatan);
    }
}