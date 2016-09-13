package module5.HW;

import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];


    public BookingComAPI() {
        Room room1 = new Room();
        rooms[0] = room1;

        //do the same for all 5 rooms

        /*

        */
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {


        //logic - implementations


        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
