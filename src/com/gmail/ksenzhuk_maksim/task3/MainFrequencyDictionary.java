package com.gmail.ksenzhuk_maksim.task3;

/*Имеется тест. Следует составить для него частотный словарь*/

import java.util.Map;

public class MainFrequencyDictionary {
    public static void main(String[] args) {

        String text = "It contained- a few dollars, a two credit cards, " +
                "a two business cards and two pictures, one a duplicate " +
                "of the family pictures and other a school pictures";

        System.out.printf("Print input text:\n%s\n", text);

        Map<String, Integer> mapDictionary;
        FrequencyDictionaryService frequencyDictionaryService = new FrequencyDictionaryService();
        mapDictionary = frequencyDictionaryService.findFrequencyDictionary(
                frequencyDictionaryService.convertStringToList(text));
        frequencyDictionaryService.printMapWithFormat(mapDictionary);
    }
}
