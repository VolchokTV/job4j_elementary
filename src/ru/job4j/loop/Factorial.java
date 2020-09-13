package ru.job4j.loop;

public class Factorial {

    public static long calc(int n) {
        long result = 1;
        if (n == 0) {
            return result;
        } else {
            for (int i = 1; i <= n; i++) {
                result = result * i;
            }
            return result;
        }
    }
}

