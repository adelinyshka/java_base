package ru.job4j.sort;

import java.util.Arrays;
import ru.job4j.array.Defragment;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int cash = money - price;
        while (cash != 0) {
            for (int i = 0; i < coins.length; i++) {
                if (cash > 0) {
                    if (cash - coins[i] >= 0) {
                        cash = cash - coins[i];
                        rsl[i] = coins[i];
                        size++;
                    }
                }
            }
        }

        // defragmentation
        for (int in = 0; in < rsl.length; in++) {
            if (rsl[in] == 0) {
                for (int j = in; j < rsl.length; j++) {
                    if (rsl[j] != 0) {
                        rsl[in] = rsl[j];
                        rsl[j] = 0;
                        break;
                    }
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
