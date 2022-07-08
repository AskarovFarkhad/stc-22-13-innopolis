package calculator;

public class SimpleCalculator {

    //Многоточие означает, что мы не знаем сколько элементов будет передано в метод
    //Может быть один, может быть пять, а может и сто
    //При выполнении метода - набор чисел преобразовывается в массив
    //И внутри метода мы уже работаем с числами через массив
    public int sumNumbers(int ... numbers) {
        int result = 0;

        for (int i = 0; i < numbers.length; i = i + 1) {
            result = result + numbers[i];
        }

        return result;
    }
}
