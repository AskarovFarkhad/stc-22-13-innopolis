package cars.nonStatic;

public class Car {

    private String brand;
    private String model;

    //Наш уникальный идентификационный номер, по которому будем определять
    //уникальность автомобиля
    private int vin;

    public Car(String brand, String model, int vin) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getVin() {
        return vin;
    }
}
