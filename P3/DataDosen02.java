package P3;

public class DataDosen02 {

    public void dataSemuaDosen(Dosen02[] arrayOfDosen) {
        System.out.println("\n========== DATA SEMUA DOSEN ==========");
        int no = 1;
        for (Dosen02 d : arrayOfDosen) {
            String jk = d.jenisKelamin ? "Pria" : "Wanita";
            System.out.println(" Data Dosen ke-" + no);
            System.out.println("Kode          : " + d.kode);
            System.out.println("Nama          : " + d.nama);
            System.out.println("Jenis Kelamin : " + jk);
            System.out.println("Usia          : " + d.usia);
            System.out.println("------------------------------");
            no++;
        }
    }

    public void jumlahDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen02 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        System.out.println("Pria   : " + pria + " dosen");
        System.out.println("Wanita : " + wanita + " dosen");
        System.out.println("==========================================");
    }

    public void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen02 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalUsiaPria += d.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += d.usia;
                jumlahWanita++;
            }
        }

        double rerataUsiaPria   = jumlahPria   > 0 ? (double) totalUsiaPria   / jumlahPria   : 0;
        double rerataUsiaWanita = jumlahWanita > 0 ? (double) totalUsiaWanita / jumlahWanita : 0;

        System.out.println("\n===== RATA-RATA USIA PER JENIS KELAMIN =====");
        System.out.printf("Pria   : %.2f tahun%n", rerataUsiaPria);
        System.out.printf("Wanita : %.2f tahun%n", rerataUsiaWanita);
        System.out.println("============================================");
    }

    public void infoDosenPalingTua(Dosen02[] arrayOfDosen) {
        Dosen02 palingTua = arrayOfDosen[0];
        for (Dosen02 d : arrayOfDosen) {
            if (d.usia > palingTua.usia) palingTua = d;
        }
        String jk = palingTua.jenisKelamin ? "Pria" : "Wanita";
        System.out.println("\n===== DOSEN PALING TUA =====");
        System.out.println("Kode          : " + palingTua.kode);
        System.out.println("Nama          : " + palingTua.nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + palingTua.usia + " tahun");
        System.out.println("------------------------------");
    }

    public void infoDosenPalingMuda(Dosen02[] arrayOfDosen) {
        Dosen02 palingMuda = arrayOfDosen[0];
        for (Dosen02 d : arrayOfDosen) {
            if (d.usia < palingMuda.usia) palingMuda = d;
        }
        String jk = palingMuda.jenisKelamin ? "Pria" : "Wanita";
        System.out.println("\n===== DOSEN PALING MUDA =====");
        System.out.println("Kode          : " + palingMuda.kode);
        System.out.println("Nama          : " + palingMuda.nama);
        System.out.println("Jenis Kelamin : " + jk);
        System.out.println("Usia          : " + palingMuda.usia + " tahun");
        System.out.println("------------------------------");
    }
}