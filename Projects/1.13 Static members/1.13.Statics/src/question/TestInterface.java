package question;

public interface TestInterface {
    default void testMethod() {
        System.out.println("Interface");
    }
}
