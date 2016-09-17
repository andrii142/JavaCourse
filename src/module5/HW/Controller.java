package module5.HW;

public class Controller {
    private API[] arrayOfApis = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        arrayOfApis[0] = bookingComAPI;

        //....
    }

    public Controller(API[] arrayOfApis) {
        this.arrayOfApis = arrayOfApis;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        //crerating array !!!BAD PRACTICE TO CREATE HERE
        BookingComAPI bookingComAPI = new BookingComAPI();
        arrayOfApis[0] = bookingComAPI;

        //100, 2, "Kiev", "Test"

        //using
        Room[] res = bookingComAPI.findRooms(price, persons, city, hotel);


        //another logic
        //Room[] res1 = new Room[];

        //for(int i = 0 ; i < 10; i ++) {
        //    res1[]
        //}



        //Room[] rooms = new Room[1000];

        /*int roomsCount = 0;

        if(true) {
            roomsCount++;
        }*/

        //test array
        Room[] rooms = {new Room(1001, 200)};

        DAOOImpl daoo = new DAOOImpl();
        //
        daoo.save(rooms[0]);
        //
        return rooms;
    }

    Room save(Room room) {
        DAOHardImpl daoHard = new DAOHardImpl();
        return daoHard.save(room);
    }



    Room[] check(API api1, API api2) {
        // api1.findRooms(0, 0, null, null); option 1

        /*int price = 100;
        int persons = 2;
        String city = "Kiev";
        String hotel = "Holiday";

        Room[] res1 = api1.findRooms(price, persons, city, hotel);
        Room[] res2 = api2.findRooms(price, persons, city, hotel);*/

        Room[] roomsFromApi1 = api1.getAll();
        Room[] roomsFromApi2 = api2.getAll();

        int countRooms;
        for(int i = 0; i < roomsFromApi1.length; i++) {
            //check if rooms from two arrays are equal
            //countRooms++;
        }

        //create array with countRooms lentgth

        for(int i = 0; i < roomsFromApi1.length; i++) {
            //check if rooms from two arrays are equal
            //countRooms++;
        }

        //logic (!!!) KEY moment

        return null;


    }

}
