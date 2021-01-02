package ru.job4j.loop;

public class DegreeLoop {
    public static int calculate(int a, int n) {
        int rsl = a;
            for (int i = n; i > 1; i--) {
                rsl *= a;
            }
        return rsl;
    }
}
