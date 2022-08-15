package workers;

public class Worker extends Thread {

    public Worker(String name) {
        super(name);
        start();
    }

//    @Override
//    public void run() {
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Я выполняю свою часть работы. Я - " + Thread.currentThread().getName());
//
//            try {
//                sleep(100);
//            } catch (InterruptedException e) {
//                System.out.println("Ooops");
//            }
//        }
//    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Я выполняю свою часть работы. Я - " + Thread.currentThread().getName());
            //.yield() - заставляет принудительно уступить место другому потоку.
            yield();
        }
    }
}
