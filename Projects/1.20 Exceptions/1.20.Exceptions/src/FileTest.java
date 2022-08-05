import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {

    public static void main(String[] args) {
        readFile();
    }


    public static void readFile() {
        File file = new File("Test");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
