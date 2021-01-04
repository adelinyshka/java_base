//package ru.job4j.condition;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class PointTest {
//
//    @Test
//    public void when00to20Then2() {
//        double expected = 2;
//        int x1 = 0;
//        int y1 = 0;
//        int x2 = 2;
//        int y2 = 0;
//        double out = Point.distance(x1, y1, x2, y2);
//        System.out.println("when00to20Then2 is " + out + ". Expected: " + expected);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void whenMin12to48Then7() {
//        double expected = 7.81;
//        int x1 = -1;
//        int y1 = 2;
//        int x2 = 4;
//        int y2 = 8;
//        double out = Point.distance(x1, y1, x2, y2);
//        System.out.println("whenMin12to48Then7 is " + out + ". Expected: " + expected);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void when14And33to50Then34() {
//        double expected = 34.20;
//        int x1 = 14;
//        int y1 = 33;
//        int x2 = 5;
//        int y2 = 0;
//        double out = Point.distance(x1, y1, x2, y2);
//        System.out.println("when14And33to50Then34 is " + out + ". Expected: " + expected);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void when17And3to1And90Then88() {
//        double expected = 88.45;
//        int x1 = 17;
//        int y1 = 3;
//        int x2 = 1;
//        int y2 = 90;
//        double out = Point.distance(x1, y1, x2, y2);
//        System.out.println("when17And3to1And90Then80 is " + out + ". Expected: " + expected);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void when44And12to6And34Then43() {
//        double expected = 43.90;
//        int x1 = 44;
//        int y1 = 12;
//        int x2 = 6;
//        int y2 = 34;
//        double out = Point.distance(x1, y1, x2, y2);
//        System.out.println("when44And12to6And34Then43 is " + out + ". Expected: " + expected);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//}
