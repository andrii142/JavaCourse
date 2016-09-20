package module6.questions;


import java.util.Date;

public class Controller {
    Store store = new Store();

    void makeOrder(User user, Item item) {
        Order order = new Order(item, new Date(), user);

    }
}
