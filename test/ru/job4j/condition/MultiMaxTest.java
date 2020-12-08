package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(21, 4, 2);
        assertThat(result, is(21));
    }

    @Test
    public void whenSecondMaxAgain() {
        int result = MultiMax.max(1, 45, 2);
        assertThat(result, is(45));
    }

    @Test
    public void whenThirdMaxAgain() {
        int result = MultiMax.max(1, 4, 32);
        assertThat(result, is(32));
    }

    @Test
    public void whenAllEqual() {
        int result = MultiMax.max(1, 1, 1);
        assertThat(result, is(1));
    }
}
