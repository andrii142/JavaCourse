package module6.questions;

public class Store {
    private Item[] items = new Item[5];
    private Order[] orders = new Order[10];
    private String city;
    private static int index = 0;

    public Store(String city) {
        this.city = city;

        Item item = new Item(1001, "Opel", "Kiev", 100);
        items[0] = item;

        item = new Item(1002, "BMW", "Kiev", 230);
        items[1] = item;

        item = new Item(1003, "Skoda", "Lviv", 70);
        items[2] = item;

        item = new Item(1004, "Mersedes", "Kiev", 400);
        items[3] = item;

        item = new Item(1005, "Opel", "Dnepr", 900);
        items[4] = item;
    }

    /*public void makeOrder(User user, Item item) {
        Order order = new Order(item, user);

        DAOImpl dao = new DAOImpl();

        for(Item storeItem : items) {
            if(storeItem.getCityStored().equals(item.getCityStored()) &&
                    storeItem.getName().equals(item.getName())) {
                orders[Store.getIndex()] = order;
                dao.save(order);
                return;
            }
        }

        System.out.println("We don't have this item");
    }*/

    public Order[] getOrders() {
        return orders;
    }

    public static int getIndex() {
        return index;
    }

    public Item[] getItems() {
        return items;
    }

    public String getCity() {
        return city;
    }
}
