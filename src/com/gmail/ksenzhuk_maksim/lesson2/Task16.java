package com.gmail.ksenzhuk_maksim.lesson2;

/*Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.*/

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task16 {
    public static void main(String[] args) {
        sumBetweenIndex(initRandomArray());
    }

    private static int[] initRandomArray() {
        int [] randomArray = new int[ThreadLocalRandom.current().nextInt(10, 16)];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(randomArray));
        return randomArray;
    }

    private static void sumBetweenIndex(int[] array) {
        int minIndex = 0;
        int minNumber = array[minIndex];
        int maxIndex = 0;
        int maxNumber = array[maxIndex];
        int amountBetweenMaxAndMinIndex = 0;
        int amountBetweenMinAndMaxIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxIndex = i;
                maxNumber = array[i];
            } else if (array[i] < minNumber) {
                minIndex = i;
                minNumber = array[i];
            }
        }
        System.out.printf("min index = %d, max index = %d, array length = %d\n", minIndex,maxIndex,array.length);
        if (maxIndex - minIndex > 1) {
            for (int j = minIndex + 1; j < maxIndex; j++) {
                amountBetweenMinAndMaxIndex += array[j];
            }
            System.out.println("Amount between min and max index = " +
                    amountBetweenMinAndMaxIndex);
        } else if (minIndex - maxIndex > 1) {
            for (int i = maxIndex + 1; i < minIndex; i++) {
                amountBetweenMaxAndMinIndex += array[i];
            }
            System.out.println("Amount between max and min index = " +
                    amountBetweenMaxAndMinIndex);
        } else System.out.println("These isn't any numbers between min&max or max&min index \namount = 0");
    }
}
