package module5.HW;

public class DAOOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println(room.toString() + "saved");
        return room;
    }

    @Override
    public boolean delete(Room room) {
        return false;
    }

    @Override
    public Room update(Room room) {
        return null;
    }

    @Override
    public Room findById(long id) {
        //Room room = new Room(id, 0, null, null);
        //System.out.println("" + );
        //return

        return null;
    }

    @Override
    public Room[] getAll() {
        return new Room[0];
    }
}
