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
}
