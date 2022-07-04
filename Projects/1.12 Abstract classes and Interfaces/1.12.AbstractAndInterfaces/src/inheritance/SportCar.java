package inheritance;
//Класс Спортивная Машина, наследуется от Car
public class SportCar extends Car {

    public SportCar(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void go() {
        System.out.println(this.getBrand() + this.getModel() + ": едем ооооооочень быстро и очень не безопасно");
    }
}
