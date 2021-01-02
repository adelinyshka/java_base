package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        StringBuilder sNew = new StringBuilder(s);
        if (s.length() == 0) {
            return "empty";
        }
        if (s.length() <= 4) {
            return s;
        } else {

            for (int i = sNew.length() - 5; i >= 0; i--) {
                sNew.setCharAt(i, '#');
            }
            return new String(sNew);
        }
    }
}
