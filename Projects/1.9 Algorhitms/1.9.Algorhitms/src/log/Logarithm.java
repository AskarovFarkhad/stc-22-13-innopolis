package log;

import java.util.Random;

public class Logarithm {
    //Переменная, которая считает количество вызовов метода Бинарного поиска
    public static int countActionsForBinary = 0;

    //Переменная, которая считает количество вызовов метода Линейного поиска
    public static int countActionsForLine = 0;

    public static void main(String[] args) {
        //Создаем объект типа Random - нужен нам для выдачи случайного числа
        Random random = new Random();
        //Создаем массив случайной длины
        int[] array = new int[random.nextInt(1000) + 1];
        //Заполняем массив случайными числами
        fullArray(array);
        //Сортируем массив
        bubbleSort(array);
        System.out.println("Длина массив - " + array.length);
        System.out.println("Запускаю линейный поиск...");
        //Проверяем, какой метод быстрее найдет число 525
        //Запуск метода линейного поиска
        System.out.println(findNumber(array, 525));
        System.out.println("Количество операций линейного поиска - " + countActionsForLine);
        System.out.println("###################################################");
        System.out.println("Запускаю бинарный поиск...");
        //Запуск метода бинарного поиска
        System.out.println(recursiveBinarySearch(
                array,
                525,
                0,
                array.length - 1));
        System.out.println("Количество операций бинарного поиска - " + countActionsForBinary);
    }

    //O(log n) - логарифмическая зависимость
    public static int recursiveBinarySearch(int[] array,
                                            int elementToSearch,
                                            int firstIndex,
                                            int lastIndex) {
        //Каждый раз, когда заходим в данный метод, переменная, которая хранит количество вызовов данного метода, увеличивается на 1
        countActionsForBinary += 1;
        // Если последний индекс больше или равен начальному
        if (lastIndex >= firstIndex) {
            //Высчитываем середину между двух индексов
            int mid = firstIndex + (lastIndex - firstIndex) / 2;

            // Если элемент по индексу, который мы высчитали и есть искомый элемент,
            // то мы его возвращаем
            if (array[mid] == elementToSearch) {
                return mid;
            }

            // Если элемент по индексу, который мы высчитали больше элемента, который мы ищем
            // то вызываем этот же метод, но отбрасываем большую (правую) половину массива
            // т.е. ищем число в левой части массива
            if (array[mid] > elementToSearch) {
                return recursiveBinarySearch(array, elementToSearch, firstIndex, mid - 1);
            }

            // Если элемент по индексу, который мы высчитали меньше элемента, который мы ищем
            // то вызываем этот же метод, но отбрасываем меньшую (левую) половину массива
            // т.е. ищем число в правой части массива
            return recursiveBinarySearch(array, elementToSearch, mid + 1, lastIndex);
        }

        System.out.println("Элемент не найден");
        //Если число, которое мы ищем мы не нашли - то возвращаем -1
        return -1;
    }

    //Метод, который заполняет массив случайными числами в диапазоне от 1 до 100
    //O(n) - линейная сложность
    public static void fullArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i = i + 1) {
            array[i] = random.nextInt(1000) + 1;
        }
    }

    //Сортировка Пузырьком - самые большие числа последовательно "всплывают" в самый конец массива
    //O(n^2)
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array.length - 1; j = j + 1) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //Метод, который ищет индекс числа в массиве
    //Если такого числа в массиве нет, то возращаем -1
    //Если есть - то возвращаем индекс числа
    //O(n) - линейная сложность
    public static int findNumber(int[] array, int elementToSearch) {
        for (int i = 0; i < array.length; i = i + 1) {
            if (array[i] == elementToSearch) {
                return i;
            }
            //Каждый раз, когда срабатывает цикл, переменная, которая хранит количество вызовов данного метода, увеличивается на 1
            countActionsForLine += 1;
        }

        System.out.println(elementToSearch + " отсутствует в массиве");
        return -1;
    }
}
