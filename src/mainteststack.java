import dsalib.stack.StackArray;
import dsalib.stack.StackLinkedList;

public class mainteststack {
    public static void main(String[] args) {
        StackArray<Integer> stack1 = new StackArray<>(5);
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        System.out.println("Peek: " + stack1.peek());
        System.out.println("Pop: " + stack1.pop());
        stack1.print();

        StackLinkedList<Integer> stack2 = new StackLinkedList<>();
        stack2.push(100);
        stack2.push(200);
        stack2.push(300);
        System.out.println("Stack pop: " + stack2.pop());
        System.out.println("Stack peek: " + stack2.peek());
        stack2.print();
    }
}
