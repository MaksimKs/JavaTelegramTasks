package com.gmail.ksenzhuk_maksim.lesson4.task3;

import static com.gmail.ksenzhuk_maksim.lesson4.task3.TriangleValidation.*;

class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double sideA, double sideB, double sideC) {
        if (validationForAnyTriangle(sideA, sideB, sideC) &&
                validationForEquilateralTriangle(sideA, sideB, sideC)) {
                setSideA(sideA);
                setSideB(sideB);
                setSideC(sideC);
        } else System.out.printf(
                "It's impossible to create equilateral triangle with such sides: %.2f, %.2f, %.2f\n", sideA, sideB,sideC);
    }
}
