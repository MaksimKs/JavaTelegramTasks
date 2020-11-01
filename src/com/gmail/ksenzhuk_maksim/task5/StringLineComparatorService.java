package com.gmail.ksenzhuk_maksim.task5;

import java.util.Comparator;

class StringLineComparatorService implements Comparator<String> {

    @Override
    public int compare(String firstString, String secondString) {
        return firstString.length() - secondString.length();
    }

}
