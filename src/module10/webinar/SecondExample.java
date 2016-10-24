package module10.webinar;

import sn.User;

import java.util.ArrayList;
import java.util.List;

public class SecondExample {
    static List<User> list = new ArrayList<>();

    public static void main(String[] args) {


        User user = new User("Denis", "Kiev");
        user.setPassword("111");
        User user1 = new User("Andrey", "Lviv");
        User user2 = new User("Denis", null);
        User user3 = new User("Denis", "Kiev");

        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);

        System.out.println(calc("Kiev"));


    }

    private static int calc(String city) {
        int counter = 0;
        int counter1 = 0;
        for (User user : list) {
            try {
                if (user.getCity().equals(city))
                    counter++;

                if (user.getPassword().length() < 5)
                    counter1++;

                list.get(5);
                System.out.println("try is finished without error");
            } catch (NullPointerException e) {
                System.out.println("warning:" + user.getFirstName() + " NPE");
                continue;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("critical error:" + user.getFirstName() + " IAOBE");
                break;
            } finally {
                System.out.println("finally...");
            }
        }
        return counter1;
    }
}
