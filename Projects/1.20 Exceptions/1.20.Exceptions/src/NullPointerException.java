public class NullPointerException {

    public static void main(String[] args) {
        Car car = null;

        System.out.println(car.getBrand());
        System.out.println(car.getModel());
    }
}
