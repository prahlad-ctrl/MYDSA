package dsalib.deque;

public class DequeArray<T> {
    private Object[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public DequeArray(int capacity) {
        this.capacity = capacity;
        this.arr = new Object[capacity];
        this.front = -1;
        this.rear = 0;
        this.size = 0;
    }

    public void addFront(T value) {
        if (isFull())
            throw new RuntimeException("Deque Overflow");

        if (front == -1) {
            front = rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }
        arr[front] = value;
        size++;
    }

    public void addRear(T value) {
        if (isFull())
            throw new RuntimeException("Deque Overflow");

        if (front == -1) {
            front = rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = value;
        size++;
    }

    public T removeFront() {
        if (isEmpty())
            throw new RuntimeException("Deque Underflow");
        T val = (T) arr[front];

        if (front == rear) {
            front = rear = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return val;
    }

    public T removeRear() {
        if (isEmpty())
            throw new RuntimeException("Deque Underflow");
        T val = (T) arr[rear];

        if (front == rear) {
            front = rear = -1;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }
        size--;
        return val;
    }

    public T peekFront() {
        if (isEmpty())
            throw new RuntimeException("Deque is empty");
        return (T) arr[front];
    }

    public T peekRear() {
        if (isEmpty())
            throw new RuntimeException("Deque is empty");
        return (T) arr[rear];
    }

    public void print() {
        System.out.print("DequeArray: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}