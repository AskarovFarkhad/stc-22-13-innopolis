package interfaces;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        Axe axe = new Axe();
        Fanera fanera = new Fanera();

        airplane.fly();
        axe.fly();
        fanera.fly();

        Flyable flyable = new Airplane();
        flyable.fly();
        flyable.drive();
        flyable = new Axe();
        flyable.fly();
        flyable.drive();
        flyable = new Fanera();
        flyable.fly();
        flyable.drive();
    }
}
