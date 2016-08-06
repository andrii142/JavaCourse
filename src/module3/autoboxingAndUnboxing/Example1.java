package module3.autoboxingAndUnboxing;

import java.util.ArrayList;
import java.util.List;

public class Example1 {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for (int i = 1; i < 50; i += 2)
            li.add(i);

        //but java do this :
        //List<Integer> li = new ArrayList<>();
        //for (int i = 1; i < 50; i += 2)
        //   li.add(Integer.valueOf(i));
    }
}
