package singleton;

public class Singleton {
    //volatile - Отключает кэширование у поля. Т.е. оно становится общим для всех потоков.
    private static volatile Singleton instance;
    private String message;

    private Singleton(String message) {
        this.message = message;
    }

    public static Singleton getInstance(String message) {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(message);
            }
            return instance;
        }
    }

    public String getMessage() {
        return message;
    }
}
