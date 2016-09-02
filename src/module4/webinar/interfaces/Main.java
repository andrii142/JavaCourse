package module4.webinar.interfaces;

public class Main {
    public static void main(String[] args) {
        DeveloperDbService developerDbService = new DeveloperDbService();


        //declaration
        DBService devDbService;

        //initialization
        devDbService = new DeveloperDbService();
        devDbService = new ManagerDbService();

    }
}
