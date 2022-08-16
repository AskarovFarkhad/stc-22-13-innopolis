package runnableThread;

public class RunnableMain {

    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl();

        Thread thread = new Thread(runnable);

        thread.start();
    }
}
