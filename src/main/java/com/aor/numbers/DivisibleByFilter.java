package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilterer {
    public DivisibleByFilter(Integer number) {
        number_ = number;
    }

    @Override
    public boolean accept(Integer number) {
       return number % number_ == 0;
    }

    private Integer number_;
}
