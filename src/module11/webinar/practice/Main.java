package module11.webinar.practice;

public class Main {
    public static void main(String[] args) {
        System.out.println(GooglePage.class.getProtectionDomain().
                getCodeSource().getLocation().getPath());
    }
}
