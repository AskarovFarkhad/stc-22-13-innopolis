import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumbersStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            numbers.add(random.nextInt(1000));
        }

//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                System.out.print("[" + numbers.get(i) + "] ");
//            }
//        }

        //.stream() - преобразует структуру данных в поток данных
        //.filter() - фильтрует поток данных, пропускает дальше только те данные. которые удовлетворяют условию
        //.disctinct() - убирает все дубликаты из потока данных
        //.sorted() - сортирует поток данных
        //:: - квадроточие. Ссылка на метод.
        //Human human = new Human("Oleg");
        //human.getName();
//        numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .distinct()
//                .sorted()
//                .forEach(System.out::println); //System.out.println();

        //.map() - принимает на вход поток одного типа, а на выходе выдает поток другого типа
        List<String> strings = numbers.stream()
                .map(number -> {
                    String stroke = String.valueOf(number); //Было 100 -> стало "100"
                    return stroke;
                })
                .collect(Collectors.toList());

        System.out.println(strings);
        strings = strings.stream()
                .map(Integer::parseInt)
                .distinct()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println(strings);
    }
}
