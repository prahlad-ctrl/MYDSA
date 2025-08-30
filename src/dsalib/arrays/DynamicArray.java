package dsalib.arrays;

import java.util.Arrays;

public class DynamicArray<T> {
    private Object[] arr;
    private int size;
    private int capacity;

    public DynamicArray() {
        capacity = 2;
        arr = new Object[capacity];
        size = 0;
    }

    // Resize array
    private void resize() {
        capacity *= 2;
        arr = Arrays.copyOf(arr, capacity);
    }

    // Add element at end
    public void add(T value) {
        if (size == capacity) {
            resize();
        }
        arr[size++] = value;
    }

    // Insert at any index
    public void insertAt(int index, T value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        if (size == capacity) {
            resize();
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;
    }


    // Delete at index
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null;
    }

    // Search for element
    public int search(T value) {
        for (int i = 0; i < size; i++) {
            if (arr[i].equals(value)) return i;
        }
        return -1;
    }

    // Get element
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Invalid index");
        return (T) arr[index];
    }

    // Print array
    public void print() {
        System.out.print("DynamicArray: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Return size
    public int size() {
        return size;
    }
}