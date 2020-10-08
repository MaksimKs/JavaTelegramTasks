package com.gmail.ksenzhuk_maksim.task1;


import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomCollectionNumbers {

    ArrayList<Integer> fillListWithRandomNumbers () {
        int capacity = ThreadLocalRandom.current().nextInt(10,15);
        ArrayList<Integer> integerArrayList = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            integerArrayList.add((int)(Math.random()*3));
        }
        return integerArrayList;
    }

}
