package dsalib.queue;

public class QueueArray<T> {
    private T[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    private void resize() {
        capacity *= 2;
        T[] newArr = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }
        arr = newArr;
        front = 0;
        rear = size - 1;
    }

    public void enqueue(T value) {
        if (isFull())
            resize();
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    public T dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue Underflow");
        T val = arr[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }

    public T peek() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.print("QueueArray: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}