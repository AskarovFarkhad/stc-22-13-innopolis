package polymorphism;

public class SportCar extends Car {

    private boolean isTurbo;

    public SportCar(String brand, String model, boolean isTurbo) {
        //super() всегда вызывается в начале конструктора потомка
        super(brand, model);
        this.isTurbo = isTurbo;
    }

    public void drive() {
        //(ПЕРЕМЕННАЯ1 == ПЕРЕМЕННАЯ2) -> (true)|(false) - в скобках результатом сравнения будет true,
        //если обе переменные равны, или false - если они не равны
        //(ПЕРЕМЕННАЯ1 != ПЕРЕМЕННАЯ2) -> (true)|(false) - в скобках результатом сравнения будет true,
        //если переменные не равны, или false - если они равны
        //if(isTurbo) {}
        if (isTurbo == true) {
            System.out.println(getBrand() + " " + getModel() + ": МЫ ОЧЕНЬ БЫСТРО КУДА ТО ЛЕТИМ!!!!");
        } else {
            System.out.println(getBrand() + " " + getModel() + ": мы быстро едем!!!!");
        }
    }

    public void crash() {
        System.out.println("Мы разбились :С");
    }
}
