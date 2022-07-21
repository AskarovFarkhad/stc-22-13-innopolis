package homework_15;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * В main в качестве condition подставить:
 * - проверку на четность элемента
 * - проверку, является ли сумма цифр элемента четным числом.
 * - Доп. задача: проверка на четность всех цифр числа. (число состоит из цифр)
 * - Доп. задача: проверка на палиндромность числа
 * (число читается одинаково и слева, и справа -> 11 - палиндром, 12 - нет, 3333 - палиндром, 3211 - нет, и т.д.).
 */

public class Main {

    /**
     * Метод для заполнения List<Integer>.
     *
     * @return заполненный лист с числами от 200 до 250.
     */
    private static List<Integer> generate(final int size) {
        return IntStream.range(0, size)
                .boxed()
                .map(i -> ThreadLocalRandom.current().nextInt(200, 250))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        final List<Integer> numbers = generate(20);

        // проверку на четность элемента
        System.out.println("Array with even numbers: " + Sequence.filter(numbers, number -> number % 2 == 0));

        // проверку, является ли сумма цифр элемента четным числом
        System.out.println("Array with numbers where every digit sum even: " +
                Sequence.filter(
                        numbers,
                        number -> {
                            int sum = 0;

                            while (number != 0) {
                                sum += number % 10;
                                number = number / 10;
                            }

                            return sum % 2 == 0;
                        }));

        // Доп. задача: проверка на четность всех цифр числа (число состоит из цифр).
        ByCondition conditionEveryDigitEven = new ByCondition() {
            @Override
            public boolean isOk(int number) {
                boolean flag = true;

                while (number != 0 && flag) {
                    flag = (number % 10) % 2 == 0;
                    number = number / 10;
                }

                return flag;
            }
        };

        System.out.println("Array with numbers where every digit is even: " +
                Sequence.filter(
                        numbers,
                        conditionEveryDigitEven));

        // Доп. задача: проверка на палиндромность числа.
        System.out.println("Array with polyndromous numbers: " +
                Sequence.filter(
                        numbers,
                        number -> {
                            String numberToString = String.valueOf(number);
                            String data = new StringBuilder(numberToString).reverse().toString();
                            return numberToString.equals(data);
                        }));
    }
}
