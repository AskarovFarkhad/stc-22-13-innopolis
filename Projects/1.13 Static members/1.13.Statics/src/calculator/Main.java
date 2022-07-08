package calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Работает VerySimpleCalculator");
        VerySimpleCalculator verySimpleCalculator = new VerySimpleCalculator(2, 6, 8, 5, 4);

        int sumAllNumbers = verySimpleCalculator.sumNumbers();

        System.out.println(sumAllNumbers);
        System.out.println("Работает SimpleCalculator");

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        int sumAllNumbers2 = simpleCalculator.sumNumbers(2, 6, 8, 5, 4);
        int sumAllNumbers3 = simpleCalculator.sumNumbers(102, 828, 901, 1809);

        System.out.println(sumAllNumbers2);
        System.out.println(sumAllNumbers3);

        System.out.println("Работает StaticCalculator");

        int sumAllNumbers4 = StaticCalculator.sumNumbers(2, 6, 8, 5, 4);
        int sumAllNumbers5 = StaticCalculator.sumNumbers(102, 828, 901, 1809);

        System.out.println(sumAllNumbers4);
        System.out.println(sumAllNumbers5);

        System.out.println("Случайное число, полученное с помощью Math");
        double test = Math.random();
        System.out.println(test);
        System.out.println(test * 100);
        System.out.println((int) (test * 100 + 1));

    }
}
