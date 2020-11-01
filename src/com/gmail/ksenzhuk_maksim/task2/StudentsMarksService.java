package com.gmail.ksenzhuk_maksim.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StudentsMarksService {

    private ArrayList<Integer> arrayList;

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public StudentsMarksService() {
        this.arrayList = createListWithMarks();
    }

    ArrayList<Integer> createListWithMarks() {
        int capacity = 20;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < capacity; i++) {
            list.add((int)(Math.random()*100));
        }
        //IntStream.range(0,20).map(x -> (int)(Math.random()*100)).forEach(list::add);
        return list;
    }

    int findMaxMarkInLs (ArrayList<Integer>arrayList) {
        int maxMarkInLs = 0;
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            int temp = iterator.next();
            if (temp > maxMarkInLs) {
                maxMarkInLs = temp;
            }
        }

        /* iterate using "foreach"*//*
        for (Integer element:arrayList) {
            if (element > maxMarkInLs) {
                maxMarkInLs = element;
            }
        }*/

        return maxMarkInLs;
    }
}
