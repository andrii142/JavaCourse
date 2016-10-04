package module7.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    public static void main(String[] args) {
        //list example
        List<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(6);
        list.add(-1);
        list.add(11);

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int resCompare = o2 - o1;
                return resCompare;

               // return o1 - o2;
            }
        };


        list.sort(comparator);
        System.out.println(list);

        //array example
        String[] strings = new String[5];
        strings[0] = "Sun";
        strings[1] = "Pool";
        strings[2] = "Kiev";
        strings[3] = "Apple";
        strings[4] = "Car";

        Arrays.sort(strings);

        System.out.println(Arrays.deepToString(strings));

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                //0. Sun vs Kiev
                //1. 3 vs 4
                //2. 3 - 4 = -1
                //3. Sun < Kiev
                return s2.length() - s1.length();
            }
        };

        Arrays.sort(strings, c);

        System.out.println(Arrays.deepToString(strings));

    }
}
