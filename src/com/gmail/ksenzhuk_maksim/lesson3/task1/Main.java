package com.gmail.ksenzhuk_maksim.lesson3.task1;

/*1.Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов.
Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.*/

public class Main {
    public static void main(String[] args) {
        TimeInterval timeIntervalFirst = new TimeInterval(3723);
        TimeInterval timeIntervalSecond = new TimeInterval(1,2,3);
        TimeInterval timeIntervalThird = timeIntervalFirst;

        TimeInterval.compareInstance(timeIntervalFirst,timeIntervalSecond);
        TimeInterval.compareInstance(timeIntervalFirst,timeIntervalThird);

        System.out.println("first interval data: " + timeIntervalFirst);
        System.out.println("second interval data: " + timeIntervalSecond);
        System.out.println("third interval data: " + timeIntervalThird);

        /*Входные параметры в конструкторе для проверки
        - если значения < 0, переменным присваивается 0
        - 0с и 0ч, 0м, 0с
        - 100с и 1м, 40с
        - 3723с и 1ч, 2, 3с*/
    }
}
