package module4.webinar.abstractclassesandmethods;

public abstract class Employee {
    String name;
    int balance;
    int salary;

    abstract void paySalary();

    void printBalance() {
        System.out.println(balance);
    }

    void greeting() {
        System.out.println("Good morning" + name);
    }

    //abstract void paySalary();


/*    public int getBalance() {
        return balance;
    }

    public int getSalary() {
        return salary;
    }*/
}
