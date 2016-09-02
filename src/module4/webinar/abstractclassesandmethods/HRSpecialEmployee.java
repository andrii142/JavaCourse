package module4.webinar.abstractclassesandmethods;

public class HRSpecialEmployee extends HREmployee {
    @Override
    void paySalary() {
        double k = 1.1;
        balance += salary * k;
    }
}
