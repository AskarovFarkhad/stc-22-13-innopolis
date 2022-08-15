package polymorphism;

public class OffRoadCar extends Car{

    private String brand;
    private String model;
    private boolean isFullWheel;

    public OffRoadCar(String brand, String model, boolean isFullWheel) {
        this.brand = brand;
        this.model = model;
        this.isFullWheel = isFullWheel;
    }

    public void drive() {
        if (isFullWheel) {
            System.out.println(brand + " " + model + ": нам море по колено");
        } else {
            System.out.println(brand + " " + model + ": мы - паркетник:С");
        }
    }
}
