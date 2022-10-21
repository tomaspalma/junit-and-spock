package com.aor.numbers;

import com.sun.org.apache.xpath.internal.operations.Div;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListFiltererTest {
    private List<Integer> numbersList = new ArrayList<>();

    @BeforeEach
    public void generateList() {
        if(numbersList.isEmpty()) {
            numbersList = Arrays.asList(1, -9, -14, 2, -3, 4, 11);
        }
    }

    @Test
    public void positiveByFilter() {
        PositiveFilter positiveFilter = new PositiveFilter();
        ListFilterer listFilterer = new ListFilterer(positiveFilter);
        List<Integer> result = listFilterer.filter(numbersList);

        Assertions.assertEquals(Arrays.asList(1, 2, 4, 11), result);

    }

    @Test
    public void divisibleByFilter() {
        DivisibleByFilter divisibleByFilter = new DivisibleByFilter(4);
        ListFilterer listFilterer = new ListFilterer(divisibleByFilter);
        List<Integer> result = listFilterer.filter(numbersList);

        Assertions.assertEquals(Arrays.asList(4), result);
    }

}
