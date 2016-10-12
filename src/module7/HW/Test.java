package module7.HW;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();

        List<String> list2 = new LinkedList<>();

        long start = System.currentTimeMillis();

        for(int i = 0 ; i < 1000000; i ++) {
            list2.add("test");
            //list1.add(1);
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);
    }
}
