package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivisibleByFilterTest {
   @Test
   public void someDivisibleOthersNot() {
        GenericListFilterer divisibleFilter = new DivisibleByFilter(2);
        List<Integer> testSubject = Arrays.asList(1, -4, -3, 5, 10, 11);
        List<Boolean> expected = Arrays.asList(false, true, false, false, true, false), result = new ArrayList<>();

        for(Integer number : testSubject) {
            if(divisibleFilter.accept(number)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        Assertions.assertEquals(expected, result);
    }
}
