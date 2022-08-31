package semaphore;

import java.util.concurrent.Semaphore;

public class Car extends Thread {

    private Semaphore semaphore;
    private String numberCar;

    public Car(Semaphore semaphore, String numberCar) {
        this.semaphore = semaphore;
        this.numberCar = numberCar;
        start();
    }

    @Override
    public void run() {
        System.out.println(this.getNumberCar() + " стоит в очереди на автомойку");
        try {
            //Забираем у "охраника" ключ карту (у семафора)
            semaphore.acquire();
            System.out.println(this.getNumberCar() + " заехал в бокс");
            sleep(1000);
            System.out.println(this.getNumberCar() + " моется");
            sleep(1000);
            System.out.println(this.getNumberCar() + " помылся");
            sleep(1000);
            System.out.println(this.getNumberCar() + " уехал из бокса");
            //Отдаем ключ-карту обратно охраннику.
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNumberCar() {
        return numberCar;
    }
}
