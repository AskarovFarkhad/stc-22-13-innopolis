package homework_28;

import homework_28.entity.Human;
import homework_28.repository.impl.CrudRepositoryImpl;
import lombok.extern.slf4j.Slf4j;

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
                    Human getHuman = repository.getById(Integer.parseInt(sc.nextLine().trim()));
                    if (getHuman == null) log.error("Человека с таким ID не существует...");
                    System.out.println(getHuman);
                    break;
                case "3":
                    System.out.print("Введите данные человека в формате <Имя Фамилия Город Паспортные данные>: ");
                    String[] dataCreate = sc.nextLine().trim().split("\\s");
                    try {
                        if (repository.save(new Human(
                                dataCreate[0],
                                dataCreate[1],
                                dataCreate[2],
                                dataCreate[3])) == 1) {
                            log.info("Команда успешно выполнена!");
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        log.error("Данные не корректны.");
                    }
                    break;
                case "4":
                    System.out.print("Введите ID человека для обновления данных: ");
                    Human humanForUpdate = repository.getById(Integer.parseInt(sc.nextLine().trim()));

                    if (humanForUpdate == null) {
                        log.error("Человека с таким ID не существует...");
                        break;
                    }
                    log.info("Данные человека " + humanForUpdate + " будут обновлены...");

                    System.out.print("Введите новые данные человека в формате <Имя Фамилия Город Паспортные данные>: ");
                    String[] dataUpdate = sc.nextLine().trim().split("\\s");
                    try {
                        humanForUpdate.setName(dataUpdate[0]);
                        humanForUpdate.setLastName(dataUpdate[1]);
                        humanForUpdate.setCity(dataUpdate[2]);
                        humanForUpdate.setNumberPassport(dataUpdate[3]);

                        if (repository.update(humanForUpdate) == 1) {
                            log.info("Команда успешно выполнена!");
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        log.error("Данные не корректны.");
                    }
                    break;
                case "5":
                    System.out.print("Введите данные человека в формате <Имя Фамилия Город Паспортные данные>: ");
                    String[] dataDelete = sc.nextLine().trim().split("\\s");
                    try {
                        if (repository.delete(new Human(dataDelete[0], dataDelete[1], dataDelete[2], dataDelete[3])) > 0) {
                            log.info("Команда успешно выполнена!");
                        } else {
                            log.error("Данные не корректны.");
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        log.error("Данные не корректны.");
                    }
                    break;
                case "6":
                    System.out.print("Введите ID человека: ");
                    if (repository.deleteById(Integer.parseInt(sc.nextLine().trim())) == 1) {
                        log.info("Команда успешно выполнена!");
                    }
                    break;
                case "7":
                    repository.deleteAll();
                    log.info("Команда успешно выполнена!");
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

                        "* Для выхода введите 'exit'\n" +
                        "--------------------------------");
    }

}
