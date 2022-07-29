package homework_16;

import java.util.Objects;

/**
 * Создать класс **Human** у которого будут поля:
 * private String name;
 * private String lastName;
 * private String patronymic;
 * private String city;
 * private String street;
 * private String house;
 * private String flat;
 * private String numberPassport;
 *
 * Переопределить три метода: **toString()**, **hashCode()**, **equals**
 *
 * Метод **toString** должен выводить информацию таким образом (пример):
 * Пупкин Вася Варфаламеевич \
 * Паспорт:\
 * Серия: 9822 Номер: 897643\
 * Город Джава, ул. Программистов, дом 15, квартира 54
 *
 * Метод **equals()** должен сравнивать людей по номеру паспорта
 */
public class Human {

    private final String name;
    private final String lastName;
    private final String patronymic;
    private String city;
    private String street;
    private String house;
    private String flat;
    private final String numberPassport;

    public Human(String name,
                 String lastName,
                 String patronymic,
                 String city,
                 String street,
                 String house,
                 String flat,
                 String numberPassport) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
        this.numberPassport = numberPassport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return numberPassport.equals(human.numberPassport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberPassport);
    }

    @Override
    public String toString() {
        return "Данные человека:\n" + lastName + " " + name + " " + patronymic + "\n" +
                "Паспортные данные: " + "серия - " + numberPassport.substring(0, 4) + ", номер - " +
                numberPassport.substring(4, 10) + "\n" +
                "Адрес: г. " + city + ", ул. " + street + ", д. " + house + ", кв. " + flat + "\n";
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getFlat() {
        return flat;
    }

    public String getNumberPassport() {
        return numberPassport;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}
