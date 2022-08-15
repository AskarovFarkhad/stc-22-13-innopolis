package abstraction;
//Car - абстрактный класс, т.е. этот класс не может иметь объекты
public abstract class Car {

    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    //Абстрактный метод - метод без реализации. Его реализация перекладывается на
    //не абстрактного потомка
    public abstract void go();

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
}
