package wrappers;

public class StorageDigits<T> {

    private Object[] storageDigits = new Object[10];
    private int count = 0;

    public void addNumber(T number) {
        if (count < storageDigits.length) {
            storageDigits[count] = number;
            count = count + 1;
        }
    }

    public void printArray() {
        for (int i = 0; i < storageDigits.length; i++) {
            System.out.println(storageDigits[i]);
        }
    }
}
