package multiArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> integerList = new Vector<>();
        Thread thread0 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                integerList.add(i);
            }
        });

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                integerList.add(i - 2000);
            }
        });

        thread0.start();
        thread1.start();

        thread0.join();
        thread1.join();

        int i = 0;

    }
}
