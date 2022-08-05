import java.util.Scanner;

public class TestOlegException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
        } catch (Exception oleg) {
            //TODO
            throw new OlegException("WTF");
        }
    }
}
