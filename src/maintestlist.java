import dsalib.linkedlist.DoublyLinkedList;
import dsalib.linkedlist.SinglyLinkedList;

public class maintestlist {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.insertAtHead(1);
        sll.insertAtTail(2);
        sll.insertAtTail(3);
        sll.delete(2);
        sll.printList();

        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.insertAtHead(5);
        dll.insertAtTail(10);
        dll.insertAtTail(15);
        dll.delete(10);
        dll.printForward();
        dll.printBackward();
    }
}