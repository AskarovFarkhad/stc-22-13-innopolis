package interfaces;

//Класс стол, который не имплементирует интерфейс Flyable
//соответственно - ему не нужно реализовывать его методы
public class Table {

    public void fly() {
        System.out.println("Стол полетел");
    }
}
