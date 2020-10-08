package com.gmail.ksenzhuk_maksim.task1;

/*Создать коллекцию, наполнить ее случайными числами
Удалить повторяющиеся числа.*/

import java.util.*;

public class MainRandomCollectionNumbers {
    public static void main(String[] args) {

        RandomCollectionNumbers randomCollectionNumbers = new RandomCollectionNumbers();
        ArrayList<Integer> randomNumbersList = randomCollectionNumbers.fillListWithRandomNumbers();
        System.out.println("Random numbers:");
        System.out.println(randomNumbersList.toString());

        RandomCollectionService randomCollectionService = new RandomCollectionService(randomNumbersList);
        System.out.println("Numbers without duplicates:");
        ArrayList<Integer> withoutDuplicates = randomCollectionService.removeDuplicateNumbers();
        System.out.println(withoutDuplicates.toString());

        System.out.println("Create collection without duplicates using \"set collection\":");
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(randomNumbersList);
        System.out.println(set);
    }
}
