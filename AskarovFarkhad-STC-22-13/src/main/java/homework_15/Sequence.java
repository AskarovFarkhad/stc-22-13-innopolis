package homework_15;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

    /**
     * Метод возвращает массив, который содержит элементы, удовлетворяющие логическому выражению condition.
     *
     * @param numbers   некая последовательность чисел.
     * @param condition условие.
     * @return элементы, удовлетворяющие логическому выражению condition.
     */
    public static List<Integer> filter(List<Integer> numbers, ByCondition condition) {
        List<Integer> result = new ArrayList<>();

        for (Integer number : numbers) {
            if (condition.isOk(number)) {
                result.add(number);
            }
        }

        return result;
    }
}
