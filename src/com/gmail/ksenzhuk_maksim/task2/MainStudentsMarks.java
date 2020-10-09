package com.gmail.ksenzhuk_maksim.task2;

/*Создать список оценок учеников с помощью ArrayList,
заполнить случайнми оценками. Найти самую высокую оценку
с использованием итератора*/

public class MainStudentsMarks {
    public static void main(String [] args) {

        StudentsMarksLs studentsMarksLs = new StudentsMarksLs();
        System.out.println("Print list of marks: " + studentsMarksLs.getArrayList());

        System.out.println("Max mark in list is: " + studentsMarksLs.findMaxMarkInLs(studentsMarksLs.getArrayList()));
    }
}
