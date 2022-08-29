package attestation_1.services;

import attestation_1.entity.User;
import attestation_1.repository.UsersRepositoryFileImpl;
import attestation_1.repository.impl.UsersRepositoryFile;

import java.io.*;
import java.util.Map;

/**
 * Класс для чтения из файла БД пользователей и последующее обновление при внесении изменений.
 */
public class FileConnect {

    private static File file;
    private static final UsersRepositoryFile usersRepository = UsersRepositoryFileImpl.getInstance();

    public static void setFile(File file) {
        FileConnect.file = file;
    }

    public static void fileRead() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.trim().split("\\|");

                User user = new User(
                        data[1],
                        data[2],
                        Integer.parseInt(data[3]),
                        data[4].equalsIgnoreCase("true"));

                user.setId(Integer.parseInt(data[0]));
                usersRepository.create(user);
            }
        } catch (IOException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Возникла ошибка при обновлении файла: " + e.getMessage());
        }
    }

    public static void fileUpdate(Map<Integer, User> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            users.keySet().forEach(key -> {
                try {
                    User user = users.get(key);
                    writer.write(String.format("%d|%s|%s|%d|%s\n",
                            key, user.getName(), user.getLastName(), user.getAge(), user.isWorking()));
                } catch (IOException e) {
                    System.out.println("Возникла ошибка при обновлении файла: " + e.getMessage());
                }
            });
        } catch (IOException e) {
            System.out.println("Возникла ошибка при обновлении файла: " + e.getMessage());
        }
    }
}
