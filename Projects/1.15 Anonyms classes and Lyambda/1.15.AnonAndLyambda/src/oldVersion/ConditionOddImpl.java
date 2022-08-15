package oldVersion;

public class ConditionOddImpl implements Condition{
    @Override
    public boolean isOk(int number) {
        boolean result = number % 2 != 0;

        return result;
    }
}
