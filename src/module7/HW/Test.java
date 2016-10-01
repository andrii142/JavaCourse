package module7.HW;

public class Test {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for(int i = 0 ; i < 1000000; i ++) {
            for(int j = 0 ; j < 1000000; j ++) {
                int a = i * 10 - 1000 + 200 - 21212;

                int b = i;
            }
        }

        long finish = System.currentTimeMillis();

        System.out.println(finish - start);
    }
}
