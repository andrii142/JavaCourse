package module5.HW;

public class Controller {
    private API[] apis = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;

        //....
    }

    public Controller(API[] apis) {
        this.apis = apis;
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        //crerating array !!!BAD PRACTICE TO CREATE HERE
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;


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

        return null;

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

        //api1.getAll();
        //api2.getAll();


        //logic (!!!) KEY moment

        return null;


    }

}
