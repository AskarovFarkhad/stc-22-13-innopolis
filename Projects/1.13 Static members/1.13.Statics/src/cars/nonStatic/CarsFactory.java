package cars.nonStatic;

//Завод по производству автомобилей
public class CarsFactory {

    //Метод, который создает машину
    public Car createCar(String brand, String model) {
        int vin = (int) (Math.random() * 1000);
        Car car = new Car(brand, model, vin);
        //return new Car(brand, model)
        return car;
    }
}
