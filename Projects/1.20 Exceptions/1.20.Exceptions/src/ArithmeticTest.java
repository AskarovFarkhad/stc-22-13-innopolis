import java.util.Scanner;

public class ArithmeticTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите первое число");
            int a = scanner.nextInt();
            System.out.println("Введите второе число");
            int b = scanner.nextInt();
            try {
                System.out.println("Результат деления = " + (a / b));
            } catch (ArithmeticException e) {
                System.out.println("Делить на ноль - нельзя, попробуй заново");
            }
        }
        //System.err.println("Hello");
    }
}
