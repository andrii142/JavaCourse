package module10.questions.ownexception;

public class Test {
    public static void main(String[] args) {
        try {
            testOwnException("test1");
        } catch (OwnException e) {
            System.out.println(e.getMessage());
        }
    }

    static void testOwnException(String item) throws OwnException {
        if (!item.equals("test"))
            throw new OwnException("constructor invoked..");
    }
}
