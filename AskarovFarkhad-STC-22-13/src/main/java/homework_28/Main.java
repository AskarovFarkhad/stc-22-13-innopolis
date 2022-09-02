package homework_28;

import homework_28.entity.Human;
import homework_28.repository.impl.CrudRepositoryImpl;
import lombok.extern.slf4j.Slf4j;

import java.sql.SQLException;
import java.util.Scanner;

@Slf4j
public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final CrudRepositoryImpl repository = new CrudRepositoryImpl();

    public static void main(String[] args) {

        repository.createTable();
        boolean flag = true;

        while (flag) {
            main_menu();
            switch (sc.nextLine().trim()) {
                case "1":
                    repository.getAll().forEach(System.out::println);
                    break;
                case "2":
                    System.out.print("Введите ID человека: ");
                    System.out.println(repository.getById(Integer.parseInt(sc.nextLine().trim())));
                    break;
                case "3":
                    System.out.print("Введите данные человека в формате <Имя Фамилия Город Паспортные данные>: ");
                    String[] dataCreate = sc.nextLine().trim().split("\\s");
                    repository.create(new Human(dataCreate[0], dataCreate[1], dataCreate[2], dataCreate[3]));
                    break;
                case "4":
                    System.out.print("Введите данные человека в формате <Имя Фамилия Город Паспортные данные>: ");

                    break;
                case "5":
                    System.out.print("Введите данные человека в формате <Имя Фамилия Город Паспортные данные>: ");
                    String[] dataDelete = sc.nextLine().trim().split("\\s");
                    try {
                        repository.delete(new Human(dataDelete[0], dataDelete[1], dataDelete[2], dataDelete[3]));
                    } catch (SQLException e) {
                        log.error("Ошибка при работе с СУБД: " + e.getCause());
                    }
                    break;
                case "6":
                    System.out.print("Введите ID человека: ");
                    try {
                        repository.deleteById(Integer.parseInt(sc.nextLine().trim()));
                    } catch (SQLException e) {
                        log.error("Ошибка при работе с СУБД: " + e.getCause());
                    }
                    break;
                case "7":
                    try {
                        repository.deleteAll();
                    } catch (SQLException e) {
                        log.error("Ошибка при работе с СУБД: " + e.getCause());
                    }
                    break;
                case "8":
                    try {
                        System.out.println(repository.count());
                    } catch (SQLException e) {
                        log.error("Ошибка при работе с СУБД: " + e.getCause());
                    }
                    break;
                case "exit":
                    flag = false;
                    break;
                default:
                    System.out.println("Выберите корректное действие.");
                    break;
            }
        }
    }

    public static void main_menu() {
        System.out.println(
                "--------------------------------\n" +
                        "Выберите действие:\n" +
                        "1. Получить весь список\n" +
                        "2. Получить человека по ID\n" +
                        "3. Добавить человека в БД\n" +
                        "4. Обновить человека в БД\n" +
                        "5. Удалить человека по данным\n" +
                        "6. Удалить человека по ID\n" +
                        "7. Удалить всех людей из списка\n" +
                        "8. Получить количество людей в БД\n" +

                        "* Для выхода введите 'exit'\n" +
                        "--------------------------------");
    }

}
