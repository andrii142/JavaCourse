package module3.phones;

public class Phone {
    private String manufacturer;
    private String operating_system;
    private String model;
    private int cost;

    public Phone(int cost, String model, String manufacturer, String operating_system) {
        this.cost = cost;
        this.model = model;
        this.manufacturer = manufacturer;
        this.operating_system = operating_system;
    }

    public int getCost() {
        return cost;
    }

    public String getOperating_system() {
        return operating_system;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setOperating_system(String operating_system) {
        this.operating_system = operating_system;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
