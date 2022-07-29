package set.newVersion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GIBDD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Number> numberSet = new HashSet<>();
        String result = null;
        System.out.println("Добро пожаловать в ГИБДД");
        System.out.println("Выберите номер для Вашей машины");

        while (true) {
            System.out.println(Arrays.toString(numberSet.toArray()));
            result = scanner.nextLine();

            if (result.equals("stop")) {
                return;
            }

            if (numberSet.add(new Number(result))) {
                System.out.println("Поздравляем, Ваш номер был зарегестрирован - " + result);
            } else {
                System.out.println("Такой номер уже существует, введите другой");
            }
        }
    }
}
