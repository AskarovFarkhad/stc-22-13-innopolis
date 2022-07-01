package homework_9;

/*
    На вход подается последовательность чисел, стремящаяся к бесконечности
    (последовательность может быть и из 100 чисел, может и их 1000000 чисел быть), оканчивающаяся на -101.
    Необходимо вывести число, которое присутствует в последовательности минимальное количество раз.

    Условия задачи:
    * Все числа в диапазоне от -100 до 100.
    * Числа встречаются не более 2 147 483 647-раз каждое.
    * Сложность алгоритма - O(n)
*/

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Farkhad.Askarov
 * @version 1.0
 */
public class Homework_9 {
    public static void main(String[] args) {
        final List<Integer> numbers = generate(50);
        System.out.println(numbers); // для наглядности
        Map<Integer, Integer> countNumbers = countNumber(numbers);
        System.out.println(countNumbers); // для наглядности
        System.out.println(printMinCountNumber(countNumbers));
    }

    private static List<Integer> generate(final int size) {
        return IntStream.range(0, size)
                .boxed()
                .map(i -> ThreadLocalRandom.current().nextInt(-100, 100))
                .collect(Collectors.toList());
    }

    /**
     * Метод для подсчета количества одинаковых чисел. Сложность - O(n).
     *
     * @param numbers последовательность целых чисел.
     * @return число (key), количество повторений (value).
     */
    private static Map<Integer, Integer> countNumber(List<Integer> numbers) {
        final Map<Integer, Integer> countNumber = new HashMap<>();
        for (Integer number : numbers) {
            countNumber.merge(number, 1, Integer::sum);
        }
        return countNumber;
    }

    /**
     * Метод для вывода числа, который повторялся наименьншее количество раз. Сложность - O(n).
     *
     * @param countNumbers число (key), количество повторений (value).
     * @return число.
     */
    private static Integer printMinCountNumber(Map<Integer, Integer> countNumbers) {
        Integer min = Integer.MAX_VALUE;
        Integer result = 0;

        for (Map.Entry<Integer, Integer> entry : countNumbers.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();

            if (value < min) {
                min = value;
                result = key;
            }
        }
        return result;
    }
}
