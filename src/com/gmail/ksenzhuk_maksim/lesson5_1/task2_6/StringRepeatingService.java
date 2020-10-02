package com.gmail.ksenzhuk_maksim.lesson5_1.task2_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRepeatingService {

    private String paramForSearch = "default";
    private String simpleString = "We have Default string, with default param and default length and different register.";

    public String getParamForSearch() {
        return paramForSearch;
    }

    public String getSimpleString() {
        return simpleString;
    }

    public StringRepeatingService() {}

    public StringRepeatingService(String paramForSearch, String simpleString) {
            this.paramForSearch = paramForSearch;
            this.simpleString = simpleString;
    }

    int countRepeatingString (String paramForSearch, String simpleString) {
        int countOfRepeating = 0;
        if (ValidatorForInputString.validation(paramForSearch) &&
        ValidatorForInputString.validation(simpleString)) {
            Pattern pattern = Pattern.compile(paramForSearch, Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
            Matcher matcher = pattern.matcher(simpleString);
            while (matcher.find()) {
                countOfRepeating++;
            }
        }
        return countOfRepeating;
    }


}
