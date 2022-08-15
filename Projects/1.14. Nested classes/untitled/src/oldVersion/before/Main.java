package oldVersion.before;

public class Main {
    public static void main(String[] args) {

        Car carCar = new Car("Daewoo", "Matiz", "Blue", 210, 4.5, "DaewooPower", true);

        System.out.println(carCar.getBrand());
        System.out.println(carCar.getModel());
        System.out.println(carCar.getColor());
        System.out.println(carCar.getPowerEngine());
        System.out.println(carCar.getvEngine());
        System.out.println(carCar.getBrandEngine());
        System.out.println("АКПП? - " + carCar.isAutomatic());
    }
}
