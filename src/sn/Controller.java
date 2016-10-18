package sn;

import java.util.List;
import java.util.stream.Collectors;

public class Controller {

    UserDAO dao = new UserDAOImpl();

    User register(User user) {
        return dao.save(user);
    }

    void logOut(User user) {
        user.setLoggedIn(false);
        //redirect
    }

    //json
    User login(String userName, String password) {
        List<User> users = dao.getAll().stream()
                //.anyMatch(u -> u.getFirstName().equals(userName) && u.getPassword().equals(password))
                .filter(u -> u.getFirstName().equals(userName) && u.getPassword().equals(password))
                .collect(Collectors.toList());

        if (users.size() == 0) System.out.println("error was occured");

        else {
            User user = users.get(0);
            user.setLoggedIn(true);
            return user;
        }

        return null;
    }


    void addToFriends(User fromUser, User toUser) {
        if(!UserUtil.checkLogin(fromUser)) return;

        fromUser.getFriends().add(toUser);
        toUser.getFriends().add(fromUser);
    }

    void sendMessage(User fromUser, User toUser, String msg) {
        if(!UserUtil.checkLogin(fromUser)) return;

        MessageDAO messageDAO = new MessageDAOImp();

        Message message = new Message(fromUser, toUser, msg);

        message.setMsgType(MsgType.OUT);
        fromUser.getMessages().add(message);


        message.setMsgType(MsgType.IN);
        toUser.getMessages().add(message);

        messageDAO.save(message);
    }
}
