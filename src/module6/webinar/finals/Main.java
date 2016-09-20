package module6.webinar.finals;

public class Main extends DBService {

    Object delete(Object object, long id) {
        System.out.println(generateString("deleted"));
        //you can chanege logic, but other classes can't
        return object;
    }


    public static void main(String[] args) {
        User user = new User("Denis", "Kiev", 25);
    }

}
