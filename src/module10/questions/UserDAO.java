package module10.questions;

import java.util.List;

public interface UserDAO {
    User saveUser(User user);

    List<User> findByEmail(String email);

    //

    //

    //
}
