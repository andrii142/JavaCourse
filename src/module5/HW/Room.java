package module5.HW;

import java.util.Date;

public class Room {
    private long id;
    private int price;
    private String city;

    public Room(long id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Room room = (Room) object;

        /*if(id != 0) {
            if (id != room.id) return false;
        }*/

        if(price != 0) {
            if (price != room.price) return false;
        }

        if(city != null) {
            if (!city.equals(room.city)) return false;
        }

        //null.methods - as a result nullPointerException

        return true;
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
