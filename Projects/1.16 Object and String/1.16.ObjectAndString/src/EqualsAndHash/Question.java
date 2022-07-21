package EqualsAndHash;

public class Question {
    public static void main(String[] args) {
        Car car = new Car("Car", "Car", "car");
        Car car2 = new Car("Car2", "Car2", "car2");
        Car car3 = new Car("Car2", "Car2", "car2");

        System.out.println(car.equals(car2));
        car = car2;
        System.out.println(car.equals(car2));
        car = new Car("Car", "Car", "Carrr");
        System.out.println(car3.equals(car));
    }
}
