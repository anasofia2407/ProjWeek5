package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import sun.jvm.hotspot.code.Stub;

import java.util.Arrays;
import java.util.List;
import static org.mockito.Mockito.*;


public class ListAggregatorTest {
    private List<Integer> list;
    private List<Integer> list4;
    private List<Integer> list5;
    @BeforeEach
    public void setUp() throws Exception {
        list = Arrays.asList(1, 2, 4, 2, 5);
        list4= Arrays.asList(-1,-4,-5);
        list5= Arrays.asList(1,2,4,2);
    }
    @Test
    public void sum() {

        ListAggregator aggregator = new ListAggregator();
        int sum = aggregator.sum(list);

        Assertions.assertEquals(14, sum);
    }

    @Test
    public void max() {


        ListAggregator aggregator = new ListAggregator();
        int max = aggregator.max(list);
        int max1 = aggregator.max(list4);

        Assertions.assertEquals(5, max);
        Assertions.assertEquals(-1, max1);
    }

    @Test
    public void min() {


        ListAggregator aggregator = new ListAggregator();
        int min = aggregator.min(list);

        Assertions.assertEquals(1, min);
    }

    @Test
    public void distinct() {

        ListAggregator aggregator = new ListAggregator();
        GenericListDeduplicator deduplicator = Mockito.mock(GenericListDeduplicator.class);
        Mockito.when(deduplicator.deduplicate(Mockito.anyList())).thenReturn(Arrays.asList(1, 2, 4));
        int distinct = aggregator.distinct(Arrays.asList(1, 2, 4, 2), deduplicator);
        Assertions.assertEquals(3, distinct);
    }

}
