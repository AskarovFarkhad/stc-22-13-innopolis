package tests;


public class Main {
    public static void main(String[] args) {
        Superman superman = new Superman();
        Flyable supermanFly = new Superman();

        superman.drive();
        superman.fly();
        superman.work();

        supermanFly.fly();
    }
}
