package module11.webinar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReadeExample {
    public static void main(String[] args) throws IOException {
        //InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 3;
        while (count > 0) {
            String input;
            try {
                input = br.readLine();
            } catch (IOException e) {
                System.err.println("system error");
                throw e;
            }

            System.out.println("The string " + input + " is read");

            try {
                int a = Integer.valueOf(input);
                System.out.println(a + 10);
            } catch (NumberFormatException e) {
                System.out.println("it is not integer value");
            }

            count--;
        }


        System.out.println("finished");

        //IOUtils.closeQuitely(br);

        try {
            if (br != null)
                br.close();
        } catch (IOException e) {
            System.out.println("closed is failed");
        }
    }
}
