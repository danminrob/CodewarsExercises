package com.codewars.excercises.kyu5;

import com.codewars.util.Assert;

public class ValidParentheses {
    public static boolean validParentheses(String str) {
        int openedParentheses = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openedParentheses++;
            } else if (str.charAt(i) == ')') {
                openedParentheses--;
            }
            if (openedParentheses < 0) {
                return false;
            }
        }
        return openedParentheses == 0;
    }

    public static void test() {
        Assert.equals(false, ValidParentheses.validParentheses("()"));
        Assert.equals(false, ValidParentheses.validParentheses("())"));
        Assert.equals(false, ValidParentheses.validParentheses("(()"));
        Assert.equals(true, ValidParentheses.validParentheses("(()()((())))"));
        System.out.println("OK");
    }
}
