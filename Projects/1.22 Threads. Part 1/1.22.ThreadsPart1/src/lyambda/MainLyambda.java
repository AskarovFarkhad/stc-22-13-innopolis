package lyambda;

public class MainLyambda {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Мы находимся в потоке - " + Thread.currentThread().getName());
            }
        }, "Мишка Гамми");

        thread.start();
    }
}
