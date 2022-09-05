package lection;

import java.util.ArrayList;
import java.util.List;

public class NumbersProcessor {

    private final NumberToBooleanVector mapper;

    public NumbersProcessor(NumberToBooleanVector mapper) {
        this.mapper = mapper;
    }
    //10, 9, 5, 3
    //false, false, true, true
    public List<Boolean> convertToBooleanVector(List<Integer> numbers) {
        List<Boolean> result = new ArrayList<>();

        for (Integer integer : numbers) {
            result.add(mapper.map(integer));
        }

        return result;
    }
}
