package module5.practice;

/**
 * Created by zetokz on 12.09.16.
 */
public class Apple {

    private int weight;

    public Apple(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apple apple = (Apple) o;

        return weight == apple.weight;
    }

    @Override
    public int hashCode() {
        return weight;
    }
}
