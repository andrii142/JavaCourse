package module10.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        int index = 5;
        while(index > 0) {
            list.add(UUID.randomUUID().toString());
            index--;
        }

        list.removeIf(x -> x.contains("5")
                && x.length() > 1);

        System.out.println(list);
    }
}
