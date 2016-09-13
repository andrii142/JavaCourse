package module5.webinar.equalshashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println(a == b);

        //equals is used to compare objects

        // ==
        // equals

        Employee e1 = new Employee();
        e1.setId(101);
        Employee e2 = new Employee();
        e2.setId(101);

        //System.out.println(e1 == e2); wrong!!
        System.out.println(e1.equals(e2));



        //-----------------------
        //e1.setId(100);
        //e2.setId(100);

        //Печатает 'true'
        //System.out.println(e1.equals(e2));

        Set employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        //Печатает два объекта
        System.out.println(employees);
    }
}
