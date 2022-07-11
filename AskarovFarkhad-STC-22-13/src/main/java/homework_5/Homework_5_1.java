package homework_5;

import java.util.Scanner;

public class Homework_5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countEven = 0, countOdd = 0, a = scanner.nextInt();

        while (a != -1) {
            if (a % 2 == 0) countEven++;
            else countOdd++;

            a = scanner.nextInt();
        }
        System.out.println("Количество четных чисел: " + countEven + "\n" +
                "Количество нечетных чисел: " + countOdd);
    }
}
