package example;

//Трудовая биржа
public class LaborExchanger implements LaborExchangeInterface {

    //Метод принимает на вход только те объекты, чьи классы имплементируют
    //интерфейс Workable
    @Override
    public void goToWork(Workable workable) {
        System.out.println("Иди работать");
        workable.work();
    }
}
