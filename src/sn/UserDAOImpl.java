package sn;

import java.util.ArrayList;
import java.util.List;

public class UserDAOImpl implements UserDAO {
    static List<User> allUsers = new ArrayList<>();


    @Override
    public User save(User user) {
        allUsers.add(user);
        return user;
    }

    @Override
    public List<User> getAll() {
        return allUsers;
    }
}
