package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {

    @Test
    public void when0And10Then55() {
        int result = Counter.sum(0, 10);
        assertThat(result, is(55));
    }

    @Test
    public void when3And8Then33() {
        int result = Counter.sum(3, 8);
        assertThat(result, is(33));
    }

    @Test
    public void when1And1Then1() {
        int result = Counter.sum(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void when4And11Then60() {
        int result = Counter.sum(4, 11);
        assertThat(result, is(60));
    }

    @Test
    public void when2And7Then27() {
        int result = Counter.sum(2, 7);
        assertThat(result, is(27));
    }

    @Test
    public void when5And9Then35() {
        int result = Counter.sum(5, 9);
        assertThat(result, is(35));
    }
}
