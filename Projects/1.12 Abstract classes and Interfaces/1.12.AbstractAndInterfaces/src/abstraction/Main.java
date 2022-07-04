package abstraction;

public class Main {
    public static void main(String[] args) {
        //Создаем объекты классов
        SportCar sportCar = new SportCar("Audi", "A3");
        CitizenCar citizenCar = new CitizenCar("Renault", "Logan");
        Bus bus = new Bus("ПАЗИК", "ПАЗИК");

        //И вызываем у каждого их реализацию абстрактного метода .go() класса Car
        sportCar.go();
        citizenCar.go();
        bus.go();
    }
}
