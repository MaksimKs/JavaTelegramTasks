package com.gmail.ksenzhuk_maksim.task4;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ListNumbersInit {

    private List <Integer> list = new ArrayList<>();
    private int lengthOfList = 20;

    public ListNumbersInit() {
        for (int i = 0; i < lengthOfList; i++) {
            list.add(i, ThreadLocalRandom.current().nextInt(-256,255));
        }
    }

    public List<Integer> getList() {
        return list;
    }

    public int getLengthOfList() {
        return lengthOfList;
    }
    public void setLengthOfList(Integer lengthOfList) {
        if (lengthOfList > 0) {
            this.lengthOfList = lengthOfList;
        } else System.out.println("Length of list less than zero.");
    }
}
