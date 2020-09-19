package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) { /* проверить, что эталон больше, чем элемент. записать в эталон элемент массива. */
                min = i;
            }
        }
        return min;
    }
}