package abstraction;

public class SportCar extends Car {

    public SportCar(String brand, String model) {
        super(brand, model);
    }

    //Данный класс не является абстрактным, а значит обязан реализовать все абстрактные методы
    //класса предка
    @Override
    public void go() {
        System.out.println(this.getBrand() + this.getModel() + ": едем ооооооочень быстро и очень не безопасно");
    }
}
