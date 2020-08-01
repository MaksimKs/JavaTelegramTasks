package com.gmail.ksenzhuk_maksim.lesson3.task3;

public class Circle implements GeometricFigure {

    private String name;
    private int radius;
    private final double PI_NUMBER =3.1415;

    public Circle(String name, int radius) {
        if (radius <= 0) {
            System.out.println("Radius of circle can't be negative or zero");
            this.name = name;
            return;
        }
        this.radius = radius;
        this.name = name;
    }

    @Override
    public void areaOfFigure() {
        System.out.println("area of circle " + name + " is " + PI_NUMBER * (Math.pow(radius,2)));
    }

    @Override
    public void printNameOfFigure() {
        System.out.println("Circle has name " + name);
    }
}
