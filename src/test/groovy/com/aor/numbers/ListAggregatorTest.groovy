package com.aor.numbers

import spock.lang.Specification

class ListAggregatorTest2 extends Specification {
    private def list;

    def "Sum of some lists test - listAggregator.sum() test"(List<Integer> list, int sumResult) {
        given:
            def listAggregator = new ListAggregator();

        expect:
            listAggregator.sum(list) == sumResult;

        where:
            list | sumResult
            Arrays.asList(-1, -4, -5, -9) | -19
            Arrays.asList(1, 9, 1, 0, 5) | 16
            Arrays.asList(4, 4, 4, 4) | 16
    }

    def "Max of lists test - listAggregator.max()"(List<Integer> list, int expectedMax) {
        given:
            def listAggregator = new ListAggregator();

        expect:
            listAggregator.max(list) == expectedMax;

        where:
            list | expectedMax
            Arrays.asList(-1, -4, -9, 0, 15) | 15
            Arrays.asList(0, -1, -9, -12, -13) | 0
            Arrays.asList(-1, -9, -12) | -1
    }

     def "Min of lists test - listAggregator.min()"(List<Integer> list, int expectedMin) {
        given:
            def listAggregator = new ListAggregator();

        expect:
            listAggregator.min(list) == expectedMin;

        where:
            list | expectedMin
            Arrays.asList(-1, -4, -9, 0, 15) | -9
            Arrays.asList(0, -1, -9, -12, -13) | -13
            Arrays.asList(-1, -9, -12) | -12
            Arrays.asList(1, 9, 14, 15) | 1
    }

    def "Distinct of lists test - listAggregatorTest.distinct()"() {
        given:
            def listAggregator = new ListAggregator();
            def list1 = [1, -1, -18, 5, 5, 0, 9, -18];

        when:
            def deduplicatorStub = Mock(GenericListDeduplicator);
            deduplicatorStub.deduplicate(list1) >> Arrays.asList(1, -1, -18, 5, 0, 9);

        then:
            listAggregator.distinct(list1, deduplicatorStub) == 6
    }

}
