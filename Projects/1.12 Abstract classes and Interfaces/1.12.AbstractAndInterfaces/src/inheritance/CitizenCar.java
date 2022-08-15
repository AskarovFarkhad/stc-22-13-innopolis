package inheritance;
//Класс Гражданская Машина, наследуется от Car
public class CitizenCar extends Car {

    public CitizenCar(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void go() {
        System.out.println(this.getBrand() + this.getModel() + ": мы едем медленно, но безопасно");
    }
}
