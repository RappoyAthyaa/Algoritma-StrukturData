package P11;

public class SLIMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();

        Mahasiswa02 mhs0 = new Mahasiswa02("21212200", "Andi", "3C", 3.2);  
        Mahasiswa02 mhs1 = new Mahasiswa02("22212202", "Cintia", "3C", 3.5); 
        Mahasiswa02 mhs2 = new Mahasiswa02("23212201", "Bimon", "2B", 3.8);  

        sll.addFirst(mhs0);
        sll.addLast(mhs1);
        sll.addLast(mhs2);

        System.out.println("data index 1 : ");
        sll.getData(1);
        System.out.println();

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexDf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.print();

        sll.removeFirst();
        sll.print();
    }
}