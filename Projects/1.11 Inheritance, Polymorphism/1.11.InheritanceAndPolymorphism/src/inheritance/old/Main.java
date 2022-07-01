package inheritance.old;

public class Main {
    public static void main(String[] args) {
        CitizenCar citizenCar = new CitizenCar("Audi", "A6");
        SportCar sportCar = new SportCar("DAEWOO", "MATIZ");
        Bus bus = new Bus("Газель", "Грузовая");

        citizenCar.drive();
        sportCar.drive();
        bus.drive();
    }
}
