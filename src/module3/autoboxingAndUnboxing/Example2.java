package module3.autoboxingAndUnboxing;

import java.util.ArrayList;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 7;

        System.out.println(sumEven(array));
    }

    private static int sumEven(Integer[] li) {
        int sum = 0;
        for (Integer item : li)
            if (item % 2 == 0)
                //UNBOXING
                sum += item;
        return sum;
    }
}
