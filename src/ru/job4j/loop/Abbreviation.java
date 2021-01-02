package ru.job4j.loop;
import java.util.Locale;

public class Abbreviation {
    public static String collect(String s) {
        String[] arr = s.split(" ");
        String rsl = "";
        for (int i = 0; i < arr.length; i++) {
            rsl = rsl + arr[i].charAt(0);
        }
        return rsl;
    }
}
