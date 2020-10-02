package com.gmail.ksenzhuk_maksim.lesson5_1.task1;

import java.util.Arrays;

public class MainSuperArray {
    public static void main(String[] args) {

        String [] studentsArray = {"Alex", "Kate", "Max", "Mike", "Olga", "Elena", "Nikolai"};
        SuperArrayService superArrayService = new SuperArrayService(studentsArray);

        System.out.println("Print all elements of array:");
        System.out.println(superArrayService.toString() + "\n");

        System.out.println("Print length of array:");
        System.out.println(superArrayService.getLength() + "\n");

        System.out.println("Add new element to array & print array with new element:");
        superArrayService.addElement("Andy");
        System.out.println(superArrayService + "\n");

        System.out.println("Get element by input index:");
        System.out.println(superArrayService.getElement(0) + "\n");

        System.out.println("Remove all element in array & print this array & length of array:");
        superArrayService.removeAllElements();
        System.out.println(superArrayService.toString() + ", length of array: " + superArrayService.getLength() + "\n");

        System.out.println("Get array with all current elements:");
        superArrayService.setSuperArrayService(studentsArray);
        System.out.println(Arrays.toString(superArrayService.getAllElements()));
    }
}

