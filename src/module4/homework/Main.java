package module4.homework;

public class Main {
    public static void main(String[] args) {
        //BankSystemImpl -> User -> Bank
        Bank usBank = new USBank();
        usBank.setCurrency(Currency.EUR);

        User user = new User();
        user.setBalance(5000);
        user.setBank(usBank);


        System.out.println(user);

        //top level of abstraction, we run all methods throught it
        BankSystem bankSystem = new BankSystemImpl(); //better
        //BankSystemImpl bankSystem1 = new BankSystemImpl();
        bankSystem.withdrawOfUser(user, 1100);

        System.out.println(user);
    }
}
