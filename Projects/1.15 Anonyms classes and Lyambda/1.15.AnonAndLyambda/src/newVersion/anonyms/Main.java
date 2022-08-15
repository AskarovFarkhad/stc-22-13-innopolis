package newVersion.anonyms;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }

        //Анонимный класс
        Condition conditionThree = new Condition() {
            @Override
            public boolean isOk(int number) {
                return number % 3 == 0;
            }
        };

        //Анонимный класс
        Condition conditionTwo = new Condition() {
            @Override
            public boolean isOk(int number) {
                return number % 2 == 0;
            }
        };

        printNumbers(array, conditionThree);
        System.out.println("А теперь четные");
        printNumbers(array, conditionTwo);
    }

    public static void printNumbers(int[] array, Condition condition) {
        for (int i = 0; i < array.length; i++) {
            //Если условие верно, то распечатываем элемент
            if (condition.isOk(array[i])) {
                System.out.println(array[i]);
            }
        }
    }
}
