package module2.practice;

/**
 * Created by Andrey on 8/20/16.
 */
public class Task2 {

    static long containsCount(long[] array, int n) {
        int k = 0;
        for (long item : array) {
            if (item == n) {
                k++;
            }
        }

        return k;
    }


    public static void main(String[] args) {
        long[] array = {10, 40, 50, 42, 54, 50, 200, 60};

        int n = 10;
        long result = containsCount(array, n);

        if(result == 1) {
            System.out.println("yes");
        }
        if(result == 0) {
            System.out.println("no");
        }
        if(result > 1) {
            System.out.println(result);
        }
    }
}
