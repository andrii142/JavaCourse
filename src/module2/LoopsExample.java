package module2;

public class LoopsExample {

    public static void main(String args[]) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }

        /*
        for( <initialization> ; <condition> ; <statement> ){

        <Block of statements>;
         */

        //statement
        //выражение

        int res;


        /*

        while (i < 10) {
            System.out.println(i);
            i++;
        }*/

        //do while example
        int count = 1;
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);


        int n = -10;
        while (n > 0) {
            System.out.println(n);
            n -= 3;
        }

        //TODO break and continue statements live
    }
}
