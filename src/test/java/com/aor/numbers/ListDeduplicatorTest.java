package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListDeduplicatorTest {

    private List<Integer> list;
    @BeforeEach
    public void setUp() throws Exception {
        list = Arrays.asList(1, 2, 4, 2, 5);}

    @Test
    public void deduplicate() {



        ListDeduplicator deduplicate= new ListDeduplicator();

        List<Integer> distinct = deduplicate.deduplicate(Arrays.asList(1,2,4,2));

        Assertions.assertEquals(Arrays.asList(1,2,4), distinct);
    }
}
