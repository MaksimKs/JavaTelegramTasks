package com.gmail.ksenzhuk_maksim.lesson2;

/*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
Задание */

public class Task7 {
    public static void main (String [] args) {
        int heightOfRectangle = 4;
        int widthOfRectangle = 7;
        double radiusOfCard = 4;
        double radiusOfCircle = Math.sqrt(Math.pow(heightOfRectangle,2) + Math.pow(widthOfRectangle,2)) / 2;

        if (radiusOfCard <= radiusOfCircle) {
            System.out.printf("The card with radius %.4f can hide this rectangle", radiusOfCard);
        } else
            System.out.printf("The card with radius %f can't hide this rectangle", radiusOfCard);
    }
}
