package com.gmail.ksenzhuk_maksim.lesson2;

/* Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.*/

public class Task4 {
    public static void main (String [] arg) {
        int number = 0;
        reverseInputNumber(number);
    }
        static void reverseInputNumber(long number) {
        if (number == 0) {
            System.out.println(number);
            return;
        }
        StringBuilder stb = new StringBuilder();
            while (number > 0) {
                long n = number % 10;
                number /= 10;
                stb.append(n);
        }
            System.out.println(stb.toString());
    }
}
