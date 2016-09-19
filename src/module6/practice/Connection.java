package module6.practice;

/**
 * Created by zetokz on 19.09.16.
 */
public class Connection {

    private final User user1 = new User();
    private final User user2;

    private static final Connection INSTANCE = new Connection();
    private static final User USER;

    private Connection() {
        user2 = new User();
    }

    private final User user3 = new User();

    static {
        USER = new User();
//        INSTANCE = new Connection();
//        INSTANCE = new Connection();
    }

    private static final Connection INSTANCE2 = new Connection();

    public static Connection getInstance() {
//        if (INSTANCE == null) {
//            INSTANCE = new Connection();
//        }
        return INSTANCE;
    }

    public static User getUser() {
        return USER;
    }
}
