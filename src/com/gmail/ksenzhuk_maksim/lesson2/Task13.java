package com.gmail.ksenzhuk_maksim.lesson2;

/*Создать последовательность случайных чисел, найти и вывести наибольшее
из них.*/

import java.util.Arrays;
import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int [][] tempArray = findMaxNumberInArray(creatingNewArray());
        System.out.printf("max number from randoms numbers is %d \n", tempArray[0][0]);
        System.out.printf("index of max number from randoms %d", tempArray[1][0]);
    }

    private static int [] creatingNewArray() {
        Random random = new Random();
        int [] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    private static int [][] findMaxNumberInArray(int [] array) {
        int [][] arrayForNumberAndIndex = new int[2][1];
        int maxNumberInArray = array[0];
        int indexOfMaxNumber = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxNumberInArray) {
                maxNumberInArray = array[i];
                indexOfMaxNumber = i;
            }
        }
        arrayForNumberAndIndex[0][0] = maxNumberInArray;
        arrayForNumberAndIndex[1][0] = indexOfMaxNumber;

        return arrayForNumberAndIndex;
    }
}
