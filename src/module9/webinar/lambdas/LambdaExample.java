package module9.webinar.lambdas;

import module9.webinar.functions.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        //lambda example
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");


        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        System.out.println(names);


       // new Comparator<String>() {
       //     @Override
       //     public int compare(String a, String b) {
       //         return b.compareTo(a);
       //     }
       // }; ===== (a, b) -> b.compareTo(a


        Collections.sort(names, (a, b) -> b.compareTo(a));


        //custom lambda example
        Converter<String, Integer, Long> converter2 = new Converter<String, Integer, Long>() {
            @Override
            public Integer convert(String from, Long anotherLong) {
                if(anotherLong == 10) return 10;
                return Integer.valueOf(from);
            }
        };


        //create object with lambda
        PersonExample<Integer, String, Person> personExample = (a, b) -> new Person(a, b);
        Person person = personExample.create(100, "test Descroption");


        Converter<String, Integer, Long> converter = (from, anotherFrom) -> {
            if(anotherFrom == 10) return 10;
            return Integer.valueOf(from);
        };


        long input = 20;
        System.out.println(converter.convert("123", input));

    }
}
