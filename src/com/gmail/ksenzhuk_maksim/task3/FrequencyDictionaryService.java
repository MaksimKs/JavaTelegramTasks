package com.gmail.ksenzhuk_maksim.task3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class FrequencyDictionaryService {

    private String stringForDictionary;

    public FrequencyDictionaryService() {
    }

    public FrequencyDictionaryService(String string) {
        if (!string.isEmpty()) {
            this.stringForDictionary = string;
        } else System.out.println("Input string is empty.");
    }

    public String getStringForDictionary() {
        return stringForDictionary;
    }

    //convert string to list
    List<String> convertStringToList(String stringForDictionary) {
        Pattern pattern = Pattern.compile(",?\\s");
        String[] array = pattern.split(stringForDictionary);

        return Arrays.asList(array);
    }

    //find duplicates in input list
    Map<String, Integer> findFrequencyDictionary(List<String> list) {
        Map<String, Integer> frequencyDictionary = new HashMap<>();
        for (String element : list) {
            frequencyDictionary.put(
                    element, frequencyDictionary.containsKey(element) ?
                            frequencyDictionary.get(element) + 1 : 1);
        }
        return frequencyDictionary;
    }

    //print map using format
    void printMapWithFormat(Map <String,Integer> mapDictionary){
        System.out.format("%-20s","Word:");
        System.out.format("%s","Duplicate amount:\n");
        for (Map.Entry<String,Integer> pair : mapDictionary.entrySet()) {
            System.out.printf("%-20s%d\n", pair.getKey(), pair.getValue());
        }
    }
}
