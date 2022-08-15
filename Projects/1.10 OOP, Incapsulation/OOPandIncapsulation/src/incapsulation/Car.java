package incapsulation;

public class Car {
    //Поля классы -> состояние объекта
    private String model;
    private String brand;
    private int engine;

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
    public Car() {
    }

    //Метод класса -> поведение объекта
    public void printInfo() {
        System.out.println("********************************");
        System.out.println("Марка автомобиля - " + brand);
        System.out.println("Модель автомобиля - " + model);
        System.out.println("Объем двигателя автомобиля - " + engine);
    }

    //Сеттер поля model
    public void setModel(String newModel) {
        model = newModel;
    }
    //Геттер поля model
    public String getModel() {
        return model;
    }
    //Сеттер поля brand
    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    //Сеттер поля engine
    public void setEngine(int newEngine) {
        if (newEngine > 0) {
            engine = newEngine;
        } else {
            engine = 200;
        }
    }
    //Геттер поля brand
    public String getBrand() {
        return brand;
    }
    //Геттер поля engine
    public int getEngine() {
        return engine;
    }
}
