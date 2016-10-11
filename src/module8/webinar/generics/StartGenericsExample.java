package module8.webinar.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

//generics for method example
public class StartGenericsExample {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("test");
        list.add(11);

        String item = (String) list.get(1);
    }


    //very bad practice
    static Object[] fromArrayToCollection1(Object[] a, Collection<Object> c) {
        for (Object o : a) {
            c.add(o);
        }
        return a;
    }

   /* static void fromArrayToCollection2(Object[] a, Collection<?> c) {
        for (Object o : a) {
            c.add(o); // compile-time error
        }
    }*/


    static <T> Collection<T> fromArrayToCollection3(T[] array, Collection<T> c) {
        //T element = array[1];
        for (T el : array) {
            c.add(el); // Correct
        }

        //do anything you want with other types here
        //String test;


        return c;
    }

    static String test(String aaa) {
        return "dffff" + aaa;
    }
}
