package com.aor.numbers

import spock.lang.Specification

class DivisibleByFilterTest2 extends Specification {
    private def filter

    def setup() {
        filter = new DivisibleByFilter(4)
    }

    def "Filter returns true when divisible and false otherwise"(int a, boolean expected) {
        expect:
            filter.accept(a) == expected
        where:
            a | expected
            4 | true
            2 | false
            13 | false
    }
}
