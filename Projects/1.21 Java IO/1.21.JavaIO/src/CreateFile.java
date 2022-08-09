import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("ForTest.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Successful");
            } else {
                System.out.println("Существует ли файл? " + file.exists());
                System.out.println("Not successful");
            }
        } catch (IOException e) {
            System.out.println("Плак ;С");
        }
    }
}
