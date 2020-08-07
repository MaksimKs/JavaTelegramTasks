package com.gmail.ksenzhuk_maksim.lesson2;

/*Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив)*/

import java.util.concurrent.ThreadLocalRandom;

public class Task15 {
    public static void main(String[] args) {
        reverseArray(initAndFillRandomArray());
    }

    private static int[] initAndFillRandomArray() {
        int[] randomArray = new int[ThreadLocalRandom.current().nextInt(10, 16)];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 25);
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();
        return randomArray;
    }
    
    private static void reverseArray(int[] array){
        int temp;
        for (int i = 0; i < array.length/2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        for(int number : array) {
            System.out.print(number + " ");
        }
    }
}
