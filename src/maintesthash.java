import dsalib.hash.HashMap;
import dsalib.hash.HashSet;

public class maintesthash {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("B", 20);
        map.print();
        System.out.println("Get B: " + map.get("B"));
        System.out.println("Contains A? " + map.containsKey("A"));
        map.remove("A");
        System.out.println("Contains A? " + map.containsKey("A"));
        System.out.println("Map size: " + map.size());

        HashSet<Integer> set = new HashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        set.print();
        System.out.println("Contains 20? " + set.contains(20));
        set.remove(20);
        System.out.println("Contains 20? " + set.contains(20));
        System.out.println("Set size: " + set.size());
    }
}
