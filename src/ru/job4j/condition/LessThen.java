package ru.job4j.condition;

public class LessThen {
    public static boolean check(int first, int second) {
        boolean result = false;
        if (first < second) {
            result = true;
        }
        return result;
    }
}