package example;

//Пример рефакторинга кода
//Во всех трех методах присутствовала повторяющаяся строчка кода
//которую мы вынесли в отдельный метод, чтобы избежать дублирование кода
public class Test {

//    public int testMethodNumberOne(int a, int b) {
//        int result = a + b;
//        return result * result;
//    }
//
//    public int testMethodNumberTwo(int a, int b) {
//        int result = a + b;
//        return result * 100;
//    }
//
//    public int testMethodNumberThree(int a, int b) {
//        int result = a + b;
//        return result / 100;
//    }

    public int testMethodNumberOne(int a, int b) {
        int result = sumTwoNumbers(a, b);
        return result * result;
    }

    public int testMethodNumberTwo(int a, int b) {
        return sumTwoNumbers(a, b) * 100;
    }

    public int testMethodNumberThree(int a, int b) {
        return sumTwoNumbers(a, b) / 100;
    }

    private int sumTwoNumbers(int a, int b) {
        return a + b;
    }
}
