package P11;

public class QueueMahasiswa02 {
    private NodeTugas02 head; 
    private NodeTugas02 tail; 
    private int size;

    public QueueMahasiswa02() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        int MAX = 10;
        return size >= MAX;
    }

    public void enqueue(MahasiswaClass02 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak dapat menambah antrian.");
            return;
        }
        NodeTugas02 newNode = new NodeTugas02(mhs);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        System.out.println("Mahasiswa " + mhs.nama + " berhasil masuk antrian. " +
                           "Nomor antrian: " + size);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada mahasiswa yang dipanggil.");
            return;
        }
        System.out.println("\n>>> Memanggil mahasiswa:");
        head.data.tampilkanInformasi();
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        System.out.println("Mahasiswa selesai dilayani. Sisa antrian: " + size + " orang.\n");
    }

    public void peekFront() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian terdepan:");
        head.data.tampilkanInformasi();
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Antrian paling akhir:");
        tail.data.tampilkanInformasi();
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa yang masih mengantri: " + size + " orang.");
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("╔══════════════════════════════════════════════════════╗");
        System.out.println("           DAFTAR ANTRIAN UNIT KEMAHASISWAAN            ");
        System.out.println("╚══════════════════════════════════════════════════════╝");
        NodeTugas02 temp = head;
        int nomor = 1;
        while (temp != null) {
            System.out.print("No." + nomor + " | ");
            temp.data.tampilkanInformasi();
            temp = temp.next;
            nomor++;
        }
        System.out.println("──────────────────────────────────────────────────────");
    }

    public void clearQueue() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Semua antrian telah dikosongkan.");
    }
}