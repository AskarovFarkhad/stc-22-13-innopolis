package homework_11.workers;

import homework_11.entity.Profession;
import homework_11.entity.Worker;

public class FrontedDeveloper extends Worker {

    private final Profession profession = Profession.FRONTDEV;

    public FrontedDeveloper(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public void goToWork() {
        System.out.println(getLastName() + " " + getName() + " занимает должность " + profession + ".");
    }

    @Override
    public void goToVacation(int days) {
        System.out.println(profession + ": " + getLastName() + " " + getName() + ". Уходит в отпуск на " + days + " дней.");
    }
}
