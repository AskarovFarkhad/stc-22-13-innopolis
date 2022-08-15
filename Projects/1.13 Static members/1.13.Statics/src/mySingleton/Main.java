package mySingleton;

public class Main {
    public static void main(String[] args) {
        MySingleton singleton = MySingleton.getInstance("Hello");
        MySingleton singleton2 = MySingleton.getInstance("Goodbye");
        MySingleton singleton3 = MySingleton.getInstance("OLEG");

        System.out.println(singleton.message);
        System.out.println(singleton2.message);
        System.out.println(singleton3.message);
    }
}
