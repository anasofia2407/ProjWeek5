import com.aor.numbers.ListAggregator
import com.aor.numbers.ListDeduplicator
import spock.lang.Specification

class ListDeduplicatorTest extends Specification{
    private List<Integer> list;
    def setup(){
        list = Arrays.asList(1, 2, 4, 2, 5);
    }
    def "duplicate"(){
        given:
        ListDeduplicator deduplicate= new ListDeduplicator();
        when:
        List<Integer> distinct = deduplicate.deduplicate(Arrays.asList(1,2,4,2));
        then:
        distinct == Arrays.asList(1,2,4)
    }

}
