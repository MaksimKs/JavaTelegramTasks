package com.gmail.ksenzhuk_maksim.lesson7.task1;

import java.util.Objects;

class Validation {

    static String inputValidation(String inputString) throws NumberFormatException, NullPointerException {
        if (Objects.isNull(inputString)) {
            throw new NullPointerException("One of input param: \'title; duration; genre; director\' is null");
        } else if (inputString.isEmpty()) {
            throw new NumberFormatException("One of input param: \'title; duration; genre; director\' is empty");
        } else return inputString;
    }
}
