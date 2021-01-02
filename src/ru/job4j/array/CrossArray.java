package ru.job4j.array;

public class CrossArray {
    public static void printCrossEl(int[] left, int[] right) {
        int[] rsl = {};
        for (int i = 0; i < left.length; i++) {
            if (left[i] == right[i]) {
                rsl[i] = left[i];
            }
        }
        System.out.println(rsl);
    }
}
