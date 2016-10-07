package module7.practice;

import java.util.ArrayList;
import java.util.List;

public class HW1 {
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        List<List<String>> result = new ArrayList<>();

        int count = 5;
        while(count > 0) {
            result.add(new ArrayList<>());
            count--;
        }
    }
}
