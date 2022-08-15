package inheritance.old;

public class CitizenCar {

    private String brand;
    private String model;

    public CitizenCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void drive() {
        System.out.println(brand + " " + model + ": куда то едем!");
    }
}
