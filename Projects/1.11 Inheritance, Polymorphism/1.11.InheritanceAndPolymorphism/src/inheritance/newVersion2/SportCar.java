package inheritance.newVersion2;

public class SportCar extends Car {

    public SportCar(String brand, String model) {
        //super() всегда вызывается в начале конструктора потомка
        super(brand, model);
    }
}
