package inheritance.newVersion2;

public class Car {

    // protected - поля, помеченные данным модификатором, доступны только внутри свеого класса
    //и внутри классов потомков
    protected String brand;
    protected String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car() {}

    public void drive() {
        System.out.println(brand + " " + model + ": куда то едем!");;
    }

}
