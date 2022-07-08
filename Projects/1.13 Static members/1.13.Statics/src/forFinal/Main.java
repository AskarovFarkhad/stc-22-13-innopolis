package forFinal;

public class Main {

    public static final int NUMBER = 102;

    public static void main(String[] args) {
        //System.out.println(NUMBER);
        //System.out.println(NUMBER + 102);
//
        TestClass testClass = new TestClass(new Human("Oleg"));
        //AnotherTestClass anotherTestClass = new AnotherTestClass();
//
        //testClass.sayHello();
        //anotherTestClass.anotherSayHello();

        System.out.println(testClass.getHuman().getName());
        testClass.getHuman().setName("Igor");
        System.out.println(testClass.getHuman().getName());
    }
}
