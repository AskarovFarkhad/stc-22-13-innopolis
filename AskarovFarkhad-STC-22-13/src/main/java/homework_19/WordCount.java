package homework_19;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * На вход подается строка с текстом. Необходимо посчитать, сколько встречается раз каждое слово в этой строке.
 * <p>
 * Вывести:\
 * Слово - количество раз\
 * Слово - количество раз\
 * Использовать Map, у объектов String есть метод для деления строки на части по определенному символу.
 * Слово - символы, ограниченные пробелами справа и слева.
 * <p>
 * Пример:\
 * Маша и три медведя
 * <p>
 * Маша - 1 раз\
 * и - 1 раз\
 * три - 1 раз\
 * медведя - 1раз
 */

public class WordCount {

    public static void main(String[] args) {
        final HashMap<String, Integer> words = new HashMap<>();

        try (FileInputStream in = new FileInputStream("src\\main\\java\\homework_19\\Text");
             InputStreamReader reader = new InputStreamReader(in);
             BufferedReader buff = new BufferedReader(reader)) {
            wordProcessing(buff, words);
        } catch (Exception e) {
            e.printStackTrace();
        }

        printWords(words);
    }

    public static void wordProcessing(BufferedReader buff, HashMap<String, Integer> words) throws IOException {

        while (buff.ready()) {
            String[] strings = buff.readLine().trim().split("\\s*(([\\s@#$%&*<>.'»,!«;:()\" ?—])|(\\.{3}))\\s*");

            final Integer count = 1;

            for (String word : strings) {
                // проверка на пустую строку
                if (!word.equals("")) words.merge(word.toLowerCase(), count, Integer::sum);
            }
        }
    }

    public static void printWords(HashMap<String, Integer> words) {
        words.forEach((s, integer) -> System.out.println(s + ": " + integer));

        int sum = words.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
        System.out.println("Общее количество слов: " + sum);
    }
}
