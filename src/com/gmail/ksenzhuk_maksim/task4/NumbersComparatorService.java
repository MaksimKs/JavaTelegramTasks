package com.gmail.ksenzhuk_maksim.task4;

import java.util.Comparator;

class NumbersComparatorService implements Comparator<Integer> {

    @Override
    public int compare(Integer elOne, Integer elTwo) {
        return elOne.compareTo(elTwo);
    }
}
