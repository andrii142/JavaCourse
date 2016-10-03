package module7.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WarmUpTask2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Yalta");
        list.add("Kiev");
        list.add("Praga");
        list.add("London");
        list.add("Odessa");

        System.out.println(list);

        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        list.sort(c);


        System.out.println(list);
    }

}
