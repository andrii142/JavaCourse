package module6.questions2;

import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayMerge {
    public static void main(String[] args) {
        int[] a1 = new int[1];
        int[] a2 = new int[3];
        int[] a3 = new int[6];

        int length = a1.length + a2.length + a3.length;

        int[] res = new int[length];

        //iterate throuht array and add elements

        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(11);
        queue.add(-11);
        queue.add(0);
        int a = queue.element();
    }
}
