package com.codewars.excercises.kyu8;

import com.codewars.util.Assert;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    public static void test() {
        Assert.equals("aaaa", StringRepeat.repeatStr(4, "a"));
        Assert.equals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
        Assert.equals("", StringRepeat.repeatStr(5, ""));
        Assert.equals("", StringRepeat.repeatStr(0, "kata"));
        System.out.println("OK");
    }
}
