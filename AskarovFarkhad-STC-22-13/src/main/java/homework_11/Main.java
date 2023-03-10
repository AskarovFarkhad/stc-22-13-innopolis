package homework_11;

import homework_11.entity.Worker;
import homework_11.workers.BackendDeveloper;
import homework_11.workers.FrontedDeveloper;
import homework_11.workers.SoftwareTester;
import homework_11.workers.SystemAdministration;

import java.util.ArrayList;

/**
 * Наследование, Полиморфизм
 * <p>
 * Нужно создать класс Worker, с полями:
 * String name; // имя
 * String lastName; // фамилия
 * String profession; // профессия
 * <p>
 * Так же у класса Worker, есть два метода:
 * public void goToWork(); //Метод в котором описана работа. Метод, как минимум, должен выводить кто работает,
 * какая у него профессия и как он работает. Каждый потомок должен переопределить этот метод (каждая профессия работает по своему).
 * <p>
 * public void goToVacation(int days); //Метод в котором описан отпуск. На вход принимает количество дней отпуска.
 * Метод, как минимум, должен выводить кто уходит в отпуск, какая у него профессия и на сколько дней уходит в отпуск.
 * Каждый потомок должен переопределить этот метод (каждая профессия отдыхает по своему)
 * <p>
 * Нужно создать минимум четыре класса потомка (профессию выбирайте сами:)),
 * например - Программист, Тестировщик, СисАдмин, ДевОпс и.т.д.
 * <p>
 * В классе Main (в котором создаются объекты всех классов профессий) через полиморфизм вывести отпуск и работу каждого
 * объекта по аналогии с "машинами" на уроке.
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<Worker> workerList = new ArrayList<>();

        workerList.add(new BackendDeveloper("Обе-ван", "Кеноби"));
        workerList.add(new FrontedDeveloper("Фродо", "Беггинс"));
        workerList.add(new SystemAdministration("Гарри", "Поттер"));
        workerList.add(new SoftwareTester("Питер", "Паркер"));

        for (Worker worker : workerList) {
            worker.goToWork();
            worker.goToVacation((int) (5 + Math.random() * 30));
            System.out.println("*********************************************************************************");
        }
    }
}
