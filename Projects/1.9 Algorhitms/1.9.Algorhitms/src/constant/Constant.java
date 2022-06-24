package constant;

public class Constant {
    public static void main(String[] args) {
        int[] array = {0, 2, 6, 8, 15, 654};
        System.out.println(getElementOnIndex(array, 3));
        System.out.println(getElementOnIndex(array, -2));
    }
    //O(1) - константная сложность
    public static int getElementOnIndex(int[] array, int index) {
        //Если индекс находится в диапазоне массива - то вытаскиваем элемент
        if (index >= 0 && index < array.length) {
            return array[index];
        }
        //Иначе - выводим "Некорректный индекс" и возвращаем -1
        System.out.println("Некорректный индекс");
        return -1;
    }
}
