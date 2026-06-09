package P12.CaseMethod2;

public class DoubleLinkedListAntrian02 {
    NodeAntrian02 head;
    NodeAntrian02 tail;
    int size;
    int counterAntrian;

    public DoubleLinkedListAntrian02() {
        head = null;
        tail = null;
        size = 0;
        counterAntrian = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int tambahAntrian(String nama, String noHp) {
        counterAntrian++;
        Pembeli02 p = new Pembeli02(counterAntrian, nama, noHp);
        NodeAntrian02 newNode = new NodeAntrian02(p);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return counterAntrian;
    }

    public Pembeli02 hapusAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Pembeli02 pembeli = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return pembeli;
    }

    public void cetakAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-15s %-15s %-15s%n", "No Antrian", "Nama", "No HP");
        NodeAntrian02 tmp = head;
        while (tmp != null) {
            System.out.printf("%-15d %-15s %-15s%n",
                tmp.data.noAntrian,
                tmp.data.namaPembeli,
                tmp.data.noHp);
            tmp = tmp.next;
        }
    }
}
