package ru.job4j.ex;

public  class Fact {

    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Integer should be positive.");
        }
            int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int fact = calc(25);
        System.out.println(fact);
    }

}