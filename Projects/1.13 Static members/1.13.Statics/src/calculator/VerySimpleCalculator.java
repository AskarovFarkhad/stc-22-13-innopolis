package calculator;

public class VerySimpleCalculator {

    private int[] numbers;

    public VerySimpleCalculator(int ... numbers) {
        this.numbers = numbers;
    }

    public int sumNumbers() {
        //result будет хранить результат суммы всех чисел
        int result = 0;

        for (int i = 0; i < numbers.length; i = i + 1) {
            result = result + numbers[i];
        }

        return result;
    }
}
