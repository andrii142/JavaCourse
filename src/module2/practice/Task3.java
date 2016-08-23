package module2.practice;

public class Task3 {

    static double withdrawBalance(double balance, double withdrawal, double commission) {
       // double commission = 1.5;
        return balance - withdrawal - commission;
    }

    public static void main(String[] args) {
        //double balance = 100;
        //double withdraw = 30.5;
        //double commision = 10.5;

        double balanceAfter = withdrawBalance(100, 30.5, 10.5);

        if(balanceAfter >= 0) {
            System.out.println("ok");
            System.out.println(balanceAfter);
        }
        else {
            System.out.println("no");
        }
    }

}
