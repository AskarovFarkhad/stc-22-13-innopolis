package example;

//Класс, который имплементирует интерфейс Workable
//а значит он должен имплементировать все методы интерфейса Workable
public class NormalWork implements Workable {

    private String profession;

    public NormalWork(String profession) {
        this.profession = profession;
    }

    //Метод интерфейса Workable
    @Override
    public void work() {
        System.out.println(profession + " - это хорошая профессия, я рад что она у меня есть");
    }
}
