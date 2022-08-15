package newVersion;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TestsDeleteLists {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        addElements(arrayList);
        addElements(linkedList);

        deleteElementIndexArrayList(arrayList, arrayList.size() - 1);
        deleteElementIndexLinkedList(linkedList, linkedList.size() - 1);
        System.out.println("*****************************");
        deleteElementValueArrayList(arrayList, 5);
        deleteElementValueLinkedList(linkedList, 5);

    }

    public static void deleteElementIndexLinkedList(LinkedList<Integer> linkedList, int index) {
        Date start = getTime();
        Integer result = linkedList.remove(index);
        Date end = getTime();
        System.out.println("LinkedList удалил элемент - " + result + " по индексу " + index + " за - " + (end.getTime() - start.getTime()));
    }

    public static void deleteElementIndexArrayList(ArrayList<Integer> arrayList, int index) {
        Date start = getTime();
        Integer result = arrayList.remove(index);
        Date end = getTime();
        System.out.println("ArrayList удалил элемент - " + result + " по индексу " + index + " за - " + (end.getTime() - start.getTime()));
    }

    public static void deleteElementValueArrayList(ArrayList<Integer> arrayList, int value) {
        Date start = getTime();
        boolean result = arrayList.remove(new Integer(value));
        Date end = getTime();
        System.out.println("ArrayList удалил элемент - " + value + " результат " + result + " за - " + (end.getTime() - start.getTime()));
    }

    public static void deleteElementValueLinkedList(LinkedList<Integer> linkedList, int value) {
        Date start = getTime();
        boolean result = linkedList.remove(new Integer(value));
        Date end = getTime();
        System.out.println("LinkedList удалил элемент - " + value + " результат " + result + " за - " + (end.getTime() - start.getTime()));
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
