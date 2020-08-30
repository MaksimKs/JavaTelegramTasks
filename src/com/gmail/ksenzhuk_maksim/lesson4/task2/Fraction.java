package com.gmail.ksenzhuk_maksim.lesson4.task2;

/*2)Реализовать методы сложения, вычитания, умножения и деления объектов (для
тех классов, объекты которых могут поддерживать арифметические действия).
Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей.
Создать массив/список/множество объектов и передать его в метод, который изменяет каждый элемент
массива с четным индексом путем добавления следующего за ним элемента.*/

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        if (numerator != 0) {
            this.numerator = numerator;
        } else System.out.println("input number shouldn't be a zero");
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else System.out.println("input number shouldn't by a zero");
    }

    @Override
    public String toString() {
        return "Fraction= numerator: " + numerator + ", denominator: " + denominator;
    }

}
