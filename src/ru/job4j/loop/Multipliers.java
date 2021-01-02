package ru.job4j.loop;

public class Multipliers {
    public static void out(int n) {
        if (n == 1) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
//
//    Дано целое число n (> 0). Нужно вывести делители числа. Делитель это число на которое делится заданное число
//
//        Например,
//
//        Для 1, это 1
//
//        Для 2, это 1 и 2
//
//        Для 6, это 1, 2, 3, 6
//
//        Для 7, это 1, 7
