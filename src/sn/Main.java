package sn;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAOImpl();
        System.out.println(dao.getAll());

        User user = new User("Denis", "Kiev");
        User user1 = new User("Roman", "Lviv");

        Controller controller = new Controller();

        controller.register(user);
        controller.register(user1);

        System.out.println(dao.getAll());
    }
}
