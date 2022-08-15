package example;

public class Main {
    public static void main(String[] args) {
        //Массив типа Human
        //После инициализации массива на всех индексах лежит null
        Human[] humans = new Human[10];

        //Заполняем массив людьми
        for (int i = 0; i < humans.length; i++) {
            humans[i] = new Human("Human" + i, i);
        }
        //Результат работы метода .findHuman кладем в объектную переменную типа Human
        Human human = findHuman("Human4", humans);

        //Выводим возраст человека, которого нашли
        System.out.println(human.getAge());
    }

    //Метод, который ищет человека по имени
    public static Human findHuman(String name, Human[] humans) {
        //На каждой итерации сравниваем имя текущего человека
        // с именем человека, которое передали в метод
        for (int i = 0; i < humans.length; i++) {
            //Если имя совпало - возвращаем этого человека в место, где был вызван метод
            if (humans[i].getName().equals(name)) {
                return humans[i];
            }
        }
        //Если не нашли, то возвращаем null
        System.out.println("Не нашли");
        return null;
    }
}
