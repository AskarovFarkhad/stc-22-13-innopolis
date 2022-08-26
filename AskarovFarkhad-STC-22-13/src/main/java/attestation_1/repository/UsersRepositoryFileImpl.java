package attestation_1.repository;

import attestation_1.entity.User;
import attestation_1.exception.NotFoundUserException;
import attestation_1.repository.impl.UsersRepositoryFile;
import attestation_1.services.FileConnect;

import java.util.HashMap;
import java.util.Scanner;

public class UsersRepositoryFileImpl implements UsersRepositoryFile {

    private static UsersRepositoryFileImpl instance;
    private final HashMap<Integer, User> users = new HashMap<>();
    private final Scanner sc = new Scanner(System.in);

    private UsersRepositoryFileImpl() {
    }

    public static UsersRepositoryFileImpl getInstance() {
        if (instance == null) instance = new UsersRepositoryFileImpl();
        return instance;
    }

    @Override
    public User select(int id) throws NotFoundUserException {
        if (users.containsKey(id))
            return users.get(id);
        else throw new NotFoundUserException();
    }

    @Override
    public void create(User user) {
        users.put(user.getId(), user);
        FileConnect.fileUpdate(users);
        System.out.println(" *** Пользователь успешно добавлен *** \n");
    }

    @Override
    public void update(Integer id) throws NotFoundUserException {
        if (users.containsKey(id)) {
            System.out.println("Введите новые данные в формате Имя Фамилия Возраст (Работает или нет? Да/Нет): ");
            String[] data = sc.nextLine().trim().split("\\s");

            User user = users.get(id);
            try {
                user.setName(data[0]);
                user.setLastName(data[1]);
                user.setAge(Integer.parseInt(data[2]));
                user.setWorking(data[3].equalsIgnoreCase("Да"));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.println("Вы ввели некорректные данные...\n");
            }

            users.put(user.getId(), user);
            FileConnect.fileUpdate(users);
            System.out.println(" *** Пользователь " + user + " обновлён! *** \n");
        } else throw new NotFoundUserException();
    }

    @Override
    public void delete(int id) throws NotFoundUserException {
        if (users.containsKey(id)) {
            User user = users.get(id);
            users.remove(id);
            FileConnect.fileUpdate(users);
            System.out.println(" *** Пользователь " + user + " успешно удалён! *** \n");
        } else throw new NotFoundUserException();
    }
}
