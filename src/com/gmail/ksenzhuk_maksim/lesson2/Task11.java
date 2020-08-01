package com.gmail.ksenzhuk_maksim.lesson2;

/*Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя*/

public class Task11 {
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 100);
        if (randomNumber == 0) {
            System.out.printf("%d number is zero", randomNumber);
        } else checkForCompositeNumber(randomNumber);
    }

    private static void checkForCompositeNumber(int randomNumber) {
        boolean isPrimeNumber = true;
        if (randomNumber == 1 || randomNumber == 2 || randomNumber == 3) {
            isPrimeNumber = true;
        } else for (int i = 2; i <= (int)(Math.sqrt(randomNumber)); i++) {
            if (randomNumber % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        if (isPrimeNumber) {
            System.out.printf("%d is prime number", randomNumber);
        } else System.out.printf("%d is composite number", randomNumber);

    }
}
