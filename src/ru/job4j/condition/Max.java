package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int three) {
        int result = max(left, max(right, three));
        return result;
    }

    public static int max(int left, int right, int three, int four) {
        int result = max(max(left, right), max(three, four));
        return result;
    }
}