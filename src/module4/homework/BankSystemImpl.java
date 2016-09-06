package module4.homework;


public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        //if (userBank.getLimitOfFunding() >= amount) {
        //    user.setBalance(user.getBalance() - amount - userBank.getCommission(amount));
        //}
    }

    @Override
    public void fundUser(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {

    }
}
