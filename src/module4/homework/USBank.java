package module4.homework;

/**
 * Created by Andrey on 9/2/16.
 */
public class USBank extends Bank {

    @Override
    int getLimitOfWithdrawal() {
        int limit;
        if (getCurrency() == Currency.USD) limit = 1000;
        else limit = 1200;
        return limit;
    }

    @Override
    //
    int getCommission(int amount) {
        int commission;
        if (getCurrency() == Currency.USD) {
            if (amount < 1000) commission = 5;
            else commission = 7;
        } else {
            //if (amount < 1000) commission = 5;
            //else commission = 7;
            return 0;
        }
        return commission;
    }
}
