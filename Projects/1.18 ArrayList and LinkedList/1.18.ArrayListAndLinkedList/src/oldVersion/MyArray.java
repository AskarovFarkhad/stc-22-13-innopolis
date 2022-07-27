package oldVersion;

public class MyArray {

    private int[] array;
    private int count;
    private final int DEFAULT_CAPACITY = 10;
    private final int DEFAULT_VALUE_COUNT = 0;

    public void addElement(int element) {
        if (count == array.length) {
            int[] tempArray = new int[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
        }

        array[count] = element;
        count++;
    }

    public MyArray(int length) {
        this.count = DEFAULT_VALUE_COUNT;
        this.array = new int[length];
    }

    public MyArray() {
        this.count = DEFAULT_VALUE_COUNT;
        this.array = new int[DEFAULT_CAPACITY];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
