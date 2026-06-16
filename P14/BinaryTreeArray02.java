package P14;

public class BinaryTreeArray02 {
    Mahasiswa02[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray02() {
        this.dataMahasiswa = new Mahasiswa02[10];
    }

    void populateData(Mahasiswa02 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1); 
                dataMahasiswa[idxStart].tampilInformasi(); 
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}