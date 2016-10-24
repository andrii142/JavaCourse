package module10.webinar;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExeptionExample {
    public static void main(String[] args) {
        try {
            dangerous();
            dangerous1();
        } catch (IOException e) {
            System.out.println("file now found");
        } finally {
            System.out.println("finished");
        }

    }


    //try catch example
    /*static void dangerous() {

        try {
            Scanner scanner = new Scanner(new File("/path"));
            //logic
            System.out.println("file changed and saved");
        } catch (Exception e) {
            System.out.println("file now found");
        }

        System.out.println("logic continue...");
    }*/


    static void dangerous() throws IOException {
        Scanner scanner = new Scanner(new File("/path"));
        //logic
        System.out.println("file changed and saved");

        System.out.println("logic continue...");
    }

    //Object o = new Object();
    //(String) o

    static void dangerous1() throws IOException {
        Scanner scanner = new Scanner(new File("/path"));
        //logic
        System.out.println("file changed and saved");

        System.out.println("logic continue...");
    }
}
