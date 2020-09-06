package com.gmail.ksenzhuk_maksim.lesson4.task2;
/*2)Реализовать методы сложения, вычитания, умножения и деления объектов (для
тех классов, объекты которых могут поддерживать арифметические действия).
Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей.
Создать массив/список/множество объектов и передать его в метод, который изменяет каждый элемент
массива с четным индексом путем добавления следующего за ним элемента.*/

public class MainFraction {
    public static void main (String [] args) {

        FractionService fractionService = new FractionService();
        Fraction fraction1 = new Fraction(3,7);
        Fraction fraction2 = new Fraction(10,4);
        Fraction fraction3 = new Fraction(11, 6);

        System.out.println(fraction1.toString());
        System.out.println("addition fraction: " + fractionService.addition(fraction1));
        System.out.println("subtract fraction: " + fractionService.subtract(fraction1));
        System.out.println("multiply fraction: " + fractionService.multiply(fraction1));
        System.out.println("divide fraction: " + fractionService.divide(fraction1));

        System.out.println("\n" + fraction2.toString());
        System.out.println("addition fraction: " + fractionService.addition(fraction2));
        System.out.println("subtract fraction: " + fractionService.subtract(fraction2));
        System.out.println("multiply fraction: " + fractionService.multiply(fraction2));
        System.out.println("divide fraction: " + fractionService.divide(fraction2));

        System.out.println("\n" + fraction3.toString());
        System.out.println("addition fraction: " + fractionService.addition(fraction3));
        System.out.println("subtract fraction: " + fractionService.subtract(fraction3));
        System.out.println("multiply fraction: " + fractionService.multiply(fraction3));
        System.out.println("divide fraction: " + fractionService.divide(fraction3));

        //init and print array with fractions
        System.out.println("\nprinting array with fractions:");
        Fraction [] tempArray = fractionService.createAndFillArrayWithFractions();
        fractionService.printArrayWithFractions(tempArray);

        System.out.println("\nprint array with changed even elements:");
        fractionService.printArrayWithFractions(fractionService.changeEvenElementsInArray(tempArray));

    }
}
