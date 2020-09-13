package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        long rsl = Factorial.calc(5);
        long expected = 120;
        assertThat(rsl, is(expected));

    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        long rsl = Factorial.calc(1);
        long expected = 1;
        assertThat(rsl, is(expected));

    }

    @Test
    public void whenCalculateFactorialForTenThenThreeMln() {
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        long rsl = Factorial.calc(10);
        long expected = 3628800;
        assertThat(rsl, is(expected));

    }
}