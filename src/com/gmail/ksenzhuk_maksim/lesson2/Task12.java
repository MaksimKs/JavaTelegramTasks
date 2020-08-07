package com.gmail.ksenzhuk_maksim.lesson2;

/*Найдите сумму первых n целых чисел, которые делятся на 3*/

public class Task12 {
    public static void main(String[] args) {
//        int randomAmount = (int)(Math.random()*15);
        int randomAmount = 3;
        System.out.println("random number for counting is " + randomAmount);
        int counter = 0;
        int sum = 0;
        for (int i = 3; counter < randomAmount; i += 3) {
            if (i % 3 == 0) {
                counter++;
                sum += i;
            }
        }
        System.out.println("sum of all numbers which can divide by \'3\' = " + sum);
    }
}
