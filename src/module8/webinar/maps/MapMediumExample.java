package module8.webinar.maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapMediumExample {
    private static int TESTS_COUNT = 10;
    private static Task task = new Task("");

    public static void main(String[] args) {
        Map<Integer, Boolean> map = new TreeMap<>();

        //emulates tests results
        int index = 0;
        while (TESTS_COUNT > 0) {
            boolean res = false;
            if (index % 2 == 0) res = true;
            map.put(index, res);
            index++;

            TESTS_COUNT--;
        }


        System.out.println(map);

        //create solutions
        Solution solution = new Solution(map);

        List<Solution> solutions = new ArrayList<>();

        //update task
        task.setSolutions(solutions);
    }
}
