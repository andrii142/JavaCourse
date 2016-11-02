package finalproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User("Test1"));
        list.add(new User("Test2"));


        Iterator<User> iterator = list.iterator();
        iterator.next();
        iterator.remove();

        iterator.next();
        iterator.remove();

        System.out.println(list);
    }
}
