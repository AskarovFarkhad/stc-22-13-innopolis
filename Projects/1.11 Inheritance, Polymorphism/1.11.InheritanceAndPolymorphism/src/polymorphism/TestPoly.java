package polymorphism;

public class TestPoly {
    public static void main(String[] args) {
        //Старый вариант
        //SportCar sportCar = new SportCar("Daewoo", "Matiz", true);
        //CitizenCar citizenCar = new CitizenCar("Lada", "Priora", true);
        //Bus bus = new Bus("Bus", "Bus", false);
        //Car car = new Car("Car", "Car");

        //Восходящее преобразование
        Car car = new SportCar("Daewoo", "Matiz", true);
        SportCar sportCar = new SportCar("Ока", "Ока", true);

    }
}
