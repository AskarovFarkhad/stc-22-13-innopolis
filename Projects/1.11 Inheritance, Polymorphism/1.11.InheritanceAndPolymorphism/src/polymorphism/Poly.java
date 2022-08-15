package polymorphism;


public class Poly {
    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Bus("Bus", "Bus", false);
        cars[1] = new SportCar("SpotrCar", "SportCar", true);
        cars[2] = new CitizenCar("CitizenCar", "CitizenCar", true);
        cars[3] = new OffRoadCar("Lada", "Нива", true);

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }
    }
}
