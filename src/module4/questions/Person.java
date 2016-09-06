package module4.questions;

//you can skip implements
public abstract class Person {
    private Car car;

    public Person(Car car) {
        this.car = car;
    }

    abstract void runDistance(int distance);

    public Car getCar() {
        return car;
    }
}
