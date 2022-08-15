package example;

public class Main {
    public static void main(String[] args) {
        NormalWork medBrat = new NormalWork("Мед. работник");
        NormalWork policeMan = new NormalWork("Полицейский");
        NormalWork teacher = new NormalWork("Учитель");

        NotNormalWork blogger = new NotNormalWork("Блоггер");
        NotNormalWork tiktoker = new NotNormalWork("Тиктокер");

        LaborExchanger laborExchanger = new LaborExchanger();

        laborExchanger.goToWork(medBrat);
        laborExchanger.goToWork(policeMan);
        laborExchanger.goToWork(teacher);

    }
}
