package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositiveFilterTest {

    @Test
    public void someNegativeSomePositive() {
        PositiveFilter positiveFilter = new PositiveFilter();
        List<Integer> testSubject = Arrays.asList(1, -4, -3, 5, 10, 11);
        List<Boolean> expected = Arrays.asList(true, false, false, true, true, true), result = new ArrayList<>();

        for(Integer number : testSubject) {
            if(positiveFilter.accept(number)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        Assertions.assertEquals(expected, result);
    }
}
