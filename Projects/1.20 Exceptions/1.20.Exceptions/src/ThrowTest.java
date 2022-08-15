import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
        } catch (InputMismatchException e) {
            throw new RuntimeException();
        }
    }
}
