package module7.practice;

import java.util.*;

public class WarmUpTask4 {
    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
        users.add(new User(10, "Andrey"));
        users.add(new User(101, "Andrey"));
        users.add(new User(69, "Dima"));
        users.add(new User(27, "Rita"));

        System.out.println(users);

        Set<User> users1 = new HashSet<>();
        users1.add(new User(10, "Andrey"));
        users1.add(new User(10, "Andrey"));
        users1.add(new User(69, "Dima"));
        users1.add(new User(27, "Rita"));

        System.out.println(users1);


    }
}
