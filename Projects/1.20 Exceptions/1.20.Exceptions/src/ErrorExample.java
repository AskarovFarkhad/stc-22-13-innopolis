import java.util.ArrayList;

public class ErrorExample {

    public static void main(String[] args) {
        ArrayList<Object[]> arrayList = new ArrayList<>();
        while (true) {
            arrayList.add(new Object[10000]);
        }
    }
}
