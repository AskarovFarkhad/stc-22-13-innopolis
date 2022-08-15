package example;

public class Human {
    //Поля классы -> состояние объекта
    private String name;
    private int age;
    //Конструктор. Если при создании объекта используется данный конструктор, то
    //у данного объекта будут проинициализированы все поля.
    public Human(String name, int age) {
        //this - это переменная, которая ссылается на только что созданный объект
        this.name = name;
        this.age = age;
    }
    //Геттер поля name
    public String getName() {
        return name;
    }
    //Сеттер поля name
    public void setName(String name) {
        this.name = name;
    }
    //Геттер поля age
    public int getAge() {
        return age;
    }
    //Сеттер поля age
    public void setAge(int age) {
        this.age = age;
    }

}
