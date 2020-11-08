package com.gmail.ksenzhuk_maksim.lesson7.task2;
/*Задана строка, состоящая из символов
"("; ")"; "["; "]"; "{"; "}";. Проверить правильность
расстановки скобок. Использовать стек*/

public class MainStringChecker {
    public static void main(String[] args) {
        String stringForChecker = "(new hello) [string] {stack checker}";
        String string = "(Removes [the {object} at the top of this] stack) and returns";
        String nullString = null;
        String emptyString = "";

        try {
            System.out.println(StringCheckerService.stringChecker(stringForChecker));
            System.out.println(StringCheckerService.stringChecker(string));
            System.out.println(StringCheckerService.stringChecker(nullString));
            System.out.println(StringCheckerService.stringChecker(emptyString));
        } catch (NullPointerException | NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
