package com.gmail.ksenzhuk_maksim.lesson4.task3;

public class TriangleValidation {

    static boolean validationForAnyTriangle (double sideA, double sideB, double sideC) {
        boolean isPossibleToCreateATriangle = false;
        if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) {
            isPossibleToCreateATriangle = true;
        }
        return isPossibleToCreateATriangle;
    }

    static boolean validationForEquilateralTriangle (double sideA, double sideB, double sideC) {
        return  (sideA == sideB && sideB == sideC && sideA == sideC);
    }

    static boolean validationForIsoscelesTriangle (double sideA, double sideB, double sideC) {
        boolean case1 = (sideA == sideB && sideA != sideC);
        boolean case2 = (sideB == sideC && sideB != sideA);
        boolean case3 = (sideA == sideC && sideA != sideB);

        return (case1 || case2 || case3);
    }

    static boolean validationForRectangularTriangle (double sideA, double sideB, double sideC) {
        boolean case1 = Math.pow(sideA,2) == (Math.pow(sideB,2) + Math.pow(sideC,2));
        boolean case2 = Math.pow(sideB,2) == (Math.pow(sideA,2) + Math.pow(sideC,2));
        boolean case3 = Math.pow(sideC,2) == (Math.pow(sideA,2) + Math.pow(sideB,2));

        return (case1 || case2 || case3);
    }
}
