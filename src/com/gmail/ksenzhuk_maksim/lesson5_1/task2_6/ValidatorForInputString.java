package com.gmail.ksenzhuk_maksim.lesson5_1.task2_6;

import java.util.Objects;

class ValidatorForInputString {
    static boolean validation(String inputString) {
        boolean isValid = true;
        if (Objects.isNull(inputString)) {
            System.out.println("Error: input parameters have null elements");
            return isValid = false;
        }
        if (inputString.isEmpty()) {
            System.out.println("Error: input parameters are empty");
            return isValid = false;
        }
        return isValid;
    }
}
