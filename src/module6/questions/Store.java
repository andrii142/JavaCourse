package module6.questions;

public class Store {
    private Item[] items = new Item[5];
    private Order[] orders = new Order[10];
    private String city;
    private static int index = 0;

    public Store(String city) {
        this.city = city;
    }

    public Order[] getOrders() {
        return orders;
    }

    public static int getIndex() {
        return index;
    }
}
