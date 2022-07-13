package newVersion.nonStatic;

public class Car {

    private String brand;
    private String model;
    private String color;

    private Engine engine;

    private boolean isAutomatic;

    public Car(String brand,
               String model,
               String color,
               boolean isAutomatic,
               int powerEngine,
               double vEngine,
               String brandEngine) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.engine = new Engine(powerEngine, vEngine, brandEngine);
        this.isAutomatic = isAutomatic;
    }

    public void printInfoAboutEngine() {
        System.out.println("Информация по двигателю - " + brand + " " + model);
        System.out.println("Марка двигателя - " + engine.brandEngine);
        System.out.println("Объем двигателя - " + engine.vEngine);
        System.out.println("Мощность двигателя - " + engine.powerEngine);
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

    class Engine {

        private int powerEngine;
        private double vEngine;
        private String brandEngine;

        private String brand;

        public Engine(int powerEngine, double vEngine, String brandEngine) {
            this.powerEngine = powerEngine;
            this.vEngine = vEngine;
            this.brandEngine = brandEngine;
            System.out.println("Двигатель для " + Car.this.brand + " " + model + " сконструирован!");
        }

        public int getPowerEngine() {
            return powerEngine;
        }

        public void setPowerEngine(int powerEngine) {
            this.powerEngine = powerEngine;
        }

        public double getvEngine() {
            return vEngine;
        }

        public void setvEngine(double vEngine) {
            this.vEngine = vEngine;
        }

        public String getBrandEngine() {
            return brandEngine;
        }

        public void setBrandEngine(String brandEngine) {
            this.brandEngine = brandEngine;
        }
    }
}
