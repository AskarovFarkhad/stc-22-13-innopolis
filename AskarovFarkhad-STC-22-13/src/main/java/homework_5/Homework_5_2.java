package homework_5;

import java.util.Scanner;

public class Homework_5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, a = scanner.nextInt();

        while (a != -1) {
            if (a < min) min = a;
            a = scanner.nextInt();
        }
        System.out.println("Минимальное число в последовательности: " + min);
    }
}
