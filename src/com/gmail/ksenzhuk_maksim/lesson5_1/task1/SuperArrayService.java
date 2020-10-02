package com.gmail.ksenzhuk_maksim.lesson5_1.task1;

import java.util.Arrays;

public class SuperArrayService implements MySuperArray {

    private String [] superArrayService;

    public SuperArrayService (String [] superArrayServices) {
        this.superArrayService = superArrayServices;
    }

    public String[] getSuperArrayService() {
        return superArrayService;
    }

    void setSuperArrayService (String [] superArrayService) {
        this.superArrayService = superArrayService;
    }

    @Override
    public String toString() {
        return "SuperArrayService:" +
                Arrays.toString(superArrayService);
    }

    @Override
    public int getLength() {
        return this.superArrayService.length;
    }

    @Override
    public int addElement(String element) {
        String [] arrayLengthIncrement = new String[this.superArrayService.length + 1];
        System.arraycopy(this.superArrayService, 0, arrayLengthIncrement, 0, this.superArrayService.length);
        arrayLengthIncrement[arrayLengthIncrement.length - 1] = element;
        setSuperArrayService(arrayLengthIncrement);
        return arrayLengthIncrement.length;
    }

    @Override
    public String getElement(int index) {
        String defaultElement = "";
        if (index < 0) {
            System.out.println("Impossible to get element less than 0");
            return defaultElement;
        } else if (index > this.superArrayService.length) {
            System.out.printf("Input index: '%d' more than array length", index);
            return defaultElement;
        } else return this.superArrayService[index];
    }

    @Override
    public void removeAllElements() {
        this.superArrayService = new String[0];
    }

    @Override
    public String[] getAllElements() {
        return this.superArrayService;
    }
}

