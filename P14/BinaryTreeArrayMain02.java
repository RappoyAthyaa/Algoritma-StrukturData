package P14;

public class BinaryTreeArrayMain02 {
    public static void main(String[] args) {
        BinaryTreeArray02 bta = new BinaryTreeArray02();

        Mahasiswa02 mhs1 = new Mahasiswa02("244160121", "Ali", "A", 3.57);
        Mahasiswa02 mhs2 = new Mahasiswa02("244160185", "Candra", "C", 3.41);
        Mahasiswa02 mhs3 = new Mahasiswa02("244160221", "Badar", "B", 3.75);
        Mahasiswa02 mhs4 = new Mahasiswa02("244160220", "Dewi", "B", 3.35);
        Mahasiswa02 mhs5 = new Mahasiswa02("244160131", "Devi", "A", 3.48);
        Mahasiswa02 mhs6 = new Mahasiswa02("244160205", "Ehsan", "D", 3.61);
        Mahasiswa02 mhs7 = new Mahasiswa02("244160170", "Fizi", "B", 3.86);

        System.out.println("=== PENGUJIAN TUGAS 4: METHOD add() ===");
        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs7);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        System.out.println("\n=== PENGUJIAN TUGAS 4: METHOD traversePreOrder() ===");
        System.out.println("PreOrder Traversal Mahasiswa: ");
        bta.traversePreOrder(0);
    }
}