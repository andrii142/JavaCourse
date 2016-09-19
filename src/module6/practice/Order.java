package module6.practice;

/**
 * Created by zetokz on 19.09.16.
 */
public class Order {
    private long id;
    private String itemName;
    private boolean isActive;
    private boolean isDone;
    private int price;
    private User user;

    public Order(int price, String itemName, boolean isActive, boolean isDone, long id) {
        this.price = price;
        this.itemName = itemName;
        this.isActive = isActive;
        this.isDone = isDone;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (id != order.id) return false;
        if (isActive != order.isActive) return false;
        if (isDone != order.isDone) return false;
        if (price != order.price) return false;
        if (!itemName.equals(order.itemName)) return false;
        return user.equals(order.user);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + itemName.hashCode();
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (isDone ? 1 : 0);
        result = 31 * result + price;
        result = 31 * result + user.hashCode();
        return result;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }
}
