package com.aor.numbers;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {
    private GenericListFilter filter;
    public ListFilterer(GenericListFilter filter) {
        this.filter=filter;
    }

    public List<Integer> filter(List<Integer> list) {
        List<Integer> res=new ArrayList<Integer>();
        for (int i=0; i<list.size();i++){
            if(filter.accept(list.get(i))){
               res.add(list.get(i));
            }
        }
        return res;
    }
}
