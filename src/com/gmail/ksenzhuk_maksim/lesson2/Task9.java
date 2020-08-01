package com.gmail.ksenzhuk_maksim.lesson2;

/* Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
произведение, т.е. факториал числа.*/

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Task9 {
    public static void main(String[] args) {
        factorial((int)(Math.random()*20));
    }

    private static void factorial(int numberForFactorial) {
        int counter = numberForFactorial;
        long factorial = 1;

        DecimalFormat grouped = new DecimalFormat();
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(' ');
        grouped.setDecimalFormatSymbols(decimalFormatSymbols);

        if (numberForFactorial > 1) {
            while (counter != 0) {
                factorial *= counter;
                counter--;
            }
            System.out.printf("Factorial of %d is %s", numberForFactorial, grouped.format(factorial));
        } else if (numberForFactorial == 0 || numberForFactorial == 1) {
            System.out.printf("Factorial of %d is = 1", numberForFactorial);
        }
    }
}