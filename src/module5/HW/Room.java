package module5.HW;

import java.util.Date;

public class Room {
    private long id;
    private int price;
    private String city;


    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Room room = (Room) object;

        if (id != room.id) return false;
        if (price != room.price) return false;
        return city.equals(room.city);

        //null.methods - as a result nullPointerException
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + price;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    public void setId(long id) {
        this.id = id;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
