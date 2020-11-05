package ru.job4j.oop;

public class Bus implements Vehicle{

    @Override
    public void move() {
        System.out.println("Bus ride from Boston to Chicago by " + environ());
    }

    @Override
    public String environ() {
        return "new highway.";
    }
}
