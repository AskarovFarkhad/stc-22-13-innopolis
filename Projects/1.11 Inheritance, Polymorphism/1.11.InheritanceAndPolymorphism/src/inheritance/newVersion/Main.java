package inheritance.newVersion;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("AUDI", "A6");
        SportCar sportCar = new SportCar("Daewoo", "Matiz", false);
        CitizenCar citizenCar = new CitizenCar("LADA", "PRIORA", true);
        Bus bus = new Bus("ПАЗИК", "БЕЛЫЙ", false);

        car.drive();
        System.out.println("*********************");
        sportCar.drive();
        System.out.println("*********************");
        citizenCar.drive();
        System.out.println("*********************");
        bus.drive();
    }
}
