package homework_10;

/**
 * Создать класс **Human** используя инкапсуляцию (модификаторы и методы доступа),
 * у которого будут поля:
 * * String name
 * * String lastName
 * * int age
 * <p>
 * Будет два конструктора - один пустой, второй - полный (инициализирует все поля)
 * <p>
 * Создать класс Main, в котором будет создаваться массив на случайное количество человек.
 * После инициализации массива - заполнить его объектами класса Human
 * (у каждого объекта случайное значение поля age).
 * После этого - отсортировать массив по возрасту и вывести результат в консоль
 */

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // сортировка с помощью класса AgeComparator
        ArrayList<Human> humanArrayList = new ArrayList<>();
        generateArrayList(humanArrayList, 0, 20);
        humanArrayList.sort(new AgeComparator());
        System.out.println(humanArrayList);

        // используем TreeSet
        System.out.println(generateTreeSet(0, 20));

        // сортировка расчёской (Comb Sort)
        Human[] humans = generateArrayHuman(0, 20);
        combSort(humans);
        System.out.println(Arrays.toString(humans));
    }

    /** Метод для заполнения ArrayList.
     * @param start начальное значение диапазона - "от"
     * @param end   конечное значение диапазона - "до"
     * @return остортированный TreeSet
     */
    public static void generateArrayList(ArrayList<Human> humanArrayList,
                                         final int start,
                                         final int end) {
        int count = start + (int) (Math.random() * end);

        for (int i = 0; i < count; i++) {
            humanArrayList.add(new Human(
                    getRandomString(),
                    getRandomString(),
                    (int) (0 + (Math.random() * 100))));
        }
    }

    /**
     * Метод для заполнения классами Human и сортировки с использованием TreeSet.
     * @param start начальное значение диапазона - "от"
     * @param end   конечное значение диапазона - "до"
     * @return остортированный TreeSet.
     */
    public static TreeSet<Human> generateTreeSet(int start, int end) {
        int count = start + (int) (Math.random() * end);
        TreeSet<Human> humanTreeSet = new TreeSet<>();

        for (int i = 0; i < count; i++) {
            humanTreeSet.add(new Human(
                    getRandomString(),
                    getRandomString(),
                    (int) (0 + (Math.random() * 100))));
        }

        return humanTreeSet;
    }

    /**
     * Метод для заполнения массива с объектам Human.
     * @param start начальное значение диапазона - "от"
     * @param end   конечное значение диапазона - "до"
     * @return массив.
     */
    public static Human[] generateArrayHuman(final int start,
                                             final int end) {
        Human[] humans = new Human[start + (int) (Math.random() * end)];

        for (int i = 0; i < humans.length; i++) {
            humans[i] = (new Human(
                    getRandomString(),
                    getRandomString(),
                    (int) (0 + (Math.random() * 100))));
        }

        return humans;
    }

    /**
     * Сортировка расчёской.
     * @param humans заполненый эксземплярами лист.
     */
    public static void combSort(Human[] humans) {
        final double factor = 1.247;
        int gap = humans.length;

        while (gap > 1) {
            gap = (int) (gap / factor);

            for (int i = 0; gap + i < humans.length; i++) {
                if (humans[i].getAge() > humans[i + gap].getAge()) {
                    Human temp = humans[i];
                    humans[i] = humans[i + gap];
                    humans[i + gap] = temp;
                }
            }
        }
    }

    /**
     * Метод для создания рандомных строк для имени и фамилии.
     * @return строка.
     */
    public static String getRandomString() {
        return RandomStringUtils.random(
                10, true, false);
    }
}
