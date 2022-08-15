package oop;
//Класс - это чертеж
public class Car {
    //Поля классы -> состояние объекта
    String model;
    String brand;
    int engine;
    //Конструктор. Если при создании объекта используется данный конструктор, то
    //у данного объекта будут проинициализированы все поля.
    public Car(String newModel,
               String newBrand,
               int newEngine) {
        model = newModel;
        brand = newBrand;
        engine = newEngine;
    }
    //Пустой конструктор, который ничего не инициализирует
    public Car() {}
    //Метод класса -> поведение объекта
    public void printInfo() {
        System.out.println("********************************");
        System.out.println("Марка автомобиля - " + brand);
        System.out.println("Модель автомобиля - " + model);
        System.out.println("Объем двигателя автомобиля - " + engine);
    }
}
