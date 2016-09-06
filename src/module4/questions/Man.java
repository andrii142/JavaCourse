package module4.questions;

public class Man extends Person {

    public Man(Car car) {
        super(car);
    }

    //ovveride interface method with own logic
    @Override
    public void runDistance(int distance) {
        if(distance < 50) {
            System.out.println("Run : " + RunTypes.BY_FOOT);
        }

        if(distance >=50 && distance < 1500) {
            System.out.println("Run : " + RunTypes.BY_CAR);
            System.out.println("Fuel spent : " + getCar().fuelNeeds());
        }

        if(distance >= 1500) {
            System.out.println("Run : " + RunTypes.BY_PLANE);
        }
    }
}
