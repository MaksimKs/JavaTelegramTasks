package com.gmail.ksenzhuk_maksim.task1;

import java.util.ArrayList;

public class RandomCollectionService {

    private ArrayList<Integer> inputArrayList;

    public RandomCollectionService(ArrayList<Integer> inputArrayList) {
        this.inputArrayList = inputArrayList;
    }

    public ArrayList<Integer> getInputArrayList() {
        return inputArrayList;
    }
    void setInputArrayList(ArrayList<Integer> inputArrayList) {
        this.inputArrayList = inputArrayList;
    }

    ArrayList<Integer> removeDuplicateNumbers () {
        ArrayList<Integer> listWithoutDuplicate = new ArrayList<>();
        for (Integer element : inputArrayList) {
            if (!listWithoutDuplicate.contains(element)) {
                listWithoutDuplicate.add(element);
            }
        }
        return listWithoutDuplicate;
    }


}
