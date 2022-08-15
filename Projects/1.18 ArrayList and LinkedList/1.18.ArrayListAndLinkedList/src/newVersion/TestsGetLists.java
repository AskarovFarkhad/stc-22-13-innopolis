package newVersion;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TestsGetLists {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        addElements(arrayList);
        addElements(linkedList);

        getElementArrayList(arrayList, arrayList.size() - 1);
        getElementLinkedList(linkedList, linkedList.size() - 1);
    }


    public static void getElementArrayList(ArrayList<Integer> arrayList, int index) {
        Date start = getTime();
        Integer result = arrayList.get(index);
        Date end = getTime();
        System.out.println("ArrayList достал элемент - " + result + " по индексу " + index + " за - " + (end.getTime() - start.getTime()));
    }

    public static void getElementLinkedList(LinkedList<Integer> linkedList, int index) {
        Date start = getTime();
        Integer result = linkedList.get(index);
        Date end = getTime();
        System.out.println("LinkedList достал элемент - " + result + " по индексу " + index + " за - " + (end.getTime() - start.getTime()));
    }

    public static void addElements(List<Integer> list) {
        for (int i = 0; i < 10_000_000; i++) {
            list.add(i);
        }
    }

    public static Date getTime() {
        return new Date();
    }
}
