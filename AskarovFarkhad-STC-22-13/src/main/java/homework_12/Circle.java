package homework_12;

public class Circle extends Ellipse implements Moveable {

    public Circle(double x, double y) {
        super(x, y);
    }

    @Override
    void getPerimeter() {
        double P = 2 * getX() * Math.PI;
        double scale = Math.pow(10, 2);
        System.out.println("Периметр Circle - " + Math.ceil(P * scale) / scale);
    }

    @Override
    public void move(double x, double y) {
        this.setX(x);
        this.setY(y);
        System.out.print("Новый ");
        getPerimeter();
    }
}
