package com.gmail.ksenzhuk_maksim.task5;

import java.io.File;

public class MainForPoem {
    public static void main(String[] args) {

        File file = new File("tasks/src/com/gmail/ksenzhuk_maksim/task5/data/PoemText.txt");
        String pathToFile = file.getAbsolutePath();

        PoemService poemService = new PoemService();
        poemService.initList(pathToFile);
        poemService.printList(poemService.getList());


        System.out.println("\n************************\n" +
                "Print poem after sorting:");
        poemService.printList(poemService.initListForSort(poemService.getList()));
    }
}
