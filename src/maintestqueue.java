import dsalib.queue.QueueArray;
import dsalib.queue.QueueLinkedList;

public class maintestqueue {
    public static void main(String[] args) {
        QueueArray<String> queue1 = new QueueArray<>(5);
        queue1.enqueue("A");
        queue1.enqueue("B");
        queue1.enqueue("C");
        System.out.println("Peek: " + queue1.peek());
        System.out.println("Dequeue: " + queue1.dequeue());
        queue1.print();

        QueueLinkedList<Integer> queue2 = new QueueLinkedList<>();
        queue2.enqueue(11);
        queue2.enqueue(22);
        queue2.enqueue(33);
        System.out.println("Queue dequeue: " + queue2.dequeue());
        System.out.println("Queue front: " + queue2.peek());
        queue2.print();
    }
}
