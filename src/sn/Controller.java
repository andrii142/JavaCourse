package sn;

public class Controller {

    UserDAO dao = new UserDAOImpl();

    User register(User user) {
        return dao.save(user);
    }

    void addToFriends(User fromUser, User toUser) {
        fromUser.getFriends().add(toUser);
        toUser.getFriends().add(fromUser);
    }

    //TODO only registered can send messages and do actions in system
    //TODO login
    void sendMessage(User fromUser, User toUser, String msg) {
        MessageDAO messageDAO = new MessageDAOImp();

        Message message = new Message(fromUser, toUser, msg);

        message.setMsgType(MsgType.OUT);
        fromUser.getMessages().add(message);


        message.setMsgType(MsgType.IN);
        toUser.getMessages().add(message);

        messageDAO.save(message);
    }
}
