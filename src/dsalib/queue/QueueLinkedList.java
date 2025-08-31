package dsalib.queue;

public class QueueLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> front, rear;
    private int size;

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public T dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue Underflow");
        T val = front.data;
        front = front.next;
        if (front == null)
            rear = null;
        size--;
        return val;
    }

    public T peek() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.print("QueueLinkedList: ");
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}