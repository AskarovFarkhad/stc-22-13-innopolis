package initializators;

public class Main {
    public static void main(String[] args) {
        Human oleg = new Human("Oleg");
        Human igor = new Human("Igor");

        System.out.println(oleg.getName());
        System.out.println(igor.getName());
    }
}
