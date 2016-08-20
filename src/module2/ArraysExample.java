package module2;

public class ArraysExample {

    static int calculateBalancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                //send email promotion
                sum += balance;
            }
        }
        //send email
        //OR

        return sum;
    }

    static int calculateBalancesSumSimpleVersion(int[] balances) {
        int sum = 0;
        for (int i = 0; i <= balances.length; i++) {
            int balance = balances[i];
            if (balance > 1000 && balance < 5000) {
                //send email promotion
                sum += balance;
            }
        }
        //send email
        //OR
        return sum;
    }

    public static void main(String[] args) {
        int[] myIntArray0 = new int[3];

        /*for (int i = 0; i < myIntArray0.length; i++) {
            System.out.println(myIntArray0[i]);
        }*/

        int[] myIntArray1 = {1303, 2, 3, 10, 55};
        //System.out.println(myIntArray1[3]);
        //System.out.println(myIntArray1.length);

        for (int item : myIntArray1) {
            //logic
        }

        int[] balances = {1303, 1232, 900, 432, 5600, 2323, 0, 10};
        int[] balances1 = {1435, 1436, 3460, 436, 5346, 436, 4340, 150};

        int sum = calculateBalancesSum(balances);
        int sum1 = calculateBalancesSum(balances1);

        System.out.println(sum);
        System.out.println(sum1);

    }

    /*String[] myStringArray0 = new String[3];
    String[] myStringArray1 = {"a", "b", "c"};
    String[] myStringArray2 = new String[]{"a", "b", "c"};*/
}
