package module3.phones;

public class Phone {
    private String manufacturer;
    private String operatingSystem;
    private String model;
    private int cost;

    //область видимость
    //private
    //public
    //protected
    //(default-package private)

    public Phone() {
    }

    public Phone(int cost, String model, String manufacturer) {
        this.cost = cost;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    static void test() {
        System.out.println("test");
    }

    public static void main(String[] args) {
        test();
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
