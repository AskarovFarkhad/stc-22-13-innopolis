package interfaces;
//Класс самолет, который имплементирует интерфейс Flyable
//соответственно - реализует все его методы
public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Мы летим на самолете");
    }

    @Override
    public void drive() {
        System.out.println("Ребят, самолет не катает по дорогам");
    }
}
