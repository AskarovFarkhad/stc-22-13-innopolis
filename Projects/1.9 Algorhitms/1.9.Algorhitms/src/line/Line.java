package line;

import java.util.Random;

public class Line {
    public static void main(String[] args) {
        //Создаем пустой массив на 20 элементов
        int[] array = new int[20];
        //Выводим его в консоль
        printArray(array);
        //Заполняем массив случайгыми числами
        fullArray(array);
        //Выводим массив в консоль после того, как заполнили его числами
        printArray(array);
        //Ищем индекса числа 15 (есть ли это число в массиве или нет)
        System.out.println(findNumber(array, 15));
    }

    //Метод, который распечатывает массив консоль
    //O(n) - линейная сложность
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i = i + 1) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    //Метод, который заполняет массив случайными числами в диапазоне от 1 до 100
    //O(n) - линейная сложность
    public static void fullArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i = i + 1) {
            array[i] = random.nextInt(100) + 1;
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
        }

        System.out.println(elementToSearch + " отсутствует в массиве");
        return -1;
    }
}
