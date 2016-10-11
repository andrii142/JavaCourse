package module8.webinar.generics;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Integer[] array = {1, 5, 6, 9};
        List<Integer> list = new ArrayList<>();
        list.add(12);

        System.out.println(StartGenericsExample.fromArrayToCollection3(array, list));


        String[] array1 = {"ee", "aa"};
        List<String> list1 = new ArrayList<>();
        list1.add("bb");
        System.out.println(StartGenericsExample.fromArrayToCollection3(array1, list1));
    }
}
