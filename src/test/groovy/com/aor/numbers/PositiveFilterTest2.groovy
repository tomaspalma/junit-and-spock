package com.aor.numbers

import spock.lang.Specification

class PositiveFilterTest2 extends Specification {
    private def filter

    def setup() {
        filter = new PositiveFilter()
    }

    def "Should accept positive numbers and rejected negative numbers"(int a, boolean expected) {
        expect:
            filter.accept(a) == expected
        where:
            a | expected
            2 | true
            9 | true
            121 | true
            -2 | false
            0 | false
    }
}
