package ru.job4j.oop;


import org.junit.Assert;
import org.junit.Test;


public class PointTest {

    @Test
    public void when303030to202020then86() {
        double expected = 86.60;
        Point g = new Point(30, 30, 30);
        Point h = new Point(-20, -20, -20);
        double out = g.distance3d(h);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when303050to202040then114() {
        double expected = 114.45;
        Point k = new Point(30, 30, 50);
        Point l = new Point(-20, -20, -40);
        double out = k.distance3d(l);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when303020to202010then76() {
        double expected = 76.81;
        Point m = new Point(30, 30, 20);
        Point n = new Point(-20, -20, -10);
        double out = m.distance3d(n);
        Assert.assertEquals(expected, out, 0.01);
    }
}