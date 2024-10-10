package StackQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(2);
        queue.insert(8);
        queue.insert(5);
        queue.insert(9);
        queue.insert(7);
        queue.insert(1);
        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}
