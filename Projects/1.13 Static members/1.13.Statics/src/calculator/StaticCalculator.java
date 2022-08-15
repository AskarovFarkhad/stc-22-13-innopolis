package calculator;

public class StaticCalculator {

    //Многоточие означает, что мы не знаем сколько элементов будет передано в метод
    //Может быть один, может быть пять, а может и сто
    //При выполнении метода - набор чисел преобразовывается в массив
    //И внутри метода мы уже работаем с числами через массив
    //А ключевое слово static означает, что для вызова данного метода
    //нам не нужен объект класса StaticCalculator, т.к. метод принадлежит
    //классу, а не его объектам
    public static int sumNumbers(int ... numbers) {
        int result = 0;

        for (int i = 0; i < numbers.length; i = i + 1) {
            result = result + numbers[i];
        }

        return result;
    }
}
