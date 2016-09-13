package module5.webinar.equalshashcode;

/**
 * Created by amudrevskyi on 09.09.2016.
 */
public class Test {
    public static void main(String[] args) {
        Integer[] test = {7, 11};
        for (Integer item : test) {
            Integer b = 11;
            if (item == b)
                System.out.println("cool");
        }

        Object o1 = new Object();
        Object o2 = new Object();

        System.out.println(o1 == o2);
    }
}
