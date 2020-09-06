package com.gmail.ksenzhuk_maksim.lesson4.task2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class FractionService {

    double addition(Fraction fraction) {
        double numerator = fraction.getNumerator() * fraction.getNumerator();
        return numerator / fraction.getDenominator() + numerator / fraction.getDenominator();
    }

    double subtract(Fraction fraction) {
        double numerator = fraction.getNumerator() * fraction.getNumerator();
        return numerator / fraction.getDenominator() - fraction.getDenominator();
    }

    double multiply(Fraction fraction) {
        double numerator = fraction.getNumerator() * fraction.getNumerator();
        return (numerator / fraction.getDenominator()) * (numerator / fraction.getDenominator());
    }

    double divide(Fraction fraction) {
        double numerator = fraction.getNumerator() * fraction.getNumerator();
        return (numerator / fraction.getDenominator()) / (numerator / fraction.getDenominator());
    }

    Fraction[] createAndFillArrayWithFractions() {
        int arrayLength = ThreadLocalRandom.current().nextInt(5, 6);
        Fraction[] arrayWithFractions = new Fraction[arrayLength];
        for (int i = 0; i < arrayWithFractions.length; i++) {
            int randomNumerator = (int) (Math.random() * 20 + 1);
            int randomDenominator = (int) (Math.random() * 25 + 1);
            arrayWithFractions[i] = new Fraction(randomNumerator, randomDenominator);
        }
        return arrayWithFractions;
    }

    Fraction[] changeEvenElementsInArray(Fraction[] fractions) {
        Fraction[] arrayForChangeEvenElement = fractions.clone();
        for (int i = 0; i < arrayForChangeEvenElement.length; i += 2) {
            if (i + 1 < arrayForChangeEvenElement.length) {
                arrayForChangeEvenElement[i].setNumerator(arrayForChangeEvenElement[i].getNumerator() + arrayForChangeEvenElement[i + 1].getNumerator());
                arrayForChangeEvenElement[i].setDenominator(arrayForChangeEvenElement[i].getDenominator() + arrayForChangeEvenElement[i + 1].getDenominator());
            }
        }
        return arrayForChangeEvenElement;
    }

    void printArrayWithFractions(Fraction[] fractions) {
        Arrays.stream(fractions).forEach(System.out::println);
        /*for(Fraction fraction:fractions) {
            System.out.println(fraction.toString());
        }*/
    }
}