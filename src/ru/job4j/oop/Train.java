package ru.job4j.oop;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("Hyperloop train from Paris arrived to London by " + environ());
    }

    @Override
    public String environ() {
        return "new special rail.";

    }
}
