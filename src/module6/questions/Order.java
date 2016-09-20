package module6.questions;

import java.util.Date;

public class Order {
    private Item item;
    private User user;
    private Date date;
    private static int counter;

    public Order(Item item, User user) {
        this.item = item;
        this.user = user;
        this.date = new Date();
    }

    public static int getCounter() {
        return counter;
    }
}
