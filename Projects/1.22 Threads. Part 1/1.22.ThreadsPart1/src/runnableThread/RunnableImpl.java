package runnableThread;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Мы в реализации Runnable");
        }
    }
}
