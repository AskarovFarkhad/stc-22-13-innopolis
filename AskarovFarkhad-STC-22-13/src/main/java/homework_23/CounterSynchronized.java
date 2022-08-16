package homework_23;

public class CounterSynchronized {

    private Integer count;

    public CounterSynchronized() {
        this.count = 1;
    }

    public synchronized Integer getCount() {
        return this.count++;
    }
}
