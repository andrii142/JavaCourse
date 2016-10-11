package module8.questions;

import java.util.Set;
import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        Set<String> set1 = new TreeSet<>();



        TreeSet<String> set = new TreeSet<>();
        set.add("test1");
        set.add("test2");
        set.add("test3");

        System.out.println(set.last());

        TreeSet<Order> orders = new TreeSet<>();
        orders.add(new Order(100, "test1"));
        orders.add(new Order(150, "test2"));
        orders.add(new Order(90, "test3"));

        System.out.println(orders.last());

        //Iterator<String> iterator = set.iterator();
        //iterator.
    }
}
