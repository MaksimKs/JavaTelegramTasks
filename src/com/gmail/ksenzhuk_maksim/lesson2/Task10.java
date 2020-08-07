package com.gmail.ksenzhuk_maksim.lesson2;

/*Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/

public class Task10 {
    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 10; i <= 15 ; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
