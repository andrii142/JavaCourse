package module6.webinar.finals;

public class DBService {
    String res = null;

    final Object save(Object object) {
        System.out.println("saved");
        return object;
    }

    final Object delete(Object object) {
        System.out.println(generateString("deleted"));
        //you can chanege logic, but other classes can't
        return object;
    }

    String generateString(String res) {
        return res = res;
    }
}
