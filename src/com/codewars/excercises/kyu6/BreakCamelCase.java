package com.codewars.excercises.kyu6;

import com.codewars.util.Assert;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BreakCamelCase {
    public static String camelCase(String input) {
        StringBuilder resultString = new StringBuilder();
        Pattern regex = Pattern.compile("([a-z])([A-Z])");
        Matcher regexMatcher = regex.matcher(input);
        while (regexMatcher.find())
            regexMatcher.appendReplacement(resultString,
                    regexMatcher.group(1)+" "+regexMatcher.group(2));
        regexMatcher.appendTail(resultString);
        return resultString.toString();
    }

    public static String simple(String input) {
        return input.replaceAll("([A-Z])"," $1");
    }

    public static void test() {
        Assert.equals("camel Casing", BreakCamelCase.camelCase("camelCasing"));
        Assert.equals("camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        Assert.equals("camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
        System.out.println("OK");
    }
}
