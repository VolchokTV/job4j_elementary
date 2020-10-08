package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean condition = left >= right;
        int result = condition ? left : right;
        return result;
    }

    public static int max(int left, int right, int three) {
        boolean condition = left >= max(right, three);
        int result = condition ? left : max(right, three);
        return result;
    }

    public static int max(int left, int right, int three, int four) {
        boolean condition = max(left, right) >= max(three, four);
        int result = condition ? max(left, right) : max(three, four);
        return result;
    }
}