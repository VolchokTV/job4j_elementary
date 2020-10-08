package ru.job4j.condition;

public class OddCheck {
    public static boolean check(int num) {
        boolean res = false;
        if ((num % 2) != 0) {
            res = true;
        }
            return res;
    }
}
