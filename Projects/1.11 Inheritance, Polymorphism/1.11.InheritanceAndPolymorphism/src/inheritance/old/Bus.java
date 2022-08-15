package inheritance.old;

public class Bus {

    private String brand;
    private String model;

    public Bus(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void drive() {
        System.out.println(brand + " " + model + ": да, мы едем медленно, но мы везем мотоцикл!!");
    }
}
