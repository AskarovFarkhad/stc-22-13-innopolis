package inheritance.newVersion2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("AUDI", "A6");
        SportCar sportCar = new SportCar("Daewoo", "Matiz");
        CitizenCar citizenCar = new CitizenCar("LADA", "PRIORA");
        Bus bus = new Bus("ПАЗИК", "БЕЛЫЙ");

        car.drive();
        System.out.println("*********************");
        sportCar.drive();
        System.out.println("*********************");
        citizenCar.drive();
        System.out.println("*********************");
        bus.drive();
    }
}
