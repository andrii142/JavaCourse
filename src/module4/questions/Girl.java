package module4.questions;

//can delete implements
public class Girl extends Woman {
    public Girl(Car car) {
        super(car);
    }

    //use methods of Woman
    @Override
    public void runDistance(int distance) {
        super.runDistance(distance);
    }
}
