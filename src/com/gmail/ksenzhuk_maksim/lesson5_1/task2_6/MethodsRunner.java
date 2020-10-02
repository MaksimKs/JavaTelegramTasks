package com.gmail.ksenzhuk_maksim.lesson5_1.task2_6;

/*- Напишите метод для поиска самой длинной
    строки в массиве. LongestStringService
  - Напишите метод, котрый проверяет является ли
    слово палиндромом. PalindromeService
  - Напишите метод, заменяющий в тексте все
    вхождерния слова "бяка" на [вырезано цензурой]. CensoredService
  - Имеются две строки. Напишите метод, возвразающий
    кол-во вхождений одной строки в другую. StringRepeatingService
  - проверить является ли строка ip-адресом. IpCheckerService*/


public class MethodsRunner {
    public static void main(String[] args) {

        /*LongestStringService:
        Тест:
        1. Передача массива без элементов
        2. Передача массива с null элементом
        3. Передача заполненного массива*/

        String [] array = new String[5];
        array[0] = "String service";
        array[1] = "Java";
        array[2] = "ont two three";
        array[3] = "Random string for check";
        array[4] = "one two";

        LongestStringService longestStringService = new LongestStringService(array);
        System.out.println(longestStringService);
        System.out.println("longest sting is: " + longestStringService.getLongestString() + '\n');


        /*PalindromeService
        Test:
        1. Переда в конструтор с параметром: Level; Radar; Racecar; nan; random word.
        2. Вызовы конструтора без параметров и ввод с консоли Level; Radar; Racecar; "random word".*/

        PalindromeService palindromeService = new PalindromeService();
        System.out.println(palindromeService);
        if (palindromeService.checkForPalindrome(palindromeService.getStringForCheckPalindrome())) {
            System.out.println("Input word is palindrome\n");
        } else System.out.println("Input word isn't palindrome\n");


        /*CensoredService
        Test:
        1. Одно и тоже слово, которое необходимо заменить написать в разных регистрах*/

        CensoredService censoredService = new CensoredService();
        System.out.println(censoredService.getStringForCensored() + "\n");
        System.out.println(censoredService.replaceMatches(censoredService.getStringForCensored()));


        /*StringRepeatingService
        Test:
        1. Строка, которая посторяется в другой написана в в разных регистрах
        2. Одна из строк пустая или имеет null значение.*/

        StringRepeatingService stringRepeatingService = new StringRepeatingService();
        System.out.println("Param. for search: " + stringRepeatingService.getParamForSearch());
        System.out.println("String for search: " + stringRepeatingService.getSimpleString());
        System.out.println("Amount of repeating: " +
                stringRepeatingService.countRepeatingString(stringRepeatingService.getParamForSearch(),
                stringRepeatingService.getSimpleString()));

        /*IpCheckerService
        Test: 0.0.0.0 -true; 123.234.234.123 - true; 255.255.255.255 - true; 256.1.2.3 - false*/

        IpCheckerService ipCheckerService = new IpCheckerService("123.234.234.123");
        System.out.println(ipCheckerService);

    }
}
