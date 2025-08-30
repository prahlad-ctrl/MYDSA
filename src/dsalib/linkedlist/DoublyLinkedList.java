package dsalib.linkedlist;

public class DoublyLinkedList<T> {
    private Node head;

    private static class Node {
        int data;
        Node prev, next;

        Node(int d) {
            data = d;
            prev = next = null;
        }
    }

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at tail
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
    }

    // Delete node by value
    public void delete(int data) {
        if (head == null)
            return;
        Node curr = head;

        if (curr.data == data) {
            head = curr.next;
            if (head != null)
                head.prev = null;
            return;
        }

        while (curr != null && curr.data != data) {
            curr = curr.next;
        }
        if (curr == null)
            return;

        if (curr.next != null)
            curr.next.prev = curr.prev;
        if (curr.prev != null)
            curr.prev.next = curr.next;
    }

    // Print forward
    public void printForward() {
        Node curr = head;
        System.out.print("DoublyLinkedList (forward): ");
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            if (curr.next == null)
                break;
            curr = curr.next;
        }
        System.out.println("null");
    }

    // Print backward
    public void printBackward() {
        Node curr = head;
        if (curr == null)
            return;
        while (curr.next != null) {
            curr = curr.next;
        }
        System.out.print("DoublyLinkedList (backward): ");
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.prev;
        }
        System.out.println("null");
    }
}
