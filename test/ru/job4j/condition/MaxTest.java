package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(0,1, 2, 1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1,0 ,1);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax3To2To1Then3() {
        int result = Max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }
}