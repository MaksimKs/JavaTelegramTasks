package com.gmail.ksenzhuk_maksim.lesson3.task3;

/*3.Создайте интерфейс, который представляет геометрическую фигуру.
Сделайте так, чтобы класс Circle реализовывал ваш интерфейс.
Создайте класс Квадрат, который тоже реализует интерфейс Геометрическая фигура.
Поместите в переменную типа Фигура сначала круг, и вызовите несколько методов.
Потом поместите в нее квадрат, и вызовите несколько методов. Какие принципы ООП
вы использовали в этом задании?*/

public class MainFigures {
    public static void main(String[] args) {

        GeometricFigure someFigure = new Circle("First_Circle", 0);
        someFigure.printNameOfFigure();
        someFigure.areaOfFigure();

        someFigure = new Square("First_Square", 3);
        someFigure.printNameOfFigure();
        someFigure.areaOfFigure();

        //----Какие принципы ООП
        //вы использовали в этом задании?

        /*использовался принцим наследования через реализацию интервейса GeometricFigure
        использовался принцим полиморфизма, тк круг и квадрат реализуют один интесфейс и методы этого
        интерфеса, но имею разную реализацию методов
         */
    }
}
