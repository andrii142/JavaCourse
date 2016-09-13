package module5.HW;

public class DAOHardImpl implements DAO {
    //

    @Override
    public Room save(Room room) {
        return null;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        //Rooms - id = 101, price = 400, persons = 2, city = Kiev, hotel = HolidayInn - saved in DB

        //id = 101, price = 600, persons = 2, city = Minks, hotel = HolidayInn - saved in DB
        return null;
    }

    @Override
    public Room findById(long id) {
        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
