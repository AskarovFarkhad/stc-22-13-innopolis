package lection;

public class NumberUtil implements NumberToBooleanVector {

    public boolean isSimple(int number) {
        if (number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    //TODO: Что здесь происходит?
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return a;
    }

    @Override
    public boolean map(int number) {
        return isSimple(number);
    }
}
