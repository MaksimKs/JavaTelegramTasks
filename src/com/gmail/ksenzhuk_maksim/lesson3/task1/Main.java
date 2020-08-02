package com.gmail.ksenzhuk_maksim.lesson3.task1;

/*1.Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов.
Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.*/

public class Main {
    public static void main(String[] args) {
        TimeInterval timeIntervalFirst = new TimeInterval(3662);
        TimeInterval timeIntervalSecond = new TimeInterval(54600);
        TimeInterval timeIntervalThird = new TimeInterval(1,2,3);
        TimeInterval timeIntervalFourth = timeIntervalSecond;

        timeIntervalFirst.equals(timeIntervalSecond);
        timeIntervalSecond.equals(timeIntervalThird);
        timeIntervalSecond.equals(timeIntervalFourth);

        System.out.println("time interval data: " + timeIntervalFirst);
        System.out.println("first interval data: " + timeIntervalSecond);
        System.out.println("second interval data: " + timeIntervalThird);
        System.out.println("third interval data: " + timeIntervalFourth);

        /*Входные параметры в конструкторе для проверки
        - если значения < 0, переменным присваивается 0
        - 0с и 0ч, 0м, 0с
        - 100с и 1м, 40с
        - 3723с и 1ч, 2, 3с*/
    }
}
