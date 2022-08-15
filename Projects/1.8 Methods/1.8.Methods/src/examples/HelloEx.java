package examples;

public class HelloEx {
    public static void main(String[] args) {
        printHello();
    }
    //Если у метода (подпрограммы) есть слово void (которое переводится как "пустота")
    //То это процедура, все остальное - это функция
    public static void printHello() {
        System.out.println("Hi all");
    }
}
