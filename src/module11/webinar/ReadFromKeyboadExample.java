package module11.webinar;

import java.io.InputStream;
import java.util.Scanner;

public class ReadFromKeyboadExample {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);


        /*while (scanner.hasNextInt()) {
            int read = scanner.nextInt();
            if(read > 1000)
                System.out.println("Cool");
        }*/

        int index = 2;
        while (index > 0 && scanner.hasNext()) {
            String read = scanner.next();

            int res;
            try {
                res = Integer.valueOf(read);
                System.out.println(res - 1000);
            } catch (NumberFormatException e) {
                System.err.println("wrong input");
            }


            index--;
            // System.out.println(read + "OP");
        }

        scanner.close();
    }
}
