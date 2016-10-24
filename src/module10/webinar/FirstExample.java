package module10.webinar;

import java.util.ArrayList;
import java.util.List;

public class FirstExample {
    public static void main(String[] args) {


        //syntax
       /* try {

            //code

        }
        catch (Throwable t) {

        }*/


        Integer a;

        //try-catch first example
        try {
            a = null;
            a.toString();

           /*try {
                List<String> list = new ArrayList<>();
                list.get(0);
            } catch (Throwable t) {
                System.out.println("this el does not exist");
            }*/
        } catch (Throwable t) {
            System.out.println("null pointer has happened");

            try {
                a = 10;
                a.toString();

                System.out.println(a);
            } catch (Throwable e) {
                //
            }
        }


        try {
            List<String> list = new ArrayList<>();
            list.get(0);
        } catch (Throwable t) {
            System.out.println("this el does not exist");
        }

        //the best way to handle NPE
        a = null;
        if (a != null)
            a.toString();
        //else System.out.println("a is null");


    }
}
