package module4.homework;

public abstract class Bank {
    Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    abstract int getCommission(int summ);

    abstract int getLimitOfWithdrawal();

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "currency=" + currency +
                '}';
    }
}
