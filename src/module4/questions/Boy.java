package module4.questions;

public class Boy extends Man {
    public Boy(Car car) {
        super(car);
    }

    //ovveride method with own logic
    @Override
    public void runDistance(int distance) {
        if(distance < 35) {
            System.out.println("Run : " + RunTypes.BY_FOOT);
        }

        if(distance >=35 && distance < 950) {
            System.out.println("Run : " + RunTypes.BY_CAR);
            System.out.println("Fuel spent : " + getCar().fuelNeeds());
        }

        if(distance >= 950) {
            System.out.println("Run : " + RunTypes.BY_PLANE);
        }
    }
}
