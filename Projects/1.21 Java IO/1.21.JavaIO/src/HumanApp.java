import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HumanApp {
    public static void main(String[] args) {
        ArrayList<Human> humans = new ArrayList<>();

        System.out.println(humans.size());
        getAllHumans(humans);
        System.out.println(humans.size());

    }

    public static void getAllHumans(ArrayList<Human> humans) {

        String name;
        String lastName;
        String patronymic;
        int age;
        String line = null;

        try(BufferedReader reader = new BufferedReader(new FileReader("ForTest.txt"))) {
            while ((line = reader.readLine()) != null) {
                String[] info = line.split("\\|");
                lastName = info[0];
                name = info[1];
                patronymic = info[2];
                age = Integer.parseInt(info[3]);

                Human human = new Human(name, lastName, patronymic, age);
                humans.add(human);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    public static void createHumans(ArrayList<Human> humans) {
        Scanner scanner = new Scanner(System.in);
        //если choice = -1, мы закончили
        int choice = 0;
        String name;
        String lastName;
        String patronymic;
        int age;

        while (choice != -1) {
            System.out.println("Введите имя");
            name = scanner.nextLine();
            System.out.println("Введите фамилию");
            lastName = scanner.nextLine();
            System.out.println("Введите отчество");
            patronymic = scanner.nextLine();
            System.out.println("Введите возраст");
            age = scanner.nextInt();
            scanner.nextLine();
            Human human = new Human(name, lastName, patronymic, age);
            humans.add(human);

            try (BufferedWriter writer = new BufferedWriter(new FileWriter("ForTest.txt", true))) {
                writer.write(human.toString());
                writer.write("\n");
                writer.flush();
            } catch (IOException e) {
                throw new RuntimeException();
            }

            System.out.println("Продолжить? -1 - нет");
            choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
