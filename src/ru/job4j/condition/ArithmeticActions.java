package ru.job4j.condition;

public class ArithmeticActions {
    public static String selectAction(int left, int right, int rsl) {
        String result = "none";
        if (rsl == left + right) {
            result = "added";
        } else if (rsl == left - right) {
            result = "subtracted";
        } else if (rsl == left * right) {
            result = "multiplied";
        } else if (rsl == left / right)
        result = "divided";

        return result;
    }
}