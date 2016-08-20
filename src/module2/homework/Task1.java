package module2.homework;

public class Task1 {

    static int balancesSum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 1000 && balance < 5000) {
                sum += balance;
            }
        }
        return sum;
    }

    static String[] getOwnerNames(int[] balances, String[] names) {
        int ownersCount = 0;
        for (int balance : balances) {
            if (balance > 1000) ownersCount++;
        }

        String[] result = new String[ownersCount];

        int index = 0;
        for (int i = 0; i < balances.length; i++) {
                if (balances[i] > 1000) {
                    result[index] = names[i];
                    index++;
                }
        }

        return result;
    }

    //HOMEWORK 2.1
    static double withdrawBalance(double balance, double withdrawal) {


        return 0;
    }

    //HOMEWORK 2.2
    static double withdrawBalance(String ownerName, double withdrawal) {


        return 0;
    }

    //HOMEWORK 2.3
    static double fundBalance(String ownerName, double fund) {


        return 0;
    }


    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        int[] balances1 = {200, 200, 500, 4000, 30};




    }
}
