package lection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
class NumberUtilTest {

    private final NumberUtil numberUtil = new NumberUtil();

    @Nested
    class TestIsSimple {
        @ParameterizedTest(name = "return <true> on {0}")
        @ValueSource(ints = {2, 3, 13, 17, 19, 31})
        @DisplayName("Тест простых чисел")
        public void test_on_simples(int number) {
            assertTrue(numberUtil.isSimple(number));
        }

        @ParameterizedTest(name = "return <false> on {0}")
        @ValueSource(ints = {15, 9, 36, 64})
        @DisplayName("Tecт не простых чисел")
        public void test_on_not_simples(int number) {
            assertFalse(numberUtil.isSimple(number));
        }

        @ParameterizedTest(name = "return <false> on {0}")
        @ArgumentsSource(value = NumberProvider.class)
        @DisplayName("Тест составных чисел")
        public void test_composite_random_numbers(int number) {
            assertFalse(numberUtil.isSimple(number));
        }
    }

    @Nested
    class TestGcd {
        @ParameterizedTest(name = "for numbers {0} and {1} result - {2}")
        @CsvSource(value = {"9, 12, 3", "18, 12, 6", "16, 48, 16"})
        @DisplayName("Тест наибольшего делителя")
        public void testGcd(int a, int b, int expected) {
            assertEquals(expected, numberUtil.gcd(a, b));
        }
    }
}