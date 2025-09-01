package dsalib.hash;

import java.util.LinkedList;

class HashNode<K, V> {
    K key;
    V value;

    public HashNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class HashMap<K, V> {
    private LinkedList<HashNode<K, V>>[] buckets;
    private int capacity;
    private int size;

    public HashMap() {
        capacity = 10;
        buckets = new LinkedList[capacity];
        size = 0;
    }

    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    // insert or update
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (HashNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        buckets[index].add(new HashNode<>(key, value));
        size++;
    }

    // get value by key
    public V get(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null)
            return null;

        for (HashNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    // remove key
    public V remove(K key) {
        int index = getBucketIndex(key);
        if (buckets[index] == null)
            return null;

        for (HashNode<K, V> node : buckets[index]) {
            if (node.key.equals(key)) {
                V val = node.value;
                buckets[index].remove(node);
                size--;
                return val;
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.println("HashMap contents:");
        for (int i = 0; i < capacity; i++) {
            if (buckets[i] != null) {
                for (HashNode<K, V> node : buckets[i]) {
                    System.out.println(node.key + " -> " + node.value);
                }
            }
        }
    }
}
