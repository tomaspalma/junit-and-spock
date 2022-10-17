package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListFiltererTest {
    private List<Integer> numbersList;

    @BeforeEach
    public void generateList() {
        if(numbersList.isEmpty()) {
            numbersList = Arrays.asList(1, -9, -14, 2, -3, 4, 11);
        }
    }

    @Test
    public void filterByDivisible() {

    }

}
