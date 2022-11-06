package com.aor.numbers

import spock.lang.Specification

class ListSorterTest2 extends Specification {
    def "It should sort a list"(List<Integer> list, List<Integer> sorted) {
        expect:
            list.sort().equals(sorted) == true
        where:
            list | sorted
            Arrays.asList(-1, -3, 5) | Arrays.asList(-3, -1, 5)
            Arrays.asList(9, 12, 10, 1) | Arrays.asList(1, 9, 10, 12)
    }
}
