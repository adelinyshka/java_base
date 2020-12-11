package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.calc(95, 90);
        assertThat(month, is(0));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calc(90, 95);
        assertThat(month, is(1));
    }

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(50, 90);
        assertThat(month, is(2));
        System.out.println(month);
    }

    @Test
    public void whenIvanLessByFewNik2() {
        int month = Fitness.calc(80, 90);
        assertThat(month, is(1));
        System.out.println(month);
    }

    @Test
    public void whenIvanLessByFewNik3() {
        int month = Fitness.calc(30, 150);
        assertThat(month, is(4));
        System.out.println(month);
    }
}
