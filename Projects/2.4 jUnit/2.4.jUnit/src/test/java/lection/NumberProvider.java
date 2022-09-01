package lection;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class NumberProvider implements ArgumentsProvider {

    private static final int NUMBERS_COUNT = 10;

    private static final int HIGH = 100;

    private static final int LOW = 4;

    private final Random random = new Random();

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        List<Arguments> arguments = new ArrayList<>();

        for (int i = 0; i < NUMBERS_COUNT; i++) {
            int first = LOW + random.nextInt(HIGH);
            int second = LOW + random.nextInt(HIGH);
            int result = first * second;
            arguments.add(Arguments.of(result));
        }

        return arguments.stream();
    }
}
