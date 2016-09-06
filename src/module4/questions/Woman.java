package module4.questions;

public class Woman extends Person {

    public Woman(Car car) {
        super(car);
    }

    //ovveride interface method with own logic
    @Override
    public void runDistance(int distance) {
        if(distance < 10) {
            System.out.println("For " + distance + " I can run : " + RunTypes.BY_FOOT);
        }

        if(distance >=10 && distance < 500) {
            System.out.println("For " + distance + " I can run : " + RunTypes.BY_CAR);
            System.out.println("Fuel spent : " + getCar().fuelNeeds());
        }

        if(distance >= 500) {
            System.out.println("For " + distance + " I can run : " + RunTypes.BY_PLANE);
        }
    }
}
