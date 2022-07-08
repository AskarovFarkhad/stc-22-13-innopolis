package mySingleton;

//Паттерн - Singleton (Одиночка)
public final class MySingleton {

    //Делаем приватную статическую переменную типа MySingleton
    //которая будет хранить один единственный экземпляр класса
    private static MySingleton instance;
    public String message;

    //Обязательно делаем конструктор приватным, чтобы его нельзя
    //было вызвать вне класса
    private MySingleton(String message) {
        this.message = message;
    }

    //Статический метод, который возвращает объект класса MySingleton
    //Если метод вызывается в первый раз (объект MySingleton еще не создавался)
    //то метод создаст объект и вернет его
    //Если объект уже существует, то никакие новые объекты создаваться не будут
    //метод вернет уже существующий объект класса MySingleton
    public static MySingleton getInstance(String message) {
        if (instance == null) {
            instance = new MySingleton(message);
        }

        return instance;
    }
}
