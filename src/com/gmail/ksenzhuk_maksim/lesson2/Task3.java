package com.gmail.ksenzhuk_maksim.lesson2;

/* Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.
по аналогии с примером выше.*/

public class Task3 {
    public static void main(String[] args) {
        int numberOfSeconds = 4500001;
        minutesAmount(numberOfSeconds);
        hoursMinutesAmount(numberOfSeconds);
        daysHoursMinutesAmount(numberOfSeconds);
        weeksDaysHoursMinutesAmount(numberOfSeconds);
    }

    private static void minutesAmount(int numberOfSeconds) {
        int secondsAmount = numberOfSeconds % 60;
        int minutes = (numberOfSeconds - secondsAmount) / 60;
        System.out.printf("In %d seconds we've %d minutes, %d seconds \n",
                numberOfSeconds, minutes, secondsAmount);
    }

    private static void hoursMinutesAmount(int numberOfSeconds) {
        int secondsAmount = numberOfSeconds % 60;
        int minutes = (numberOfSeconds - secondsAmount) / 60;
        int minsRemain = minutes % 60;
        int hours = (minutes - minsRemain) / 60;
        System.out.printf("In %d seconds we've %d hours, %d minutes, %d seconds \n",
                numberOfSeconds, hours, minsRemain, secondsAmount);
    }

    private static void daysHoursMinutesAmount(int numberOfSeconds) {
        int secondsAmount = numberOfSeconds % 60;
        int minutes = (numberOfSeconds - secondsAmount) / 60;
        int minsRemain = minutes % 60;
        int hours = (minutes - minsRemain) / 60;
        int hoursRemain = hours % 24;
        int days = (hours - hoursRemain) / 24;
        System.out.printf("In %d seconds we've %d days, %d hours, %d minutes, %d seconds \n",
                numberOfSeconds, days, hoursRemain, minsRemain, secondsAmount);
    }

    private static void weeksDaysHoursMinutesAmount(int numberOfSeconds) {
        int secondsAmount = numberOfSeconds % 60;
        int minutes = (numberOfSeconds - secondsAmount) / 60;
        int minsRemain = minutes % 60;
        int hours = (minutes - minsRemain) / 60;
        int hoursRemain = hours % 24;
        int days = (hours - hoursRemain) / 24;
        int daysRemain = days % 7;
        int weeks = (days - daysRemain) / 7;
        System.out.printf("In %d seconds we've %d weeks, %d days, %d hours, %d minutes,%d seconds \n",
                numberOfSeconds, weeks, daysRemain, hoursRemain, minsRemain, secondsAmount);
    }
}
