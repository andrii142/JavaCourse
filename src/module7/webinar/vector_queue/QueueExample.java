package module7.webinar.vector_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        queue.add(1100);
        queue.add(11);
       // queue.add(0);
        queue.add(110);
        queue.add(-30);
        queue.add(-40);
        queue.add(-11);
        queue.add(50);

        //-11 0 11 40 ...


        System.out.println(queue.element());

      //  queue.remove();

      //  System.out.println(queue.element());

        //System.out.println(queue.peek());

       // System.out.println(queue.poll());

       // System.out.println(queue.peek());
    }
}
