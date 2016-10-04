package sn;

public class Controller {

    DAO dao = new DAOImpl();

    User register(User user) {
        return dao.save(user);
    }

    User addToFriends(User fromUser, User toUser) {
        fromUser.getFriends().add(toUser);
        return toUser;
    }
}
