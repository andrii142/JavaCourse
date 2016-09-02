package module4.webinar.abstractclassesandmethods;

public class DeveloperEmployee extends Employee {
    public DeveloperEmployee(int balance, int salary) {
        this.balance = balance;
        this.salary = salary;
    }

    @Override
    void paySalary() {
        balance+=salary;
    }
}
