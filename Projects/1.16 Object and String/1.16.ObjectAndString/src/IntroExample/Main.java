package IntroExample;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();

        human.toString();

        Object[] objects = new Object[5];

        objects[0] = new Car();
        objects[1] = new AirPlane();
        objects[2] = new City();
        objects[3] = new Tank();
        objects[4] = new Human();

        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
