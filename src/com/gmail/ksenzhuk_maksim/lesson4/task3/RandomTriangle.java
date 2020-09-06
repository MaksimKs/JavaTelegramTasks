package com.gmail.ksenzhuk_maksim.lesson4.task3;


class RandomTriangle extends Triangle {

    public RandomTriangle(double sideA, double sideB, double sideC) {
        if (TriangleValidation.validationForAnyTriangle(sideA,sideB,sideC)){
            setSideA(sideA);
            setSideB(sideB);
            setSideC(sideC);
        } else System.out.printf(
                "It's impossible to create random triangle with such sides: %.2f, %.2f, %.2f \n", sideA, sideB,sideC);
    }
}
