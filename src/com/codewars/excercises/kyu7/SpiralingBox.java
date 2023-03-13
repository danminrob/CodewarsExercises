package com.codewars.excercises.kyu7;

import com.codewars.util.Assert;

public class SpiralingBox {
    public static int[][] createBox(int width, int length) {
        int[][] arr = new int[length][width];
        for (int x = 1; x <= length; x++) {
            for (int j = 1; j <= width; j++) {
                arr[x-1][j-1] = x;
            }
        }
        return arr;
    }

    public static void test() {
        final int[][] box_7_8 = {{1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 1},
                {1, 2, 3, 3, 3, 2, 1},
                {1, 2, 3, 4, 3, 2, 1},
                {1, 2, 3, 4, 3, 2, 1},
                {1, 2, 3, 3, 3, 2, 1},
                {1, 2, 2, 2, 2, 2, 1},
                {1, 1, 1, 1, 1, 1, 1}};

        final int[][] box_8_7 = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 2, 2, 2, 2, 2, 2, 1},
                {1, 2, 3, 3, 3, 3, 2, 1},
                {1, 2, 3, 4, 4, 3, 2, 1},
                {1, 2, 3, 3, 3, 3, 2, 1},
                {1, 2, 2, 2, 2, 2, 2, 1},
                {1, 1, 1, 1, 1, 1, 1, 1}};

        final int[][] box_4_2 = {{1, 1, 1, 1}, {1, 1, 1, 1}};

        final int[][] box_2_4 = {{1, 1}, {1, 1}, {1, 1}, {1, 1}};

        Assert.equals(box_7_8, SpiralingBox.createBox(7,8));
        Assert.equals(box_8_7, SpiralingBox.createBox(8,7));
        Assert.equals(box_4_2, SpiralingBox.createBox(4,2));
        Assert.equals(box_2_4, SpiralingBox.createBox(2,4));
        System.out.println("OK");
    }
}
