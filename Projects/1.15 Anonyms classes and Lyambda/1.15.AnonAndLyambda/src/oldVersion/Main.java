package oldVersion;

import java.util.Random;

public class Main {

//    public static void main(String[] args) {
//        int[] array = new int[10];
//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10) + 1;
//            if (array[i] % 2 == 0) {
//                System.out.println(array[i] + " четное число");
//            } else {
//                System.out.println(array[i] + " нечетное число");
//            }
//        }
//    }

//    public static void main(String[] args) {
//        ConditionChetnieImpl chetnie = new ConditionChetnieImpl();
//        ConditionNeChetnieImpl neChetnie = new ConditionNeChetnieImpl();
//
//        int[] array = new int[10];
//        Random random = new Random();
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10) + 1;
//
//            if (chetnie.isOk(array[i])) {
//                System.out.println(array[i] + " четное число");
//            }
//            if (neChetnie.isOk(array[i])) {
//                System.out.println(array[i] + " нечетное число");
//            }
//        }
//    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
//        ConditionChetnieImpl chetnie = new ConditionChetnieImpl();
//        ConditionNeChetnieImpl neChetnie = new ConditionNeChetnieImpl();

        Condition condition = new ConditionOddImpl();
        printNumbers(array, condition);

        condition = new ConditionEvenImpl();
        printNumbers(array, condition);

    }

    public static void printNumbers(int[] array, Condition condition) {
        for (int i = 0; i < array.length; i++) {
            if (condition.isOk(array[i])) {
                System.out.println(array[i]);
            }
        }
    }
}
