package defaultThread;

public class MyThreadMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //.start() - запускает поток исполнения.
        myThread.start();
        System.out.println("Мы в конце метода main");

    }
}
