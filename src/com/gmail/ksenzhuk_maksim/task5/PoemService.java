package com.gmail.ksenzhuk_maksim.task5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PoemService {

    private List <String> list;

    public List<String> getList() {
        return list;
    }

    void initList (String pathToFile) {
        try {
            this.list = PoemReader.readerFromFile(pathToFile);
        } catch (IOException e) {
            if (e.getClass().getSimpleName().equals("FileNotFoundException")) {
                System.out.println("File not found.");
            } else System.out.println(e.getMessage());
        }
    }

    List<String> initListForSort(List<String> inputList) {
        List<String> listForSort = new ArrayList<>(inputList);
        listForSort.sort(new StringLineComparatorService());
        return listForSort;
    }

    void printList (List<String> listForPrint) {
        listForPrint.forEach(element -> System.out.println(element));
    }

}
