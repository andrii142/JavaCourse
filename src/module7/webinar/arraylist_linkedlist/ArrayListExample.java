package module7.webinar.arraylist_linkedlist;

import module6.HW.ArrayUtils;
import module7.webinar.compare.CustomCompator;
import module7.webinar.User;

import java.util.*;
import java.util.function.UnaryOperator;

public class ArrayListExample {
    public static void main(String[] args) {
        //
        List<String> list = new ArrayList<>();

        System.out.println(list);

        list.add("item");
        list.add("item1");
        list.add("item2");
        list.add("item3");

        System.out.println(list);

        list.add(1, "item9");

        System.out.println(list);

        list.set(1, "item10");

        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("test");
        list1.add("test1");

        list.addAll(list1);

        System.out.println(list);

        //list.clear();

        //System.out.println(list);


        //System.out.println(list.indexOf("test1"));

        UnaryOperator<String> operator = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                if(s.equals("item")) {
                    return "haha";
                }
                return s;
            }
        };


        list.replaceAll(operator);

        //System.out.println(list);



        List<String> list2 = new ArrayList<>();
        list2.add("item");
        list2.add("test");

        //list.retainAll(list2);

        System.out.println(list);


        //System.out.println(list.contains("item"));

        //System.out.println(list.remove("item10"));

        //System.out.println(list);

        //System.out.println(list.contains(list2));

        System.out.println(list.removeAll(list2));

        System.out.println(list);



        List<User> users = new ArrayList<>();
        users.add(new User("Denis", 1321));
        users.add(new User("Test", 2001));
        users.add(new User("Alexey", 101));

        users.sort(new CustomCompator());

        System.out.println(users);

        User[] userArray = new User[2];
        userArray[0] = new User("Denis", 20);
        userArray[1] = new User("Test", 10);

        Arrays.sort(userArray);

        System.out.println(Arrays.deepToString(userArray));
    }
}
