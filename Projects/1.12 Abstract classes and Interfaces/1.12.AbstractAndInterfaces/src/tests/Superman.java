package tests;

//За счет того, что Workable наследует и Flyable, и Driveable
//класс, который имплементирует его (Workable)
//должен реализовать методы и Workable, и Flyable, и Driveable
public class Superman implements Workable {

    @Override
    public void fly() {
        System.out.println("Я умею летать");
    }

    @Override
    public void drive() {
        System.out.println("Я умею ездить");
    }

    @Override
    public void work() {
        System.out.println("Я умею работать");
    }
}
