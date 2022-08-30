package forLombok.oldVersion;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("Audi", "A6", 325);

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPower());

        System.out.println(car.toString());
    }
}
