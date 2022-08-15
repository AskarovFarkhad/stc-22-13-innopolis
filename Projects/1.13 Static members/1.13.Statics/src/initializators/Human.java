package initializators;

public class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    //Инициализатор - нужен для присвоения значений по умолчанию
    {
        name = "Oleg";
    }

    public String getName() {
        return name;
    }
}
