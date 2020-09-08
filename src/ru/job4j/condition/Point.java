package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0 ,0 ,2 ,0);
        System.out.println("result (0,0) to (2,0) " + result);
        result = Point.distance(1,2,11,12);
        System.out.println("result (1,2) to (11,12) " + result);
        result = Point.distance(-10,40,- 10,20);
        System.out.println("result (-10,-10) to (40,20) " + result);
    }
}
