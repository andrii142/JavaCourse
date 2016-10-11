package module8.questions;

import java.util.TreeSet;

public class Q7 {
    public static void main(String[] args) {
        TreeSet<Order> orders = new TreeSet<>();
        orders.add(new Order(100, "test1"));
        orders.add(new Order(150, "test2"));
        orders.add(new Order(90, "test3"));

        System.out.println(orders);
    }
}
