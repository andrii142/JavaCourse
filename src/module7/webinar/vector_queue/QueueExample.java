package module7.webinar.vector_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.add("item1");
        queue.add("item2");
        queue.add("item3");
        queue.add("item4");

       // System.out.println(queue.element());

      //  queue.remove();

      //  System.out.println(queue.element());

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue.peek());
    }
}
