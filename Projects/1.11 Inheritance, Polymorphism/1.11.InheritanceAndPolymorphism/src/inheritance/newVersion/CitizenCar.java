package inheritance.newVersion;

public class CitizenCar extends Car {

    private boolean isSafe;

    public CitizenCar(String brand, String model, boolean isSafe) {
        super(brand, model);
        this.isSafe = isSafe;
    }

    @Override
    public void drive() {
        if (isSafe) {
            System.out.println(getBrand() + " " + getModel() + ": куда то едем!");
        } else {
            System.out.println(getBrand() + " " + getModel() + ": куда то едем в каске!");
        }
    }
}
