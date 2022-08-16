package eggVsHen;

public class MainEggVsHen {
    public static void main(String[] args) {
        EggThread eggThread = new EggThread();
        HenThread henThread = new HenThread();

        System.out.println("Да начнется спор");
        eggThread.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("Тиранозавр Рекс");
        }

        henThread.start();
    }
}
