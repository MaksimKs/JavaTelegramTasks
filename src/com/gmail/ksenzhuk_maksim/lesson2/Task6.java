package com.gmail.ksenzhuk_maksim.lesson2;

/* Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.*/

public class Task6 {
    public static void main(String[] args) {
        int number = 128;
        int temp = number;

        int counter = 0;

        while (temp > 0) {
            int n = temp % 10;
            temp /= 10;
            counter++;
        }

        if (counter == 3) {
            System.out.println("This number " + number + " is three-digit.");
        }

        int lastDigitOfNumber = number % 10;
        if (lastDigitOfNumber == 7) {
            System.out.println("Last digit in " + number + " is 7.");
        }

        if (number % 2 == 0) {
            System.out.println(number + " is even number.");
        } else System.out.println(number + " is odd number.");
    }
}
