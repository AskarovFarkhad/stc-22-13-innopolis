package homework_16;

public class Main {
    public static void main(String[] args) {
        Human Ivan = new Human(
                "Иван",
                "Иванов",
                "Иванович",
                "Казань",
                "М. Вахитова",
                "5/3",
                "45",
                "9214984523");

        Human Ivan2 = new Human(
                "Иван",
                "Иванов",
                "Иванович",
                "Казань",
                "М. Вахитова",
                "5/3",
                "45",
                "9214984523");

        Human Ivan3 = new Human(
                "Иван",
                "Иванов",
                "Иванович",
                "Казань",
                "М. Вахитова",
                "5/3",
                "45",
                "9214984535");

        System.out.println(Ivan);

        System.out.println(Ivan.equals(Ivan2)); // Ivan == Ivan2
        System.out.println(Ivan2.equals(Ivan3)); // Ivan3 != Ivan
        System.out.println(Ivan.equals(Ivan3)); // Ivan3 != Ivan2
    }
}
