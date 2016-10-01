package module7.webinar.sets;

import module7.webinar.User;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("aaa");

        System.out.println(set);


        Set<Integer> set1 = new TreeSet<>();
        set1.add(11);
        set1.add(9);
        set1.add(8);

        System.out.println(set1);


        Set<User> set2 = new TreeSet<>();
        set2.add(new User("Denis", 11));
        set2.add(new User("Denisf", 2));
        set2.add(new User("Den", 3));

        set2.add(new User("Denis", 13));

        System.out.println(set2);
    }
}
