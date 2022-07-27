package newVersion;

import java.util.ArrayList;

public class TestArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 100_000; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList.size());
    }

}
