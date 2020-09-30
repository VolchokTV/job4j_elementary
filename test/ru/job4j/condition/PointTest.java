package ru.job4j.condition;
import org.junit.Test;

public class PointTest {

    @Test
    public void when12to1112then14() {
        double expected = 14.14;
        int x1 = 1;
        int y1 = 2;
        int x2 = 11;
        int y2 = 12;
       // double out = Point.distance(x1, y1, x2, y2);
      //  Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when1010to4020then58() {
        int expected = 20;
        int x1 = -10;
        int y1 = 40;
        int x2 = -10;
        int y2 = 20;
        //double out = Point.distance(x1, y1, x2, y2);
       // Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when3030to2020then70() {
        double expected = 70.71;
        int x1 = 30;
        int y1 = 30;
        int x2 = -20;
        int y2 = -20;
       /// double out = Point.distance(x1, y1, x2, y2);
      //  Assert.assertEquals(expected, out, 0.01);
    }
}