package attestation_1.entity;

/**
 * Класс пользователя.
 */
public class User {

    /**
     * Поле, которое учитывает ID пользователя при чтении из файла. После чтения из файла фиксируется максимальный ID
     * и далее при добавлении новых пользователей значение инкрементируется.
     */
    private static int ID = 0;

    private int id;

    private String name;

    private String lastName;

    private int age;

    private boolean working;

    public User(String name, String lastName, int age, boolean working) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.working = working;
    }

    private static void checkID(int id) {
        ID = Math.max(ID, id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        checkID(id);
    }

    public void setId() {
        this.id = ID + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", working=" + working +
                '}';
    }
}
