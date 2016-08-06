package module3.autoboxingAndUnboxing;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);

        System.out.println(sumEven(list));
    }

    private static int sumEven(List<Integer> li) {
        int sum = 0;
        for (Integer i : li)
            if (i % 2 == 0)
                sum += i;
        return sum;
    }
}
