package module8.questions;

public class Order implements Comparable<Order>{
    private int price;
    private String name;

    public Order(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int compareTo(Order o) {
        return price - o.price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                '}';
    }
}
