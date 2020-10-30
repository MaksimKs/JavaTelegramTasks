package com.gmail.ksenzhuk_maksim.task5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class PoemReader {

    static List<String> readerFromFile (String pathToFile) throws IOException{
        List<String> listForPoem = listForPoem = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(pathToFile));
        String line;
            while ((line = fileReader.readLine()) != null) {
                listForPoem.add(line);
            }
            fileReader.close();
        return listForPoem;
    }
}
