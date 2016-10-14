package module8;


import sn.User;

public class Test extends HW<User> {

    void test() {
        User user = new User("Denis", "Kiev");
        delete(user);
    }
}
