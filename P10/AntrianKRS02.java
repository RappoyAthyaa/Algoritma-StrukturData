package P10;

public class AntrianKRS02 {
    private MahasiswaClass02[] data;
    private int front;
    private int rear;
    private int size;
    private final int MAX = 10;
    private int totalDilayani;
    private final int KAPASITAS_DPA = 30;

    public AntrianKRS02() {
        data           = new MahasiswaClass02[MAX];
        front          = 0;
        rear           = -1;
        size           = 0;
        totalDilayani  = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == MAX;
    }

    public void clearAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian sudah kosong.");
            return;
        }
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan.");
    }

    public void tambahAntrian(MahasiswaClass02 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh (maks " + MAX + "). " +
                    mhs.nama + " tidak dapat masuk antrian.");
            return;
        }
        rear = (rear + 1) % MAX;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk antrian. " +
                "Nomor antrian: " + size);
    }

    public MahasiswaClass02[] panggilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dipanggil.");
            return null;
        }
        if (totalDilayani >= KAPASITAS_DPA) {
            System.out.println("DPA sudah mencapai batas " + KAPASITAS_DPA +
                    " mahasiswa. Sesi selesai.");
            return null;
        }

        int ambil = Math.min(2, size);
        ambil = Math.min(ambil, KAPASITAS_DPA - totalDilayani);

        MahasiswaClass02[] dipanggil = new MahasiswaClass02[ambil];
        for (int i = 0; i < ambil; i++) {
            dipanggil[i] = data[front];
            front = (front + 1) % MAX;
            size--;
            totalDilayani++;
        }
        return dipanggil;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("\n=== DAFTAR ANTRIAN KRS MAHASISWA ===");
        System.out.println("NIM - Nama - Prodi - Kelas");
        for (int i = 0; i < size; i++) {
            int idx = (front + i) % MAX;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void lihatDuaTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("2 Mahasiswa Terdepan:");
        int tampil = Math.min(2, size);
        for (int i = 0; i < tampil; i++) {
            int idx = (front + i) % MAX;
            System.out.print((i + 1) + ". ");
            data[idx].tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Mahasiswa Paling Akhir:");
        data[rear].tampilkanData();
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getTotalDilayani() {
        return totalDilayani;
    }

    public int getBelumKRS() {
        return size;
    }

    public int getSisaKapasitasDPA() {
        return KAPASITAS_DPA - totalDilayani;
    }
}
