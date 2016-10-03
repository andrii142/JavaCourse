package module7.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WarmUpTask1 {
   // List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(20);

        System.out.println(list);

        /*Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                //int res = i1 - i2;
                //if(res < 0) return -1;
                //if(res > 0) return 1;
                //if(res == 0) return 0;

                return i2 - i1;
            }
        };*/

        list.sort(new IncreaseOrder());

        System.out.println(list);

    }

}
