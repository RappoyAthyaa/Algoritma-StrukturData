package P9;

public class StackSurat02 {
    Surat02[] stack;
    int top;
    int size;

    public StackSurat02(int size) {
        this.size = size;
        stack = new Surat02[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat02 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat02 pop() {
        if (!isEmpty()) {
            Surat02 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat02 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk dilihat.");
            return null;
        }
    }

    public boolean cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }

    public void tampilHasilCari(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("┌─────────────────────────────────────┐");
                System.out.println("  ID Surat  : " + stack[i].idSurat);
                System.out.println("  Nama      : " + stack[i].namaMahasiswa);
                System.out.println("  Kelas     : " + stack[i].kelas);
                System.out.println("  Jenis Izin: " + stack[i].getJenisIzin());
                System.out.println("  Durasi    : " + stack[i].durasi + " hari");
                System.out.println("└─────────────────────────────────────┘");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama \"" + namaMahasiswa + "\" tidak ditemukan.");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada surat.");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println((top - i + 1) + ". [" + stack[i].idSurat + "] "
                        + stack[i].namaMahasiswa
                        + " | Kelas: " + stack[i].kelas
                        + " | Izin: " + stack[i].getJenisIzin()
                        + " | Durasi: " + stack[i].durasi + " hari");
            }
        }
    }
}
