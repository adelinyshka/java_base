package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        System.out.println("when00to20Then2 is " + out + ". Expected: " + expected);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMin12to48Then7() {
        double expected = 7.81;
        Point a = new Point(-1, 2);
        Point b = new Point(4, 8);
        double out = a.distance(b);
        System.out.println("whenMin12to48Then7 is " + out + ". Expected: " + expected);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when14And33to50Then34() {
        double expected = 34.20;
        Point a = new Point(14, 33);
        Point b = new Point(5, 0);
        double out = a.distance(b);
        System.out.println("when14And33to50Then34 is " + out + ". Expected: " + expected);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when17And3to1And90Then88() {
        double expected = 88.45;
        Point a = new Point(17, 3);
        Point b = new Point(1, 90);
        double out = a.distance(b);
        System.out.println("when17And3to1And90Then80 is " + out + ". Expected: " + expected);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when44And12to6And34Then43() {
        double expected = 43.90;
        Point a = new Point(44, 12);
        Point b = new Point(6, 34);
        double out = a.distance(b);
        System.out.println("when44And12to6And34Then43 is " + out + ". Expected: " + expected);
        Assert.assertEquals(expected, out, 0.01);
    }
}
