package module6.questions;


import java.util.Date;

public class Controller {
    private Store store = new Store("Kiev");

    
    void makeOrder(User user, Item item) {
        Order order = new Order(item, user);
        store.getOrders()[Store.getIndex()] = order;
    }



}
