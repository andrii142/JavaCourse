package module5.HW;

import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms = new Room[5];



    public BookingComAPI() {
        Room room1 = new Room(1001, 200);
        rooms[0] = room1;

        //do the same for all 5 rooms

        /*

        */
    }

    //implentation
    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {


        //check equals


        //check hotel


        //logic - implementations


        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
