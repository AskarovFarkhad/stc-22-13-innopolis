package defaultThread;

public class MyThread extends Thread {

    //Переопределяем всегда метод .run(), а не .start()
    @Override
    public void run() {
        System.out.println("Мы в классе defaultThread.MyThread");
    }
}
