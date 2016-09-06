package module4.questions;

public class Main {
    public static void main(String[] args) {
        Car honda = new Honda();
        //Honda honda = new Honda();
        Car tesla = new Tesla();

        Person woman = new Woman(honda);
        Person man = new Man(tesla);

        Person boy = new Boy(honda);
        Person girl = new Girl(honda);

        woman.runDistance(900);
        woman.runDistance(2);
        woman.runDistance(1000);

        System.out.println();

        boy.runDistance(900);
        boy.runDistance(2);
        boy.runDistance(1000);

        //Person person = Man();
        //person.runDistance(int 500);

    }
}
