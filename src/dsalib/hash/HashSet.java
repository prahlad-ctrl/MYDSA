package dsalib.hash;

public class HashSet<K> {
    private HashMap<K, Object> map;
    private static final Object PRESENT = new Object();

    public HashSet() {
        map = new HashMap<>();
    }

    // Add element
    public void add(K key) {
        map.put(key, PRESENT);
    }

    // Remove element
    public void remove(K key) {
        map.remove(key);
    }

    // Check if element exists
    public boolean contains(K key) {
        return map.containsKey(key);
    }

    // Size of set
    public int size() {
        return map.size();
    }

    // Print set
    public void print() {
        System.out.println("HashSet contents:");
        map.print();
    }
}
