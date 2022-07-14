package newVersion.lyambda;

import java.util.Random;

public class Main {

//    public static void main(String[] args) {
//        int[] array = new int[10];
//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10) + 1;
//        }
//
//        printNumbers(array, oleg -> oleg % 2 == 0);
//        System.out.println("А теперь не четные");
//        printNumbers(array, number -> number % 2 != 0);
//    }

    public static void main(String[] args) {
        printNames(() -> {
                    String result = "Hello, Super User";

                    return result;
                });
    }

    public static void printNumbers(int[] array, Condition condition) {
        for (int i = 0; i < array.length; i++) {
            //Если условие верно, то распечатываем число
            if (condition.isOk(array[i])) {
                System.out.println(array[i]);
            }
        }
    }

    public static void printNames(Printable printable) {
        String result = printable.print();

        System.out.println(result);
    }

//    public static void printNames(String name, String lastName, Printable printable) {
//        String result = printable.print();
//
//        System.out.println(result);
//    }
}
