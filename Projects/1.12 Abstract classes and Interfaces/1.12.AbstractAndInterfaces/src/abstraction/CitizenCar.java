package abstraction;

public class CitizenCar extends Car {

    public CitizenCar(String brand, String model) {
        super(brand, model);
    }

    //Данный класс не является абстрактным, а значит обязан реализовать все абстрактные методы
    //класса предка
    @Override
    public void go() {
        System.out.println(this.getBrand() + this.getModel() + ": мы едем медленно, но безопасно");
    }
}
