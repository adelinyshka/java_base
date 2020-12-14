package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray0() {
        int[] input = new int[] {2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray1() {
        int[] input = new int[] {4, 1, 6};
        int[] result = Turn.back(input);
        int[] expect = new int[] {6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray11() {
        int[] input = new int[] {4, 1};
        int[] result = Turn.back(input);
        int[] expect = new int[] {1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray2() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expect = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray22() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = Turn.back(input);
        int[] expect = new int[] {8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray3() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] result = Turn.back(input);
        int[] expect = new int[] {4, 3, 2, 1};
        assertThat(result, is(expect));
    }
}
