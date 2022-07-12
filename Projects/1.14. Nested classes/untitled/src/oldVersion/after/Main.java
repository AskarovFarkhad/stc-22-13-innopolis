package oldVersion.after;

public class Main {
    public static void main(String[] args) {

        Engine engine = new Engine(210, 4.5, "DaewooPower");
        Car car = new Car("Daewoo", "Matiz", "Blue", engine, true);

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getEngine().getBrandEngine());
        System.out.println(car.getEngine().getPowerEngine());
        System.out.println(car.getEngine().getvEngine());
        System.out.println("АКПП? - " + car.isAutomatic());
    }
}
