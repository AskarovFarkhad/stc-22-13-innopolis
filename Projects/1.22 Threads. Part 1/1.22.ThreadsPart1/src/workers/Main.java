package workers;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Рабочий 1 копает яму");
//        }
//
//        System.out.println(Thread.currentThread().getName());
//
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Рабочий 2 таскает землю");
//        }
//
//        System.out.println(Thread.currentThread().getName());
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Рабочий 3 закапывает яму");
//        }

        Worker worker1 = new Worker("Копатель");
        Worker worker2 = new Worker("Таскатель");
        Worker worker3 = new Worker("Закапыватель");

        //worker1.start();
        ////Метод .join() заставляет текущий поток (в котором вызван этот метод)
        ////ждать окончания работы потока, у чьего объекта был вызван метод .join()
        ////worker1.join();
        //worker2.start();
        ////worker2.join();
        ////Потоки демоны - вспомогательные потоки исполнения. Процесс не будет дожидаться окончания их работы
        ////как только закончат работу основные (не демоны) потоки, программа принудительно завершит работу
        ////всех потоков демонов
        ////worker3.setDaemon(true);
        //worker3.start();

        System.out.println("Я поехал домой, не забудьте закрыть калитку");
    }
}
