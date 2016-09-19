package module6.practice;

/**
 * Created by zetokz on 19.09.16.
 */
public class Main {
    public static void main(String[] args) {
//        System.out.println("first user counter = "
//                + User.getCounter());

//        new User();
//        new User();
//        new User();
//        final User user1 = new User();
//        System.out.println(User.getCounter()); // legal
//        final User user2 = new User();
//        System.out.println(user2.getCounter()); // illegal


//        System.out.println("after creating users, counter = "
//                + User.getCounter());


        final String result =
                Utils.removeChar('e', "Heeello!");

        System.out.println(result);

        System.out.println(Utils.removeChar2('e', "Heeeello!"));

        System.out.println(Utils.removeChar3('e', "Heeeello!"));

        System.out.println(Utils.removeChar4('e', "Heeeello!"));

        int number = 12345;
//        final String numberReplaced = Utils.removeChar('2', String.valueOf(number));
        final String numberReplaced = Utils.removeChar('2', number + "");

//        new Utils();

        System.out.println(numberReplaced);
    }
}
