package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Ниф-Ниф";
        names[1] = "Нуф-Нуф";
        names[2] = "Наф-Наф";
        names[3] = "Big Bad Wolf";
        System.out.println("Ячейка 1 массива - names " + names[0]);
        System.out.println("Ячейка 2 массива - names " + names[1]);
        System.out.println("Ячейка 3 массива - names " + names[2]);
        System.out.println("Ячейка 4 массива - names " + names[3]);
    }
}
