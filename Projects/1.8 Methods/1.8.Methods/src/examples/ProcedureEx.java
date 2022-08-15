package examples;

public class ProcedureEx {
    public static void main(String[] args) {
        //Метод (процедура), который складывает два числа
        //И не возвращает результат
        sumTwoNumbers(10, 15);
    }
    //Метод, который складывает два числа
    //На вход принимает два целыхъ числа
    public static void sumTwoNumbers(int value1, int value2) {
        int result = value1 + value2;
    }
    //Метод, который складывает число само с собой
    public static void sumTwoNumbers(int value) {
        int result = value + value;
    }
}
