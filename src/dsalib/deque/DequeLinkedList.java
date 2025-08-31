package dsalib.deque;

public class DequeLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> prev, next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> front, rear;
    private int size;

    public void addFront(T value) {
        Node<T> newNode = new Node<>(value);
        if (front == null) {
            front = rear = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void addRear(T value) {
        Node<T> newNode = new Node<>(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    public T removeFront() {
        if (isEmpty())
            throw new RuntimeException("Deque Underflow");
        T val = front.data;
        front = front.next;
        if (front != null)
            front.prev = null;
        else
            rear = null;
        size--;
        return val;
    }

    public T removeRear() {
        if (isEmpty())
            throw new RuntimeException("Deque Underflow");
        T val = rear.data;
        rear = rear.prev;
        if (rear != null)
            rear.next = null;
        else
            front = null;
        size--;
        return val;
    }

    public T peekFront() {
        if (isEmpty())
            throw new RuntimeException("Deque is empty");
        return front.data;
    }

    public T peekRear() {
        if (isEmpty())
            throw new RuntimeException("Deque is empty");
        return rear.data;
    }

    public void print() {
        System.out.print("DequeLinkedList: ");
        Node<T> current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }
}