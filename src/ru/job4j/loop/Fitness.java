package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int monthToWin = 0;
        while (ivan <= nik) {
            ++monthToWin;
            nik *= 2;
            ivan *= 3;
        }
        return monthToWin;
    }
}