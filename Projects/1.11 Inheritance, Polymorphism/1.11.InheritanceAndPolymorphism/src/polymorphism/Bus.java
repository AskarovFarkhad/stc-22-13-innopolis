package polymorphism;

public class Bus extends Car {

    private boolean isFull;

    public Bus(String brand, String model, boolean isFull) {
        super(brand, model);
        this.isFull = isFull;
    }

    @Override
    public void drive() {
        if (isFull) {
            System.out.println(getBrand() + " " + getModel() + ": мы едем, как черепаха, но мы везем мотоцикл!!");
        } else {
            System.out.println(getBrand() + " " + getModel() + ": да, мы едем медленно, но мы везем мотоцикл!!");
        }
    }
}
