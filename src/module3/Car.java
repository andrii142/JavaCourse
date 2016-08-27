package module3;

public class Car {
    int year;
    String model;
    int price;
    String nameOfTheOwner;


    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    Car(int year, String model, int price, String nameOfTheOwner) {
        this.year = year;
        this.model = model;
        this.price = price;
        this.nameOfTheOwner = nameOfTheOwner;
    }



    //перегрузка метода
    int test(int a, String name) {
        return a - 5;
    }

    int test(int a, int b) {
        return a - 5;
    }

    void printOwnerName() {
        System.out.println(nameOfTheOwner);
    }

    void printYear() {
        System.out.println(this.year);
    }


    public static void main(String[] args) {


    }



}
