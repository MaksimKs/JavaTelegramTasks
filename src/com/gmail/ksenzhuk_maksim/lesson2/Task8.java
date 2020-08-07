package com.gmail.ksenzhuk_maksim.lesson2;

/*Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.*/

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        rubles(randomNumber);
    }

    static void rubles(long randomNumber) {
        if (randomNumber % 100 >= 11 && randomNumber % 100 <= 15) {
            System.out.println(randomNumber + " рублей");
        } else if (randomNumber % 10 == 1) {
            System.out.println(randomNumber + " рубль");
        } else if (randomNumber % 10 >= 2 && randomNumber % 10 <= 4) {
            System.out.println(randomNumber + " рубля");
        } else System.out.println(randomNumber + " рублей");
    }
}
