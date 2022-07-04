package abstraction;

public class Bus extends Car {

    public Bus(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void go() {
        System.out.println(this.getBrand() + this.getModel() + ": мы вообще едем на автобусе");
    }
}
