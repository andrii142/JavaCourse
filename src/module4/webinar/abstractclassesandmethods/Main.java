package module4.webinar.abstractclassesandmethods;

public class Main {

    static void paySalary(Employee[] employees) {
        for(Employee employee : employees) {
            employee.paySalary();
        }
    }


    public static void main(String[] args) {
        /*DeveloperEmployee developerEmployee = new DeveloperEmployee(0, 1000);
        ManagerEmployee managerEmployee = new ManagerEmployee(10, 500);

        developerEmployee.paySalary();
        managerEmployee.paySalary();
        System.out.println(developerEmployee.balance);
        System.out.println(managerEmployee.balance);*/


        DeveloperEmployee developerEmployee = new DeveloperEmployee(0, 1000);
        ManagerEmployee managerEmployee = new ManagerEmployee(10, 500);

        Employee[] employees = {developerEmployee, managerEmployee};
        paySalary(employees);

        System.out.println(developerEmployee.balance);
        System.out.println(managerEmployee.balance);

    }
}
