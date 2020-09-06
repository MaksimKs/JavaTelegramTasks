package com.gmail.ksenzhuk_maksim.lesson4.task3;
/*3)Определить класс Треугольник на плоскости. Определить площадь и периметр треугольника.
Создать массив/список/множество объектов и подсчитать количество треугольников разного типа
(равносторонний, равнобедренный, прямоугольный, произвольный). Определить для каждой группы
наибольший и наименьший по площади (периметру) объект.*/

import java.text.DecimalFormat;

public class TriangleMain {

    public static void main(String[] args) {

        Triangle [] arrayOfTriangles = new Triangle[13];
        TriangleService triangleService= new TriangleService();

        DecimalFormat decimalFormat = new DecimalFormat("#.###");

        arrayOfTriangles[0] = new EquilateralTriangle(4,4,4);
        arrayOfTriangles[1] = new EquilateralTriangle(6,6,6);
        arrayOfTriangles[2] = new EquilateralTriangle(9,9,9);

        arrayOfTriangles[3] = new IsoscelesTriangle(3,4,4);
        arrayOfTriangles[4] = new IsoscelesTriangle(5,5,3);
        arrayOfTriangles[5] = new IsoscelesTriangle(6,3,6);
        arrayOfTriangles[12] = new IsoscelesTriangle(5,11,11);

        arrayOfTriangles[6] = new RectangularTriangle(10, 6,8);
        arrayOfTriangles[7] = new RectangularTriangle(5,4,3);
        arrayOfTriangles[8] = new RectangularTriangle(12,13,5);

        arrayOfTriangles[9] = new RandomTriangle(5,7,9);
        arrayOfTriangles[10] = new RandomTriangle(7, 8, 8);
        arrayOfTriangles[11] = new RandomTriangle(9,11,13);

        System.out.println("Qty of equilateral triangle: "
                + triangleService.findEquilateral(arrayOfTriangles).length);
        System.out.println("min perimeter of equilateral triangles: " +
                triangleService.findMinByPerimeter(triangleService.findEquilateral(arrayOfTriangles)));
        System.out.println("max perimeter of equilateral triangles: " +
                triangleService.findMaxByPerimeter(triangleService.findEquilateral(arrayOfTriangles)));

        System.out.println("min area of equilateral triangles: " + decimalFormat.format(
                triangleService.findMinByArea(triangleService.findEquilateral(arrayOfTriangles))));
        System.out.println("max area of equilateral triangles: " + decimalFormat.format(
                triangleService.findMaxByArea(triangleService.findEquilateral(arrayOfTriangles))));

        System.out.println("\nQty of isosceles triangle: "
                + triangleService.findIsosceles(arrayOfTriangles).length);
        System.out.println("min perimeter of isosceles triangle: "
                + triangleService.findMinByPerimeter(triangleService.findIsosceles(arrayOfTriangles)));
        System.out.println("max perimeter of isosceles triangle:"
                + triangleService.findMaxByPerimeter(triangleService.findIsosceles(arrayOfTriangles)));

        System.out.println("min area of isosceles triangle: " + decimalFormat.format(
                triangleService.findMinByArea(triangleService.findIsosceles(arrayOfTriangles))));
        System.out.println("max area of isosceles triangle: " + decimalFormat.format(
                triangleService.findMaxByArea(triangleService.findIsosceles(arrayOfTriangles))));

        System.out.println("\nQty of rectangular triangle: "
                + triangleService.findRectangular(arrayOfTriangles).length);
        System.out.println("min perimeter of rectangular triangle: "
                + triangleService.findMinByPerimeter(triangleService.findRectangular(arrayOfTriangles)));
        System.out.println("max perimeter of rectangular triangle: "
                + triangleService.findMaxByPerimeter(triangleService.findRectangular(arrayOfTriangles)));

        System.out.println("min area of rectangular triangle: " + decimalFormat.format(
                triangleService.findMinByArea(triangleService.findRectangular(arrayOfTriangles))));
        System.out.println("max area of rectangular triangle: " + decimalFormat.format(
                triangleService.findMaxByArea(triangleService.findRectangular(arrayOfTriangles))));

        System.out.println("\nQty of random triangle: "
                + triangleService.findRandom(arrayOfTriangles).length);
        System.out.println("min perimeter of random triangle: "
                + triangleService.findMinByPerimeter(triangleService.findRandom(arrayOfTriangles)));
        System.out.println("max perimeter of random triangle: "
                + triangleService.findMaxByPerimeter(triangleService.findRandom(arrayOfTriangles)));

        System.out.println("min area of random triangle: " + decimalFormat.format(
                triangleService.findMinByArea(triangleService.findRandom(arrayOfTriangles))));
        System.out.println("max area of random triangle: " + decimalFormat.format(
                triangleService.findMaxByArea(triangleService.findRandom(arrayOfTriangles))));
    }
}
