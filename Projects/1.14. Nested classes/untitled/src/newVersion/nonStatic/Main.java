package newVersion.nonStatic;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Daewoo",
                "Matiz",
                "Blue",
                true,
                210,
                4.5,
                "DaewooPower");

        Car audi = new Car("Audi",
                "A6",
                "Black",
                true,
                420,
                6.5,
                "AudiPower");

        System.out.println("Марка авто - " + car.getBrand());
        System.out.println("Модель авто - " + car.getModel());
        System.out.println("Цвет авто - " + car.getColor());
        System.out.println("Марка двигателя авто - " + car.getEngine().getBrandEngine());
        System.out.println("Мощность двигателя авто - " + car.getEngine().getPowerEngine());
        System.out.println("Объём двигателя авто - " + car.getEngine().getvEngine());
        System.out.println("АКПП? - " + car.isAutomatic());

        System.out.println("****************************************");
        System.out.println("Марка авто - " + audi.getBrand());
        System.out.println("Модель авто - " + audi.getModel());
        System.out.println("Цвет авто - " + audi.getColor());
        System.out.println("Марка двигателя авто - " + audi.getEngine().getBrandEngine());
        System.out.println("Мощность двигателя авто - " + audi.getEngine().getPowerEngine());
        System.out.println("Объём двигателя авто - " + audi.getEngine().getvEngine());
        System.out.println("АКПП? - " + audi.isAutomatic());


        System.out.println("****************************************");
        car.printInfoAboutEngine();
        audi.printInfoAboutEngine();

    }
}
