package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return Math.max(left, right);
    }

    public static int maxFor3(int one, int two, int three) {
        return Math.max(one, max(two, three));
    }

    public static int maxFor4(int one, int two, int three, int four) {
        return Math.max(one, max(two, max(three, four)));
    }
}
