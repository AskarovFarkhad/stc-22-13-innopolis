package newVersion.lyambda;

public interface Printable {

    //void print(String value1, String value2);
    //String print(String value1, String value2);
    String print();

    default void printNames(String name) {
        System.out.println("Hello, " + name);
    }
}
