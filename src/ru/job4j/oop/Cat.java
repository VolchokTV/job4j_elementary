package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("This is " + this.name + ". He is ate " + this.food + ".");
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        //System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("kotleta");
        gav.show();
        //System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Большой Черный Кот");
        black.eat("fish");
        black.show();
    }
}