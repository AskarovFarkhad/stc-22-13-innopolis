package singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getInstance("FOO");
//        Singleton singleton2 = Singleton.getInstance("BAR");
//
//        System.out.println(singleton1.getMessage());
//        System.out.println(singleton2.getMessage());

        Thread threadFoo = new Thread(new FooThread());
        Thread threadBar = new Thread(new BarThread());

        threadFoo.start();
        threadBar.start();
    }
}
