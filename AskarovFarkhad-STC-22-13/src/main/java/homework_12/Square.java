package homework_12;

public class Square extends Rectangle implements Moveable {

    public Square(double x, double y) {
        super(x, y);
    }

    @Override
    void getPerimeter() {
        double P = 2 * ((getX() * 2) + (getY() * 2));
        double scale = Math.pow(10, 2);
        System.out.println("Периметр Square - " + Math.ceil(P * scale) / scale);
    }

    @Override
    public void move(double x, double y) {
        this.setX(x);
        this.setY(y);
        System.out.print("Новый ");
        getPerimeter();
    }
}
