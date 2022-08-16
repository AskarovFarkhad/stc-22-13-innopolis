package oop;

public class Main {
    public static void main(String[] args) {
        //Создаем объект типа Car, называем его объектную переменную audi и инициализируем все поля
        //конкретными значениями, которые были переданы в конструктор
        Car audi = new Car("A6", "AUDI", 420);
        //Создаем объект типа Car, называем его объектную переменную bmw и иницилизируем все поля
        //значениями по умолчанию, за счет пустого конструктора
        Car bmw = new Car();
        //Обращаемся к полям конкретного объекта
        //и задаем им значения
        bmw.brand = "BMW";
        bmw.model = "e36";
        bmw.engine = 420;

        //Вызываем метод .printInfo()
        //Который распечатывает значения своих полей
        audi.printInfo();
        bmw.printInfo();
    }
}