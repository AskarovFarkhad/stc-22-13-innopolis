package forLombok.newVersion;

public class Main {

    public static void main(String[] args) {

        Car car = Car.builder()
                .brand("Audi")
                .model("A6")
                .build();

        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getPower());

        System.out.println(car);
    }
}
