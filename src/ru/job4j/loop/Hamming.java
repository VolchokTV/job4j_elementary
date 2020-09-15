package ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int counter = 0;
        for (int index = 0; index < left.length(); index++) {
            if (left.charAt(index) != right.charAt(index)) {
                counter++;
            }
        }
        return counter;
    }
}