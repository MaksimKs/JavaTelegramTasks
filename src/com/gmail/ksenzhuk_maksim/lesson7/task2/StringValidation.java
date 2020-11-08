package com.gmail.ksenzhuk_maksim.lesson7.task2;

import java.util.Objects;

public class StringValidation {

    static boolean validation(String string) throws NullPointerException, NumberFormatException {
        boolean isInputValid = true;
        if (Objects.isNull(string)) {
            isInputValid = false;
            throw new NullPointerException("Input is null");
        } else if (string.isEmpty()) {
            isInputValid = false;
            throw new NumberFormatException("Input string is empty");
        }
        return isInputValid;
    }
}
