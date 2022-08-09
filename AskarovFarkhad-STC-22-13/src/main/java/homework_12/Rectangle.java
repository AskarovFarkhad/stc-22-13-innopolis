package homework_12;

public class Rectangle extends Figure {

    public Rectangle(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    void getPerimeter() {
        double P = 2 * ((getX() * 2) + (getY() * 2));
        double scale = Math.pow(10, 2);
        System.out.println("Периметр Rectangle - " + Math.ceil(P * scale) / scale);
    }
}
