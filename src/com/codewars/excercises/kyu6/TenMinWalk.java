package com.codewars.excercises.kyu6;

import com.codewars.util.Assert;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int x = 0, y = 0;
        for (char direction: walk) {
            switch (direction) {
                case 'n' -> x++;
                case 's' -> x--;
                case 'w' -> y++;
                case 'e' -> y--;
            }
        }
        return x == 0 && y == 0;
    }

    public static void test() {
        Assert.equals(true, TenMinWalk.isValid(new char[]{'n','n','e','e','s','s','w','s','w','n'}));
        Assert.equals(false, TenMinWalk.isValid(new char[]{'n','n','e','e','s','s','w','s','w','n','n','s'}));
        Assert.equals(false, TenMinWalk.isValid(new char[]{'n','e','e','e','s','s','w','s','w','n'}));
        System.out.println("OK");
    }
}