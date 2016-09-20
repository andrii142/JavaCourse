package module6.questions;

import java.util.Date;

public class Order {
    private Item item;
    private User user;
    private Date date;
    private static int counter;

    private boolean isActive;
    private boolean isShipped;

    public Order(Item item, User user) {
        this.item = item;
        this.user = user;
        this.date = new Date();

        this.isActive = true;
        this.isShipped = false;
    }


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Order order = (Order) object;

        if (isActive != order.isActive) return false;
        if (isShipped != order.isShipped) return false;
        if (!item.equals(order.item)) return false;
        if (!user.equals(order.user)) return false;
        return date.equals(order.date);
    }

    @Override
    public int hashCode() {
        int result = item.hashCode();
        result = 31 * result + user.hashCode();
        result = 31 * result + date.hashCode();
        result = 31 * result + (isActive ? 1 : 0);
        result = 31 * result + (isShipped ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item=" + item +
                ", user=" + user +
                ", date=" + date +
                ", isActive=" + isActive +
                ", isShipped=" + isShipped +
                '}';
    }

    public static int getCounter() {
        return counter;
    }

    public Item getItem() {
        return item;
    }

    public boolean isActive() {
        return isActive;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public User getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setShipped(boolean shipped) {
        isShipped = shipped;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public static void setCounter(int counter) {
        Order.counter = counter;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
