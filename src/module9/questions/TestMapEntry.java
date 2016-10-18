package module9.questions;

import java.util.*;

public class TestMapEntry {
    public static void main(String[] args) {
        List<String> list;

        Map<String, String> map = new HashMap<>();
        map.put("1", "test1");
        map.put("2", "test2");
        map.put("3", "test3");


        Set<Map.Entry<String, String>> set = map.entrySet();

        Iterator<Map.Entry<String, String>> iterator = set.iterator();

        Map.Entry<String, String> ob = iterator.next();


        System.out.println(map.entrySet());
    }

    private boolean check(Map<String, String> map) {
        /*for(String key : map.keySet()){
            if(map.get(key).equals())
        }*//*

        for(Map.Entry<String, String> entry : map.entrySet()) {
            if(entry.getValue().equals())
                return true;
        }*/

        return true;
    }
}
