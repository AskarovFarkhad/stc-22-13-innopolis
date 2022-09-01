package lection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(value = DisplayNameGenerator.ReplaceUnderscores.class)
@ExtendWith(MockitoExtension.class)
class NumbersProcessorTest {

    private NumbersProcessor numbersProcessor;

    @Mock
    private NumberToBooleanVector mapper;

    private static final List<Boolean> EXPECTED = Arrays.asList(true, true, false, true, false);


    @BeforeEach
    public void setUp() {
        when(mapper.map(3)).thenReturn(true);
        when(mapper.map(7)).thenReturn(true);
        when(mapper.map(15)).thenReturn(false);
        when(mapper.map(11)).thenReturn(true);
        when(mapper.map(21)).thenReturn(false);

        numbersProcessor = new NumbersProcessor(mapper);
    }

    @ParameterizedTest
    @MethodSource(value = "correctNumbers")
    public void map_on_correct_number(List<Integer> numbers) {
        assertEquals(EXPECTED, numbersProcessor.convertToBooleanVector(numbers));
    }

    public static Stream<List<Integer>> correctNumbers() {
        return Stream.of(Arrays.asList(3, 7, 15, 11, 21));
    }
}