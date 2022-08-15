import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IerarhiException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;

        try {
            a = scanner.nextInt();
        } catch (NoSuchElementException e) {
            System.out.println("Мы в NoSuchElementException");
        } catch (RuntimeException e) {
            System.out.println("Мы в RuntimeException");
        } catch (Exception e) {
            System.out.println("Мы в Exception");
        }
    }
}
