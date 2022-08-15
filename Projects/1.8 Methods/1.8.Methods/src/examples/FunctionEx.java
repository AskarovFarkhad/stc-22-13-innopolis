package examples;

public class FunctionEx {
    public static void main(String[] args) {
        //Объявляем переменную а и кладем в нее 10 (инициализируем)
        int a = 10;
        //Объявляем переменную b и кладем в нее 1400 (инициализируем)
        int b = 1400;
        //Объявляем переменную number и кладем в нее результат работы функции(метода) sumTwoNumbers
        int number = sumTwoNumbers(a, b);
        //Выводим в консоль "Результаты суммы двух чисел: " + number
        System.out.println("Результаты суммы двух чисел: " + number);
    }
    //Метод, который складывает два числа и возвращает их сумму
    //На вход принимает два целых числа
    public static int sumTwoNumbers(int value1, int value2) {
        //return value1 + value2;
        int result = value1 + value2;
        return result;
    }

    //Метод, который складывает число само с собой и возвращает результат сложения
    //На вход принимает одно целое число
    public static int sumTwoNumbers(int value) {
        //return value + value;
        int result = value + value;
        return result;
    }
}
