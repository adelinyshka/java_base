package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        System.out.println("whenMan180Then92, result: " + out);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMan170then80() {
        short in = 170;
        double expected = 80;
        double out = Fit.manWeight(in);
        System.out.println("whenMan170then80, result: " + out);
        Assert.assertEquals(expected, out, 0.9);
    }

    @Test
    public void whenWoman165Then63() {
        short in = 165;
        double expected = 63;
        double out = Fit.womanWeight(in);
        System.out.println("whenWoman165Then63, result: " + out);
        Assert.assertEquals(expected, out, 0.9);
    }

    @Test
    public void whenWoman180Then80() {
        short in = 180;
        double expected = 80;
        double out = Fit.womanWeight(in);
        System.out.println("whenWoman180Then80, result: " + out);
        Assert.assertEquals(expected, out, 0.9);
    }
}
