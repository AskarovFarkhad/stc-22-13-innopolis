package localClass;

import java.util.Random;

public class TestClass {

    public void printTestNumber() {
        class PrintNumber {
            void printNumber() {
                Random random = new Random();

                System.out.println(random.nextInt(1000));
            }
        }

        PrintNumber localClass = new PrintNumber();

        localClass.printNumber();
    }
}
