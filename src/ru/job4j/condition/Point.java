package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(-1, 2, 4, 8);
        double result3 = Point.distance(14, 33, 5, 0);
        double result4 = Point.distance(17, 3, 1, 90);
        double result5 = Point.distance(44, 12, 6, 34);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (-1, 2) to (4, 8) " + result2);
        System.out.println("result (14, 33) to (5, 0) " + result3);
        System.out.println("result (17, 3) to (1, 90) " + result4);
        System.out.println("result (44, 12) to (6, 34) " + result5);
    }
}
