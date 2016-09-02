package module4.webinar.abstractclassesandmethods;

import module4.webinar.polymorphism.Figure;

public class HREmployee extends Employee {
    @Override
    void paySalary() {
        double k = 1.1;
        balance += salary * k;
    }
}
