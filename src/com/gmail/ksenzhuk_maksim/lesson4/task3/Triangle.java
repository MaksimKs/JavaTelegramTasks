package com.gmail.ksenzhuk_maksim.lesson4.task3;

public abstract class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    double findPerimeterOfTriangle() {
        return this.sideA + this.sideB + this.sideC;
    }
    //Heron's formula to find Area of triangle
    double findAreaOfTriangle() {
        double halfOfPerimeter = this.findPerimeterOfTriangle() / 2;
        return Math.sqrt(
                halfOfPerimeter*(halfOfPerimeter-this.sideA)*(halfOfPerimeter-this.sideB)*(halfOfPerimeter-this.sideC));
    }

    public double getSideA() {
        return sideA;
    }
    void setSideA(double sideA) {
        if (sideA <= 0) {
            System.out.println("Side A of triangle should be more than zero");
        } else this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }
    void setSideB(double sideB) {
        if (sideB <= 0) {
            System.out.println("Side B of triangle should be more than zero");
        } else this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }
    void setSideC(double sideC) {
        if (sideC <= 0) {
            System.out.println("Side C of triangle should be more than zero");
        } else this.sideC = sideC;
    }

    @Override
    public String toString() {
        return "Triangle " + this.getClass().getSimpleName() +
                ": sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC;
    }
}
