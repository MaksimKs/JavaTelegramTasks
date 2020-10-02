package com.gmail.ksenzhuk_maksim.lesson5_1.task2_6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CensoredService {

    private String stringForCensored = "Напишите метод, заменяющий в тексте слово бяка \n" +
            "на другое слово даже если это слово с большой \n" +
            "буквы Бяка и в рахных регистрах бяКа БЯка БЯКА.";

    public String getStringForCensored(){
        return stringForCensored;
    }

    String replaceMatches (String string) {
        Pattern pattern = Pattern.compile("бяка", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(string);
        return new String(matcher.replaceAll("[вырезано цензурой]"));
    }
}
