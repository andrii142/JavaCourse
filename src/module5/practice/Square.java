package module5.practice;

/**
 * Created by zetokz on 12.09.16.
 */
public final class Square extends View {

    private int counter = 0;

    @Override
    public void show() {
        counter++;
        System.out.println("New square " + counter + " showing");
    }

    @Override
    public void hide() {
        if (counter <= 0) {
            System.out.println("Sorry there is no any square");
        } else {
            System.out.println("Square " + counter + " hided");
            counter--;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return counter == square.counter;

    }

    @Override
    public int hashCode() {
        return counter;
    }
}
