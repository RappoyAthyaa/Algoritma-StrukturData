package P13;

public class Node02 {
    Mahasiswa02 mahasiswa;
    Node02 left, right;

    public Node02() {
    }

    public Node02(Mahasiswa02 mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.left = null;
        this.right = null;
    }
}