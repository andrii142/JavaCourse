package module6.questions;


public class Controller {
    private Store store = new Store("Kiev");

    private DAOImpl dao = new DAOImpl();


    //@Requet(/makeOrder)
    public void makeOrder(User user, Item item) {
        Order order = new Order(item, user);

        Item[] items = store.getItems();

        for(Item storeItem : items) {
            if(storeItem.getCityStored().equals(item.getCityStored()) &&
                    storeItem.getName().equals(item.getName())) {
                store.getOrders()[Store.getIndex()] = order;
                dao.save(order);
                return;
            }
        }

        System.out.println("We don't have this item");
    }


    public void cancelOrder(User user, Item item) {
        Order[] orders = store.getOrders();

        for(Order storeOrder : orders) {
            if(storeOrder.getUser().equals(user) && storeOrder.getItem().equals(item)) {
                storeOrder.setActive(false);
                //TODO
            }
        }
    }





}
