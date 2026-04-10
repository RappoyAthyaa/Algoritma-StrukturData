package P6;

public class DataDosen02 {
    Dosen02[] dataDosen = new Dosen02[10];
    int idx = 0;

    void tambah(Dosen02 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
            System.out.println("Data dosen berhasil ditambahkan.");
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        System.out.println("=".repeat(65));
        System.out.printf("%-10s %-25s %-15s %s%n", "Kode", "Nama", "Jenis Kelamin", "Usia");
        System.out.println("=".repeat(65));
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
        System.out.println("=".repeat(65));
    }

    void SortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen02 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
        System.out.println("Data berhasil diurutkan secara ASC (Bubble Sort).");
    }

    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) {
                    maxIdx = j;
                }
            }
            Dosen02 temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
        System.out.println("Data berhasil diurutkan secara DSC (Selection Sort).");
    }

    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen02 key = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia > key.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = key;
        }
        System.out.println("Data berhasil diurutkan secara ASC (Insertion Sort).");
    }
}