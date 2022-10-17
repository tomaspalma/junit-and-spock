package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    private GenericListFilterer filterer_;

    public ListFilterer(GenericListFilterer filterer) {
        filterer_ = filterer;
    }

    public List<Integer> filter(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for(Integer i : list) {
            if(filterer_.accept(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
