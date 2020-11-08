package com.gmail.ksenzhuk_maksim.lesson7.task2;

import java.util.Stack;

public class StringCheckerService {

    static boolean stringChecker(String inputString) {
        if (StringValidation.validation(inputString)) {
            return checker(inputString);
        }
        return false;
    }

    private static boolean checker(String inputString) {
        boolean isAllBracketsClosed = false;
        Stack <Character> stackElement = new Stack<>();
        for (Character element:inputString.toCharArray()) {
            if (element == '(' || element == '[' || element == '{') {
                stackElement.push(element);
            } else if (element == ')' || element == ']' || element == '}') {
                if (stackElement.isEmpty()){
                    break;
                }
                else {
                    char openBracket = stackElement.pop();
                    if (theSamePairOfBrackets(openBracket, element)){
                        isAllBracketsClosed = true;
                    }
                }
            }
        }
        if (!stackElement.isEmpty()) {
            isAllBracketsClosed = false;
        }
        return isAllBracketsClosed;
    }

    private static boolean theSamePairOfBrackets(char openBracket, Character closeBracket) {
        return (openBracket == '(' && closeBracket == ')' || openBracket == '[' && closeBracket == ']' ||
                openBracket == '{' && closeBracket == '}');
    }
}
