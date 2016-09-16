package module6.webinar.finals;

public class User {
    private String name;
    private String lastName;
    private int age;

    //constant
    private final String cityOfBirth;

    //static constant - common for every object
    private final String companyName;


    {
        companyName = "dsd";



    }

    public User(String name, String cityOfBirth, int age) {
        this.name = name;
        this.cityOfBirth = cityOfBirth;
        this.age = age;
    }




    private void someLogic() {
        String res = name + lastName;
        //cityOfBirth = res;
    }
}
