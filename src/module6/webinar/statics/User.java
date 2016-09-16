package module6.webinar.statics;

public class User {
    private String firstName;
    private int age;
    //static variable example
    private static String companyName;


    //example of inner or nested class
    //static class Department {
    //
    //}

    //static block example
    static {
        log();
        //firstName = "Mr.";
        //age = 20;
        //int length = firstName.length();
        companyName = "IBM";
        System.out.println("block if invoked");
        //any logic
    }

    void gender() {
        firstName += "Mr. ";
    }

    //why static is needed - to initialize something
    static void log() {
        System.out.println("Program started");
    }

    /*static String description = "Some text";*/


    //example of static method
    static String editCompany() {
        if (companyName != null && !companyName.equals("GlobalLogic"))
            companyName = "GlobalLogic";

        return companyName;
    }


    public User(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public static void setCompanyName(String companyName) {
        User.companyName = companyName;
    }

    @Override
    public String toString() {
        return companyName;
    }

    /*final void change() {
        age = 20;
        //companyName = "Toyota";
    }*/
}
