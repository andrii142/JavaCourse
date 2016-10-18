package sn;

public class UserUtil {
    static boolean checkLogin(User user) {
        if (!user.isLoggedIn()) {
            System.err.println("you must be logged in");
            //redirect
            return false;
        }
        return true;
    }

}
