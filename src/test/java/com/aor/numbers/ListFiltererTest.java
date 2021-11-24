package com.aor.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ListFiltererTest {
    private List<Integer> list;
    @BeforeEach
    public void setUp() throws Exception {
        list = Arrays.asList(0, 2, 4, 2, 5);}

    @Test
    public void filter() {



        GenericListFilter filterer = new PositiveFilter();
        ListFilterer filterer1= new ListFilterer(filterer);
        List<Integer> distinct = filterer1.filter(Arrays.asList(0,-1,6,8,-5));
        Assertions.assertEquals(Arrays.asList(6,8), distinct);

        GenericListFilter filterer2 = new DivisibleByFilter(3);
        ListFilterer filterer3= new ListFilterer(filterer2);
        List<Integer> distinct1 = filterer3.filter(Arrays.asList(0,1,27,9,-5,80,81));
        Assertions.assertEquals(Arrays.asList(0,27,9,81), distinct1);


    }
}
