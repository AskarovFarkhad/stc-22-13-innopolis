package homework_23;

import java.util.stream.IntStream;

/**
 * Реализовать синхронизацию c несколькими способами: <br>
 * 1) с помощью synchronized <br>
 * 2) с помощью ReentrantReadWriteLock <br>
 * 3) с помощью wait/notify <br>
 * 4) с помощью Atomic <br>
 * 5) с помощью CAS <br>
 */
public class Main {

    public static void main(String[] args) {
        testSynchronized(new CounterSynchronized());

        testObjectMethods(new CounterObjectMethods());
    }

    public static void testSynchronized(CounterSynchronized counter) {
        IntStream.range(0, 999).parallel().forEach(i -> counter.getCount());
        System.out.println(counter.getCount());
    }

    public static void testObjectMethods(CounterObjectMethods counter) {
        IntStream.range(0, 999).parallel().forEach(i -> counter.initCount());
        System.out.println(counter.getCount());
    }
}
