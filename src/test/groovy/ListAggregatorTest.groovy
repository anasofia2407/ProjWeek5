import com.aor.numbers.GenericListDeduplicator
import com.aor.numbers.ListAggregator
import spock.lang.Specification

class ListAggregatorTest extends Specification {
    private List<Integer> list;
    private List<Integer> list4;
    private List<Integer> list5;
    def setup(){
        list = Arrays.asList(1, 2, 4, 2, 5);
        list4= Arrays.asList(-1,-4,-5);
        list5= Arrays.asList(1,2,4,2);

    }

    def "soma"(){
        given:
        ListAggregator aggregator = new ListAggregator();
        when:
        int sum = aggregator.sum(list);
        then:
        sum == 14
    }

    def "max"(){
        given:
        ListAggregator aggregator = new ListAggregator();
        when:
        int max = aggregator.max(list);
        int max1 = aggregator.max(list4);
        then:
        max == 5
        max1==-1

    }
    def "min"(){
        given:
        ListAggregator aggregator = new ListAggregator();
        when:
        int min = aggregator.min(list);
        then:
        min == 1

    }
    def "distinct"(){
        given:
        ListAggregator aggregator = new ListAggregator();
        def deduplicator = Mock(GenericListDeduplicator)
        deduplicator.deduplicate(Arrays.asList(1, 2, 4, 2)) >> Arrays.asList(1, 2, 4)
        when:
        def result = aggregator.distinct(Arrays.asList(1, 2, 4, 2),deduplicator)
        then:
        result == 3
    }
}
