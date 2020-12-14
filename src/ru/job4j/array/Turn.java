package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        if (array.length <= 3 && array.length > 1) {
            temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;
        } else {
            for (int i = 0; i <= (array.length - 1) / 2; i++) {
                temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
            }
        }
        return array;
    }
}
