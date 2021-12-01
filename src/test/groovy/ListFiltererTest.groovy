import com.aor.numbers.DivisibleByFilter
import com.aor.numbers.ListAggregator
import com.aor.numbers.ListFilterer
import com.aor.numbers.PositiveFilter
import spock.lang.Specification

class ListFiltererSpecification extends Specification{
    def listDefault = List<Integer>

    def "filter pos"(){
        given:
        def expected = Arrays.asList(6,8)
        def PosFilter = new PositiveFilter()
        when:
        def MyFilter = new ListFilterer(PosFilter)
        def distinct = MyFilter.filter(Arrays.asList(0,-1,6,8,-5))
        then:
        expected == distinct
    }
    def "filter div"(){
        given:
        def expected = Arrays.asList(0,27,9,81)
        def DivFilter = new DivisibleByFilter(3)
        when:
        def MyFilter = new ListFilterer(DivFilter)
        def distinct = MyFilter.filter(Arrays.asList(0,1,27,9,-5,80,81))
        then:
        expected == distinct
    }
}