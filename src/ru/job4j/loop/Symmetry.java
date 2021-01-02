package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String newStr = String.valueOf(i);
        boolean result = false;
        for (int j = 0; j <= newStr.length() / 2; j++) {
            if (newStr.charAt(j) == newStr.charAt(newStr.length() - 1 - j)) {
                result = true;
            } else {
                 result = false;
                 break;
            }
        }
        return result;
    }
}
