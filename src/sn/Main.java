package sn;

public class Main {
    public static void main(String[] args) {
        UserDAO dao = new UserDAOImpl();
        MessageDAO messageDAO = new MessageDAOImp();

        //System.out.println(dao.getAll());

        User user = new User("Denis", "Kiev");
        User user1 = new User("Roman", "Lviv");

        Controller controller = new Controller();

        controller.register(user);
        controller.register(user1);

        //System.out.println(dao.getAll());

        controller.addToFriends(user, user1);

        controller.sendMessage(user1, user, "Привет!");
        controller.sendMessage(user, user1, "Не пиши мне:)");

        //System.out.println(user);
        //System.out.println(user1);

        System.out.println(messageDAO.getAll());

       // System.out.println(dao.getAll());

    }
}
