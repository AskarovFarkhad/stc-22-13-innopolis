package cars.staticVin;

//Завод по производству автомобилей
public class CarsFactory {

    //Если мы видим ключевое слово static - значит оно принадлежит классу, а не объектам.
    //Счетчик, который увеличивается на один, каждый раз при создании объекта типа Car
    private static int VINCount = 0;

    //Метод, который создает машину
    public Car createCar(String brand, String model) {
        Car car = new Car(brand, model, VINCount);
        VINCount = CarsFactory.VINCount + 1;
        //return new Car(brand, model)
        return car;
    }
}
