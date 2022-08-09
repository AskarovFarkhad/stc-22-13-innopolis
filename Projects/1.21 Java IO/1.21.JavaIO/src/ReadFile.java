import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
//        try {
//            File file = new File("ForTest.txt");
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String line = bufferedReader.readLine();
//
//            while (line != null) {
//                System.out.println(line);
//                line = bufferedReader.readLine();
//            }
//        } catch (IOException e) {
//            throw new RuntimeException();
//        }

        //try-with-resource
        try(BufferedReader reader = new BufferedReader(new FileReader("ForTest.txt"))) {
            String line = null;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }
}
