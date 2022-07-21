package ForString;

public class Main {

    public static void main(String[] args) {
        Car audi = new Car("AUDI", "A6");
        Car bmw = new Car("BMW", "X5");

        System.out.println(audi.toString());
        System.out.println(bmw.toString());
    }
}
