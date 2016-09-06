package module4.homework;

/**
 * Created by Andrey on 9/2/16.
 */
public class USBank extends Bank {


    @Override
    int getCommission(int amount) {
            int commission;
            if (getCurrency() == Currency.USD) {
                if (amount < 1000) commission = 5;
                else commission = 7;
            } else {
                if (amount < 1000) commission = 5;
                else commission = 7;
            }
            return commission;
    }
}
