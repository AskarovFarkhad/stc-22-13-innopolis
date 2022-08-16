package homework_23;

import java.beans.IntrospectionException;

public class CounterObjectMethods {

    private Integer count;

    public CounterObjectMethods() {
        this.count = 1;
    }

    public void initCount() {
        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println("Error: " + e.getMessage());
        }
        this.count++;
        notify();
    }

    public Integer getCount() {
        return this.count;
    }
}
