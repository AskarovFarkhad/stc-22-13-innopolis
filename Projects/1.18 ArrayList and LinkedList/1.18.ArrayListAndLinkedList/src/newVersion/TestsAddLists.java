package newVersion;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TestsAddLists {

    public static void main(String[] args) {

        addLastArrayList(new ArrayList<>());
        addLastLinkedList(new LinkedList<>());
        System.out.println("*************************");
        addFirstArrayList(new ArrayList<>());
        addFirstLinkedList(new LinkedList<>());
        System.out.println("*************************");
        addMiddleArrayList(new ArrayList<>());
        addMiddleLinkedList(new LinkedList<>());
    }

    public static void addLastArrayList(ArrayList<Integer> arrayList) {
        Date start = getTime();

        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(i);
        }

        Date end = getTime();

        System.out.println("ArrayList добавил 1_000_000 элементов за - " + (end.getTime() - start.getTime()));
    }

    public static void addLastLinkedList(LinkedList<Integer> linkedList) {
        Date start = getTime();

        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
        }

        Date end = getTime();

        System.out.println("LinkedList добавил 1_000_000 элементов за - " + (end.getTime() - start.getTime()));
    }

    public static void addFirstArrayList(ArrayList<Integer> arrayList) {
        Date start = getTime();

        for (int i = 0; i < 100_000; i++) {
            arrayList.add(0, i);
        }

        Date end = getTime();

        System.out.println("ArrayList добавил 100_000 элементов в начало за - " + (end.getTime() - start.getTime()));
    }

    public static void addFirstLinkedList(LinkedList<Integer> linkedList) {
        Date start = getTime();

        for (int i = 0; i < 100_000; i++) {
            linkedList.addFirst(i);
        }

        Date end = getTime();

        System.out.println("LinkedList добавил 100_000 элементов в начало за - " + (end.getTime() - start.getTime()));
    }

    public static void addMiddleArrayList(ArrayList<Integer> arrayList) {
        Date start = getTime();

        for (int i = 0; i < 100_000; i++) {
            arrayList.add(arrayList.size() / 2 , i);
        }

        Date end = getTime();

        System.out.println("ArrayList добавил 100_000 элементов в середину за - " + (end.getTime() - start.getTime()));
    }

    public static void addMiddleLinkedList(LinkedList<Integer> linkedList) {
        Date start = getTime();

        for (int i = 0; i < 100_000; i++) {
            linkedList.add(linkedList.size() / 2, i);
        }

        Date end = getTime();

        System.out.println("LinkedList добавил 100_000 элементов в середину за - " + (end.getTime() - start.getTime()));
    }


    public static Date getTime() {
        return new Date();
    }
}
