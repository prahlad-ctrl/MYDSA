import dsalib.arrays.DynamicArray;

public class maintestarray {
    public static void main(String[] args) {
        DynamicArray<Integer> dynArr = new DynamicArray<>();

        dynArr.add(10);
        dynArr.add(20);
        dynArr.insertAt(1, 15);
        dynArr.add(30);
        dynArr.get(2);
        dynArr.print();
        System.out.println("Index of 20: " + dynArr.search(20));
        dynArr.delete(2);
        dynArr.print();
    }
}