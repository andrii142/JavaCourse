package module4.homework;


public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, int amount) {
        //if (user.getBank().getLimitOfFunding() >= amount) {
        //    user.setBalance(user.getBalance() - amount - commissionCount(user.getBank().getCurrency(), amount));
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

    private double commissionCount(Currency bankCurrency, int amount) {
        double commission;
        if (bankCurrency == Currency.USD) {
            if (amount < 1000) commission = amount * 0.05;
            else commission = amount * 0.07;
        } else {
            if (amount < 1000) commission = amount * 0.05;
            else commission = amount * 0.07;
        }
        return commission;

    }
}
