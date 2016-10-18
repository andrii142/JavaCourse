package module9.questions;

import sn.User;

public class UserDAOImpl extends AbstractDAOImpl<User> {



    public User saveUser(User user){
        return save(user);
    }
}
