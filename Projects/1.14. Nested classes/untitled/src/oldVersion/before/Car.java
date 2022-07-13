package oldVersion.before;

public class Car {

    private String brand;
    private String model;
    private String color;
    private int powerEngine;

    private double vEngine;
    private String brandEngine;
    private boolean isAutomatic;

    public Car(String brand,
               String model,
               String color,
               int powerEngine,
               double vEngine,
               String brandEngine,
               boolean isAutomatic) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.powerEngine = powerEngine;
        this.vEngine = vEngine;
        this.brandEngine = brandEngine;
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

    public int getPowerEngine() {
        return powerEngine;
    }

    public void setPowerEngine(int powerEngine) {
        this.powerEngine = powerEngine;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    public String getBrandEngine() {
        return brandEngine;
    }

    public void setBrandEngine(String brandEngine) {
        this.brandEngine = brandEngine;
    }

    public double getvEngine() {
        return vEngine;
    }

    public void setvEngine(double vEngine) {
        this.vEngine = vEngine;
    }
}
