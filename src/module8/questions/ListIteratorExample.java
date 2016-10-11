package module8.questions;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        test(list);
    }

    static private void test(List<String> list) {

        list.add("test1");
        list.add("test2");
        list.add("test3");
        list.add("test4");

        ListIterator<String> iter = list.listIterator();

        Spliterator<String> i = list.spliterator();


        String check1 = "test2";
        while (iter.hasNext()) {
            String item = iter.next();
            System.out.println(item);
            if (item.equals(check1)) {
                System.out.println(Boolean.TRUE);
            }
        }


        String check2 = "test4";

        while (iter.hasPrevious()) {
            String item = iter.previous();
            System.out.println(item);
            if (item.equals(check2)) {
                System.out.println(Boolean.TRUE);
            }
        }



    }
}
