package module8.webinar.maps;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();

        //KEY - VALUE
        Map<String, Integer> map = new HashMap<>();

        System.out.println(map);

        map.put("Jan", 31);
        map.put("Feb", 28);
        map.put("Mar", 30);
        map.put("Apr", 30);

        System.out.println(map);

        map.get("Feb");


        System.out.println(map.keySet());

        map.remove("Mar");

        System.out.println(map.values());


        Map<String, Integer> map1 = new TreeMap<>();

        map1.put("Jan", 31);
        map1.put("Feb", 28);
        map1.put("Mar", 30);
        map1.put("Apr", 30);

        System.out.println(map1);



    }
}
