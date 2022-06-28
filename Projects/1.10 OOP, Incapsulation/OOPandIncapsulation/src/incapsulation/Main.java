package incapsulation;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Создаем объект типа random
        Random random = new Random();
        //Создаем пустую машину
        Car car = new Car();
        //Задаем случайное значение
        int randomValue = random.nextInt(200) - 100;
//        car.brand = "AUDI";
//        car.model = "A6";
//        car.
//        if (randomValue > 0) {
//            car.engine = randomValue;
//        } else {
//            System.out.println("Было введено отрицательное число");
//            car.engine = 200;
//        }
        //Кладем в поля объекта конкретные значения
        car.setModel("A6");
        car.setBrand("AUDI");
        car.setEngine(-120);

        //Выводим значение полей объекта car
        System.out.println(car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getEngine());
        //car.printInfo();
    }
}
