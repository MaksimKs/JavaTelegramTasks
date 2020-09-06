package com.gmail.ksenzhuk_maksim.lesson4.task3;

import static com.gmail.ksenzhuk_maksim.lesson4.task3.TriangleValidation.*;

class RectangularTriangle extends Triangle {

    public RectangularTriangle (double sideA, double sideB, double sideC) {
        if (validationForAnyTriangle(sideA,sideB,sideC) &&
                validationForRectangularTriangle(sideA,sideB,sideC)) {
            setSideA(sideA);
            setSideB(sideB);
            setSideC(sideC);
        } else System.out.printf(
                "It's impossible to create rectangular triangle with such sides: %.2f, %.2f, %.2f\n", sideA, sideB,sideC);
    }
}
