package module4.webinar.abstractclassesandmethods;

public class ManagerEmployee extends Employee {
    public ManagerEmployee(int balance, int salary) {
        this.balance = balance;
        this.salary = salary;
    }

    @Override
    void paySalary() {
        double k = 1.1;
        balance += salary * k + 200;
    }
}
