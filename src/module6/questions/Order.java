package module6.questions;

import java.util.Date;

/**
 * Created by amudrevskyi on 20.09.2016.
 */
public class Order {
    private Item item;
    private User user;
    private Date date;
    private static int counter;

    public Order(Item item, Date date, User user) {
        this.item = item;
        this.date = date;
        this.user = user;
    }
}
