package sn;

import java.util.List;

public interface DAO {
    User save(User user);

    List<User> getAll();
}
