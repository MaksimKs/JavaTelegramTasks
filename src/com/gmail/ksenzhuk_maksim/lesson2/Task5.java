package com.gmail.ksenzhuk_maksim.lesson2;

/*
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
* */

public class Task5 {
    public static void main(String[] args) {
        long number = 1623456718;
        int counter = 0;
        char[] charsArray = String.valueOf(number).toCharArray();
        boolean trigger = false;
        for (int i = 0; i < charsArray.length; i++) {
            for (int j = i + 1; j < charsArray.length; j++) {
                if (charsArray[i] == charsArray[j]) {
                    trigger = true;
                    counter++;
                }
            }
        }
        if (trigger) {
            System.out.println("Some of the digits in " + number + " are equal");
            System.out.println(counter);
        } else
            System.out.println("All digits are different");
    }
}
