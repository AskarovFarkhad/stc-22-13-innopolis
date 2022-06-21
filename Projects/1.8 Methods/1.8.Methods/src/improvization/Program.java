package improvization;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        int[] array = {10, 11, 12, 13, 14};
        //Вспомогательный класс Arrays с помощью которого мы распечатаем массив в консоль
        System.out.println(Arrays.toString(array));
        //Вызываем наш метод, который меняет числа местами
        swapNumbersInArray(array, 0, 4);
        //Вспомогательный класс Arrays с помощью которого мы распечатаем массив в консоль
        System.out.println(Arrays.toString(array));
        //Вызываем наш метод, который меняет числа местами
        swapNumbersInArray(array, 1, 3);
        //Вспомогательный класс Arrays с помощью которого мы распечатаем массив в консоль
        System.out.println(Arrays.toString(array));
    }
    //Метод меняет местами два числа
    //Принимает на вход массив и два индекса
    public static void swapNumbersInArray(int[] array, int index1, int index2) {
        //Создаем временную переменную, которая будет хранить значение
        //элемента под index1
        int temp = array[index1];
        //После этого, в массиве, под index1, кладем значение элемента в массиве под index2
        //Теперь у нас в массиве под index1 и index2 лежат одинаковые значения
        array[index1] = array[index2];
        //В массив на index2 кладем старое значение элемента массива под index1
        array[index2] = temp;
    }
}
