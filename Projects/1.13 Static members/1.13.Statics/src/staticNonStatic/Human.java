package staticNonStatic;

public class Human {

    public static String rasa = "Chelovek";
    //Статический метод может обращаться только к статическим переменным.
    static void sayHello() {
        System.out.println(rasa);
    }
}
