package square;

public class Main {
    public static void main(String[] args) {
        int[] array = {9, 10, 88, 0, -2, 17, 16, 11, 11};
//        printArray(array);
//        bubbleSort(array);
//        printArray(array);

        printTableMultiplication(10);
    }

    //Сортировка Пузырьком - самые большие числа последовательно "всплывают" в самый конец массива
    //O(n^2)
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array.length - 1; j = j + 1) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    //Метод, который распечатывает массив
    //O(n)
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i = i + 1) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    //Метод, который печатает "таблицу" умножения до числа number
    //O(n^2) - квадратичная зависимость
    public static void printTableMultiplication(int number) {
        for (int i = 1; i <= number; i = i + 1) {
            for (int j = 1; j <= number; j = j + 1) {
                System.out.print("[" + j * i + "]");
            }
            System.out.println();
        }
    }
}
