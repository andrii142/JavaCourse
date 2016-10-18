package module9.webinar.functions;

import java.util.function.Supplier;


public class SupplierExample {
    public static void main(String[] args) {
        //java 7 usage
        Supplier<Person> personSupplier = new Supplier<Person>() {
            @Override
            public Person get() {
                return null;
            }
        };


        //Supplier<Person> upplier1 = () -> new Person();
        Supplier<Person> supplier = Person::new;
        Person person = supplier.get();


        //another example
        display(() -> 100);
    }

    static void display(Supplier<Integer> arg) {
        System.out.println(arg.get());
    }
}
