package module6.questions;

//
public class Controller {
    private Store store = new Store("Kiev");

    private DAOImpl dao = new DAOImpl();


    //if store has requested item order accepted
    //else error
    public void makeOrder(User user, Item item) {
        Order order = new Order(item, user);

        Item[] items = store.getItems();

        for (Item storeItem : items) {
            if (storeItem.getCityStored().equals(item.getCityStored()) &&
                    storeItem.getName().equals(item.getName())) {
                store.getOrders()[Store.getIndex()] = order;
                dao.save(order);
                return;
            }
        }

        System.out.println("We don't have this item");
    }


    //find order in the store and cancel it
    public void cancelOrder(User user, Item item) {
        makeOrderOperation(user, item, "inactivate");
    }

    public void shipOrder(User user, Item item) {
        makeOrderOperation(user, item, "ship");
    }


    private void makeOrderOperation(User user, Item item, String methodName) {
        Order[] orders = store.getOrders();

        for (Order storeOrder : orders) {
            if (storeOrder.getUser().equals(user)
                    && !storeOrder.isShipped()
                    && customCheckIfItemEqual(storeOrder, item)) {

                switch (methodName) {
                    case "ship": {
                        storeOrder.setShipped(true);

                        //any logic

                        break;
                    }

                    case "inactivate":
                        storeOrder.setActive(false);
                        break;
                }

                //if(methodName.equals("inactivate")) storeOrder.setActive(false);
                //if(methodName.equals("ship")) storeOrder.setShipped(true);

                //can be solved with reflection
                //storeOrder.methodName(param);
                return;
            }
        }

        System.out.println("We don't have this oders");
    }

    //get all shipped orders

    //get min/max order price

    //get average order price

    //get order cities


    private int getRevenueFromAllOrders() {


        //TODO


        return 0;
    }


    private boolean customCheckIfItemEqual(Order storeOrder, Item item2) {
        Item item1 = storeOrder.getItem();

        return item1.getName().equals(item2.getName())
                && item1.getCityStored().equals(item2.getCityStored());

        //if(!item1.getName().equals(item2.getName())) return false;
        //return item1.getCityStored().equals(item2.getCityStored());
    }


}
