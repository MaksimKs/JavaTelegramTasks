package com.gmail.ksenzhuk_maksim.lesson3.task3;

public class Square implements GeometricFigure {

    private String name;
    private double sideOfSquare;

    public Square (String name, double side) {
        if (side <= 0) {
            System.out.println("Side of the square can't be negative or zero");
            this.name = name;
            return;
        }
        this.name = name;
        this.sideOfSquare = side;
    }

    @Override
    public void areaOfFigure() {
        System.out.println("area of square " + name + " is " + Math.pow(sideOfSquare,2));
    }

    @Override
    public void printNameOfFigure() {
        System.out.println("Square has name " + name);
    }
}
