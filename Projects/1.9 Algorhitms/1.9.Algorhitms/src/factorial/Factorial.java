package factorial;

public class Factorial {
    public static void main(String[] args) {
        //3! = 1 * 2 * 3 = 6;
        //4! = 1 * 2 * 3 * 4= 24;
        //5! = 1 * 2 * 3 * 4 * 5 = 120;
        System.out.println(simpleFactorial(5));
        System.out.println(simpleFactorial(7));
        System.out.println("******************************");
        System.out.println(hardFactorial(5));
        System.out.println(hardFactorial(7));
    }

    //Простая реализация высчитывания факториала
    //Последовательно умножаем переменную result на все числа до числа number
    public static int simpleFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i = i + 1) {
            //result *= i;
            result = result * i;
        }

        return result;
    }

    //Рекурсивно (внутри метода вызываем этот же метод) находим факториал числа
    //Суть в том, что мы рекурсивно вызываем метод, каждый раз кладем в него (число - 1)
    //Происходит это до тех пор, пока не дойдем до вызова данного метода, когда в него кладется 1
    //После этого, операторы return возвращают результаты работы методов в места, где они были вызваны
    //Т.е. вовзращается 1 и умножается на 2
    //После этого, результат произведения возвращается в место вызова и там, умножается на 3 и т.д. до числа,
    //чей факториал мы хотим найти
    public static int hardFactorial(int number) {
        if (number == 1) {
            return number;
        }

        return number * hardFactorial(number - 1);
    }
}

