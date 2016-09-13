package module4.homework;

public class Main {
    public static void main(String[] args) {
        /*//BankSystemImpl -> User -> Bank
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

        System.out.println(user);*/


        Bank bank1 = new EUBank();
        //bank1.
        Bank bank2 = new USBank();
        //bank2
        Bank bank3 = new ChinaBank();

        //System.out.println(bank1.equals(bank2));

        Currency currency = Currency.USD;
        Currency currency1 = Currency.EUR;

        //System.out.println(currency == currency1);
        //System.out.println(currency.equals(currency1));

        String name = "abc";
        //name.intern();
        System.out.println("abc" == "abc");
        System.out.println("abc" == name);


        BankSystemImpl bankSystem1 = new BankSystemImpl();
        BankSystemImpl bankSystem2 = new BankSystemImpl();
        //bankSystem1.setA(110);

        System.out.println(bankSystem1.equals(bankSystem2));

        //System.out.println("abc".equals("abc"));


    }
}
