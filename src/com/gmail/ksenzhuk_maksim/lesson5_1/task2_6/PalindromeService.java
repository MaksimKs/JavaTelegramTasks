package com.gmail.ksenzhuk_maksim.lesson5_1.task2_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

class PalindromeService {

    private String stringForCheckPalindrome;

    public String getStringForCheckPalindrome() {
        return stringForCheckPalindrome;
    }

    @Override
    public String toString() {
        return "PalindromeService: " +
                "string for check palindrome='" + stringForCheckPalindrome + '\'';
    }

    public PalindromeService() {
        System.out.println("Print some word, to check this word is palindrome:");
        String temp = readFromConsole();
        if (!temp.isEmpty()) {
            this.stringForCheckPalindrome = temp;
        } else throw new IllegalArgumentException("input line is empty");
    }

    public PalindromeService(String stringForCheckPalindrome) {
        if (!Objects.isNull(stringForCheckPalindrome)) {
            this.stringForCheckPalindrome = stringForCheckPalindrome.toLowerCase();
        } else throw new IllegalArgumentException("input line is empty");
    }

    private String readFromConsole () {
        String temp = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            temp = reader.readLine().toLowerCase();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }

    public boolean checkForPalindrome(String stringFromConsole) {
        char [] arrayOfStringFromConsole = stringFromConsole.toCharArray();
        for (int i = 0; i <= arrayOfStringFromConsole.length / 2; i++)
            if (arrayOfStringFromConsole[i] != arrayOfStringFromConsole[arrayOfStringFromConsole.length - 1 - i])
                return false;
            return true;
    }
}
