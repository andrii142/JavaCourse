package module4.homework;

public abstract class Bank {
    private long id;
    private Currency currency;
    private int totalCapital;
    private double rating;
    private String name;



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



    /*@Override
    public boolean equals(Object object) {
        if (this == object) return true;
        //if (object == null || getClass() != object.getClass()) return false;
        Bank bank = null;
        if(object instanceof Bank) {
            bank = (Bank) object;
        }

        return id == bank.id;
    }*/

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        //if (object == null || getClass() != object.getClass()) return false;

        Bank bank = (Bank) object;

        if (id != bank.id) return false;
        if (totalCapital != bank.totalCapital) return false;
        if (Double.compare(bank.rating, rating) != 0) return false;
        if (currency != bank.currency) return false;
        return name != null ? name.equals(bank.name) : bank.name == null;






    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
