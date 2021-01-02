package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = false;
        for (int i = array.length - 1; i > 1; i--) {
            if (array[i] > array[--i]) {
                rsl = true;
            } else {
                rsl = false;
                break;
            }

        }
        return rsl;
    }
}
