package module5.webinar.uml;

public class ClassB {
    private String x;
    private ClassA classA; //aggregation

    void test() {
        System.out.println("hi there!");
    }

    void associationExample() {
        ClassA classA = new ClassA();
        System.out.println(classA.getPrice());
    }
}
