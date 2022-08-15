package interfaces;

//Класс фанера, который имплементирует интерфейс Flyable
//соответственно - реализует все его методы
public class Fanera implements Flyable {
    @Override
    public void fly() {
        System.out.println("Фанера летит над Парижем");
    }

    @Override
    public void drive() {
        System.out.println("Ребят, фанера не летает по земле");
    }
}
