package semaphore;

import java.util.concurrent.Semaphore;

public class WishBox {

    public static void main(String[] args) {
        //TODO: fair???
        Semaphore semaphore = new Semaphore(3);

        new Car(semaphore, "А060АС716");
        new Car(semaphore, "Е222КХ116");
        new Car(semaphore, "Y632UU009");
        new Car(semaphore, "L232FF119");
        new Car(semaphore, "K152UU029");
    }
}
