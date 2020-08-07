package com.gmail.ksenzhuk_maksim.lesson2;

/*Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера.*/


import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task14 {
    public static void main(String[] args) {
        findMaxMinAndIndexInArray(fillArrayWithMarks());
    }

    private static int [] fillArrayWithMarks() {
        //int [] arrayForMarks = {4,4,4,4,4,3,4,4};
        int [] arrayForMarks = new int[(ThreadLocalRandom.current().nextInt(5,10+1))];
        for (int i = 0; i < arrayForMarks.length; i++) {
            arrayForMarks[i] = ThreadLocalRandom.current().nextInt(1,10+1);
        }
        System.out.println(Arrays.toString(arrayForMarks));
        return arrayForMarks;
    }

    private static void findMaxMinAndIndexInArray (int [] array) {
        int maxIndex = 0;
        int maxMark = array[maxIndex];
        int minIndex = 0;
        int minMark = array[minIndex];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[minIndex]) {
                minIndex = i;
                minMark = array[i];
            } else if (array[i] > array[maxIndex]) {
                maxIndex = i;
                maxMark = array[i];
            }
        }
        System.out.printf("max mark - %d \nindex of max mark - %d \n" +
                            "min mark - %d \nindex of min mark - %d", maxMark,maxIndex,minMark,minIndex);
    }
}
