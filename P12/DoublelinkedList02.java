package P12;

public class DoublelinkedList02 {
    Node02 head;
    Node02 tail;
    private int size; 

    public DoublelinkedList02() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    public void printSize() {
        System.out.println("Jumlah data dalam list: " + size);
    }

    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void add(int index, Mahasiswa02 data) {
        if (index < 0 || index > size) {
            System.out.println("Indeks tidak valid! Indeks harus antara 0 dan " + size);
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }

        Node02 newNode = new Node02(data);
        Node02 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
        System.out.println("Data berhasil ditambahkan pada indeks " + index);
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Node02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + keyNim);
            return;
        }

        Node02 toDelete = current.next;
        System.out.println("Data yang dihapus setelah NIM " + keyNim + ":");
        System.out.println("---------------------------");
        toDelete.data.tampil();
        System.out.println("---------------------------");

        if (toDelete == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = toDelete.next;
            toDelete.next.prev = current;
        }
        size--;
        System.out.println("Data berhasil dihapus.");
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid! Indeks harus antara 0 dan " + (size - 1));
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }

        Node02 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data yang dihapus pada indeks " + index + ":");
        System.out.println("---------------------------");
        current.data.tampil();
        System.out.println("---------------------------");

        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
        System.out.println("Data berhasil dihapus.\n");
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("Data pertama (head):");
        System.out.println("---------------------------");
        head.data.tampil();
        System.out.println("---------------------------");
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("Data terakhir (tail):");
        System.out.println("---------------------------");
        tail.data.tampil();
        System.out.println("---------------------------");
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        if (index < 0 || index >= size) {
            System.out.println("Indeks tidak valid! Indeks harus antara 0 dan " + (size - 1));
            return;
        }

        Node02 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        System.out.println("Data pada indeks " + index + ":");
        System.out.println("---------------------------");
        current.data.tampil();
        System.out.println("---------------------------");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("===== DAFTAR DATA =====");
        Node02 current = head;
        int i = 0;
        while (current != null) {
            System.out.println("[Indeks " + i + "]");
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.next;
            i++;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        System.out.println("===== DATA (TERBALIK) =====");
        Node02 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("---------------------------");
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data yang dihapus.");
            return;
        }
        System.out.println("Data yang dihapus dari awal:");
        System.out.println("---------------------------");
        head.data.tampil();
        System.out.println("---------------------------");

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Data berhasil dihapus dari awal list.\n");
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada data yang dihapus.");
            return;
        }
        System.out.println("Data yang dihapus dari akhir:");
        System.out.println("---------------------------");
        tail.data.tampil();
        System.out.println("---------------------------");

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Data berhasil dihapus dari akhir list.\n");
    }
}