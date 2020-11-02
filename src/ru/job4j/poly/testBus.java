package ru.job4j.poly;

public class testBus {
    public static void main(String[] args) {
        Bus orange = new Bus();
        System.out.println(orange.refuel(100));
        orange.passengers(40);
    }
}
