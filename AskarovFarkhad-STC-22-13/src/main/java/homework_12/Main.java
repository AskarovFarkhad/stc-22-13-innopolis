package homework_12;

import java.util.ArrayList;

/**
 * Абстрактные классы и интерфейсы
 * Сделать абстрактный класс Figure, у данного класса есть два поля - x и y координаты.
 * Классы Ellipse и Rectangle должны быть потомками класса Figure.
 * Класс Square - потомок класса Rectangle, Circle - потомок класса Ellipse.
 * В классе Figure предусмотреть абстрактный метод getPerimeter().
 * Так же, нужно определить интерфейс Moveable c единственным методом .move(int x, int y),
 * который позволит перемещать фигуру на заданные координаты.
 * Данный интерфейс должны реализовать только классы Circle и Square.
 * В Main создать массив всех фигур и "перемещаемых" фигур. У всех вывести в консоль периметр,
 * а у "перемещаемых" фигур изменить случайным образом координаты.
 */


public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> allFigure = new ArrayList<>();

        allFigure.add(new Ellipse(5.5, 4.0));
        allFigure.add(new Rectangle(5.5, 4.0));
        allFigure.add(new Square(4.0, 4.0));
        allFigure.add(new Circle(4.0, 4.0));

        for (Figure figure : allFigure) {
            figure.getPerimeter();

            if (figure instanceof Moveable) {
                ((Moveable) figure).move(0 + Math.random() * 30, 0 + Math.random() * 30);
            }
        }
    }
}
