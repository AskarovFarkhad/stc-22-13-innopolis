package inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Subaru", "Impreza");
        SportCar sportCar = new SportCar("Audi", "A3");
        CitizenCar citizenCar = new CitizenCar("Renault", "Logan");

        car.go();
        sportCar.go();
        citizenCar.go();
    }
}
