package inheritance.newVersion;

public class Car {

    // protected - поля, помеченные данным модификатором, доступны только внутри свеого класса
    //и внутри классов потомков
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car() {}

    public void drive() {
        System.out.println("Мы едем на непонятной машине");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
