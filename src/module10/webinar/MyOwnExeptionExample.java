package module10.webinar;

public class MyOwnExeptionExample {
    public static void main(String[] args) throws Throwable {
        try {
            checkString("test");
        } catch (NullPointerException e) {

        } catch (ClassCastException e) {

        } catch (Exception e) {
            System.err.println("bad string");
            //send error ticket to admin
        }
    }

    static void checkString(String string) throws TestException {
        if (string.equals("system"))
            System.out.println("happy");
        else {
            //System.out.println("error");
            Exception ex = new Exception();
            //throw ex;
            //throw new Error();
            throw new TestException("test exception...");
        } //throw Throwable
    }
}
