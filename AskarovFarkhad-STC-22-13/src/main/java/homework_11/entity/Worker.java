package homework_11.entity;

public class Worker {
    private String name;
    private String lastName;

    public Worker(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void goToWork() {
        System.out.println(name + " " + lastName + " работает в профессии: ");
    }

    public void goToVacation(int days) {
        System.out.println(name + " " + lastName + " уходит в отпуск на " + days + " дней!");
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

}
