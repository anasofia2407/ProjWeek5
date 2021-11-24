package com.aor.numbers;

public class DivisibleByFilter implements GenericListFilter{
    private Integer n;
    DivisibleByFilter(Integer number){
        this.n=number;

    }
    @Override
    public boolean accept(Integer number) {
        if(number%n==0){
            return true;
        }
        return false;
    }
}