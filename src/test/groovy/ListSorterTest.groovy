import com.aor.numbers.ListAggregator
import com.aor.numbers.ListSorter
import spock.lang.Specification

class ListSorterTest extends Specification{
    private List<Integer> list;
    def setup(){
        list = Arrays.asList(3, 2, 6, 1, 4, 5, 7);
    }
    def "sort"(){
        given:
        ListSorter sorter = new ListSorter();
        when:
        def sorted = sorter.sort(list);
        then:
        sorted == Arrays.asList(1, 2, 3, 4, 5, 6, 7)
    }
}
