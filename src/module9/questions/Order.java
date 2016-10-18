package module9.questions;

public class Order {
    private String city;
    private String name;

    public Order(String city, String name) {
        this.city = city;
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Order order = (Order) object;

        return city != null ? city.equals(order.city) : order.city == null;

    }

    @Override
    public int hashCode() {
        return city != null ? city.hashCode() : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
