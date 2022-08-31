package singleton;

public class BarThread extends Thread {

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance("BAR");
        System.out.println(singleton.getMessage());
    }
}
