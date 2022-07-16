package oldVersion;

public class ConditionEvenImpl implements Condition{
    @Override
    public boolean isOk(int number) {
        boolean result = number % 2 == 0;

        return result; //return result = number % 2 == 0;
    }
}
