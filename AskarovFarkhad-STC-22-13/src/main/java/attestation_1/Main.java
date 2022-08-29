package attestation_1;

import attestation_1.entity.User;
import attestation_1.exception.NotFoundUserException;
import attestation_1.repository.UsersRepositoryFileImpl;
import attestation_1.repository.impl.UsersRepositoryFile;
import attestation_1.services.FileConnect;

import java.io.File;
import java.util.Scanner;

public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final UsersRepositoryFile usersRepository = UsersRepositoryFileImpl.getInstance();

    public static void main(String[] args) {

        boolean flag = true;

        System.out.println("Введите адрес файла для работы с данными пользователей: ");
        FileConnect.setFile(new File(sc.nextLine().trim()));
        FileConnect.fileRead();

        while (flag) {
            main_menu();
            switch (sc.nextLine().trim()) {
                case "1":
                    System.out.print("Введите ID пользователя: ");
                    try {
                        System.out.println(usersRepository.select(Integer.parseInt(sc.nextLine().trim())));
                    } catch (NotFoundUserException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "2":
                    System.out.print("Введите данные человека в формате Имя Фамилия Возраст (Работает или нет? Да/Нет): ");
                    String[] data = sc.nextLine().trim().split("\\s");
                    try {

                        User user = new User(
                                data[0],
                                data[1],
                                Integer.parseInt(data[2]),
                                data[3].equalsIgnoreCase("Да"));
                        user.setId();

                        usersRepository.create(user);
                    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                        System.out.println("Вы ввели некорректные данные...");
                    }
                    break;
                case "3":
                    System.out.print("Для обновления данных введите ID пользователя: ");
                    try {
                        usersRepository.update(Integer.parseInt(sc.nextLine().trim()));
                    } catch (NotFoundUserException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "4":
                    System.out.print("Введите ID пользователя: ");
                    try {
                        usersRepository.delete(Integer.parseInt(sc.nextLine().trim()));
                    } catch (NotFoundUserException e) {
                        System.out.println(e.getMessage());
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
                        "1. Поиск пользователя\n" +
                        "2. Добавить пользователя\n" +
                        "3. Обновить данные пользователя\n" +
                        "4. Удалить пользователя\n\n" +
                        "* Для выхода введите 'exit'\n" +
                        "--------------------------------");
    }
}
