package com.codewars.excercises.kyu6;

import com.codewars.util.Assert;

public class GiveMeADimond {
    public static String print(int n) {
        if (n < 0 || n % 2 == 0) {
            return null;
        }
        int topLvl = (n + 1) / 2;
        String[] lines = new String[topLvl];
        for (int lvl = 0; lvl < topLvl; lvl++) {
            String line = "";
            if (lvl > 0) {
                line = " ".repeat(lvl);
            }
            line += "*".repeat(n - (lvl * 2)) + "\n";
            lines[lvl] = line;
        }

        StringBuilder res = new StringBuilder();
        for (int i = lines.length-1; i > 0; i--) {
            res.append(lines[i]);
        }
        for (String line : lines) {
            res.append(line);
        }
        return res.toString();
    }

    public static void test() {
        Assert.equals(null, GiveMeADimond.print(2));
        Assert.equals(" *\n***\n *\n", GiveMeADimond.print(3));
        Assert.equals("  *\n ***\n*****\n ***\n  *\n", GiveMeADimond.print(5));
        System.out.println("OK");
    }
}
