package sn;

import java.util.List;

public interface UserDAO {
    User save(User user);

    List<User> getAll();
}
