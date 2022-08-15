package inheritance.old;

public class SportCar {

    private String brand;
    private String model;

    public SportCar(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void drive() {
        System.out.println(brand + " " + model + ": мы очень быстро куда то едем!!!!");
    }
}
