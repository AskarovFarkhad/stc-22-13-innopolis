package homework_12;

public class Ellipse extends Figure {

    public Ellipse(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    @Override
    void getPerimeter() {
        double P = 4 * (Math.PI * getX() * getY() + (getX() - getY())) / (getX() + getY());
        double scale = Math.pow(10, 2);
        System.out.println("Периметр Ellipse - " + Math.ceil(P * scale) / scale);
    }
}
