package module7.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class WarmUpTask3 {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "Yalta";
        array[1] = "Kiev";
        array[2] = "Praga";
        array[3] = "London";
        array[4] = "Odessa";

        System.out.println(Arrays.deepToString(array));

        Arrays.sort(array);

        System.out.println(Arrays.deepToString(array));

        //apply comparator
        Comparator<String> c = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Arrays.sort(array, c);

        System.out.println(Arrays.deepToString(array));




    }
}
