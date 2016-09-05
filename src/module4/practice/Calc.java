package module4.practice;

public class Calc implements MoneyConverter {
    private double k = 26.5;

    @Override
    public double convertFromUsd(int i) {
        return k * i;
    }
}
