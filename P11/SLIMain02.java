package P11;

public class SLIMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();

        Mahasiswa02 mhs1 = new Mahasiswa02("21212203", "Dirga", "4D", 3.6);
        Mahasiswa02 mhs2 = new Mahasiswa02("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa02 mhs3 = new Mahasiswa02("22212227", "Cintia", "3C", 3.5);
        Mahasiswa02 mhs4 = new Mahasiswa02("23212201", "Simon", "2B", 3.8);

        sll.print(); 

        sll.addFirst(mhs1);
        sll.print();

        sll.addLast(mhs2); 
        sll.print(); 

        sll.insertAfter("Dirga", mhs3); 
        sll.insertAt(2, mhs4); 
        sll.print(); 
    }
}