package module10.questions;

import java.util.List;

public class UserDAOImpl extends AbstractDAOImpl<User> implements UserDAO {

    @Override
    public User saveUser(User user) {
        return save(user);
    }

    @Override
    public List<User> findByEmail(String email) {
        return null;
    }
}
