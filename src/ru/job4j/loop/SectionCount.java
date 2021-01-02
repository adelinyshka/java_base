package ru.job4j.loop;

public class SectionCount {
    public static int count(int length, int section) {
        int sum = 0;
        for (int i = length; i >= section; i -= section) {
            sum++;
        }
        return sum;
    }
}
