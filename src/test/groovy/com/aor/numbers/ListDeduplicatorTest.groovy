package com.aor.numbers

import spock.lang.Specification

class ListDeduplicatorTest2 extends Specification {

    private def list1, list2;

    def setup() {
       list1 = Arrays.asList(1, 4, 1, 1, 1);
        list2 = Arrays.asList(-1, -1, 0, 5, 9, 12, 12);
    }

    def "Deduplicate of list test"() {
        given:
            def listDeduplicator = new ListDeduplicator();
        when:
            def sorterStub = Mock(GenericListSorter);
            sorterStub.sort(list1) >> Arrays.asList(1, 1, 1, 1, 4);
            sorterStub.sort(list2) >> Arrays.asList(-1, -1, 0, 5, 9, 12, 12);
        then:
            listDeduplicator.deduplicate(list1, sorterStub) == Arrays.asList(1, 4);
            listDeduplicator.deduplicate(list2, sorterStub) == Arrays.asList(-1, 0, 5, 9, 12);
    }

}
