package com.gmail.ksenzhuk_maksim.task4;
/*Не используя вспомогательных объектов,
 переставить отрицательные элементы данного списка
 в конец, а положительные - в начало списка.*/

import java.util.Collections;
import java.util.List;

public class MainSortedNumbers {
    public static void main(String[] args) {

        ListNumbersInit listNumbersInit = new ListNumbersInit();
        System.out.println("List before sort:");
        for (Integer element:listNumbersInit.getList()) {
            System.out.print(element + "; ");
        }

        List<Integer> listForSorting = listNumbersInit.getList();
        listForSorting.sort(new NumbersComparatorService());
        System.out.println("\nList after sort:");
        listForSorting.forEach(element -> System.out.print(element + "; "));

    }
}
