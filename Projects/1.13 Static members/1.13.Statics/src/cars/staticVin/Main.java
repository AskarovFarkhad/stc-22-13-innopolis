package cars.staticVin;

public class Main {
    public static void main(String[] args) {
        CarsFactory carsFactory = new CarsFactory();

        Car audiOnOleg = carsFactory.createCar("AUDI", "A6");
        Car audiOnIgor = carsFactory.createCar("AUDI", "A6");
        Car audiOnVova = carsFactory.createCar("AUDI", "A6");

        System.out.println("AUDI Olega");
        System.out.println(audiOnOleg.getBrand());
        System.out.println(audiOnOleg.getModel());
        System.out.println(audiOnOleg.getVin());
        System.out.println("AUDI Igorya");
        System.out.println(audiOnIgor.getBrand());
        System.out.println(audiOnIgor.getModel());
        System.out.println(audiOnIgor.getVin());
        System.out.println("AUDI Vladimira");
        System.out.println(audiOnVova.getBrand());
        System.out.println(audiOnVova.getModel());
        System.out.println(audiOnVova.getVin());
    }
}
