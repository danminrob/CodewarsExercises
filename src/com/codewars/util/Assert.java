package com.codewars.util;

public class Assert {

    public static void equals(Object expected, Object result) {
        if( expected == null && result == null){
            return;
        }

        if (expected == null || !expected.equals(result)) {
            throw new AssertionError("Expected value:" + expected
                    + " - actual value:" + result.toString());
        }
    }
}
