package P10;

public class Queue02 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue02(int n) {
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        return size == 0;
    }

    public boolean IsFull() {
        return size == max;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen terdepan: " + data[front]);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(int dt) {
        if (IsFull()) {
            System.out.println("OVERFLOW: Queue sudah penuh! Program dihentikan.");
            System.exit(1);
        }
        if (front == -1) front = 0;
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
    }

    public int Dequeue() {
        if (IsEmpty()) {
            System.out.println("UNDERFLOW: Queue masih kosong! Program dihentikan.");
            System.exit(1);
        }
        int dt = data[front];
        size--;
        if (IsEmpty()) {
            front = rear = -1;
        } else {
            front = (front + 1) % max;
        }
        return dt;
    }
}