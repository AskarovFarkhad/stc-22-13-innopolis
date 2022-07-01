package homework_7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Farkhad.Askarov
 * @version 1.1
 */
public class Homework_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbers = generate(50);

        System.out.println("Введите число для поиска его индекса: ");
        System.out.println(searchNumber(numbers, sc.nextInt()));

        System.out.println("Проводится оптимизация массива...");
        int[] array = new int[numbers.size()];
        System.out.println(Arrays.toString(optimizationArray(numbers, array)));
    }

    private static List<Integer> generate(final int size) {
        return IntStream.range(0, size)
                .boxed()
                .map(i -> ThreadLocalRandom.current().nextInt(0, 20))
                .collect(Collectors.toList());
    }

    /**
     * Функция возвращает индекс числа number (возвращается первое совпадение с начала массива).
     *
     * @param numbers список целых чисел.
     * @param number  целое число для поиска.
     * @return индекс числа number.
     */
    public static int searchNumber(List<Integer> numbers, int number) {
        for (int i = 0; i < numbers.size(); i++) {
            if (number == numbers.get(i)) return i;
        }
        return -1;
    }

    /**
     * Процедура оптимизации порядка элементов.
     *
     * @param array массив целых чисел.
     */
    public static int[] optimizationArray(List<Integer> numbers, int[] array) {
        for (int i = 0, j = 0; i < numbers.size(); i++) {
            if (numbers.get(i) != 0) array[j++] = numbers.get(i);
        }

        return array;
    }
}
