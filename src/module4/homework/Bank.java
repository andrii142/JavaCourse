package module4.homework;

public abstract class Bank {
    Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    abstract int getCommission(int summ);
}
