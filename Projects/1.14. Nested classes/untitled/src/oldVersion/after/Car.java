package oldVersion.after;

public class Car {

    private String brand;
    private String model;
    private String color;

    private Engine engine;

    private boolean isAutomatic;

    public Car(String brand,
               String model,
               String color,
               Engine engine, boolean isAutomatic) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = engine;
        this.isAutomatic = isAutomatic;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
