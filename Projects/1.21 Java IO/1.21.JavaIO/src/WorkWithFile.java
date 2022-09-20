import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WorkWithFile {

    public static void main(String[] args) {
        File file = new File("ForTest.txt");

        Writer writer = null;

        try {
            writer = new FileWriter(file, false);
            writer.write("Varvara\n");
            writer.write("Vladimir\n");
            writer.write("Igor\n");
            writer.write("Anton\n");
            writer.write("Nikita\n");
            writer.write("Alexey\n");
            writer.write("Alexander\n");
            writer.write("Anatoliy\n");
            writer.flush();

        } catch (IOException e) {
            System.out.println("Плак :С");
        } finally {
            try {
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
