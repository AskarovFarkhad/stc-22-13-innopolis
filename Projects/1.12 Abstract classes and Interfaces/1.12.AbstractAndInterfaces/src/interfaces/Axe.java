package interfaces;

//Класс топор, который имплементирует интерфейс Flyable
//соответственно - реализует все его методы
public class Axe implements Flyable {
    @Override
    public void fly() {
        System.out.println("Топор летит в дерево");
    }

    @Override
    public void drive() {
        System.out.println("Ребят, топоры не ездят по дорогам");
    }
}
