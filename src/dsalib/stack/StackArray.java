package dsalib.stack;

public class StackArray<T> {
    private T[] arr;
    private int top;
    private int capacity;

    public StackArray(int capacity) {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
        top = -1;
    }

    private void resize() {
        capacity *= 2;
        T[] newArr = (T[]) new Object[capacity];
        for (int i = 0; i <= top; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void push(T value) {
        if (top == capacity - 1) {
            resize();
        }
        arr[++top] = value;
    }

    public T pop() {
        if (isEmpty())
            throw new RuntimeException("Stack Underflow");
        return arr[top--];
    }

    public T peek() {
        if (isEmpty())
            throw new RuntimeException("Stack is empty");
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public void print() {
        System.out.print("StackArray: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}