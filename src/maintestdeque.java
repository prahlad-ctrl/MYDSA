import dsalib.deque.DequeArray;
import dsalib.deque.DequeLinkedList;

public class maintestdeque {
    public static void main(String[] args) {
        DequeLinkedList<Integer> dq1 = new DequeLinkedList<>();
        dq1.addFront(1);
        dq1.addRear(2);
        dq1.addRear(3);
        System.out.println("Front: " + dq1.peekFront());
        System.out.println("Rear: " + dq1.peekRear());
        dq1.removeFront();
        dq1.removeRear();
        System.out.println("Front after removals: " + dq1.peekFront());
        dq1.print();

        DequeArray<Integer> dq2 = new DequeArray<>(5);
        dq2.addRear(10);
        dq2.addRear(20);
        dq2.addFront(5);
        System.out.println("Front: " + dq2.peekFront());
        System.out.println("Rear: " + dq2.peekRear());
        dq2.removeFront();
        dq2.removeRear();
        System.out.println("Front after removals: " + dq2.peekFront());
        dq2.print();
    }
}
