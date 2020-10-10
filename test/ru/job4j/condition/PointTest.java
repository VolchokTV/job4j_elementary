package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when12to1112then14() {
        double expected = 14.14;
        Point a = new Point(1, 2);
        Point b = new Point(11, 12);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1040to1020then20() {
        int expected = 20;
        Point c = new Point(-10, 40);
        Point d = new Point(-10, 20);
        double out = c.distance(d);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3030to2020then70() {
        double expected = 70.71;
        Point e = new Point(30, 30);
        Point f = new Point(-20, -20);
        double out = e.distance(f);
        Assert.assertEquals(expected, out, 0.01);
    }
}