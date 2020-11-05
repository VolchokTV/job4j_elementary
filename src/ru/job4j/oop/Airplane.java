package ru.job4j.oop;

public class Airplane implements Vehicle {

    @Override
    public void move() {
        System.out.println(environ() + " Под крылом самолета .... зеленое море тайги. ");

    }

    @Override
    public String environ() {
        return "...только небо знает где меня искать....  ";
    }
}
