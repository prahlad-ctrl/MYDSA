package dsalib.stack;

public class StackLinkedList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;
    private int size;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty())
            throw new RuntimeException("Stack Underflow");
        T val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public T peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.print("StackLinkedList: ");
        Node<T> current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}