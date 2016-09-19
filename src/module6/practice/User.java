package module6.practice;

/**
 * Created by zetokz on 19.09.16.
 */
public class User {

    private static int counter = 0;

    public User() {
        //init some fields
//        counter = counter + 1;
//        counter += 1;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
