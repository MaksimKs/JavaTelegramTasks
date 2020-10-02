package com.gmail.ksenzhuk_maksim.lesson5_1.task2_6;

//напишите метод для посика самой длинной строки в массиве

import java.util.Arrays;
import java.util.Objects;

class LongestStringService {

    private String [] stringsArray;
    private String longestString = "";

    public String getLongestString() {
        return longestString;
    }

    @Override
    public String toString() {
        return "strings array: " + Arrays.toString(stringsArray);
    }

    public LongestStringService(String [] array) {
        if (array.length == 0) {
            System.out.println("Array hasn't any elements");
        } else if (!arrayValidator(array)) {
            this.stringsArray = array;
            longestString = findLongestString(stringsArray);
        }
    }

    private String findLongestString(String [] stringArray) {
        int indexOfLongestString = 0;
        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[i].length() > longestString.length()) {
                longestString = stringArray[i];
                indexOfLongestString = i;
            }
        }
        return longestString;
    }

    private boolean arrayValidator (String [] array) {
        boolean hasNull = false;
        for(int i = 0; i < array.length; i++) {
            if (Objects.isNull(array[i])) {
                hasNull = true;
                System.out.printf("Array has 'null' element, index of this el. is: %d \n", i);
            }
        }
        return hasNull;
    }

}
