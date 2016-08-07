package module2;

public class ClassExample {
    private int abs;
    public static boolean isActive;
    static String name;

    private static void printNameIsActive() {
        System.out.println(name + " is " + isActive);
    }

    private String getNameIsActive() {
        return name + " is " + isActive;
    }

    public static void main(String[] args) {
        name = "Jack";
        isActive = true;

        printNameIsActive();
    }
}
