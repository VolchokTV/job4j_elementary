package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
        for (int[] ints : array) {
            for (int cell = 0; cell < ints.length; cell++) {
                if (ints[cell] < 0) {
                    ints[cell] = 0;
                }
            }
        }
        return array;
    }
}