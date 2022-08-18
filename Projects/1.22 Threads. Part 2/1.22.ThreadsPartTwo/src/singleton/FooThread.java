package singleton;

public class FooThread extends Thread {

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("FOO");
        System.out.println(singleton.getMessage());
    }
}
